
public class JiechengSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int result = 0;
		int sum = 1;
		int n = 10;
		
		for(int i=start; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sum*=j;
			}
			result += sum;
			sum = 1;
		}
		
		System.out.println("result= "+result);
	}

}
