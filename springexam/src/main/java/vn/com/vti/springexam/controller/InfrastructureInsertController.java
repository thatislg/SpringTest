/**
 * 
 */
package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.InfrastructureForm;

/**
 * @author thatislg1720
 *
 */
@Controller
@RequestMapping("/infrastructureInsert")
public class InfrastructureInsertController {
	
	@ModelAttribute
	public InfrastructureForm createForm() {
		return new InfrastructureForm();
	}
	
	@RequestMapping("/input")
	public String input(InfrastructureForm infrastructureForm) {
		return "infrastructure/infrastructureInsertInput";
	}
	
	@RequestMapping("/confirm")
	public String confirm(InfrastructureForm infrastructureForm, Model model) {
		return "infrastructure/infrastructureInsertConfirm";
	}
}
