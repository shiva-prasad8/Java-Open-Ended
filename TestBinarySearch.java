package oe;
import java.util.Scanner;
public class TestBinarySearch 
{
  @SuppressWarnings("resource")
public static void main(String[] args) throws NumberFormatException, InterruptedException
  {
    int key,size,i,j,small;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	size = input.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter the array elements: ");
	for(i=0;i<size;i++)
	{
	  arr[i] = input.nextInt(); 
	}
		
	//SORTING (SELECTION SORT)
		
	for (i=0;i<size-1;i++)
	{  
	  small = i; 
	  for (j=i+1;j<size;j++)
	  {
	    if (arr[j] < arr[small])  
	       small = j;
	  }
	  int temp = arr[small];
	  arr[small] = arr[i];  
	  arr[i] = temp;
	} 
	System.out.println("The sorted array is: ");
	for (i = 0; i < size; i++)  
	  System.out.print("  "+arr[i]);  
	    
	//Read the key element from user
	System.out.println("\nEnter the element to search: ");
	key = input.nextInt();
		
	//Create an object
	BinarySearch BS = new BinarySearch(key, size);
	BS.search(arr, key, size);
	input.close();
  }
}