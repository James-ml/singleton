package demo;

/**
 * 单例-3
 * 内部类创建单例
 * 好处：既可以实现延迟加载，也不会使用同步降低性能
 * Created by Jims on 2017/2/24.
 */
public class Singleton03 {
    public Singleton03() {
        System.out.println("Singleton02 is create");
    }

    private static class Singleton {
        private static Singleton03 instance = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return Singleton.instance;//创建单例
    }

    public static void createString() {
        System.out.println("Create String in Singleton03");
    }
}

class Test03 {
    public static void main(String[] args) {
        Singleton03.getInstance();//得到单例
        //Singleton03.createString();
    }
}