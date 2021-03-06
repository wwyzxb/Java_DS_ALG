package org.vincent.datastructure.search;

public class BinarySearch {
	/**
	 * 锟斤拷锟斤拷锟斤拷郯锟斤拷锟斤拷</br>
	 * 时锟戒复锟接讹拷为锟斤拷O(logn)</br>
	 * @param data 锟斤拷锟斤拷锟斤拷锟斤拷
	 * @param element 锟斤拷锟斤拷锟斤拷元锟斤拷
	 */
	public static void Search(int[] data,int element){
		int low=0;
		int high=data.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(element<data[mid])
				high=mid-1;
			else if (element>data[mid])
				low=mid+1;
			else {
				System.out.println("锟桔帮拷锟斤拷锟?+element+":"+mid);
				return;
			}
		}
		System.out.println("未锟揭碉拷"+element);
		System.out.println("未锟揭碉拷"+element);

	}

}
