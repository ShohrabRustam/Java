import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByPartitionByEmployee {
    public String eName;

    @Override
    public String toString() {
        return "GroupByPartitionByEmployee{" +
                "eName='" + eName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String department;
    public Integer salary;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public GroupByPartitionByEmployee(String eName, String department, Integer salary) {
        this.eName = eName;
        this.department = department;
        this.salary = salary;
    }

    public  static void main(String[] args) {

        List<GroupByPartitionByEmployee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(new GroupByPartitionByEmployee("A", "IT", 100000));
        employeeArrayList.add(new GroupByPartitionByEmployee("B", "TECH", 100000));
        employeeArrayList.add(new GroupByPartitionByEmployee("C", "Fin", 1000));
        employeeArrayList.add(new GroupByPartitionByEmployee("F", "Legal Team", 100000));
        employeeArrayList.add(new GroupByPartitionByEmployee("D", "IT", 100000));
        employeeArrayList.add(new GroupByPartitionByEmployee("G", "Legal Team", 100000));
        employeeArrayList.add(new GroupByPartitionByEmployee("H", "Legal Team", 100000));
        Map<String,List<GroupByPartitionByEmployee>> emmployeeByDepartment = employeeArrayList.stream().collect(Collectors.groupingBy(GroupByPartitionByEmployee::getDepartment));
        emmployeeByDepartment.forEach((department,employees)->{
            System.out.println("Department : " + department);
            employees.forEach(System.out::println);
        });

        Map<Boolean,List<GroupByPartitionByEmployee>> emmployeePartitionBy = employeeArrayList.stream().collect(Collectors.partitioningBy(employee-> employee.getSalary()>=20000));

        System.out.println("Empoyee salary greater than 20K");
        emmployeePartitionBy.get(true).forEach(System.out::println);

        System.out.println("Empoyee salary less than 20K\n");
        emmployeePartitionBy.get(false).forEach(System.out::println);
    }
}
