import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
	Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int sum=0;
		for(int i=1; i<=a; i++){
			if(i%3==0 || i%5==0) sum+=i;
		}
		System.out.println(sum);
	}
}