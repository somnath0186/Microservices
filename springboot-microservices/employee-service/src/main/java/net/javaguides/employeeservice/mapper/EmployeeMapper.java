package net.javaguides.employeeservice.mapper;

import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto EmployeeToDto(Employee employee){

        EmployeeDto employeeDto =new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setDepartmentCode(employee.getDepartmentCode());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setOrganizationCode(employee.getOrganizationCode());

        return employeeDto;
    }

    public static Employee DtoToEmployee(EmployeeDto employeeDto){

        Employee employee =new Employee(
                employeeDto.getId(),employeeDto.getFirstName(),employeeDto.getLastName(),employeeDto.getEmail(),employeeDto.getDepartmentCode(),employeeDto.getOrganizationCode()
        );
        return employee;
    }

}
