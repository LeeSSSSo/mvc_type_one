package kdy.controller;

// 필요한 클래스 import
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kdy.dto.EmployeeDto;
import kdy.mapper.HelloMapper;

/**
 * HelloController는 Spring MVC 패턴에서 컨트롤러 역할을 수행하는 클래스입니다.
 * 클라이언트의 HTTP 요청을 처리하고, 필요한 데이터를 Model에 담아 View로 전달합니다.
 */
@Controller // 이 클래스가 Spring MVC의 Controller임을 명시 (빈으로 등록됨)
public class HelloController {

	/**
	 * HelloMapper는 DB와 연결된 MyBatis Mapper 인터페이스입니다.
	 * Spring이 자동으로 주입하여 사용할 수 있도록 합니다.
	 */
	@Autowired 
	HelloMapper helloMapper;

	/**
	 * 1뎁스 경로인 "/hello" 요청을 처리합니다.
	 * DB 시간과 직원 리스트를 조회하여 result.jsp 뷰로 전달합니다.
	 * 
	 * @return ModelAndView 객체 - View 이름과 Model 데이터를 담고 있음
	 */
    @GetMapping("/hello") // HTTP GET 방식의 /hello 요청 처리
    public ModelAndView hello() {
    	// DB에서 현재 시간 조회
    	String dbTime = helloMapper.getTime();
    	
    	// DB에서 직원 리스트 조회
    	List<EmployeeDto> employeeList = helloMapper.getEmployeeList();
    	
    	// View로 전달할 객체 생성 (뷰 이름은 "result" → /WEB-INF/views/result.jsp)
        ModelAndView modelAndView = new ModelAndView("result");
        
        // View에 전달할 데이터 추가
        modelAndView.addObject("message", "ModelAndView로 전달한 메시지입니다!"); // 기본 메시지
        modelAndView.addObject("myMsg", "나의메세지야!!!"); // 커스텀 메시지
        modelAndView.addObject("dbTime", dbTime); // DB에서 조회한 시간
        modelAndView.addObject("employeeList", employeeList); // 직원 목록
        
        return modelAndView; // View와 데이터를 함께 리턴
    }

    /**
     * 2뎁스 경로인 "/admin/user" 요청을 처리합니다.
     * 단순히 메시지만 전달하고 admin/user.jsp 뷰로 이동합니다.
     * 
     * @return ModelAndView 객체 - View 이름과 메시지 포함
     */
    @GetMapping("/admin/user") // HTTP GET 방식의 /admin/user 요청 처리
    public ModelAndView adminUser() {
    	// View 이름은 "admin/user" → /WEB-INF/views/admin/user.jsp
        ModelAndView modelAndView = new ModelAndView("admin/user");
        
        // View에 전달할 메시지
        modelAndView.addObject("message", "유저페이지 입니다."); // 사용자 페이지 안내 메시지
        modelAndView.addObject("myMsg", "나의메세지야!!!"); // 동일 메시지 전달
        
        return modelAndView;
    }
}
