package Lambda3;

@FunctionalInterface
interface Printable {
    void print(String s);

    public static void print5() {};
        default void print2() {};
        default void print3() {};
        default void print4() {};

}

class A{}

public class Lambda3 {

    public static void main(String[] args) {

        //람다
        Printable prn = (String msg) -> System.out.println(msg);
        prn.print("Hello");

        Printable prn1 = (msg) -> System.out.println(msg);
        prn1.print("Hello1");

        Printable prn2 = msg -> System.out.println(msg);
        prn2.print("Hello2");

        //메서드 레퍼런스
        Printable prn3 = System.out::println;
        prn3.print("Hello3");


    }
    /*
    *         Printable p = new Printable() { //익명 클래스
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
    * */
}
