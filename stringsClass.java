import java.util.Scanner;

public class stringsClass {
	public static String charReplace(String str, char oldChr, char newChar){
		str = str.replace(oldChr, newChar);
		return str;
	}

	public static void main(String[] args) {
		System.out.println(charReplace("this is string", 't', 'f'));
	}
}
