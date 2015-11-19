/**
 * Created by ASUS on 2015/11/19.
 */
/*这是用继承*/
public class First extends Thread{

    public void run(){
        //执行100次，输出语句
        for(int j = 0;j<100;j++)
            System.out.println("学姐是public，不是private。第" + j + "次");
    }
}
