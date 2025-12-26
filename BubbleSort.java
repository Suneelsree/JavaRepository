import java.util.Scanner;

public class BubbleSort{  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
                System.out.println("enter Length of array:");
                int n=s.nextInt();
                int arr[]=new int[n];   
                System.out.println("Enter elements one by one:");  
                for(int i=0; i < arr.length; i++){  
                        arr[i]=s.nextInt();  
                }  
                System.out.println();  
                bubbleSort(arr); 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                s.close();
      }  
}  
