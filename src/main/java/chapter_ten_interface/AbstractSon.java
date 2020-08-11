package chapter_ten_interface;

import chapter_ten_interface.Abstract.AbstractGrandFather;

public   class AbstractSon extends AbstractGrandFather {


 /*   @Override
    protected void testDefaultMethodDomain() {

    }*/

    @Override
    protected void testDefaultMethodDomain() {

    }

    public AbstractSon() {
        super();
    }

    public static void main(String[] args) {
        AbstractSon abstractSon = new AbstractSon();
        //abstractSon.testDefaultMethodDomain();
    }
}
