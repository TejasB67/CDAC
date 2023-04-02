class Star11{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(j<i){
					System.out.print(" ");
				}
				else 
					System.out.print("*");
					
			}
				
			for(int k=1; k<=i-1; k++){
					System.out.print("*");
			}
			System.out.println();
		}
	}
}