import java.util.*;
public class Assignment1 {
    static class vbs{
        int savings;
        vbs(int savings){
            this.savings=savings;
        }
        public void decrement(){
            this.savings-=100;
        }
        public void increment(){
            this.savings+=1000;
        }

        public int getter(){
            return this.savings;
        }

        public void checkSaving(){
            if(this.savings>1000){
                System.out.println("Congratulations! You have saved a good amount" +
                        "Your current savings are Rs "+savings);
            }
            else if(savings > 0) {
                System.out.println("Insufficient saving!\n" +
                        "Your current savings are Rs "+savings);
            }
            else {
                System.out.println("You are in debt\n" +
                        "Your current savings are Rs "+savings);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<vbs> customers = new ArrayList<>();
        customers.add(new vbs((int)sc.nextInt()));
        customers.add(new vbs((int)sc.nextInt()));
        customers.add(new vbs((int)sc.nextInt()));

        for(vbs a:customers){
            a.decrement();
            a.increment();
            System.out.println(a.getter());
            a.checkSaving();
        }
    }
}
