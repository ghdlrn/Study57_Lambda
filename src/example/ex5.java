package example;

import java.util.function.Function;

interface SumArr {
    int sum(int[] arr);
}

public class ex5 {

    public static void main(String[] args) {
        SumArr sumArr = new SumArr() {
            @Override
            public int sum(int[] arr) {
                int sum = 0;
                for(int i : arr)
                    sum += i;
                return sum;
            }
        };
        int[] arr = {1,2,3,4,5};
        int result = sumArr.sum(arr);
        System.out.println(result);

        System.out.println("---------------------------------");

        SumArr sumArr2 = arr2 -> {
            int sum = 0;
            for(int i : arr)
                sum += i;
            return sum;
        };
        int result2 = sumArr2.sum(arr);
        System.out.println(result2);

        System.out.println("---------------------------------");

        Function<Integer[], Integer> fun = arr3 -> {
            int sum = 0;
            for(int i : arr)
                sum += i;
            return sum;
        };
    }
}
