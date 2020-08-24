package USACO.Coordinate;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
    
    public class coordinate {
        public static void main(String[] args) throws FileNotFoundException, IOException{
            Scanner sc = new Scanner(new File("coordinate.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("coordinate.out"));

            int aX,aY,bX,bY,M,N,P,Q,counter;

            aX = 0;
            aY = 0;
            counter = 0;

            bX = sc.nextInt();
            bY = sc.nextInt();
            M = sc.nextInt();
            N = sc.nextInt();
            P = sc.nextInt();
            Q = sc.nextInt();

            while(aX < bX && aY < bY){
                aX+=M; aY+=N;
                bX-=P; bY-=Q;
                counter++;
            }

            if(aX == bX && aY == bY){
                bw.write(counter);
            }else{
                bw.write(-1);
            }

            sc.close();
            bw.close();
        }
}