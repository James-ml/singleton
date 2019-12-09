package demo;

/**
 * 单例-1
 * 不足：无法对instance实例做延迟加载
 * Created by Jims on 2017/2/24.
 */
public class Singleton01 {
    //Singleton01的对象
    private Singleton01() {
        System.out.println("Singleton01 is create");
    }

    private static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("Create String in Singleton01");
    }
}

class Test {
    public static void main(String[] args) {
        Singleton01.getInstance().createString();
        //Singleton01.createString();//这种方式没有使用单例类
    }
}
