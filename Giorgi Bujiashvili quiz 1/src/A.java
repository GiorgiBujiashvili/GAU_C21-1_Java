import java.util.Scanner;

public class A {
    public int x;
    public int y;

    public void m1(){System.out.println("Hello");}
    public int m2() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter x: ");
        x = keyboard.nextInt();
        System.out.println("input accepted");
        return (x);
    }
    public void m3(){
        int z;
        z = x + 12;
        System.out.println (z);
    }

    public void m4(){
        if(x % 2 == 0)
            System.out.println(x + " is even");
        else
            System.out.println(x + " is odd");
    }

}

class B extends A {
    public int m5(){
        int y;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter y: ");
        y = keyboard.nextInt();
        System.out.println("input accepted");
        return (y);
    }

        public int m6(){
        int z;
        z= x+y;
        System.out.println(z);
        return (z);
    }


}