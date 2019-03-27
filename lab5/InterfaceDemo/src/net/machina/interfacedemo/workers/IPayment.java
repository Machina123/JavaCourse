package net.machina.interfacedemo.workers;

public interface IPayment {
    public double getPayment();
    public void increasePayment(double percent);
}
