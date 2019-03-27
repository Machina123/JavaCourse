package net.machina.interfacedemo.workers;

public class Manager extends Worker {

    private double paymentAddition;

    public Manager(String fullName) {
        super(fullName);
    }

    @Override
    public double getPayment() {
        return super.getPayment() + paymentAddition;
    }

    @Override
    public void increasePayment(double percent) {
        super.increasePayment(percent);
        this.paymentAddition *= 1 + (percent / 100.0);
    }
}
