
public class prime_1_100 {
 public static void main(String[] args) {
	
	 System.out.println("Prime numbers between 1 and 100");
	 int flag=0;
	 for (int i = 2; i <= 100; i++) {
		 flag=1;
		 for (int j = 3; j <= i/2; j++) {
			 if (i%j == 0)
		     {
	            flag=0;
	            break;
			 }
		 }
			 
			 if (flag == 1)
			 System.out.print(i+" ");	
		}
		 
	
}
}
