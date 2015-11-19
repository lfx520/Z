/**
 * Created by ASUS on 2015/11/19.
 */
public class Test {
    public static void main(String[] args){

        First f = new First();
        Sec s = new Sec();
        Thread t = new Thread(s);

        f.start();
        t.start();
    }
}