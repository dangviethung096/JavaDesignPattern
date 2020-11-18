package hungdv39.test.proxy_pattern.basic_lazy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Proxy px = new Proxy();
        px.doSomeWork();

        Proxy px2 = new Proxy();
        px2.doSomeWork();

        System.out.println("Number init = " + Proxy.count);
    }
}
