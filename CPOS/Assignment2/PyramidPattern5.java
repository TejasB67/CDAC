class PyramidPattern5{
	
	
	public static void main(String[] args){
		
		
		
		for(int i=9; i>=1; i--){
			int a=0;
			
			for(int j=1; j<=9; j++){
				if(i<=j){
					System.out.print( j + " ");
					
				}
				else
					System.out.print("  ");
				a=j;
			}
			
			for(int k = a-1 ; k>=i  ; k-- ){
				System.out.print(k+" ");
			}
			
			
			System.out.println();
		}
	}
}