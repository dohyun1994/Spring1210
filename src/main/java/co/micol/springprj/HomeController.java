package co.micol.springprj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//나는 컨트롤러입니다.클래스에만 붙일수 있다.
@Controller		
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// index.jsp에서 -> /home.do 요청이 들어오면 home() 실행.
	@RequestMapping("/home.do")
	public String home(Model model) {		// Model 객체는 돌려줄값을 실어주는 객체. db처리결과 등을 실어서.
		return "home/home";
	}
	
	
	@RequestMapping("/buttons.do")
	public String button(Model model) {		// Model 객체는 돌려줄값을 실어주는 객체. db처리결과 등을 실어서.
		return "home/bb";
	}
	
}
