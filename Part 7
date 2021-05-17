import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;

public class Part7 {
	
	/**
	 * @param r the reader to read from
	 * @param w the writer to write to
	 * @throws IOException
	 */
	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {
		comp2402a5.AdjacencyLists list = new comp2402a5.AdjacencyLists(0);
		HashMap<Integer, String> map = new HashMap<>();
		HashSet<String> checkContains = new HashSet<>();
		String line = r.readLine();
		while(line != null){
			StringBuilder buildStr = new StringBuilder();
			buildStr.append(line.charAt(0)).append(line.charAt(line.length()-1));
			line = buildStr.toString();
			if(!checkContains.contains(line)) {
				map.put(list.addVertex(), line);
				checkContains.add(line);
			}
			line = r.readLine();
		}
		for(int i = list.n-1; i >= 0; i--){
			for(int j = list.n-1; j >= 0; j--){
				if(i == j){
					continue;
				}
				if(map.get(i).charAt(map.get(i).length()-1) == map.get(j).charAt(0)){
					list.addEdge(i, j);
				}
			}
		}
		comp2402a5.Algorithms alg = new comp2402a5.Algorithms();
		int bfs = alg.bfs(list, 0, list.n-1);
		if(bfs == -1){
			w.println(0);
		}
		else{
			w.println(bfs + 1);
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
