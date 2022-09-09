package vn.com.vti.springexam.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/currentTime")
// Đường dẫn currentTime này mặc định sau port /
public class CurrentTimeController {
	
	// Tiếp tục chỉ định đường dẫn sau 
	@RequestMapping("/index")
	// Khi sử dụng với jsp thì ko sử dụng ReponseBody
	// @ResponseBody
	
	public String index(Model model) {
		Date date=  new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateStr = df.format(date);
		
		// Model này dùng để kết nối với variable java và sẽ hiển thị trong jsp
		model.addAttribute("dateAndTime", dateStr);
		
		// return tên file jsp ko có phần mở rộng jsp
		return "currentTimeView";
	}
}
