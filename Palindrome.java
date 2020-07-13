
public class Palindrome {

	public static void main(String[] args) {
		
		String s[]= {"aba","hello","hii","madam","nitin"};
		
		for(int i=0;i<s.length;i++)
		{
		StringBuilder s1=new StringBuilder(s[i]);
	
		if(s1.reverse().toString().equals(s[i])) //olleh.equals(hello)
		{
			System.out.println(s[i]);
		}

	   }
	}

}
