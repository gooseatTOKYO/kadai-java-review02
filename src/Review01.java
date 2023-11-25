//税込価格の計算
public class Review01 {

    public static void main(String[] args) {
        //tax(int price,double rate)の呼び出し ※税込価格1500円、消費税率10%の場合
        int price = 1500;
        int rate = 10;
        int result = tax(price, rate);

        //演算結果の表示
        System.out.println(price + "円の商品の税込価格は"+ (price + result) + "円（消費税は" + result + "円）です。");
    }

    // int型変数1つ、double型変数1つを受け取り、乗算結果として消費税額を計算するtaxメソッド
    public static int tax(int price,double rate) {
        rate = rate * 0.01;                         //百分率計算用
        double result= price * rate;                //消費税額の計算
        return (int)result;
    }

}
