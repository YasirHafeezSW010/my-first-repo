import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter units: ");
        int units= sc.nextInt();
        if (units<=50){
            System.out.println("price is: "+units*10);
        }
      else  if (units>=50&&units<=100){
            System.out.println("price is: "+units*15);
        }
      else if  (units>=101&&units<=200){
            System.out.println("price is: "+units*20);
        }
       else if (units>=201&&units<=300){
            System.out.println("price is: "+units*25);
        }
     else   if (units>=301){
            System.out.println("price is: "+units*30);
        }
    }

}
