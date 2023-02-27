package oe;
public class BinarySearch 
{
  int key,size;
  public BinarySearch(int key, int size) 
  {
  	this.key = key;
  	this.size = size;
  }
  void search(int[] arr,int key,int size) throws InterruptedException
  { 
	int mid,first = 0,last = size-1, flag=0;
	while(first <= last)
	{
      mid = (first + last)/2;
	  if(arr[mid] == key)    
	  {
	    flag = 1;
	    System.out.println("Element "+arr[mid]+" is present at position "+(mid+1));
	    break;
	  }
		   	
	  //IF THE KEY ELEMENT IS GREATER THAN THE MIDDLE ELEMENT 
	  else if(key > arr[mid])     
	  {  
	    first = mid+1;
	  }    
		   	
	  //IF THE KEY ELEMENT IS LESSER THAN THE MIDDLE ELEMENT 
	  else     
	  {  
	    last = mid-1;   
	  }
	}
	if(flag == 0)
	{
	  System.out.println("Element not found");
	}
  }
}