/*public class array1 {



 public static void main(String[] args) {

// int a[]={10,20,30,40};
	 int a []=new int[4];
	 a[0]=1;
	 a[1]=2;
	// a[2]=;
 	 a[3]=4;

 for(int i=0;i<a.length;i++)

 {

  System.out.println(a[i]);

 }

 }

}*/



//sum and average of array
/*import java.util.Scanner;
public class array1

{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
      
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}*/



//min and max

/*import java.util.Scanner;
public class array1{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
       
        int arr[]=new int[10];
        System.out.println("Enter elements in array");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=9;i++)
        {
        	 arr[i]=sc.nextInt();
        	
        	if(arr[i]<min)
        	{
        		min=arr[i];
        	}
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        System.out.println("Maximum element is "+max);
        System.out.println("Minimum element is "+min);
     }
}  */


 //is number isthere or not
/* import java.util.Scanner; 
class array1
{
	public static void main(String args[]) 
	{
		int i, n, num;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter number of elements"); 
		n = a.nextInt(); 
		int []array = new int[n];
		System.out.println("Enter those " + n + " elements"); 
		for (i= 0; i< n; i++) 
			array[i] = a.nextInt(); 
		System.out.println("Enter value to find");
		num = a.nextInt(); 
		for (i= 0; i < n; i++) 
		{
			if (array[i] == num) 
			{
				System.out.println("element  is present at location " + i);
				break; 
				}
			}
		if (i== n) 
			System.out.println("-1"); 
		} 
	}*/




//asci values

/*public class array1
     {
       public static void main(String[] args) 

       {
         //ASCII Value of digits 48-57
         //ASCII Value of UpperCase Character 65-90
         //ASCII Value of LowerCase Character 97-122

        int arr[] = {66,71,76,82,88,99};
        for (int i=0; i<arr.length; i++) 
        {
          System.out.print((char)arr[i]+" ");
        }
          System.out.println();

      }
   } */






