class Pattern10{

	public static void main(String[] args){
		char ch='E';
		
		for(int i=5; i>=1; i--){
			char temp= ch;
			for(int j=1; j<=5; j++){
				
				if(i<=j){
					System.out.print(ch+" ");
					ch++;
				}
				else 
					System.out.print(" ");
			}
			ch=temp;
			ch--;
			System.out.println();
		}
		
	}
}