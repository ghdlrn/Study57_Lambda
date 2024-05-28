package Lambda02;

interface Printable {
    void print(String s);
}

public class Lambda2 {

    public static void main(String[] args) {

        Printable p = new Printable() { //익명 클래스
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
        p.print("출력할 메시지");
    }
}
