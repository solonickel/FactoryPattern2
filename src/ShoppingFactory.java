public class ShoppingFactory implements Factory{

    @Override
    public App factoryMethod() {
        return new ShoppingApp();
    }
}
