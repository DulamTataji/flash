
public class ParallelArraySorting {

  public static void main(String[] args) {

    // Creating an integer array

    int[] arr = {5,8,1,10,6,9};

    // Iterating array elements

    for (int i : arr) {

      System.out.print(i+" ");

    }

    // Sorting array elements parallel

    Arrays.parallelSort(arr,0,3);

    // Arrays.sort(arr);

    System.out.println("\nArray elements after sorting");

    // Iterating array elements

    for (int i : arr) {

      System.out.print(i+" ");

    }

  }

}  

    joinNames2.add("Raheem");

 System.out.println(joinNames2);

    // Merging two StringJoiner

    StringJoiner merge = joinNames.merge(joinNames2);

    System.out.println(merge);

  }

}  



