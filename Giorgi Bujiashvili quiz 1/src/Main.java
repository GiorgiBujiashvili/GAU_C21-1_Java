public class Main {
    public static void main(String[] args){
        A a = new A();
        a.m1();
        System.out.println(a.m2());
        a.m3();
        a.m4();

        B b = new B();
        b.m5();
        System.out.println(b.m6());

        C c = new C();
        System.out.println(c.m1());
        System.out.println(c.m2());
        System.out.println(c.m3());
        System.out.println(c.m5());
        System.out.println(c.m6());
    }

}
