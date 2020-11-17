package hungdv39.test.proxy_pattern.modified;

public class ConcreteSubject extends Subject {

    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() inside " + ConcreteSubject.class.getName());
    }
}
