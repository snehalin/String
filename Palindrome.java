/*
String				StringBuffer	StringBuilder
Immutable            mutable          mutable
nonSynchronize    Synchronize        nonSynchronize
fastest            slower             faster
NonThreadSafe      ThreadSafe        NonThreadSafe
*/

public class Palindrome {
//orijinal string=reverse string
	//101 abcba madam nitin
	public static void main(String[] args) {
		String str[]= {"abc","abcba","kjhn","madam","nitin"};
		//str[0].reverse(); error
    
    
		for(int i=0;i<5;i++)
		{StringBuilder sb=new StringBuilder(str[i]);
			if(sb.reverse().toString().equals(str[i]))//cba.equals(abc)
			{
				System.out.println(str[i]);
			}
		}
	}

}
