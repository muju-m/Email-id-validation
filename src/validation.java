import java.util.Scanner;
public class validation {
	public static void main(String[] args) {
		System.out.println("Enter total number of email id");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int j=0;j<n;j++) {
			System.out.println("Enter the email id");
			str[j] = sc.next();
		}
		System.out.println("Enter the email id to search");
		String sr = sc.next();
		boolean flag = false;
		for(int k =0;k<n;k++) {
			if(sr.equalsIgnoreCase(str[k])) {
				System.out.println("Found the email id at position: "+(k+1));
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("Email id not found");
		}
	}
}
