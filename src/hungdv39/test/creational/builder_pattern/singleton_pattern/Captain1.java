package hungdv39.test.creational.builder_pattern.singleton_pattern;

public class Captain1 {
    private Captain1() {
        System.out.println("Đội trưởng đã được tạo");
    }

    private static class SingletonHelper {
        private static final Captain1 captain = new Captain1();
    }

    public static Captain1 getCaptain() {
        return SingletonHelper.captain;
    }

    public static void dummyMethod() {
        System.out.println("Đây là một hàm rác trong singleton class!");
    }
}
