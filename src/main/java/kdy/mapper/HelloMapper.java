package kdy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kdy.dto.EmployeeDto;

@Mapper
public interface HelloMapper {
    String getTime();

    List<EmployeeDto> getEmployeeList();

    void insertEmployee(EmployeeDto dto);

    EmployeeDto getEmployeeById(int empId);

    void updateEmployee(EmployeeDto dto);

    void deleteEmployee(int empId);
}
