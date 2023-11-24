
public class Clock {

    public static void main(String[] args) {
        int result= getSeconds(18,32,47);
        System.out.println("18時間32分47秒を秒で表わすと："+result);
    }

    public static int getSeconds(int hour,int min,int sec) {
        hour    = hour *60 * 60;
        min     = min * 60;
       int result = hour + min + sec;
       return result;
    }


}
