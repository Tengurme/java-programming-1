import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t!=0){
                String s = sc.next();
                int n = sc.nextInt();
                switch (n){
                    case 0:
                        char[] a = s.toCharArray();
                        for(int i=0;i<s.length();i++){
                            a[i]+=2;
                        }
                        String str = new String(a);
                        System.out.println(str);
                        break;
                    case 1:
                        int i=0;
                        char[] ab = s.toCharArray();
                        for(i=0;i<s.length()-1;i++){
                            System.out.print(ab[i]+".");
                        }
                        System.out.print(ab[i]);
                        break;
                    case 2:
                        StringBuilder sb=new StringBuilder(s);
                        sb.reverse();
                        System.out.println(sb);
                        break;
                        default:System.out.println("Invalid locale");
                }
                t--;
            }
        }catch (Exception e ){}
    }
}
