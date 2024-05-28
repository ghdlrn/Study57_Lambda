package example;

interface PrintVar {

    void printVar(String name, int i);
}

public class ex2 {

   public static void main(String[] args) {

       PrintVar printVar = new PrintVar() {
           @Override
           public void printVar(String name, int i) {
               System.out.println(name + "=" + i);
           }
       };
       printVar.printVar("a", 1);

       PrintVar printVar2 = (name, i) -> System.out.println(name + "=" +i);
       printVar2.printVar("a", 1);

   }



}
