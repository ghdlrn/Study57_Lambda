package ex04;

interface Printable {
    void print();
}

class Papers {

    private final String msg;

    public Papers(String msg) { this.msg = msg; }

    public Printable getPrinter() {

        class Printer implements Printable {

            @Override
            public void print() {
                System.out.println(msg);
            }
        }

        return new Printer();
    }
}

public class LocalInnerClass {

    public static void main(String[] args) {
        Papers p = new Papers("전송할 페이지");

        Printable prn = p.getPrinter();
        prn.print();
    }

}
