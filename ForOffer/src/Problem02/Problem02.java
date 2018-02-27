package Problem02;

/**
 * Created by yrd on 2018/2/25.
 *
 * 剑指Offer 面试题2
 * 实现Singleton模式
 * http://blog.csdn.net/derrantcm/article/details/45330779
 */
public class Problem02 {

    /**
     * 静态内部类，线程安全 [推荐]
     * 由于静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，
     * 第一次调用getInstance()时将加载内部类HolderClass，在该内部类中定义了一个static类型的变量instance，此时会首先初始化这个成员变量，
     * 由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。
     * 由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响
     */
    public static class Singleton5 {
        private Singleton5() {}

        private static class HolderClass {
            private static final Singleton5 instance = new Singleton5();
        }

        public static Singleton5 getInstance() {
            return HolderClass.instance;
        }
    }

    /**
     * 饿汉式，线程安全
     */
    public static class Singleton {
        private static final Singleton INSTANCE = new Singleton();

        private Singleton() {}

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }

    /**
     * 懒汉式，线程不安全
     */
    public static class Singleton2 {
        private static Singleton2 instance = null;

        private Singleton2() {}

        public static Singleton2 getInstance() {
            if (instance == null) {
                instance = new Singleton2();
            }
            return instance;
        }
    }

    /**
     * 懒汉式，线程安全，多线程环境下效率不高
     */
    public static class Singleton3 {
        private static Singleton3 instance = null;

        private Singleton3() {}

        public static synchronized Singleton3 getInstance() {
            if (instance == null) {
                instance = new Singleton3();
            }
            return instance;
        }
    }

    /**
     * 懒汉式，线程安全，变种，线程安全
     */
    public static class Singleton4 {
        private static Singleton4 instance = null;

        //静态代码块，类加载时执行一次
        static {
            instance = new Singleton4();
        }

        private Singleton4() {}

        public static Singleton4 getInstance() {
            return instance;
        }
    }

    /**
     * 懒汉式，线程安全，双重检查锁定
     */
    public static class Singleton6 {
        private Singleton6() {}

        private volatile static Singleton6 instance = null;

        public static Singleton6 getInstance() {
            if (instance == null) {
                synchronized (Singleton6.class) {
                    if (instance == null) {
                        instance = new Singleton6();
                    }
                }
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
        System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
        System.out.println(Singleton3.getInstance() == Singleton3.getInstance());
        System.out.println(Singleton4.getInstance() == Singleton4.getInstance());
        System.out.println(Singleton5.getInstance() == Singleton5.getInstance());
        System.out.println(Singleton6.getInstance() == Singleton6.getInstance());
    }

}
