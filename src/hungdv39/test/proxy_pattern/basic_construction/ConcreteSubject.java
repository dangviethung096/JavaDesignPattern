package hungdv39.test.proxy_pattern.basic_construction;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("Do some work inside " + ConcreteSubject.class.getName());
    }
}
