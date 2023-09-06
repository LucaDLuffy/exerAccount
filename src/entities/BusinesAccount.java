package entities;

public class BusinesAccount extends Account {
    private double loanLimit;

    public BusinesAccount(){
        super();
    }

    public BusinesAccount(String holder, Integer number, double balance, double loanLimit) {
        super(holder, number, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0; //vou deixar o metodo balance em protect para poder utilizar aqui
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
