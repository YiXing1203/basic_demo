public class Test2 {
    public static void main(String[] args) {

        String strTest1 = "abc";
        String strTest2 = new String("test");
        if (strTest1.equals("abc")) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        if (strTest2 == "test") {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
