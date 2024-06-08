package one.digitalinnovation.gof.singleton;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonEager eager = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println("Lazy: " + lazy + ", " +
                "Eager" + eager + ", " +
                "Lazy Holder" + lazyHolder);

        lazy = SingletonLazy.getInstance();
        eager = SingletonEager.getInstance();
        lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println("Lazy: " + lazy + ", " +
                "Eager" + eager + ", " +
                "Lazy Holder" + lazyHolder);
    }
}
