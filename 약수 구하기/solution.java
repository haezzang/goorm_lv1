import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		for(int i=1; i<=a; i++){
				if(a%i==0) System.out.print(i+" ");		
		}
	}
}