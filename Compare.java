public class Compare {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hi";
		//toCharArray()
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		 
		 System.out.println(s3.toLowerCase());
		
     char c1[]=s1.toCharArray();
     char c2[]=s2.toCharArray();
      int cnt=0;
     if(c1.length!=c2.length)
    	 System.out.println("string are not equal");
     else
     {
     for(int i=0;i<c1.length;i++)
     	{
     		if(c1[i]==c2[i])
     		{cnt++;
     			
     		}
     	}
    
     if(cnt==c1.length)
     	 System.out.print("String are equals");
     else
    	 System.out.println("Strings are not equal");
     }
}}
