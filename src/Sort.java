import java.util.ArrayList;
import java.util.Scanner;

//treated arraylist as an array here
//could some additional convinience be used just because its an arraylist.
//this is done for unique elements check out what needs to change if the elements are repeated.
public class Sort {
public static void main(String[] args)
{
  Scanner scan =  new Scanner(System.in);	
  int T = scan.nextInt(),N;
  int i=0,j=0,lst[];//try using array this way
  ArrayList<Integer>list=null;
  while(i<T)
  {
	  N = scan.nextInt();
	  list = new ArrayList<Integer>(N);
	  j=0;
	  while(j<N)
	  {		  
		  list.add(scan.nextInt());
		 j++;
	  }
	  System.out.println("unsorted list:"+list);
	 // System.out.println("bubble sorted list:"+bubbleSort(list));
	 // System.out.println("insertion sorted list:"+insertionSort(list));
	  System.out.println("insertion sorted list:"+insertionSort(list));
  i++;
  }
  
  int[][] matrix = new int[2][3];
  int matrix1[][] = new int [3][4];
  int matrix2[][] = new int [4][];
  int matrix3[][] = new int [6][];
  
 
}
public static ArrayList<Integer> bubbleSort(ArrayList<Integer>list)
{
	if(list!=null)
	{
		for(int i=list.size()-1;i>0;i--)
		{
			for(int j=0;j<i;j++)				
			{
				if(list.get(j)>list.get(j+1))
				{
					int temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1, temp);
				}
			}
			
		}
	}
	return list;	
}

//insertion sort
public static ArrayList<Integer> insertionSort(ArrayList<Integer>list)
{	
	for(int i=1;i<list.size();i++)
	{
		int item = list.get(i);
		
		int k = i-1;
		while(k>=0 && list.get(k)>item) // majha element chota ase paryanta put it in next place.
		{
			list.set(k+1,list.get(k));
		    k--;
		}
		list.set(k+1, item);		
		System.out.println(list);
	}
	return list;	
}

//selection sort

public static ArrayList<Integer> selectionSort(ArrayList<Integer>list)
{
 return list;
}

}
