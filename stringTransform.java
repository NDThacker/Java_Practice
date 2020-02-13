import java.util.HashMap;
import java.util.Map.Entry;
import java.io.*;

public class stringTransform {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> aH = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bH = new HashMap<Character, Integer>();
		String aStr = "", bStr = "";
		int tests = 0;
		try {
			tests = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		while (tests-- > 0) {
			try {
				aStr = br.readLine();
				bStr = br.readLine();
			}

			catch (IOException e) {
				System.out.println(e.getMessage());
			}
			for (char ch : aStr.toCharArray()) {
				if (aH.containsKey(ch))
					aH.put(ch, aH.get(ch) + 1);
				else
					aH.put(ch, 1);
			}
			for (char ch : bStr.toCharArray()) {
				if (bH.containsKey(ch))
					bH.put(ch, bH.get(ch) + 1);
				else
					bH.put(ch, 1);
			}
			int cost = 0;
			for (Entry<Character, Integer> ind1 : bH.entrySet()) {
				if (aH.containsKey((ind1.getKey()))) {
					cost += (Math.abs(ind1.getValue() - aH.get(ind1.getKey())));
					aH.remove(ind1.getKey());
				}
				else
					cost += ind1.getValue();
			}
			for (Entry<Character, Integer> ind2 : aH.entrySet())
				cost += ind2.getValue();
			System.out.println(cost);

		}
	}
}