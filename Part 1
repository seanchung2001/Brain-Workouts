import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Part1 {
   public static void doIt(int x, BufferedReader r, PrintWriter w) 
      throws IOException {
      ArrayDeque<String> list = new ArrayDeque<String>();
      String line = r.readLine();
      while(line != null){
        if(list.size() < x){
          if(!list.contains(line)){
            list.addLast(line);
          }
        }else if(list.size() == x){
          if(!list.contains(line)){
            list.addLast(line);
            list.removeFirst();
          }
        }
        line = r.readLine();
      }
      ArrayList<String> strArr = new ArrayList<>();
      while(list.size() > 0){
        strArr.add(list.removeFirst());
      }
      Collections.sort(strArr);
      for(int j = 0; j < strArr.size(); j++){
        w.println(strArr.get(j));
      }
  }
  
  public static void main(String[] args) {
    try {
      BufferedReader r;
      PrintWriter w;
      int x;
      if (args.length == 0) {
        x = 3;
        r = new BufferedReader(new InputStreamReader(System.in));
        w = new PrintWriter(System.out);
      } else if( args.length == 1) {
        x = Integer.parseInt(args[0]); 
        r = new BufferedReader(new InputStreamReader(System.in));
        w = new PrintWriter(System.out);
      } else if (args.length == 2) {
        x = Integer.parseInt(args[0]); 
        r = new BufferedReader(new FileReader(args[1]));
        w = new PrintWriter(System.out);				
      } else {
        x = Integer.parseInt(args[0]); 
        r = new BufferedReader(new FileReader(args[1]));
        w = new PrintWriter(new FileWriter(args[2]));
      }
      long start = System.nanoTime();
      doIt(x, r, w);
      w.flush();
      long stop = System.nanoTime();
      System.out.println("Execution time: " + 1e-9 * (stop-start));
    } catch (IOException e) {
      System.err.println(e);
      System.exit(-1);
    }
  }
}
  
