package chapater_eight_copy;

public class TestFinalSon extends TestFinal {
    //这里需要注意，如果这里没有指定父类的构造函数，则会报错。
    public TestFinalSon(User user) {
        super(user);
    }


}
