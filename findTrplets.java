import java.util.*;


public class findTrplets {
	public static void main(String[] args) {
		Hashtable<Long, Integer> hashed = new Hashtable<Long, Integer>();
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		long[] inArr = new long[size];
		for(int idx = 0; idx < size; idx++)
			inArr[idx] = sc.nextLong();
		sc.close();
		int idx1, idx2;
		for(idx1 = 0; idx1 < size - 1; idx1++)
		{
			hashed.clear();
			for(idx2 = idx1 + 1; idx2 < size; idx2++)
			{
				if(hashed.containsKey(-(inArr[idx1] + inArr[idx2])))
					System.out.println(inArr[idx1] + " " + inArr[idx2] + " "+ (-(inArr[idx1] + inArr[idx2])));
				else
					hashed.put(inArr[idx2], 1);
			}
		}
	}
}