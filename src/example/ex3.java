package example;

interface Square {
    int square(int x);
}

public class ex3 {

    public static void main(String[] args) {

        Square square = new Square() {
            @Override
            public int square(int x) {
                return x * x;
            }
        };
        System.out.println(square.square(5));

        Square square2 = x -> x * x;
        System.out.println(square2.square(5));
    }
}
