package day2Assignment;
import java.util.Scanner;


public class LineComparisonUC1 {
	public static void lineComp(float x1, float y1 , float x2 ,float y2) {
		
		float length =  (float) Math.sqrt((x2 - x1)*(x2 - x1)  + (y2- y1)*(y2 -y1));
		System.out.println(length);
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO LINE COMPARISION COMPUTATION PROGRAM");
        System.out.println("Enter the co-ordinates of line:");
        Scanner sc = new Scanner(System.in);
       float x1 = sc.nextInt();
       float y1 = sc.nextInt();
       float x2 = sc.nextInt();
      float y2 = sc.nextInt();
      lineComp(x1,x2,y1,y2);
		
		

	}

}
