import java.util.*;


/**
 * Created by ASUS on 2015/11/21.
 */public class nn {
    public static void main(String[] args) {
        Collection collection1=new ArrayList();

        collection1.add("111");

        collection1.add("222");

        System.out.println("集合collection1的大小："+collection1.size());
        System.out.println("集合collection1的内容："+collection1);

        collection1.remove("111");//从集合collection1中移除掉 "111" 这个对象

         System.out.println("集合collection1移除 111 后的内容："+collection1);
         System.out.println("集合collection1中是否包含000 ："+collection1.contains("000"));
         System.out.println("集合collection1中是否包含111 ："+collection1.contains("111"));

         Collection collection2=new ArrayList();

         collection2.addAll(collection1);

        collection2.clear();//清空集合 collection1 中的元素
        System.out.println("集合collection2是否为空 ："+collection2.isEmpty());
        Object s[]= collection1.toArray();
    }
}

