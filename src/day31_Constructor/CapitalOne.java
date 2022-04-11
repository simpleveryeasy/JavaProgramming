package day31_Constructor;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet", 123456789);

        System.out.println(account1); //BankAccount{accountHolder='Ahmet Ozkok', accountNumber=123456789, balance= $0.0}

        account1.deposit(1000);
        account1.checkBalance(); //Your available balance is 1000.0

        account1.withdraw(900);
        account1.checkBalance(); //Your available balance is 100.0

        System.out.println("_________________________________________________");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987654321);

        System.out.println(account2); //BankAccount{accountHolder='Aygun', accountNumber=987654321, balance= $0.0}

        account2.deposit(10000);
        account2.checkBalance(); //Your available balance is 10000.0
    }
}
