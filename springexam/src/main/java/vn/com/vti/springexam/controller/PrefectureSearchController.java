/**
 * 
 */
package vn.com.vti.springexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.mapper.PrefectureMapper;

/**
 * @author thatislg1720
 *
 */

@Controller
@RequestMapping("/prefectureSearch")
public class PrefectureSearchController {
	@Autowired
	private PrefectureMapper prefectureMapper;
	
	@RequestMapping("/input")
	public String input() {
		return "prefecture/prefectureSearchInput";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam Integer prefectureId, Model model) {
		
		Prefecture prefecture = prefectureMapper.selectByPrimaryKey(prefectureId);
		
		model.addAttribute("prefecture", prefecture);
		
		return "prefecture/prefectureSearchDetail";
	}
}
