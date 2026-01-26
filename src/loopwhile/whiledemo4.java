package loopwhile;

public class whiledemo4 {
    public static void main(String[] args) {
        /*
        珠穆朗玛峰高度8848.8米，
        厚度为0.1毫米的足够大的纸，折叠多少次，可以超过珠穆朗玛峰
         */
        double height = 8848800.0;//毫米
        double thickness = 0.1;
        int count = 0;
        while (thickness < height) {
            thickness *= 2;
            count++;
        }
        System.out.println(count);
    }
}
