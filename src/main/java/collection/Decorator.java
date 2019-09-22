package collection;

public class Decorator {

    public static void main(String[] args) {
            I a ;
            a= new C(new B(new A()));
            System.out.println(a.m());
    }
}

interface I{
    String m();
}

//simple implementation
class A implements I {


    @Override
    public String m() {
        System.out.println("Call A");
        return "simple ";
    }
}

//Decorate B with A
class B implements  I{
    I a ;

    B(I a){
        this.a=a;
    }

    @Override
    public String m() {
        System.out.println("Call B");
        return a.m() + "add B ingredient";
    }
}
//Decorate C with B(but it is abstracted, might use )
class C implements  I{
    I a ;

    C(I a){
        this.a=a;
    }

    @Override
    public String m() {
        System.out.println("Call C");
        return a.m() + "add C ingredient";
    }
}