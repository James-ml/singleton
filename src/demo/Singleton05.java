package demo;

/**
 * 枚举：饿汉式最简单的单例
 * @author JIMS
 * @create 2019-12-09-18:01
 */
public enum Singleton05 {
    instance;
}
class Test05{
    public static void main(String[] args) {
        //创建单例
        Singleton05 singleton05 = Singleton05.instance;
    }
}