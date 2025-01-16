import java.util.*;

class PalindromeChecker{
	String text;
	
	public PalindromeChecker(String s){
		this.text=s;
		}
	
	public void checkPalindrom(String s){
		String str = new StringBuilder(s).reverse().toString();
		if(s.equals(str)){
			System.out.println("String is palindrome");
			}
		else{
			System.out.println("String is not palindrome");
			}
		}
	
	
}

class CheckPalindromeString{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = "abc";
	PalindromeChecker p = new PalindromeChecker(s);
	p.checkPalindrom(s);
		
	}
}