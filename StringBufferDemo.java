
public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer s1 ="hello"; error
		StringBuffer s1 =new StringBuffer(20);
		System.out.println(s1.capacity());
		s1=new StringBuffer("hello");//mutable
		s1.append(false);
		System.out.println("s1="+s1);
		s1.append(10);
		System.out.println("s1="+s1);
		s1.append("hello");
		System.out.println("s1="+s1);
		
		s1.delete(3,7);
		System.out.println("s1="+s1);
		
		StringBuffer s2 =new StringBuffer("hello");
		s2.reverse();
		System.out.println(s2);//olleh
		
		s2.insert(2,10);
		System.out.println(s2);
		
		s2.insert(2,true);
		System.out.println(s2);
		
		
	
	String str1=new String ("abc");
	String str2="abc";
		
		System.out.println(str1.equals(str2));//contents
		//override contents
		
	StringBuffer str3=new StringBuffer("abc");//heap
	StringBuffer str4=new StringBuffer("abc");//heap
	
	System.out.println(str3.equals(str4));//false//object -->references
	System.out.println("after convert="+str3.toString().equals(str4.toString()));
	//true
	
	System.out.println(str3==str4);	//references
	System.out.println(str1==str2);	//references
		
	}

}
