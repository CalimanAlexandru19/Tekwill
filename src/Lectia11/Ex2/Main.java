package Lectia11.Ex2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("1Bank",1500l);
        CheckingAccount checkingAccount=new CheckingAccount("2Fee",1907l,2000);
        SavingAccount savingAccount=new SavingAccount("3Rate",1234l,19.07);

        bankAccount.print();
        checkingAccount.print();
        savingAccount.print();
    }
}
