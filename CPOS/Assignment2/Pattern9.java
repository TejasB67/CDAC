class Pattern9{

	public static void main(String[] args){
		
		for(int i=5; i>=1; i--){
			char ch='A';
			for(int j=1; j<=5; j++){
				if(i<=j){
					System.out.print(ch+" ");
					ch++;
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}