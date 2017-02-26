package demo;

/**
 * 单例-2
 * 实现延迟加载
 * 不足：降低性能（比较耗时）
 * Created by Jims on 2017/2/24.
 */
public class Singleton02 {
    private Singleton02() {
        System.out.println("Singleton02 is create");
    }

    private static Singleton02 instance = null;

    //使用同步会降低性能
    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

    public static void createString() {
        System.out.println("Create String in Singleton02");
    }
}

class Test02 {
    public static void main(String[] args) {
        Singleton02.getInstance().createString();
        //Singleton02.createString();实现延迟加载
    }
}