package Lectia11.Ex2;

public class CheckingAccount extends BankAccount {
    private double fee;

    CheckingAccount(String number, Long balance, double fee){
        super(number,balance);
        this.fee=fee;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Fee: "+fee);
    }
}
