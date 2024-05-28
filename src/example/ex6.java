package example;

interface EmptyArr {
    int[] emptyArr();
}

public class ex6 {

    public static void main(String[] args) {

        EmptyArr emptyArr = new EmptyArr() {
          @Override
          public int[] emptyArr() {
              return new int[] {};
          }
        };
        int[] arr = emptyArr.emptyArr();

        EmptyArr emptyArr2 = () -> new int[] {};
        int[] arr2 = emptyArr2.emptyArr();
    }


}
