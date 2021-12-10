class StringDemo{
	public static void main(String args[])
	{
/*String s1="Hello";

 String s2="hello";
 

 System.out.println(s1==s2);

// if(s1.equals(s2))
	 if(s1.equalsIgnoreCase(s2))

 {

  System.out.println("both Objects are equal");

 }

 else

 {

  System.out.println("both objects are not equal");

 }*/
		
		
	
		
		/*	String s1=" HELLO ";

		 String s2="Hello";

		 System.out.println(s1.toLowerCase());

		 System.out.println(s2.toUpperCase());

		 System.out.println(s1.length());

		 String s3=s1.trim();

		 System.out.println(s3.length());     */
	
 
		
		
		
		/*	String s1="HELLO";



		char ch[]=s1.toCharArray();

		 for(int i=0;i<ch.length;i++)

		  System.out.println(ch[i]);

	//	 System.out.println(s1.charAt(0));

		*/	

		
		
	/*	
		String s1="hello.how.are.you";

		//String s[]= s1.split("\\.");
		String s[]= s1.split(" ");

		 for(int i=0;i<s.length;i++)

		  System.out.println(s[i]);
*/
		
		
		
		
	/*	
		String s1="hello how are you";

		 System.out.println(s1.startsWith("h"));

		 System.out.println(s1.endsWith("u"));

		 System.out.println(s1.indexOf("e"));

		 System.out.println(s1.lastIndexOf("e"));   

                                                                 */
		
		
/*		 int j=5;

		 String s2=String.valueOf(j);

		 System.out.println(s2);

		 String s1="hello";

		  byte b[]=	s1.getBytes();

		 for(int i=0;i<b.length;i++)

		 System.out.print((char)b[i]);

			*/
		
		
		
		
		
		String s="hello";

		 char ch[]=s.toCharArray();

		 for(int i=ch.length-1;i>=0;i--)

		 {

		  System.out.print(ch[i]);

		 }

		 System.out.println();

		 StringBuffer sb=new StringBuffer(s);

		 System.out.println(sb.reverse());

		  


		  
}
}



