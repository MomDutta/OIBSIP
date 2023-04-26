package internshponjava;

import java.util.Scanner;
import java.util.Random;
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		Random rand = new Random();
		int i,j,count=0;
		System.out.println("enter any number of values of game:-");
		int num = s.nextInt();
		int arr[] = new int[num];
		int arry[] = new int[num];
		System.out.println("enter "+num+" values :-");
		for(i=0;i<num;i++) {
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++) {
			n=rand.nextInt(100);
			arry[i]=n;
		}
			//System.out.println(n);
		/*	for(j=0;j<=100;j++) {
				if(n==j) {
					count++;
				}
			} */
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				if(arr[i]==arry[j])
				{
					count++;
				}
			}
		}
		System.out.println("The numbers given as guess by user are :-");
		for(i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The numbers given as guess by user are :-");
		for(i=0;i<num;i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
		System.out.println("Total match : "+count);
		double v=(double)count;
		double p=(v/5)*100;
		System.out.println("The guessing percentage by user is : "+p);
		
		
	}

}
