import java.util.Scanner;
class PyramidPattern3{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of lines");
		int line=sc.nextInt();
		
		for (int i=1; i<=line ;i++){
			for(int j=line-1; j>=i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}


}