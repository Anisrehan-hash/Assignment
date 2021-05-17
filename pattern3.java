import java.util.*;
class pattern3
{
	public static void main(String[] a)
	{
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		name=s.next();     
		int l;
		l=name.length();   
		int nl=l+3;         
        int n2=22-nl; 
		for(int i=9;i>0;i--)
		{
			if(i==1||i==9)
			{
				System.out.println("+--------------------+");
			}
			else
			{
				for(int j=1;j<23;j++)
				{
					if(j==1||j==22) 
					{
						System.out.print("|");
					}
					else
					{
	
						if(i==3 && j==n2+1)
						{
							System.out.print(name+"  "+"|");
							break;	
						}
						else
						{
				
							System.out.print(" ");
						}
						
					}
				
				}
				System.out.println();
			}
		}
	}
}