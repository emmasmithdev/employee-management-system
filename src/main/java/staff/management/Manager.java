package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary(double percent){
        double salary = super.getSalary();
        double extra = (salary / 100) * percent;
        double newSalary = salary + extra;
        super.setSalary(newSalary);
    }

    @Override
    public double payBonus() {
        return super.payBonus();
    }
}
