package demo;

/**
 * 单例-4
 * Created by Jims on 2017/2/26.
 */
public class Singleton04 {
    private Singleton04(){
        System.out.println("Singleton04 is create");
    }
    //public的作用是允许外部直接访问该变量
    //static的作用是让外部可以使用 类名.变量名 的方式来访问变量
    //final的作用是禁止外部对该变量进行修改
    public static final Singleton04 instance = new Singleton04();
}
class Test04{
    public static void main(String[] args) {
        //创建单例
        Singleton04 singleton04 = Singleton04.instance;
    }
}
