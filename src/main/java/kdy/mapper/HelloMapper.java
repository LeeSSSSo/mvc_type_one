// ✅ kdy.mapper 패키지에 속한 인터페이스입니다.
package kdy.mapper;

import java.util.List; // 여러 객체의 목록 반환 시 사용

// ✅ MyBatis에서 Mapper 인터페이스로 인식되도록 하기 위한 어노테이션
import org.apache.ibatis.annotations.Mapper;

import kdy.dto.EmployeeDto; // 직원 정보 전달 객체 (DTO: Data Transfer Object)

// ✅ HelloMapper 인터페이스는 DB와의 연결을 추상화하는 역할을 합니다.
// 실제 SQL은 매퍼 XML 파일(예: HelloMapper.xml)에 정의되어 있고,
// 이 인터페이스는 해당 SQL을 호출하는 메서드 정의만 가짐.
@Mapper
public interface HelloMapper {

    // ✅ 현재 DB 시간을 조회 (단일 문자열 반환)
    // 매퍼 XML의 <select id="getTime" resultType="String"> 과 연결
    String getTime();

    // ✅ 직원 전체 목록 조회
    // 매퍼 XML의 <select id="getEmployeeList" resultType="kdy.dto.EmployeeDto"> 와 연결
    List<EmployeeDto> getEmployeeList();

    // ✅ 직원 등록 (INSERT)
    // 매퍼 XML의 <insert id="insertEmployee" parameterType="kdy.dto.EmployeeDto"> 와 연결
    void insertEmployee(EmployeeDto dto);

    // ✅ 특정 직원 조회 (PK 기준)
    // 매퍼 XML의 <select id="getEmployeeById" parameterType="int" resultType="kdy.dto.EmployeeDto"> 와 연결
    EmployeeDto getEmployeeById(int empId);

    // ✅ 직원 정보 수정 (UPDATE)
    // 매퍼 XML의 <update id="updateEmployee" parameterType="kdy.dto.EmployeeDto"> 와 연결
    void updateEmployee(EmployeeDto dto);

    // ✅ 직원 삭제 (DELETE)
    // 매퍼 XML의 <delete id="deleteEmployee" parameterType="int"> 와 연결
    void deleteEmployee(int empId);
}