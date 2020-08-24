//package USACO.MixingMilk;
/*
ID: nihar.k1
LANG: JAVA
TASK: mixmilk
*/
import java.util.*;
import java.io.*;
public class mixmilk {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
        public InputReader() throws FileNotFoundException {
          //  reader = new BufferedReader(new FileReader("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\MixingMilk\\mixmilk.in"));
           reader = new BufferedReader(new FileReader("mixmilk.in"));

            tokenizer = null;
        }
        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
         InputReader in = new InputReader();
      // PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\MixingMilk\\mixmilk.out"));
        PrintWriter pw = new PrintWriter(new FileWriter("mixmilk.out"));

        long[] a = new long[3];
        long[] c = new long[3];
         c[0] = in.nextLong();
         a[0] = in.nextLong();
         c[1] = in.nextLong();
         a[1] = in.nextLong();
         c[2] = in.nextLong();
         a[2] = in.nextLong();
        for(int i= 1; i <= 33; i ++){
           long amt = Math.min(a[0],c[1]-a[1]);
           a[0]-= amt;
           a[1] += amt;

           amt = Math.min(a[1],c[2]-a[2]);
           a[1]-= amt;
           a[2] += amt;

           amt = Math.min(a[2],c[0]-a[0]);
           a[2]-= amt;
           a[0] += amt;
        }

       long amt = Math.min(a[0],c[1]-a[1]);
           a[0]-= amt;
           a[1] += amt;
        

        
            pw.println(a[0]);
            pw.println(a[1]);
            pw.println(a[2]);
        
       pw.close();
    }
}
