package kdy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kdy.dto.StudentDto;

@Mapper
public interface StudentMapper {
	List<StudentDto> getStudentList(); //학생 목록 조회
	
    void insertStudent(StudentDto dto);

    StudentDto getStudentById(int stdId);

    void updateStudent(StudentDto dto);

    void deleteStudent(int stdId);
}
