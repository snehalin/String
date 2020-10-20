//Collections of characters
/*
 * java.lang
String s="abc";//literal
String s1=new String();//new
Immutable:-Original String not modified
*/
public class StringDemo {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="abcd";
		System.out.println("s1="+s1+" s2="+s2);
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		String s3=new String ("Hello");
		String s4=new String ("Hello");
		System.out.println("s3="+s3+" s4="+s4);
		System.out.println(s3.hashCode()+" "+s4.hashCode());
		
		char c[]= { 'a','b','c','g','k','l'};
		
		String s5=new String(c);
		System.out.println(s5);
		
		String s6=new String(c,2,3);//start index,no.of characters
		System.out.println(s6);
		
		int i[]= {10,65,66,67,68,50};
		String s7=new String(i,1,3);
		System.out.println(s7);
		
		//length
		s1="AhefAshiAne";
		int l=s1.length();//
		System.out.println("Length of "+s1+"="+l);
		// char charAt(int);
		//char ch=sc.next().charAt(0)
		char ch=s1.charAt(0);
		System.out.println("charAt(0) of "+s1+"="+ch);
		
		//indexOf(int)
		
		System.out.println(s1.indexOf(65));//0
		
		System.out.println(s1.indexOf(65,2));//-1  2-index
		
		System.out.println(s1.lastIndexOf(65));
		
		System.out.println(s1.lastIndexOf(65,6));
		
		System.out.println(s1.concat(s2));
		System.out.println("s1="+s1);
		
		//replace(char, char)
		String s8=s1.replace('A', 'B');
		System.out.println(s8);
		System.out.println("s1="+s1);
		
		
		String x="hello"; //scp
		String y="hello";//scp
		String z=new String("hello");//heap
		String p=new String("hello");//
		if(p==z)//Reference   ,not equals
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
		
		
		if(x.equals(z))//contents
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
		
		int j=x.compareTo(y);
		System.out.println("j="+j);
		
	//	if()
		String a="abcxyz";
		String b="abc";
		
	 j=a.compareTo(b);
		System.out.println("j="+j);
		
		
		
		
		
		
	}

}
