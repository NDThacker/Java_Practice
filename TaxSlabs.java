import java.util.*;



public class TaxSlabs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		ArrayList<Long> taxVal = new ArrayList<Long>();
		taxVal.add(0, 250000L);
		taxVal.add(1, 500000L);
		taxVal.add(2, 750000L);
		taxVal.add(3, 1000000L);
		taxVal.add(4, 1250000L);
		taxVal.add(5, 1500000L);

		while(tests-- > 0)
		{
			int idx;
			long totTax = 0, income = sc.nextLong(), gross;
			gross = income;
			for(idx = 0; idx < 6; idx++)
			{
				if(income <= taxVal.get(idx))
					break;
			}
			if(idx > 5)
			{
				totTax = ((income - 1500000L) * 30 / 100);
				income = 1500000L;
				idx = 5;
			}
			for( ;idx > 0; idx--)
			{
				totTax += ((income - (taxVal.get(idx) - 250000)) * (idx * 5) / 100);
				income = (taxVal.get(idx) - 250000);
			}
			System.out.println(gross - totTax);
		}
		sc.close();
	}
}