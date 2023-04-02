class PyramidPattern4{
	
	
	public static void main(String[] args){
		
		
		
		for(int i=1; i<=9; i++){
			int a=0;
			
			for(int j=9; j>=1; j--){
				if(j<=i){
					System.out.print( ++a + " ");
					
				}
				else
					System.out.print("  ");
			}
			
			for(int j= a-1; j>0  ; j--){
				System.out.print( --a + " ");
			}
			
			System.out.println();
		}
	}
}