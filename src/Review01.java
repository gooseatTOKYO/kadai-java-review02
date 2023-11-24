//税込価格の計算
public class Review01 {

    public static void main(String[] args) {
        //tax(int price,double rate)の呼び出し　※税抜価格1500円、消費税率10%は固定
        double result = tax(1500, 10);

        //演算結果の表示
        System.out.println(1500 + "円の商品の税込価格は"+ (1500 + (int)result) + "円（消費税は" + (int)result + "円）です。");
    }

    // int型変数1つ、double型を受け取り、乗算結果を表示するtaxメソッド
    public static double tax(int price,double rate) {
        rate = rate * 0.01;                           //百分率計算用
        double result= price * rate;                //消費税額の計算
        return result;
    }

}
