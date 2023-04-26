package internshponjava;

import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
 
class Helper extends TimerTask {
    public static int i = 1;
     
    public void run() {
        System.out.println("This is called " + i++ + " time");
    }
}
public class task4new {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String s1,pa;
	char c;
	int count=0,count1=0;
	Timer timer = new Timer();
	TimerTask task = new Helper();

	System.out.println("enter your userId:-");
	s1=s.nextLine();
	System.out.println("enter password:-");
	pa=s.nextLine();
	int l=s1.length();
	int p=pa.length();
	if(l==10 && p>=5) {
		timer.schedule(task, 1000, 10000);

		System.out.println("YOUR QUIZ");
		System.out.println("1) How much is 24*2 ?");
		System.out.println("A) 26");
		System.out.println("B) 38");
		System.out.println("C) 48");
		System.out.println("D) 68");
		
		System.out.println("enter your answer");
		 c=s.next().charAt(0);
		 if(c!='c') {
			 count++;
		 }
		 else {
			 count1++;
		 }
		 
		System.out.println("2) .75 same as ?");
		System.out.println("A) 7.5%");
		System.out.println("B) 750");
		System.out.println("C) 75%");
		System.out.println("D) 0.075%");
		System.out.println("enter your answer");
		c=s.next().charAt(0);
		if(c!='c') {
			 count++;
		 }
		 else {
			 count1++;
		 }
	System.out.println("3) The Next Primer number after 7 is?");
	System.out.println("A) 10");
	System.out.println("B) 11");
	System.out.println("C) 8");
	System.out.println("D) 14");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='b') {
		 count++;
	}
	else {
		 count1++;
	}
	System.out.println("4) The perimeter of a circle is known as?");
	System.out.println("A) square");
	System.out.println("B) Circumference");
	System.out.println("C)  Pie");
	System.out.println("D)  Parallel");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='b') {
		 count++;
	}
	else {
		 count1++;
	}
	System.out.println("5) How much is 65-43?");
	System.out.println("A) 33");
	System.out.println("B) 22");
	System.out.println("C) 32");
	System.out.println("D) 20");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='b') {
		 count++;
	}
	else {
		 count1++;
	}
	System.out.println("6) Square root of 144?");
	System.out.println("A) 12");
	System.out.println("B) 11");
	System.out.println("C) 24");
	System.out.println("D) 13");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='a') {
		 count++;
	}
	else {
		 count1++;
	}
	System.out.println("7) What comes after billion and trillion?");
	System.out.println("A) Quadrillion");
	System.out.println("B) Million");
	System.out.println("C) Lakhs");
	System.out.println("D) Multi-trillion");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='b') {
		 count++;
	}
	else {
		 count1++;
	}
	System.out.println("8) How many sides do Nonagon contains?");
	System.out.println("A) 10");
	System.out.println("B) 9");
	System.out.println("C) 8");
	System.out.println("D) 7");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='b') {
		 count++;
	}
	else {
		 count1++;
	}
	System.out.println("9) ...How much is 222+83?");
	System.out.println("A) 306");
	System.out.println("B) 305");
	System.out.println("C) 333");
	System.out.println("D) 304");
	System.out.println("enter your answer");
	c=s.next().charAt(0);
	if(c!='b') {
		 count++;
	}
	else {
		 count1++;
	}
	}
	int q;
	System.out.println(count);
	System.out.println(count1);

	if(count1>=count) {
		q=count1-count;

	}
	else {
		q=0;
	}

	System.out.println("your marks is:-"+q);
		}


}
