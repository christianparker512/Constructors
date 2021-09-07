package parker.learningJava;

public class Main {

    public static void main(String[] args) {
	Account chrissAccount = new Account ();
	chrissAccount.withdrawal(100.0);
	chrissAccount.deposit(50.0);
	chrissAccount.deposit(51.25);

    Account lisaAccount = new Account();
    lisaAccount.deposit(100.00);
    }
}
