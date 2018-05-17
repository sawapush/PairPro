import java.util.Scanner;

public class IntToEng {

	    // メインメソッド
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        System.out.println(translateEng(input));

	    }

	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String[] eng = {"zero","one","three","four","five","six","seven","eight","nine","ten",
	    			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
	    	String[] Eng = {"twenty","thirty","forty","fifty","sixty","seventy","eighteen","ninety"};
	    	int ju=n/10;
	    	int iti=n%10;
	    	//if(ju==0)iti=" ";
	    	return eng[n];
	    	}
	    }
	

