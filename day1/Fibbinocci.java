package week1.day1;

import java.util.Iterator;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum=0, secondNum=1, sum=0;
		System.out.println(sum);
		for (int i = 1; i < 11; i++) {
			firstNum=secondNum;
			secondNum=sum;
			sum=firstNum+secondNum;
			System.out.println(sum);
		}
		
	}

	
}
