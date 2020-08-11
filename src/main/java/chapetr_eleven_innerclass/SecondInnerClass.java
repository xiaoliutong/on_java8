package chapetr_eleven_innerclass;

public class SecondInnerClass {
    private class PrivateClass extends FirstInnerClass {

    }

    protected class ProtectClass extends FirstInnerClass {

    }

    public PrivateClass getPrivateClass() {
        return new PrivateClass();
    }

    public ProtectClass getProtectClass() {
        return new ProtectClass();
    }
}

class Test2 {
    public static void main(String[] args) {
        SecondInnerClass secondInnerClass = new SecondInnerClass();
        FirstInnerClass firstInnerClass = secondInnerClass.getPrivateClass();
        FirstInnerClass firstInnerClass1 = secondInnerClass.getProtectClass();
    }
}