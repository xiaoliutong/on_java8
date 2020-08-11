#多态概述

--- 
>多态（也可以被称为动态绑定和后期绑定）
>绑定的概念：将方法调用和方法主体进行绑定
>多态降低类的耦合（用来区分一个类和相似类之间的区别这主要通过方法的行为来区分）

---
##关于私有方法,静态方法，属性向上转型（继承）的问题
>这里向上转型之后父类调用私有方法打印出是父类的打印内容（证明私有方法是无法被重写的，事实上私有方法默认被final修饰）
>属性向上转型（都不可行）
>静态方法（都不可行）
##多态和继承的区别
>继承这里表示的是拥有，只要是权限修饰符允许,不被final修饰的（属性，方法等哪怕是静态属性） 派生类都可以拥有
>多态表示的更多是转型的问题，只有方法可以向上转型为子类的方法（但是被private，final，static 修饰的这些被限制为基类专属的东西
无法被派生类复写） 属性是不可以的。
```java
public class SpecialExtend {
    public int filed;
    public void get(){

    }
    private  void fatherPrint(){
        System.out.println("my is father");
    }
    public static  void staticPrint(){

    }

    public static void main(String[] args) {
        SpecialExtend specialExtend = new SpecialExtendSon();
        specialExtend.fatherPrint();
    }
}

public class SpecialExtendSon extends SpecialExtend {

    public void print(){
        System.out.println("my is son");
    }

    private void fatherPrint(){
        System.out.println("my is son");
    }
}
```
---
关于封装，继承，多态的概述
>封装把一个类状态和行为进行封装使其成为程序的特殊数据类型 划分了接口与实现（这里的实现是自身类代码实现的细节）
>继承可以使一段代码无差别的运行在基类派生类中 统一管理
>多态是划分了变化的和不变化的，
这三大特征都是帮助系统更好的成长，扩展，更好的优化我们的代码。
---