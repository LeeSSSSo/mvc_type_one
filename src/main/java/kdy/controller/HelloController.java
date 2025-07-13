package kdy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kdy.dto.EmployeeDto;
import kdy.mapper.HelloMapper;

@Controller
public class HelloController {

	@Autowired HelloMapper helloMapper;
	
	//1뎁스
    @GetMapping("/hello")
    public ModelAndView hello() {
    	 String dbTime = helloMapper.getTime();
    	 List<EmployeeDto> employeeList = helloMapper.getEmployeeList();
        ModelAndView modelAndView = new ModelAndView("result"); // /WEB-INF/views/result.jsp
        modelAndView.addObject("message", "ModelAndView로 전달한 메시지입니다!");
        modelAndView.addObject("myMsg", "나의메세지야!!!");
        modelAndView.addObject("dbTime", dbTime);
        modelAndView.addObject("employeeList", employeeList);
        return modelAndView;
    }
    
    // 2뎁스
    @GetMapping("/admin/user")
    public ModelAndView adminUser() {
        ModelAndView modelAndView = new ModelAndView("admin/user"); // /WEB-INF/views/admin/user.jsp
        modelAndView.addObject("message", "유저페이지 입니다.");
        modelAndView.addObject("myMsg", "나의메세지야!!!");
        return modelAndView;
    }
    
    
   
    
}
