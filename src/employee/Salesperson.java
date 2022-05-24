package employee;

public class Salesperson extends Employee{

    private final double commission;
    private final long salesQuantity;

    public Salesperson(String name, long cpf, double commission, long salesQuantity) {
        super(name, cpf);
        this.commission = commission;
        this.salesQuantity = salesQuantity;
    }

    @Override
    public Double calculateSalary() {
        return super.getBASIC_SALARY() + commission * salesQuantity;
    }

}
