package example;

interface Roll {
    int roll();
}

public class ex4 {

    public static void main(String[] args) {

        Roll roll = new Roll() {
          @Override
          public int roll() {
              return (int)(Math.random()*6);
          }
        };
        System.out.println(roll.roll());

        Roll roll2 = () -> (int)(Math.random()*6);
        System.out.println(roll2.roll());
    }
}
