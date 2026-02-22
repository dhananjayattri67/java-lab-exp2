class Employee {
    String name;
    double salary;

    Employee() {
        name = "Unknown";
        salary = 0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Overloading
    double calculateBonus(double percentage) {
        return salary * percentage / 100;
    }

    double calculateBonus(int fixedAmount) {
        return fixedAmount;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus(double percentage) {
        return salary * 20 / 100;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus(double percentage) {
        return salary * 15 / 100;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus(double percentage) {
        return salary * 5 / 100;
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager m = new Manager("Aman", 50000);
        System.out.println("Manager Bonus: " + m.calculateBonus(10));

        Developer d = new Developer("Rahul", 40000);
        System.out.println("Developer Bonus: " + d.calculateBonus(10));

        Intern i = new Intern("Riya", 20000);
        System.out.println("Intern Bonus: " + i.calculateBonus(10));
    }
}
