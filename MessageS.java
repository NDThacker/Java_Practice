import java.util.*;
import java.io.*;
import java.util.Map.Entry;;

class SortByDate implements Comparator<Integer> {

	public int compare(Integer a, Integer b) {
		return a - b;
	}
}

public class MessageS {
	public static void main(String[] args) {
		int messages = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			messages = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String msg = "";
		String[] words;
		TreeMap<Integer, Integer> dateC = new TreeMap<>(new SortByDate());
		int multiplier = 1;
		while (messages-- > 0) {
			try {
				msg = br.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			words = msg.split(" ");
			if (words[0].equals("M:"))
				multiplier = 1;
			else
				multiplier = 2;
			for (int ind = 1; ind < words.length; ind++) {
				int date = 0;
				try {
					date = Integer.parseInt(words[ind]);
				} catch (NumberFormatException e) {
					continue;
				}
				if (dateC.containsKey(date))
					dateC.put(date, dateC.get(date) + 1 * multiplier);
				else
					dateC.put(date, 1 * multiplier);
			}
		}
		Entry<Integer, Integer> e1 = dateC.pollFirstEntry();
		Entry<Integer, Integer> e2 = dateC.pollFirstEntry();
		if ((e1.getValue() != e2.getValue()) && (e1.getKey() == 19 || e1.getKey() == 20))
			System.out.println("Date");
		else
			System.out.println("No Date");

	}
}
