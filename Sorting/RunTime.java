import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RunTime {

    // Complete the runningTime function below.
    static int runningTime(int[] arr) 
    {
        int n = arr.length;
        int swap = 0;
        if(n <= 0)
        {
            System.out.println("ERROR: Enter an array.");
        }

        else
        {
            for(int i = 1; i < n; i++) 
            {
                int value = arr[i];
                int j = i;
                
                while(j > 0 && j < n && arr[j - 1] > value) 
                {
                    arr[j] = arr[j - 1];
                    j--;
                    swap++;
                } 
            
            arr[j] = value;
            //printArr(arr);
            System.out.println(swap);
            
            }
        }

        return swap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}