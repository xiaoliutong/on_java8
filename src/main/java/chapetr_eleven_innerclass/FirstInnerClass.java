package chapetr_eleven_innerclass;

import java.io.Serializable;

public class FirstInnerClass implements Serializable {
    private String test = "";
    private InnerClass innerClass;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    private void test() {
    }

    private class InnerClass implements Serializable {
        private void getParam() {
            System.out.println(test);
        }
    }

    public static void main(String[] args) {
        FirstInnerClass firstInnerClass = new FirstInnerClass();
        firstInnerClass.test();
        InnerClass innerClass = firstInnerClass.innerClass;
        System.out.println(InnerClass.class);
        SecondInnerClass secondInnerClass = new SecondInnerClass();

    }

}

class Test {
    public static void main(String[] args) {
        FirstInnerClass firstInnerClass = new FirstInnerClass();
        firstInnerClass.getInnerClass();
        SecondInnerClass secondInnerClass = new SecondInnerClass();
       // FirstInnerClass firstInnerClass1 = secondInnerClass.getPrivateClass();
    }
}