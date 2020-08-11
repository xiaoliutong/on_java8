package chapter_nine_morebind;

public class SpecialExtendSon extends SpecialExtend {

    public void print(){
        System.out.println("my is son");
    }

    public void fatherPrint(){
        System.out.println("my is son");
    }

    @Override
    public void get() {
        int c = staticFiled;
        staticPrint();
        staticFiled=3;
        System.out.println(filed);
    }

    public static void main(String[] args) {
        SpecialExtend specialExtend = new SpecialExtendSon();
          specialExtend.get();
        //specialExtend.
    }
}
