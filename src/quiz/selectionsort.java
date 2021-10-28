package quiz;

import java.util.Random;

public class selectionsort {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] arr = new int[10]; 
		
		while(true) {
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = random.nextInt(100)+1;
			}
			boolean rndFlag = false;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i]==arr[j] && i!=j){	
						rndFlag = true;
					}
				}
			}
			if(rndFlag==false) break;
			System.out.println("난수생성시도");
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	    System.out.println("\n오름차순 정렬 후:");
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) { 
                if(arr[i]>arr[j]) {   
                    int tmp=arr[i];  
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
        }
        for(int i:arr) {
            System.out.print(i+" ");
        }
	}
}
