package patterns.singleton;

public class TestSingletonPattern {
    public static void main(String[] args) {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();
        System.out.println(dateUtil1.equals(dateUtil2));
        System.out.println(dateUtil1==dateUtil2);

    }
}
