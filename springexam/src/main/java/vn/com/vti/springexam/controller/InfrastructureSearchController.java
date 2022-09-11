/**
 * 
 */
package vn.com.vti.springexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.mapper.InfrastructureMapper;

/**
 * @author thatislg1720
 *
 */

@Controller 
@RequestMapping("/infrastructure")
public class InfrastructureSearchController {
	@Autowired
	private InfrastructureMapper infrastructureMapper;
	
	@RequestMapping("/input")
	public String input() {
		return "/infrastructure/infrastructureSearchInput";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam Integer infrasId, Model model) {
		Infrastructure infras = infrastructureMapper.selectByPrimaryKey(infrasId);
		
		model.addAttribute("infras", infras);
		
		return "/infrastructure/infrastructureSearchDetail";
	}
	
	
}
