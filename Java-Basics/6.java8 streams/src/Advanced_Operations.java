import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    String department;
    double salary;

    Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public String toString() {
        return name + " - " + salary;
    }
}

class Student {
    String name;
    String department;
    double grade;

    Student(String name, String department, double grade) {
        this.name = name;
        this.department = department;
        this.grade = grade;
    }

    public double getGrade() { return grade; }

    public String toString() {
        return name + " (" + grade + ")";
    }
}

public class AdvancedTasks {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        List<String> names = Arrays.asList("Ali", "Mona", "", "Ahmed", null, "Sara", "  ", "Nada");

        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );

        // 1 - Sort a list of employees by salary then by name.

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted employees:");
        System.out.println(sorted);




        // 2 - Find the second highest number in a list.

        int secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second highest = " + secondHighest);




        // 3 - Find duplicate elements in a list of integers.

        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());
        System.out.println("Duplicates = " + dup);





        // 4 - Remove null or empty strings from a list using stream.

        List<String> cleaned = names.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.toList());
        System.out.println("Cleaned names = " + cleaned);





        // 5 - Partition students into pass/fail groups based on grade.

        Map<Boolean, List<Student>> passFail = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade() >= 60));
        System.out.println("Pass/Fail:");
        System.out.println(passFail);


    }
}
