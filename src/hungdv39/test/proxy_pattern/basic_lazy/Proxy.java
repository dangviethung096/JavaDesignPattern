package hungdv39.test.proxy_pattern.basic_lazy;

public class Proxy extends Subject {
    private static Subject subject;
    static int count = 0;

    @Override
    public void doSomeWork() {
        System.out.println("Do some work in " + Proxy.class.getName());
        if (subject == null) {
            subject = new ConcreteSubject();
            count++;
        }

        subject.doSomeWork();
    }
}
