package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fortune")
public class FortuneController {
	
	@RequestMapping()
	public String index(Model model) {
		String result = "";
		int x;
		
		try {
			Random rand = new Random();
			x = rand.nextInt(3);
			
			switch(x) {
				case 1:
					result = "Lucky";
					break;
				case 2:
					result = "Normal";
					break;
				case 3:
					result = "Bad";
					break;
			}
			
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		model.addAttribute("fortune", result);
		return "fortune";
	}
}
