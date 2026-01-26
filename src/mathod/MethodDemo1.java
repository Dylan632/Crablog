package mathod;

public class MethodDemo1 {
    static void main() {
        /*
        定义一个方法，求两数之和
        定义格式： public static 返回值类型 方法名(参数1, 参数2, ...){
            方法体；
            return 返回值；
        }
        注意：
        1. 方法与方法之间是平级关系，不能相互嵌套；
         */
        int sum = getSum(10, 20);
        System.out.println(sum);
    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
