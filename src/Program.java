import java.util.Scanner;

public class Program {
    public static void main(String [] args){

//        System.out.println("Hello World");
//        System.out.print("Hello World\n");
//        System.out.println("Hello World");
//        int x=7;
//        int y=2;
//        System.out.print(x%y);
//        String t="\\";
//        boolean k=true;
//        char ta='9';
//        System.out.println("\n");
//        System.out.println("Cem:"+(x+y));
//        float type=12.6f;
//        byte c=12;
//        int a=c;
//        System.out.println(a);
//        int t=(int) type;
//        System.out.println(t);
//        var k=14;
//        System.out.println(k);
//        object p=12;
//        Syste.out.prinln(p);
        /**
          int x=3;
          int y=2;
          System.out.println("Netice:"+(double)x/y);
          int t=3;
          System.out.println("Netice t:"+t);//3
          int a=t++;
          System.out.println("Netice a:"+a);//3
          int b=t;
          System.out.println("Netice b:"+b);//4
          int c=++t;
          System.out.println("Netice c:"+c);//5
          int d=t;
          System.out.println("Netice d:"+d);//5
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Zehmet olmasa fesil daxil et:");
        int fesil=sc.nextInt();
        if((fesil>=1&&fesil<3)||fesil==12){
            System.out.println("Qis");
        }
        else if(fesil>=3&&fesil<6){
            System.out.println("Yaz");
        }
        else if(fesil>=6&&fesil<9){
            System.out.println("Yay");
        }
        else if(fesil>=9&&fesil<12){
            System.out.println("Payiz");
        }
        else{
            System.out.println("Bele bir fesil movcud deyil");
        }
        int a=4;
        int b=5;
        //double c=default(double);
        System.out.println("a="+a+",b="+b);
        System.out.println(c);
    }


}
