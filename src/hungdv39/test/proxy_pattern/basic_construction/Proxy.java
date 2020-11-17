package hungdv39.test.proxy_pattern.basic_construction;

public class Proxy extends Subject {
    private static Subject subject;
    static int count = 0;

    public Proxy() {
        subject = new ConcreteSubject();
        count++;
    }

    @Override
    public void doSomeWork() {
        System.out.println("Do some work in " + Proxy.class.getName());

        subject.doSomeWork();
    }
}
