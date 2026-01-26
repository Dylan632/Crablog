package looploop;

public class Test5 {
    public static void main(String[] args) {
        /*
        打印
        **122233
        *112223*
        111222**
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("1");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("2");
            }
            for (int j = 0; j < 2 - i; j++) {
                System.out.print("3");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
