import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		HashSet<Character> set =new HashSet<>();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i] >='a' && a[i]<='z')
			{
				set.add(a[i]);
			}
		}
		if(set.size()==26)
		{
			System.out.println("The given string is anagram.");
		}
		else
		{
			System.out.println("The given string is not an anagram.");
		}
	}
}