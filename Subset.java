import java.util.*;
import java.util.ArrayList;

class Subset{
	 
	public static String CheckSubset(int n1,int n2,String arr_1,String arr_2){

		if(n1>n2){

	
			if(arr_1.contains(arr_2)){
				return "arr2 is subset of arr1";
			}
	
		}
		else if(n2>n1){
			if(arr_2.contains(arr_1)){
				return "arr1 is subset of arr2";
			}


		}
		
		return "arr1 and arr2 are not subset";

		

	
	}

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	ArrayList<Integer> arr2=new ArrayList<Integer>();

	int n1=sc.nextInt();
	int n2=sc.nextInt();
	String arr_1="";
	String arr_2="";
	 int mean1=0;


	for(int i=0;i<n1;i++){
		int num=sc.nextInt();
	arr1.add(num);
		mean1+=num;
		
	}

         System.out.print(mean1/n1);
	
	Collections.sort(arr1);

	

	for(int n:arr1){
	arr_1+=n;
	}
	
	


	for(int i=0;i<n2;i++){
		int num=sc.nextInt();
		arr2.add(num);
		
	}
	Collections.sort(arr2);

	
	for(int n:arr2){
	arr_2+=n;
	}


	String ans= CheckSubset(n1,n2,arr_1,arr_2);
	System.out.print(ans);


	
	
	
	
	
	
	
	}
}