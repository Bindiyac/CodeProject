package code.project;
public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={11,23,34,45,56,67,78,89,90,101};
		int lo=0,hi=arr.length-1,mid;
		int x=101;
		while(lo<=hi)
		{			
			mid=lo+(hi-lo)/2;
			System.out.println("i: "+lo+"j: "+hi+"mid: "+mid);
			if(arr[mid]==x)
			{
				System.out.println("index: "+mid);
				break;
			}
			else if(arr[mid]>x)
				hi=mid-1;
			else
				lo=mid+1;
		}
	}

}
