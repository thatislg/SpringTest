/**
 * 
 */
package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.PrefectureForm;

/**
 * @author thatislg1720
 *
 */
@Controller
@RequestMapping("/prefectureInsert")
public class PrefectureInsertController {
	
	@ModelAttribute
	public PrefectureForm createForm() {
		return new PrefectureForm();
	}
	
	@RequestMapping("/input")
	public String input(PrefectureForm prefectureForm) {
		return "prefecture/prefectureInsertInput";
	}
	
	@RequestMapping("/confirm")
	public String confirm(PrefectureForm prefectureForm, Model model) {
		return "prefecture/prefectureInsertConfirm";
	}
}
