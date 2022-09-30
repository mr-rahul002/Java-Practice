import java.util.Scanner;

public class div4 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
  int c= a(n);
  System.out.println(c);

           sc.close();
    }
    static int a(int n){
        int x=n & 3;
       return x;
     
    }
}
//  1 1 0
//  0 1 1
//  0 1 0
