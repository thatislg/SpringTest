package vn.com.vti.springexam.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/currentTime")
public class CurrentTimeController {
	
	@RequestMapping(value="/index", produces = "text/html; charset=utf-8")
	@ResponseBody
	public String index() {
		Date date=  new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateStr = df.format(date);
		
		String result = "";
		result += "<html>";
		result += "<head>";
		result += "<meta charset=\"UTF-8\">" ;
		result += "</head>";
		result += "<body>"+ dateStr+"</body>";
		result += "</html>";
		return result;
	}
}
