import java.io.*;
import java.util.TreeSet;
import java.util.*;
import java.util.Collections.*;

public class maxRevenue {
	public static void main(String[] args) {
		TreeSet<Long> custB = new TreeSet<Long>();
		long size = 0, cur, max = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			size = Long.parseLong(br.readLine());
			for (long ind = 0; ind < size; ind++) {
				cur = Long.parseLong(br.readLine());
				custB.add(cur);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		for (long ind = 0; ind < size; ind++) {
			cur = custB.pollFirst() * (size - ind);
			if (cur > max)
				max = cur;
		}
		System.out.println(max);

	}
}