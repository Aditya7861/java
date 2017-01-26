import java.util.Scanner;

class Try{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of string you want to enter");
		int n=sc.nextInt();
		String[] st=new String[n+1];
		for(int i=0;i<n;i++)
		{
			st[i]=sc.next();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(st[i].compareTo(st[j])>0)
				{
				String t=st[i];
				st[i]=st[j];
				st[j]=t;
				}
			}
		}
		System.out.println("String are in order are");
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i]);
		}
	}
}
