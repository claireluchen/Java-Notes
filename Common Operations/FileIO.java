import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileIO {
	static StringTokenizer st;
	static BufferedReader reader;
	static BufferedWriter writer;
	static StringBuffer sb = new StringBuffer();
	
	static int n;
	static long m;
	static long[] A = new long[100010];
	static long[] B = new long[100010];
	
	static boolean check(long lim) {
		long tot = 0;
		B[n + 1] = (long) 2e18;
		for (int i = 1; i <= n + 1; i++) {
			if (B[i] > lim) {
				if (tot >= m) return true;
				tot = 0;
			}
			tot += A[i];
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		reader = new BufferedReader(new FileReader("hayfeast.in"));
		writer = new BufferedWriter(new FileWriter("hayfeast.out"));
		
		n = readInt();
		m = readLong();
		for (int i = 1; i <= n; i++) {
			A[i] = readLong();
			B[i] = readLong();
		}
		
		long head = 1, tail = (long) 1e18 + 9;
		while (head < tail) {
			long mid = (head + tail) >> 1;
			if (check(mid)) tail = mid;
			else head = mid + 1;
		}
		
		sb.append(head);
		writer.write(sb.toString());
		writer.flush();
	}
	
	//reading input
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(reader.readLine().trim());
			}catch (IOException e){
				throw new RuntimeException(e);
			}
		}
	    return st.nextToken();
	}
	static long readLong () throws IOException {
	    return Long.parseLong(next());
	}
	static int readInt () throws IOException {
	    return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
	    return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
	    return next().charAt(0);
	}
	static String readLine () throws IOException {
	    return reader.readLine().trim();
	}
}
