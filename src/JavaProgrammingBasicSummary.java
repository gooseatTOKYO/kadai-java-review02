
public class JavaProgrammingBasicSummary {

    public static void main(String[] args) {
        //int型2つの引数を持つaddメソッドを呼び出す
        add(45,13);

        //double型2つの引数を持つaddメソッドを呼び出し、処理結果をdouble型変数に代入
        double result= add(12.3,4.8);
        //演算結果の表示
        System.out.println("double型の加算：" + result);
    }

    //int型引数を2つ受け取るaddメソッドの定義(戻り値なし)
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("int型の加算："+result);
    }

    //double型引数を2つ受け取るaddメソッドの定義(戻り値あり)
    public static double add(double num1,double num2) {
        double result = num1 +num2;
        return result;
    }

}
