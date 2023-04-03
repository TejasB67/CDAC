class HollowFullPyramid{
	
	
	public static void main(String[] args){
		
		
		
		for(int i=6; i>=1; i--){
			
			for(int j=1; j<=6; j++){
				if(i==j  || i==1){
					System.out.print("* ");
					
				}
				else
					System.out.print(" ");
				
			}
			for(int k=5; k>=i; k--){
				if(k==i && i!=1){
					System.out.print("*");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
	}
}