package Lectia11.Ex2;

public class SavingAccount extends BankAccount{
    private double interestRate;

    SavingAccount(String number, Long balance, double interestRate){
        super(number,balance);
        this.interestRate=interestRate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Interest Rate: "+interestRate);
    }
}
