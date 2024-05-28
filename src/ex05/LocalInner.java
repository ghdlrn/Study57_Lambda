package ex05;

class LocalClass {

    private int localClass = 1; //인스턴스변수 객체 생성시

    public void func() {

        int localVar = 2;   //지역변수 함수 호출시--변경불가

        class InnerClass {  //지역 클래스

            int innaerVar = 3;  //인스턴스 변수 객체 생성시

            public void print() {
                System.out.println(localClass);
                System.out.println(localVar);
                System.out.println(innaerVar);
            }
        }

        InnerClass inner = new InnerClass();
        inner.print();
    }
}

public class LocalInner {
    public static void main(String[] args) {

        LocalClass localClass = new LocalClass();

        localClass.func();
    }
}
