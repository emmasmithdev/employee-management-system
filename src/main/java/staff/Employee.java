package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double payBonus(){
        return this.salary / 100;
    }

    public void raiseSalary(double percent){
        double salary = getSalary();
        double extra = (salary / 100) * percent;
        double newSalary = salary + extra;
        setSalary(newSalary);
    }

}
