package example;

interface Max {
    int max(int a, int b);
}

public class ex1 {

    public static void main(String[] args) {

        Max max = new Max() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        System.out.println(max.max(3, 4));

        Max max2 = (a, b) -> a > b ? a : b;
        System.out.println(max2.max(3, 4));
    }
}
