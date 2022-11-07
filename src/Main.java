import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> iAr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			iAr.add(sc.nextInt());
		}
		
		for (int i=0;i<n;i++) {
			int idx = getMinimum(iAr);
			System.out.println(iAr.get(idx));
			iAr.remove(idx);
		}
		
	}

	private static int getMinimum(ArrayList<Integer> iAr) {
		// TODO Auto-generated method stub
		int idx = -1;
		int min = Integer.MAX_VALUE;
		
		for (int i=0;i<iAr.size();i++) {
			int data = iAr.get(i);
			if (data < min) {
				min = data;
				idx = i;
			}
		}
		return idx;
	}

}
