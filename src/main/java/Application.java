import dao.employeeDao.EmployeeDAO;
import dao.employeeDao.EmployeeDAOImpl;
import models.Employee;

import java.util.List;

public class Application {

    private static final EmployeeDAO employeeDao = new EmployeeDAOImpl();

    public static void main(String[] args) {

        Employee employee1 = new Employee("Gera", "Gerasimov", "Man", 33, 2);
        employeeDao.addNewEmployee(employee1); //Добавление нового работника

        System.out.println(employeeDao.findById(19));//Поиск работника по Id

        Employee employeeDelete = new Employee(25, "Peter", "Pen", "Man", 8, 1);
        employeeDao.deleteEmployeeById(employeeDelete); //удаление работника по Id;

        Employee employeeUpdate = new Employee(24, "Peter", "Pen", "Man", 7, 1);
        employeeDao.updateEmployee(employeeUpdate); //обновление  данных работника;

        List<Employee> list = employeeDao.allEmployees();// список всех работников;
        System.out.println(list);
    }
}




