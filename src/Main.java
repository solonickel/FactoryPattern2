public class Main {
    public static void main(String[] args) {
        Factory myShoppingFactory = new ShoppingFactory();
        Factory myBankingFactory = new BankingFactory();

        App chaseBank = myBankingFactory.factoryMethod();
        chaseBank.display();

        App temu = myShoppingFactory.factoryMethod();
        temu.display();
    }
}
