package employee;

public abstract class Employee {
    private final String name;
    private final long cpf;
    protected final double BASIC_SALARY = 1200;

    protected Employee(String name, long cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public long getCpf() {
        return cpf;
    }

    public double getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public abstract Double calculateSalary();
}
