package day2Assignment;
import java.util.*;
public class LineComparisonUC3 {
	public static void lineCompareEquals(float x1,float x2,float y1,float y2,float x3,float x4,float y3,float y4) {
		float length1 =  (float) Math.sqrt((x2 - x1)*(x2 - x1)  + (y2- y1)*(y2 -y1));
		System.out.println(length1);
		float length2 =  (float) Math.sqrt((x4 - x3)*(x4 - x3)  + (y4- y3)*(y4 -y3));
		System.out.println(length2);
		if(length1 == length2) 
			System.out.println("Both the lines are equal");
		else if(length1 > length2)
			System.out.println(length1 +" Line 1 is greater");
		else if(length1<length2)
			System.out.println(length2 +"Line2 is greater");
		else
			System.out.println("Both the lines are not equal");
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO LINE COMPARISION COMPUTATION PROGRAM");
        System.out.println("Enter the co-ordinates of  first line:");
       float x1 = sc.nextFloat();
       float y1 = sc.nextFloat();
       float x2 = sc.nextFloat();
      float y2 = sc.nextFloat();
      System.out.println("Enter the co-ordinates of  second line:");
      float x3 = sc.nextFloat();
      float y3 = sc.nextFloat();
      float x4 = sc.nextFloat();
     float y4 = sc.nextFloat();
		
     lineCompareEquals(x1,y1,x2,y2,x3,y3,x4,y4);

	}

}
