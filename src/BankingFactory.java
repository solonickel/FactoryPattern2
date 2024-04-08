public class BankingFactory implements Factory{

    @Override
    public App factoryMethod() {
        return new BankingApp();
    }
}
