package kdy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import kdy.dto.StudentDto;
import kdy.mapper.StudentMapper;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 학생 목록 조회
     */
    @GetMapping("/list")
    public ModelAndView getStudentList() {
        ModelAndView mv = new ModelAndView("student/list");
        mv.addObject("studentList", studentMapper.getStudentList());
        return mv;
    }

    /**
     * 학생 등록 폼 이동
     */
    @GetMapping("/insertForm")
    public ModelAndView insertForm() {
        return new ModelAndView("student/insertStudent");
    }

    /**
     * 학생 등록 처리
     */
    @PostMapping("/insertStudent")
    public String insertStudent(StudentDto dto) {
        studentMapper.insertStudent(dto);
        return "redirect:/student/list";
    }

    /**
     * 학생 수정 폼 이동
     */
    @PostMapping("/editForm")
    public ModelAndView editForm(@RequestParam("stdId") int studentId) {
        StudentDto student = studentMapper.getStudentById(studentId);
        ModelAndView mv = new ModelAndView("student/updateStudent");
        mv.addObject("std", student);
        return mv;
    }

    /**
     * 학생 수정 처리
     */
    @PostMapping("/update")
    public String updateStudent(StudentDto dto) {
        studentMapper.updateStudent(dto);
        return "redirect:/student/list";
    }

    /**
     * 학생 삭제 처리
     */
    @PostMapping("/delete")
    public String deleteStudent(@RequestParam("stdId") int studentId) {
        studentMapper.deleteStudent(studentId);
        return "redirect:/student/list";
    }
}
