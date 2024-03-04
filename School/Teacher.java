package School;

public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpend(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher; " + name + " Total salary earned so far " + salaryEarned;
    }
}