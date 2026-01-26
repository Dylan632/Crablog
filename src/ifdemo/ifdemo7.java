package ifdemo;

public class ifdemo7 {
    public static void main(String[] args) {
        double price = 1000;
        double discountPrice = 0;

        if (price > 0) {
            if (price <= 10) {
                discountPrice = price;
            } else if (price <= 50) {
                discountPrice = price - 8;
            } else if (price <= 100) {
                discountPrice = price - 30;
            } else if (price <= 200) {
                discountPrice = price - 50;
            } else {
                discountPrice = price - 90;
            }
        } else {
            System.out.println("商品价格有误");
        }
        double memberPrice = price * 0.8;
        if (discountPrice < memberPrice) {
            System.out.println("代金券更优惠" + discountPrice);
        } else {
            System.out.println("会员价更优惠" + memberPrice);
        }
    }
}
