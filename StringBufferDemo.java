
public class StringBufferDemo {

	public static void main(String[] args) {
		// mutable-can modify original contents
		
		/*String        		StringBuffer
		 1.Immutable    		 Mutable
		 2.not Synchronized      Synchronized
		 3.Can be created        Can not be created using Literal
		    using Literal
		 4.  Not ThreadSafe      Threadsafe
		 5.faster                    slower
		 */
		
		//StringBuffer s1="hello"; error
		
		StringBuffer s1=new StringBuffer();//default capacity=16
		System.out.println("s1.capacity()="+s1.capacity());
		
		StringBuffer s2=new StringBuffer("abcdefghijklmnopkk");
		System.out.println("s2.capacity()="+s2.capacity());
		
		
		StringBuffer s3=new StringBuffer(20);
		System.out.println("s3.capacity()="+s3.capacity());
		
		
		String sa="hello";
		String sb="hi";
		
		sa.concat(sb);  
		System.out.println("sa="+sa);
		
		
		StringBuffer s4=new StringBuffer("hello");
		StringBuffer s5=new StringBuffer("hii");
		
		s4.append(s5);
		System.out.println("s4="+s4);
		 
		s4.append(true);
		System.out.println("s4="+s4);
		
		s4.insert(1,"ghkll");
		System.out.println("s4="+s4);
		
		       //strt index,end index
		s4.delete(7,9);//9 not included
		System.out.println("s4="+s4);
		
		s4=new StringBuffer("hello");
		
		s4.delete(2,3);
		
		System.out.println("s4="+s4);
		
		
		
		s4=new StringBuffer("hello");//heap
		
		String x="hello";
		if(s4.equals("hello"))//scp
				{
			      System.out.println("equals");
				}
		else
		{
			System.out.println("not equals");
		}
		
		System.out.println(s4.reverse());
		
	/*Object cls equal-> references
	String class eqauls ovveride->contents*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
