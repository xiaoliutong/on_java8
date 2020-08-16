package chapter_six;



/**
 * @Description: 在编程语言中大家通常对一个对象进行初始化的操作，但是大部分人可能会忘了调用这些
 * 初始化的方法，java设计者为了更加方便编程者的使用引入了构造器的概念就是在创建对象的
 * 过程中进行初始化操作，既然解决了初始化操作的问题
 * 我们还需要注意构造器方法命名的问题，在这里如果构造器的方法和程序中其他的元素进行了重名
 * 则会引发其他的问题，这里java使用了和c中一样的做法构造器的方法的和类名一样。
 * 这里需要注意的一点是这个构造器的方法 不同于我们其它方法的命名规范首字母并没有进行小写
 * @Author: LiuZhuangZhuang
 * @CreateDate: 2020/6/30 10:58
 * @UpdateUser: LiuZhuangZhuang
 * @UpdateDate: 2020/6/30 10:58
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class ObjectInit {
    /**
     * 方法实现说明
     * 方法的重载的定义：在一个类中方法名字相同但是返回值和参数的形式不同
     * 在构造方法这个层面更加需要方法的重载
     *
     * @author LiuZhuangZhuang
     * @description
     * @date 2020/6/30 11:20
     */
    public void methodReload() {
    }

    public String methodReload(String a) {
        return a;
    }

    /**
     * 方法实现说明
     *
     * @author LiuZhuangZhuang
     * @description 一般来说的话我们在这个类中不去创建构造方法的话 当我们创建对象的时候
     * 编译器会默认帮你创建下面的无参构造器但是当你在一个类创建了有参构造但是没有建造无参构造的话
     * 当你实例化这个对象的时候如果是这种 new ObjectInit()的话编译器不在帮你创建无参构造会提示错误。
     * @date 2020/6/30 13:38
     */
    public ObjectInit() {
    }

    public ObjectInit(int a) {

    }

    // public static void main(String[] args) {
    ObjectInit objectInit = new ObjectInit();
    //BeanUtils.copyProperties();
    // }


    /**
     * 方法实现说明
     *
     * @author LiuZhuangZhuang
     * @description this关键字注意只可以在非静态方法里进行调用 this的含义是当前对象的引用。
     * this的高级用法（在构造器里面调用构造器）这里不同于外部的重载编译器可以很显示的知道调用那个方法.
     * 这里this可以来做方法参数的名字和类成员变量名字一样指定赋值问题。
     * @date 2020/6/30 13:50
     */
    private String a;

    public ObjectInit(String a) {
        this(1);
        this.a = a;
    }

    public ObjectInit  getThis(){
        return this;
    }

    /**
     * 方法实现说明
     * @author LiuZhuangZhuang
     * @description
     * 首先要明白垃圾回收是来做甚么的？垃圾回收是来释放对象占用的内存，
     * finalize方法是来让编程人员可以掌控的方法，用来让程序员可以释放想要释放的资源。
     *finalize方法：当一个对象被垃圾算法计算出不可达 该对象拥有一次自我拯救的机会，前提是该对象覆写了object的finalize方法
     *把this（当前对象引用）赋值给一个对象的变量 例如 Object.a=this 这样这个对象重新被计算的时候就变换为了可达的
     * 该方法在垃圾回收前只会被调用一次 但是并不能保证这个方法会被完整的执行（比如这个方法在释放资源的时候太慢被垃圾回收了直接处死）
     * 我们需要注意的是垃圾回收和终结方法都不一定会被调用 因为jvm内存不是不够用是不会来调用垃圾回收器来回收毕竟这也是需要消耗资源的。
     * @date 2020/6/30 14:51
     */


    /**
     * 方法实现说明 构造器初始化
     *
     * @author LiuZhuangZhuang
     * @description 初始化:首先纠正自己一个误区 我们所说的初始化分为类的初始化和对象的初始化，
     * 如下面的示范例子。会先对a进行初始化赋值 然后构造器赋值 这是属于对象初始化的层次
     * 从类初始化角度 来看下面的打印顺序 类先进行初始化（类初始化的概念是静态代码段执行和类变量的赋值过程）
     * @date 2020/7/2 14:52
     */
    public static class Constructor {
        TestObjectAndClassInitOrdinal testObjectAndClassInitOrdinal1 =
                new TestObjectAndClassInitOrdinal(2);
        static TestObjectAndClassInitOrdinal testObjectAndClassInitOrdinal =
                new TestObjectAndClassInitOrdinal(1);
        int a = 10;

        public Constructor() {
            System.out.println(a);
            a = 100;
            //System.out.println(a);
            //打印顺序为 1
            //2
            //10
            //100
        }

        public static void main(String[] args) {
            System.out.println(new Constructor().a);
        }
    }

    public static class TestObjectAndClassInitOrdinal {
        public TestObjectAndClassInitOrdinal(int param) {
            System.out.println(param);
        }
    }

    /**
     * 方法实现说明
     *
     * @author LiuZhuangZhuang
     * @description 在类中变量初始化的顺序取决于它们在类中定义的顺序
     * 下面的例子还可以说明一点 在类的加载，验证，准备，解析，初始化阶段
     * 解析过程会解析本类中变量对应的对象 加载对象对应的类相应的类进行初始化。
     * @date 2020/7/2 16:29
     */

    /*
     *数组的初始化的几种形式
     *
     *  */
    int[] array = {1, 3, 4};
    int[] array1 = new int[10];
    //这种方法也是指明了数组的长度
    int[] array2 = new int[]{111, 222};


    /*
    关于方法的可变参数列表，java5新引入的特性。如下几种形式。
     * */
    //这里参数入参 如果是printArray("66","77")这种形式会被封装成string「」 数组
    //我们也可以直接入参个字符串数组  这里编译器会判断如果为数组就不会转换了。
    //关于这种方法的重载细节看如下两个方法的重载和出现的问题。看reload方法
    private static void printArray(int i, String... params) {
        System.out.println(params.length);
        for (String param : params) {
            System.out.println(param);
        }
    }

    private static void printArray(String... params) {
    }

    public static void main(String[] args) {
        String[] params = {"777"};
        //printArray("77",params);    ---这种方式会进行报错
        printArray("22", "777");//1
        printArray();//---reload
        printArray(params);//2
        printArray(2,params);
    }

}
enum  Enum{

    MAA,TTT,SSS;
    /*
     *枚举类型  做为一个常量的集合来使用
     *   首先这里的每个存在的都为一个实例 按照命名规则全部进行大写
     *
     *
     *
     * */
    public static void main(String[] args) {
        //这说明编译器会实现其string方法
        int a = Enum.MAA.ordinal();
        System.out.println(a);
    }
}