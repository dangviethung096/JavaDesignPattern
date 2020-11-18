package hungdv39.test.proxy_pattern.modified;


public class ModifiedProxyPatternExample {
    public static void main(String[] args) {
        ModifiedProxy px1 = new ModifiedProxy("Admin");
        px1.doSomeWork();

        ModifiedProxy px2 = new ModifiedProxy("Robin");
        px2.doSomeWork();
    }
}
