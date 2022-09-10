package vn.com.vti.springexam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fortune")
public class FortuneController1 {
	@RequestMapping(produces = "text/html; charset=utf-8")
	@ResponseBody
	public String index() {
		String result = "";
		int x;
		
		List<String> lkyList = new ArrayList<String>();
		lkyList.add("Lucky");
		lkyList.add("Normal");
		lkyList.add("Bad");
		
		try {
			Random rand = new Random();
			
			x = rand.nextInt(3);
			result = lkyList.get(x);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		return result;
	}
}
