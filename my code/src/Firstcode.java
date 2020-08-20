public class Firstcode
	{
		public static void main(String args[])
		{
			int k=0;
			for(int i=1;i<=4;i++)
				{
				       if(i<=2)
				       {
				    	   k++;
				       }
				       else
				       {
				    	   k=5-i;
				       }
			
						for(int j=1;j<=4;j++)
						{
							if(j<=3-k||j>=2+k)
							{
								System.out.print(" $");

							}
							else
							{
								System.out.print("  ");
							}
														
						}
						System.out.println();
				}
		}
			
		}





