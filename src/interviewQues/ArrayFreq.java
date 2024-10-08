package interviewQues;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
public class ArrayFreq {

	static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i <= n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    	
    }
	public static void main(String[] args) {

	       int arr[] = {304, 10, 200, 304, 40, 40,60,70};
	      
	       
	       Arrays.sort(arr);
	     
	       
	       int n=arr.length;

	       printFreq(arr, n);

	}

}
