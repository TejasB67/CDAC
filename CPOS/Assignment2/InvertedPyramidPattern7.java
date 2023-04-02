class InvertedPyramidPattern7{

	public static void main(String args[])
	{
	
	
		for(int i=9;i>0;i--)
		{
			for(int j=9;j>0;j--)
			{
				if(i<j){
					System.out.print(" ");
			
				}
				else
					System.out.print(i+" ");
			}
			
			System.out.println();
			
		}
			
	
	}
}