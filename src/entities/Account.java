package entities;

public abstract class Account {
    private String holder;
    private Integer number;
    protected double balance;//deixei o balance protect para usar na classe BusinesAccount

    public Account(){

    }

    public Account(String holder, Integer number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
}
