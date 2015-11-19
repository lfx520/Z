/**
 * Created by ASUS on 2015/11/19.
 */
/*这是用接口*/
 class Sec implements Runnable{

    public void run(){
        //执行100次，输出语句
        for(int j = 0;j<100;j++)
            System.out.println("学长是private，不是pubilc。第" + j + "次");
    }
}
