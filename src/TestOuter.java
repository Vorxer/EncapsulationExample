class TestOuter1 {
    static int data = 30;

    static class Inner {
        public void msg() {
            System.out.println("data is " + data);
        }
    }
}