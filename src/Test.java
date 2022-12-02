public class Test {

    public static void performStaticAction() {
        Human.humanTest();
        System.out.println("STATIC ACTION");
    }

    public void performAction() {
        Human.humanTest();
        System.out.println("ACTION");
    }
}
