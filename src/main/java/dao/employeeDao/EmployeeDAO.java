package dao.employeeDao;

import models.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee findById(Integer id);

    void addNewEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeById(Employee employee);

    List<Employee> allEmployees();
}
