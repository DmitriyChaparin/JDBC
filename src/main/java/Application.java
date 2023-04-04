import dao.employeeDao.EmployeeDAO;
import dao.employeeDao.EmployeeDAOImpl;
import models.Employee;

import java.sql.*;

public class Application {

   private static final EmployeeDAO employeeDao = new EmployeeDAOImpl();

    public static void main(String[] args) throws SQLException {

        employeeDao.findById(1);//найти работника по Id;

        employeeDao.addNewEmployee("Peter","Pen","Man",8,1);// добавление нового работника;

        employeeDao.deleteEmployeeById(22); //удаление работника по Id;

        employeeDao.refactorEmployee(24,"Peter","Pen","Man",7,1); //измениения работника по Id;

        for (Employee employee : employeeDao.allEmployees()) {
            System.out.println(employee);// список всех работников;
        }


    }

}




