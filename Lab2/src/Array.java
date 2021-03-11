import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Input the numbers of elements of Array");
        int N = input.nextInt(); //so phan tu cua mang
        if (N==0) {
			System.out.println("Array has no element");
		}
        else {
        int[] Arr = new int[N];
        
        int sum = 0;
        for (int i=0;i<N;i++){
            System.out.println("Input the value of element " + (i+1) + " ?");
            Arr[i]=input.nextInt();
            sum += Arr[i];
        }
        System.out.println("The sum of the array: " + sum + 
                            "\nThe average value of the array: " + sum/N);   
        System.out.println("Sort of numetric array:");
        for (int i=0;i<N-1;i++){
            for (int j=i+1;j<N;j++){
                if (Arr[i]>Arr[j]){
                    int temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
            System.out.print(Arr[i] + " , ");
        }
        System.out.println(Arr[N-1]);
        
        }

        System.exit(0);
    }
    
}