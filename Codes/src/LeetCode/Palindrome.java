package LeetCode;

public class Palindrome {
	public boolean isPalindrome(int x) {
		if(x<0 || x!=0 && x%10 ==0 ) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);
		
		
		
		
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome(10));

	}

}
