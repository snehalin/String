
public class StringEqualsMethod {
public static void main(String args[])
{
	String s1="   hello world   ";
	System.out.println("s1.length()="+s1.length());
	String res=s1.trim();//res=hello world
	System.out.println("length after trim()="+res.length());
	 
	int i=res.lastIndexOf("l",4);//It will search from 4 backword and 
	//displays index where first occurance of "l" present.
	System.out.println("i="+i);
	
	int j=res.lastIndexOf("l");
	System.out.println("j="+j);
	
	String h1="hello";
	String h2="hello";
	String h3=new String("HELLO");
	System.out.println("Using ==");
	if(h1==h3)//reference
	{
		System.out.println("Strings are equal");
	}
	else
	{
		System.out.println("Strings are not equal");
	}
	System.out.println("Using equals()");
	if(h1.equals(h3))//contents
	{
		System.out.println("Strings are equal");
	}
	else
	{
		System.out.println("Strings are not equal");
	}
	System.out.println("Using equalsIgnoreCase()");
	if(h1.equalsIgnoreCase(h3))
	{
		
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
	}
	
 s1="hefshinea";
 String s2="hefshinec";
 
	
	//<=> ascii value difference
	 i=s1.compareTo(s2);
	 System.out.println("i="+i);//i=-2
	 
	String s3="helloabc";
	String s4="hello";
	
	 i=s3.compareTo(s4);
	 System.out.println("i="+i);//i=3
	
	 
	 String s5="acb";//a=98
	 String s6="acd";//c=100
	 System.out.println("s5.compareTo(s6)="+s5.compareTo(s6));
	

	byte b[]=s5.getBytes();
	
	for(i=0;i<b.length;i++)
	{
		System.out.println(b[i]); //97 99 98
	}
	s5="abCD";
	char c[]=s5.toCharArray();
	
	char res1[]=new char[c.length];
	
	
	for(i=0;i<c.length;i++)
	{      
		if(c[i]>=97 && c[i]<=126)		
		{
			res1[i]=(char) (c[i]-32);
		}
		else
		{
			res1[i]=c[i];
		}
	}
	System.out.println();
	for(i=0;i<c.length;i++)
	{  
	 System.out.print(c[i]);
	}
	System.out.println("After result ");
	for(i=0;i<c.length;i++)
	{  
	 System.out.print(res1[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
