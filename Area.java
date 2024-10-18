//program to find area of rectangle
import java.util.Scanner;
public class Area{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a*b;
        System.out.println("area of the rectangle is :"+ area);
    }
}
