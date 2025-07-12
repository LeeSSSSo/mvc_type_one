package kdy.controller;

import kdy.dto.EmployeeDto;
import kdy.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class CRUDController {

    @Autowired
    private HelloMapper helloMapper;

    @GetMapping("/insertForm")
    public ModelAndView insertForm() {
        return new ModelAndView("insertEmployee"); // insertEmployee.jsp로 이동
    }
    
    
    // Insert 처리
    @PostMapping("/insert")
    public String insertEmployee(EmployeeDto dto) {
        helloMapper.insertEmployee(dto);
        return "redirect:/hello";
    }

    // 수정 form 이동
    @GetMapping("/editForm")
    public ModelAndView editForm(@RequestParam("empId") int empId) {
        EmployeeDto employee = helloMapper.getEmployeeById(empId);
        ModelAndView mv = new ModelAndView("updateEmployee"); // editForm.jsp
        mv.addObject("emp", employee);
        return mv;
    }

    // Update 처리
    @PostMapping("/update")
    public String updateEmployee(EmployeeDto dto) {
        helloMapper.updateEmployee(dto);
        return "redirect:/hello";
    }

    // Delete 처리
    @PostMapping("/delete")
    public String deleteEmployee(@RequestParam("empId") int empId) {
        helloMapper.deleteEmployee(empId);
        return "redirect:/hello";
    }
}