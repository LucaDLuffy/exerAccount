package app;

import entities.Account;
import entities.BusinesAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
       /* Account acc = new Account("Lucas", 1001, 0.0);
        BusinesAccount bacc = new BusinesAccount("Isaac", 1004, 0.0, 500.0);
        //UpCasting é usar a classe super
        Account acc1 = bacc;
        Account acc2 = new BusinesAccount("Rafa", 1005, 0.0, 200.0);
        Account acc3 = new SavingsAccount("Patricia",1006,0.0,0.01);
        //DownCasting é pegar da superclasse para a subclasse
        BusinesAccount acc4 = (BusinesAccount) acc2;//tem que usar parantes para pegar o metodo da subclasse para a superclass
        acc4.loan(100.0);
        //usando instanceof para pegar da subclasse para superclasse
        if (acc3 instanceof BusinesAccount){
            BusinesAccount acc5 = (BusinesAccount) acc3;
            acc5.loan(200.0);
            System.out.println("LOAN!!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.getBalance();
            System.out.println("Updating!!");
        }*/

       /* Account acc10 = new Account("Lucazum", 1020,1000.0);
        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());

        Account acc11 = new SavingsAccount("Lucaz",1021,1000.0,0.01);
        acc11.withdraw(200.0);
        System.out.println(acc11.getBalance());

        Account acc12 = new BusinesAccount("Luca", 1022, 1000.0, 500.0);
        acc12.withdraw(200.0);
        System.out.println(acc12.getBalance());*/

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount("Lucas", 1001, 500.00, 0.01));
        list.add(new BusinesAccount("Isaac", 1002, 1000.0, 400.0));
        list.add(new SavingsAccount("Rafaella", 1004, 300.0, 0.01));
        list.add(new BusinesAccount("Patricia", 1005, 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
