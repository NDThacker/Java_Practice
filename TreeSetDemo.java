import java.util.*;
import java.io.*;

class DescendingOrder implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2 - n1;
	}
}

public class TreeSetDemo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> wealthList = new TreeSet<Integer>(new DescendingOrder());
		try {
			String[] input = br.readLine().split(" ");
			int size = Integer.parseInt(input[0]);
			int visits = Integer.parseInt(input[1]);
			int query;
			for (int ind = 0; ind < size + visits; ind++) {
				query = Integer.parseInt(br.readLine());
				if (query == -1) {
					System.out.println(wealthList.pollFirst());
				} else {
					wealthList.add(query);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}