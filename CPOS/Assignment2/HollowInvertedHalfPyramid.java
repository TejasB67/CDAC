class HollowInvertedHalfPyramid{

	public static void main(String args[])
	{
	
	
		for(int i=6;i>0;i--)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==6 || j==1 || j==i){
					System.out.print("*");
			
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
			
		}
			
	
	}
}