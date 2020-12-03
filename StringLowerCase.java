
public class StringLowerCase {

	public static void main(String[] args) {
		String s1="ABCD";//65 66 67 68
		      //  "abcd"   97 98 99 100        
		 char c[]= s1.toCharArray();
		System.out.println("before");
		 for(int i=0;i<c.length;i++)
		 {		 
           System.out.print(c[i]);
		 }
		 for(int i=0;i<c.length;i++)
		 {
			int j=(int)c[i];//65
			c[i]=(char)(j+32);//97
		 }
		 
		 System.out.println("\nAfter");
		 for(int i=0;i<c.length;i++)
		 {
		 System.out.print(c[i]);
		 } 
	}

}
