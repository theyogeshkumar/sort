import java.util.Scanner;

public class MergeExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int arr[]={83,1,45,95,45,52,11,47,0,45,67,82};
        
        mergeSort(arr, 0, arr.length-1);
        for(int e:arr){
            System.out.print(e+" ");
        }

    }
    public static void mergeSort(int arr[],int l,int r){
        

        if(l>=r)
            return;

            int m=l+(r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
    }

    public static void merge(int arr[],int l,int m,int r){
        int i,j,k,n1=m+1-l, n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];

        for(i=0;i<n1;i++){
           L[i]=arr[l+i]; 
        }
        for(i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }
        i=0; j=0; k=l;
        while(i<n1 &&j<n2){
            if(L[i]<=R[j])
                arr[k++]=L[i++];
            else
            arr[k++]=R[j++];
        }
        while (i<n1) {
            arr[k++]=L[i++];
        }
        while (j<n2) {
            arr[k++]=R[j++];
        }



    }
}
