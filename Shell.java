//package USACO.Shell;

/*
ID: nihar.k1
LANG: JAVA
TASK: shell
*/

import java.util.*;
import java.io.*;
public class Shell {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
        public InputReader() throws FileNotFoundException {
            //reader = new BufferedReader(new FileReader("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\Shell\\shell.in"));
            reader = new BufferedReader(new FileReader("shell.in"));

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
       // PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Nihar Kodkani\\VSCodeJava\\USACO\\Shell\\shell.out"));
        PrintWriter pw = new PrintWriter(new FileWriter("shell.out"));
       int n = in.nextInt();
       int g,one,two,three;
       g = 0;
       one = 0;
       two = 0;
       three = 0;
       ArrayList <Integer> r = new ArrayList<Integer>();
       r.add(1);
       r.add(2);
       r.add(3);

       for(int i = 0; i < n; i++){
           Collections.swap(r, r.indexOf(in.nextInt()), r.indexOf(in.nextInt()));
           g = in.nextInt();
           if(r.get(2 - 1) == (g)){
               two++;
           }else if(r.get(3 - 1) == (g)){
               three++;
           }else if(r.get(1 - 1) == (g)){
               one++;
           }
       }

       int highest = Math.max(one, two);
       highest = Math.max(highest, three);
       pw.println(highest);
      // System.out.println(highest);
       pw.close();
    }
}
