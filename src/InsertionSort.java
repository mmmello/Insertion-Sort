package controller;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random generator = new Random();
		int v[] = new int[10];
		
		// Filling the vector
		for(int i=0; i<v.length; i++) v[i] = generator.nextInt(26);
		
		// Showing the vector before sorting
		System.out.printf("Out of order: ");
		for(int i=0; i < v.length; i++) System.out.printf("%d ", v[i]);
		
		insertionSort(v);
		
		// Showing the vector after sorting 
		System.out.printf("\n\nSorted: ");
		for(int i=0; i < v.length; i++) System.out.printf("%d ", v[i]);
	}
	
	public static void insertionSort(int v[]){
		int elements = v.length, aux, j;
		
		for(int i=1 ; i < elements ; i++){
			j = i;
			while(j>0){

				// The operator turned to the right puts the vector in ascending order
				// The operator facing left puts the vector in descending order
				if(v[j]<v[j-1]){
					aux = v[j];
					v[j] = v[j-1];
					v[j-1] = aux;
				}
				j--;
			}
		}
	}
}