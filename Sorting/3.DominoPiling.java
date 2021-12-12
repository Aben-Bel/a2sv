
import java.io.*;
import java.util.*;
 
 
public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        // Start writing your solution here. -------------------------------------
 
      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String
 
      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int rowHoldCapacity = n/2;
        int columnHoldCapacity = m;
        int dominos = rowHoldCapacity*columnHoldCapacity;
        if(n%2 != 0) {
            int leftOver =
            dominos += ((int) m / 2);
        }
        out.println(dominos);
      /*
          2 10
          4 5 6 7 8 9 10 11 12 12
 
      **/
 
 
 
        // Stop writing your solution here. -------------------------------------
        out.close();
    }
 
 
 
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
    }
    //--------------------------------------------------------
}
Click to see test details

Codeforces (c) Copyright 2010-2021 Mike Mirzayanov
The only programming contests Web 2.0 platform
Server time: Dec/12/2021 06:25:07 (j2).
Desktop version, switch to mobile version.
Privacy Policy
Supported by
Telegram ИТМО
