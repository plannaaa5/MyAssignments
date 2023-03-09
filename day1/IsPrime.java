package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
	int a = 9; boolean flag =false;
	for (int i = 2; i<a-1; i+=1) {
		int num=a%i;
		if (num==0) {
			System.out.println("The number "+a+" is Not Prime");
			flag = true;
			break;
		}
		
	}
	if (flag ==false)
		System.out.println("The number "+a+" is Prime");

}
}
