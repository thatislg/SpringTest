/**
 * 
 */
package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.entity.InfrastructureExample;
import vn.com.vti.springexam.mapper.InfrastructureMapper;

/**
 * @author thatislg1720
 *
 */
@Controller
@RequestMapping("/infrastructure")
public class InfrastructureListController {
	@Autowired
	private InfrastructureMapper infrastructureMapper;
	
	
	@RequestMapping("/infrasList")
	public String infrasListResult(Model model) {
		
		InfrastructureExample infrasExam = new InfrastructureExample();
		
		infrasExam.setOrderByClause("ID");
		
		List<Infrastructure> infrasList = infrastructureMapper.selectByExample(infrasExam);
		
		model.addAttribute("infrasList", infrasList);
		
		return "/infrastructure/showInfrasList";		
	}
}
