import java.util.Objects;

public class Singleton {

    private static Singleton instance;

    // TODO 1 : fix singleton bad implementation
    private Singleton() {
        // Empêcher l'instanciation directe depuis l'extérieur
    }
    
    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }

    private Bank bank;

    public void openAccount(int value) {
        bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}