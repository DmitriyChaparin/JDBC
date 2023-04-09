import dao.cityDao.CityDAO;
import dao.cityDao.CityDAOImpl;
import dao.employeeDao.EmployeeDAO;
import dao.employeeDao.EmployeeDAOImpl;
import models.City;
import models.Employee;

public class Application {
    private static final EmployeeDAO employeeDao = new EmployeeDAOImpl();
    private static final CityDAO cityDao = new CityDAOImpl();

    static void createCity(City city) {
        cityDao.addNewCity(city);
    }

    static void findCityById(Integer id) {
        System.out.println(cityDao.findById(id));
    }

    static void updateCity(City city) {
        cityDao.updateCity(city);
    }

    static void deleteCity(City city) {
        cityDao.deleteCityById(city);
    }

    static void createEmployee(Employee employee) {
        employeeDao.addNewEmployee(employee);
    }

    static void findEmployeeById(Integer id) {
        System.out.println(employeeDao.findById(id));
    }

    static void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    static void deleteEmployee(Employee employee) {
       employeeDao.deleteEmployeeById(employee);
    }

    static void printAllEmployees() {
        for (Employee employee : employeeDao.allEmployees()) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        findCityById(2);
        createCity(new City("Saratov"));
        updateCity(new City(5, "New York"));
        deleteCity(new City(7));
        findEmployeeById(1);
        createEmployee(new Employee("Fred", "Fedotov", "Man", 28, (new City(1))));
        updateEmployee(new Employee(28, "Fred", "Fedotov", "Man", 28, (new City(2))));
        deleteEmployee(new Employee(28));
        printAllEmployees();
    }
}




