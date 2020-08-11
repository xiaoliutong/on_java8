package chapter_nine_morebind;

public class SpecialExtend {
    public int filed;
    public static int staticFiled;
    public void get(){

    }
    private  void fatherPrint(){
        System.out.println("my is father");
    }
    public static  void staticPrint(){
        System.out.println("我是静态方法");
    }

    public static void main(String[] args) {
        SpecialExtend specialExtend = new SpecialExtendSon();
        specialExtend.fatherPrint();
    }
}
