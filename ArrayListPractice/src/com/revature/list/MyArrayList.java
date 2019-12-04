package com.revature.list;

public class MyArrayList {

	private int[] arrList = new int[250];
	private int size = 0;
	
	public void add(int val) {
		size++;
		if(size == arrList.length) {
			expandArray();
		}
		arrList[size-1] = val;
		//System.out.println(arrList[size-1]);
		
	}

	private void expandArray() {
 		int[] newArr = new int[(arrList.length)*2];
		for (int i =0; i<arrList.length; i++) {
			newArr[i] = arrList[i];	 
		}
		arrList = newArr;
	}

	public void set(int index, int val) {
		arrList[index] = val;
	}

	public void remove(int index) {
		int[] newArr = new int[size-1];
		for (int i = 0; i <(index-1); i++ ) {
			newArr[i] = arrList[i];
		}
		for (int i = index; i <(size-1); i++ ) {
			newArr[i] = arrList[i+1];
		}
		arrList = newArr;
		size--;
	}

	public int get(int index) {
		return arrList[index];
	}

	@Override
	public String toString() {
		StringBuilder arr = new StringBuilder("[");
		
		for (int i =0; i<size; i++) {
			arr.append(arrList[i] + ", ");
		}
		if (size > 0) {
			arr.setLength(arr.length()-2);
		}
		arr.append("]");
		String str = new String(arr);
		return str;
	}
}
