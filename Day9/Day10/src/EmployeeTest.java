import org.junit.Test;

import java.util.*;

/**
 * Created by pradhanb on 7/22/2017.
 */
public class EmployeeTest {
    @Test
    public void test() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sushant", "Manda", "IT", 5028, "Pune"));
        employees.add(new Employee("Nirzara", "Patil", "HR", 5001, "Pune"));
        employees.add(new Employee("Mukta", "Kulkarni", "Finance", 5041, "Pune"));
        employees.add(new Employee("Snigdha", "Sahoo", "Finance", 5031, "Pune"));
        employees.add(new Employee("Harshita", "Kaur", "Finance", 5081, "Pune"));
        employees.add(new Employee("Kamaljeet", "Kaur", "Finance", 5082, "Pune"));
        employees.add(new Employee("Sneh", "Sopori", "Finance", 5182, "Pune"));
        employees.add(new Employee("Deepika", "Jhawar", "Finance", 5183, "Pune"));
        employees.add(new Employee("Sanchita", "Badkas", "R&D", 5184, "Pune"));
        employees.add(new Employee("Arshi", "Saifi", "Admin", 5185, "Pune"));

        employees.add(new Employee("Nitesh", "Singhad", "IT", 5228, "Pune"));
        employees.add(new Employee("Harshala", "Chauhan", "HR", 5221, "Pune"));
        employees.add(new Employee("Virat", "Kohli", "Finance", 5222, "Pune"));
        employees.add(new Employee("Ananyo", "SenGupta", "Finance", 5231, "Pune"));
        employees.add(new Employee("Pratishruti", "Mohanty", "Finance", 5281, "Pune"));
        employees.add(new Employee("Subrato", "Mohanty", "Finance", 5282, "Pune"));
        employees.add(new Employee("Rajan", "Marwah", "Finance", 5382, "Pune"));
        employees.add(new Employee("Harshita", "Marwah", "Finance", 5383, "Pune"));
        employees.add(new Employee("Priya", "Rawal", "R&D", 5384, "Pune"));
        employees.add(new Employee("P.K", "Sahu", "Admin", 5385, "Pune"));

        employees.add(new Employee("Sushant", "Singh", "IT", 5428, "Hyderabad"));
        employees.add(new Employee("Nirzara", "Singh", "HR", 5401, "Hyderabad"));
        employees.add(new Employee("Mukta", "Singh", "Finance", 5441, "Hyderabad"));
        employees.add(new Employee("Snigdha", "Singh", "Finance", 5431, "Hyderabad"));
        employees.add(new Employee("Harshita", "Pani", "Finance", 5481, "Hyderabad"));
        employees.add(new Employee("Kamaljeet", "Pani", "Finance", 5482, "Hyderabad"));
        employees.add(new Employee("Sneh", "Pani", "Finance", 5582, "Hyderabad"));
        employees.add(new Employee("Deepika", "pani", "Finance", 5683, "Hyderabad"));
        employees.add(new Employee("Sanchita", "Meena", "R&D", 5684, "Hyderabad"));
        employees.add(new Employee("Arshi", "Meena", "Admin", 5685, "Hyderabad"));

        employees.add(new Employee("Nitesh", "Meena", "IT", 5628, "Hyderabad"));
        employees.add(new Employee("Harshala", "Chaurasia", "HR", 5621, "Hyderabad"));
        employees.add(new Employee("Virat", "Chaurasia", "Finance", 5622, "Hyderabad"));
        employees.add(new Employee("Ananyo", "Patil", "Finance", 5731, "Hyderabad"));
        employees.add(new Employee("Pratishruti", "Pradhan", "Finance", 5781, "Hyderabad"));
        employees.add(new Employee("Subrato", "Panda", "Finance", 5782, "Hyderabad"));
        employees.add(new Employee("Rajan", "Pandey", "Finance", 5782, "Hyderabad"));
        employees.add(new Employee("Harshita", "Pandey", "Finance", 5783, "Hyderabad"));
        employees.add(new Employee("Priya", "Mcwann", "R&D", 5784, "Hyderabad"));
        employees.add(new Employee("P.K", "Mcwann", "Admin", 5785, "Hyderabad"));

        Comparator c = new EmployeeComparator();
        //employees.sort(c);
        Collections.sort(employees,c);
        for (Employee emp : employees) {
            System.out.println(emp);

        }
    }
}
