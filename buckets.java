package USACO.Buckets;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
    
public class buckets {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\Buckets\\buckets.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\Buckets\\buckets.out"));
        
        int N = sc.nextInt();
        
        int[] bucketCapacities = new int[N];
        int[] bucketCurrent = new int[N];

        for(int i =0; i < N - 1; i++){
            bucketCapacities[i] = sc.nextInt();
        }
        for(int i =0; i < N - 1; i++){
            bucketCurrent[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N - 1 ; i ++){
            //fill up bucket[i +1]
            if(bucketCurrent[i] > bucketCurrent[i + 1]){
                int amt = bucketCapacities[i+1] - bucketCurrent[i];
                bucketCurrent[i]-= amt;
                bucketCurrent[i+1] += amt;
            //remove all of bucket[i]
            }else{
                int amt = bucketCurrent[i];
                bucketCurrent[i]-= amt;
                bucketCurrent[i+1]+= amt;
            }
        }

        for(int i = 0; i < N; i++){
            bw.write(bucketCurrent[i] + " ");
            // print the amount of water in each bucket at the end
        }
        bw.write(" "); // print newline
        bw.close(); // flush the output
        




        




        
    }
        
}
