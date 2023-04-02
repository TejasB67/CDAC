class Star14{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		for(int j=4; j>=1; j--){
			for(int k=1; k<=5; k++){
				if(k<j)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
