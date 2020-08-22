package design_model;
/*
 *建造者模式:
 * 建造者模式拥有的优点无需考虑对象在创建过程中，（a,b,v） 的构造参数顺序的正确，
 * 在对 对象创建的时候拥有更大的控制空间
 *
 *
 * */

public class BuliderModel {
    private final String name;

    //这里需要注意的是被final修饰的属性只可以有get方法，不可以有set方法。
    public String getName() {
        return name;
    }

    static {
        System.out.println("我在调用静态方法的时候类已经被初始化了");
    }

    public static BuilderModelBulider bulider() {
        return new BuilderModelBulider();
    }

    private BuliderModel(BuilderModelBulider buliderModel) {
        this.name = buliderModel.name;
    }


    public static class BuilderModelBulider {
        private String name;

        public BuilderModelBulider name(String name) {
            this.name = name;
            return this;
        }


        public BuliderModel bulid() {
            return new BuliderModel(this);
        }

    }


}


class TestBuilder {
    public static void main(String[] args) {
        BuliderModel buliderModel = BuliderModel.bulider().name("张三").bulid();
        System.out.println(buliderModel.toString());
    }
}
