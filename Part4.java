import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.TreeSet;

public class Part4 {
	
	/**
	 * @param r the reader to read from
	 * @param w the writer to write to
	 * @throws IOException
	 */
    public static void doIt(BufferedReader r, PrintWriter w)
      throws IOException {
      String line = r.readLine();
      SortedSet<String> sortedSuffixes = new TreeSet<>();
      sortedSuffixes.add("");
      while(line != null){
        String cpyLine = line;
        SortedSet<String> greaterThan = sortedSuffixes.tailSet(line);
        if(!greaterThan.isEmpty()){
          if(greaterThan.first().contains(line)){
            w.println(line);
          }
        }
        for(int i = 0; i < cpyLine.length(); i++){
          sortedSuffixes.add(line.substring(i, line.length()));
        }
        line = r.readLine();
      }
    }

  
  /**
   * The driver.  Open a BufferedReader and a PrintWriter, either from System.in
   * and System.out or from filenames specified on the command line, then call doIt.
   * @param args
   */
  public static void main(String[] args) {
    try {
      BufferedReader r;
      PrintWriter w;
      if (args.length == 0) {
        r = new BufferedReader(new InputStreamReader(System.in));
        w = new PrintWriter(System.out);
      } else if (args.length == 1) {
        r = new BufferedReader(new FileReader(args[0]));
        w = new PrintWriter(System.out);				
      } else {
        r = new BufferedReader(new FileReader(args[0]));
        w = new PrintWriter(new FileWriter(args[1]));
      }
      long start = System.nanoTime();
      doIt(r, w);
      w.flush();
      long stop = System.nanoTime();
      System.out.println("Execution time: " + 1e-9 * (stop-start));
    } catch (IOException e) {
      System.err.println(e);
      System.exit(-1);
    }
  }
}
