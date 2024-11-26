public class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double baseSalary, double bonus) {
        setName(name);
        setBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    // Setter for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Overriding getSalary method to include bonus
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
