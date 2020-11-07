package hungdv39.test.creational.builder_pattern.singleton_pattern;

public final class Captain2 {
    private static Captain2 captain;

    static int numIns = 0;

    private Captain2() {
        numIns++;
        System.out.println("Số lượng instance = " + numIns);
    }

    public static Captain2 getCaptain() {
        if (captain == null) {
            synchronized (Captain2.class) {
                if (captain == null) {
                    captain = new Captain2();
                    System.out.println("Một đội trưởng đã được bầu");
                } else {
                    System.out.println("Bạn đã có đội trưởng rồi, hãy tin tưởng anh ấy!");
                }
            }
        }

        return captain;
    }
}
