import java.util.*;
class LASTDIG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		sc.nextLine();
		List<Integer> ResultList = new ArrayList<Integer>();
		while (n != 0) {
			String line = sc.nextLine();
			String[] Nums = line.split("\\s+");
			Integer base = Integer.parseInt(Nums[0]);
			Integer exp = Integer.parseInt(Nums[1]);
			int result = 1;
			base = base % 10;
			while(exp > 0) {
				if ((exp % 2) == 1)
					result = (result * base) % 10;
				exp= exp >> 1;
				base = (base * base) % 10;
			}
			ResultList.add(result);
			n--;
		}
		sc.close();
		Iterator<Integer> itr = ResultList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
