//package USACO.Word;
/*
ID: nihar.k1
LANG: JAVA
TASK: word
*/
import java.util.*;
import java.io.*;
public class word {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
        public InputReader() throws FileNotFoundException {
           // reader = new BufferedReader(new FileReader("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\Word\\word.in"));
            reader = new BufferedReader(new FileReader("word.in"));

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
        InputReader r = new InputReader();
       // PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\Word\\word.out"));
        PrintWriter pw = new PrintWriter(new FileWriter("word.out"));
        int n = r.nextInt();
        long k = r.nextInt();
        int current = 0;
       // boolean newLine = false;
        String[] words = new String[n];
        for(int i = 0; i < n; i ++){
            words[i] = r.next();
        }
        for(int i = 0; i < n; i ++){
          String s = words[i];
          if(current + s.length() <= k){
            if(current > 0){
                pw.print(" ");
            }
            pw.print(s);
            current+= s.length();
          }else{
            pw.println();
            pw.print(s);
            current = s.length();
          }
        }
        pw.close(); // flushes the output once printing is done
    }
}
