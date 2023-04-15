import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODOAuto-generated method stub
		int[] arr= {5,2,3,1,5,4};//(1-  n-1)
		sort(arr);
		
		System.out.println(arr[arr.length-1]);
}


	static void sort(int[] arr) {
		// TODOAuto-generated method stub
		int i=0;
		while(i<arr.length) {
			int cor=arr[i]-1;
			if(arr[i]==arr[cor])
				i++;
			else{
				swap(arr,i,arr[i]-1);
			}
		}
	}
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}