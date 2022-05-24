package employee;

public class Consultant extends Employee{

    private final long workedHours;
    private final double hourValue;

    public Consultant(String name, long cpf, long workedHours, double hourValue) {
        super(name, cpf);
        this.workedHours = workedHours;
        this.hourValue = hourValue;
    }

    @Override
    public Double calculateSalary() {
        return workedHours * hourValue;
    }

}
