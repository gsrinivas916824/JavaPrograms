package javaPrograms;

public class SearchingElementInArrayUsingLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int key=3;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("Element Found at index: "+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element NOT Found");
		}
	}

}
