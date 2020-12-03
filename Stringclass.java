
public class Stringclass {

	public static void main(String[] args) {
		
		String s1="hello";//99
		String s2="hi";//98
		
      int i=s1.compareTo(s2);
      System.out.println(i);
      
   /* String s3 = s1.concat(s2);
      System.out.println("s3="+s3);*/
     
      
    s1= s1.concat(s2);//Immutable
      System.out.println("s1="+s1);
      
      char c[]=s1.toCharArray();
      
      
      System.out.print(c);
	}

}
