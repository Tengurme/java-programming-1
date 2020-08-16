import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String A = sc.next();
            String B = sc.next();
            int n = sc.nextInt();
            switch (n){
                case 1:
                    char[] aa = A.toCharArray();
                    char[] bb = B.toCharArray();
                    int sum=0;
                    for(char a:aa){
                        sum+=a;
                    }
                    for(char b:bb){
                        sum+=b;
                    }
                    System.out.println(sum);
                    break;

                case 2:
                    System.out.println(A+B);
                    break;

                case 3:
                    char[] ae = A.toCharArray();
                    int a=0;
                    for(char e:ae){
                        a+=e;
                    }
                    char[] be = B.toCharArray();
                    for(char b:be){
                        a+=b;
                    }
                    System.out.println(a);
                    break;

                    default :
                        System.out.println("Invalid Operation");
            }

        }catch (Exception e) {}
    }
}
