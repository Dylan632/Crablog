package looploop;

public class test4 {
    public static void main(String[] args) {
        /*
        打印
          *****
         *****
        *****
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.println("*****");
        }
    }
}
