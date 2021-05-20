package Lectia11.Ex2;

public class BankAccount {
        protected String number;
        protected Long balance;
    public BankAccount(String number, Long balance) {
            this.number = number;
            this.balance = balance;
        }

        public void print () {
            System.out.println(" Number: " + number);
            System.out.println(" Balance: " + balance);
        }


}