import java.util.Scanner;

public class C {
    public int a;
    public int b;
    public int c;

    public int m1(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a: ");
        a = keyboard.nextInt();
        System.out.println("enter b: ");
        b = keyboard.nextInt();
        System.out.println("enter c: ");
        c = keyboard.nextInt();
        return 0;
    }
    public int m2(){
        while (a >= 10)
            a /= 10;
        return a;
    }

    public int m3(){
        return (b % 10);
    }

    public int m5(){
        return (m2()*m3());
    }

    public int m6(){
        return (m3()+m5());
    }
}
