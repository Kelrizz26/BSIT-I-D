import java.util.Scanner;
public class CAMPOS_ACTIVITY_V {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    if (age==0 && age<=11){
        System.out.println("Child");
     }
     if else (age==12 && age<=17){
        System.out.println("Teen");
     
     } else (age==18 && age<=64){
        System.out.println("Adult");
     }
}
}
