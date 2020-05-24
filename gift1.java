//package com.company;

/*
ID: nihar.k1
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.HashMap;

class gift1 {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        //get amount of people
        StringTokenizer str = new StringTokenizer(f.readLine());
        int np = Integer.parseInt(str.nextToken());
        //create hashmap
        HashMap<String, Integer> PeopleToMoney = new HashMap<String, Integer>();

       String[] names = new String[np];
        //initialize hashmap and money
        for(int i=0; i< np; i++)
        {
            names[i] = f.readLine();
            PeopleToMoney.put(names[i], 0);
        }

        for(int n = 0 ; n < np; n++) {
            //init varaibles
            String giver = f.readLine();
            StringTokenizer st = new StringTokenizer(f.readLine());
            int gift = Integer.parseInt(st.nextToken());
            int numReceiptants = Integer.parseInt(st.nextToken());
            int giverMoney;
            int mpp = 0;

            if(gift == 0) {
                giverMoney = 0;
            } else {
                mpp = gift / numReceiptants;

            }

            for( int i = 0; i< numReceiptants; i++){
                StringTokenizer strr = new StringTokenizer(f.readLine());
                String receiptant = strr.nextToken();
                PeopleToMoney.put(receiptant, PeopleToMoney.get(receiptant) + mpp);
                PeopleToMoney.put(giver, PeopleToMoney.get(giver) - mpp);

            }
            //PeopleToMoney.put(giver, PeopleToMoney.get(giver) + (gift % numReceiptants));



        }
        for (String name : names){
            out.println(name + " " + PeopleToMoney.get(name));
        }
        out.close();


    }

}

