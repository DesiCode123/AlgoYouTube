public class Main {

    public static void main(String[] args) {

        MultiTreadTest multiTreadTest = new MultiTreadTest();
        MultiTreadTest multiTreadTest2 = new MultiTreadTest();
        MultiTreadTest multiTreadTest3 = new MultiTreadTest();
        multiTreadTest.start();
        multiTreadTest2.start();
        multiTreadTest3.start();

    }
}
