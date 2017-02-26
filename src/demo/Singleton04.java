package demo;

/**
 * 单例-4
 * Created by Jims on 2017/2/26.
 */
public class Singleton04 {
    private Singleton04(){
        System.out.println("Singleton04 is create");
    }
    public static final Singleton04 instance = new Singleton04();
}
class Test04{
    public static void main(String[] args) {
        //创建单例
        Singleton04 singleton04 = Singleton04.instance;
    }
}
