
public class StringDemo1 {

	public static void main(String[] args) {
		//
	//String is	class
int i=10;
		String name="xyz";
		//package -lang
		/*
		 class String
		 {
		 ---
		 ---
		 ---
		 }
		 */
		
		//1 .By using new Keyword
		//2. By using Literal
		char c[]={'1','2','a','A','@'};
		String ob=new String(c);
		String str="Pune";
		System.out.println(ob+" "+str);
		
		//Immutable- can not modify
		
		String s1=new String();
		
		          //0    1    2  3   4
		char c1[]= {'a','b','c','1','$'};
		String s2=new String(c1);
		String s3=new String(c1,1,3);//1-starting index 3 =ending index
		System.out.println(s3);// s3=bc1
		int a[]= {97,98,99,100,101,102,103,104};
		String s4=new String(a,2,4);//2-starting index  ,4-count
		System.out.println(s4);
		
		System.out.println("s4 length="+s4.length());
		
		String s5="hefshine";
		System.out.println("s5 length="+s5.length());
		
		String s6=s5.toUpperCase();
		System.out.println("s6="+s6+" "+"s5="+s5);
		
		String s7=s6.toLowerCase();  //01234567
		System.out.println("s7="+s7);//hefshine
		//indexOf method returns index of first occurance of given character or string
		int k=s7.indexOf("e");
		int j=s7.indexOf(101);
		int l=s7.indexOf('b');
		System.out.println("k="+k+" "+"j="+j+" l="+l);
		
		//charAt()
		
		char c3=s7.charAt(4);
		System.out.println("c3="+c3);//h
		
		//System.out.println("s7.charAt(14)="+s7.charAt(14));
		
		System.out.println("s7.concat(hello)="+s7.concat("hello")+" s7="+s7);
		
		String s8="     hello  hefshine   ";
		
		System.out.println(s8);
		
	System.out.println("s8.length="+s8.length());
		
	System.out.println("s8.trim()="+s8.trim()+" s8 length="+s8.trim().length()) ;
		
		String s9="helloworld";
		String s10=s9.substring(3);
		
		 System.out.println("s10="+s10);
		 
		 System.out.println("s9.lastIndexOf(a)="+s9.lastIndexOf("a"));
		
		 System.out.println("s9.lastIndexOf(l,3)="+ s9.lastIndexOf('l',3));
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
