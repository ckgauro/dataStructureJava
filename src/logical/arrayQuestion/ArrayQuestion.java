package logical.arrayQuestion;

public class ArrayQuestion {

	public static void main(String[] args) {
		System.out.println(new ArrayQuestion().check(new  int[]{2,4,2,4,1,4}, 3));

	}
	boolean check(int[]a,int b)
	{
		int []c=new int[b];
		
		for(int i:a)
		{
			int k;
			for ( k=0;k<b;k++)
			{
				if (c[k]==i )
				{
					break;
				}
				else if (c[k]==0)
				{
					c[k]=i;
					break;
				}
				
			}
			if(k==b)
				return false;
			
		}		
		
		return true;
	}

}
