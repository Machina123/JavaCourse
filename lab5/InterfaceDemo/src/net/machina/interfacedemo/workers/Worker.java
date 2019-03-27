package net.machina.interfacedemo.workers;

public class Worker implements IPayment, Comparable<Worker> {

    private String fullName;
    private double payment = 2500;

    public Worker(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public double getPayment() {
        return this.payment;
    }

    @Override
    public void increasePayment(double percent) {
        this.payment *= 1 + (percent / 100.0);
    }

    @Override
    public int compareTo(Worker o) {
        return Double.compare(this.getPayment(), o.getPayment());
    }
}
