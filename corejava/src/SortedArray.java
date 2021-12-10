public class SortedArray {

	public static void main(String[] args) 
{
		int arr[] = {8,6,5,2,1,3};
		int a = 0;
		
		System.out.println("Original array:");

		for (int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+" ");

		}

		for (int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {

				if(arr[i] > arr[j]) {

					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;

				}

			}

		}

		System.out.println();
		System.out.println("Sorted array: ");

		for (int i=0; i<arr.length; i++) {

			System.out.println(arr[i]+" ");

		}

	}

}

