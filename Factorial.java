import java.util.*;
class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=1;
		for(int i=1;i<n+1;i++){
			ans=ans*i;
		}
		System.out.println(ans);
	}
}
			
