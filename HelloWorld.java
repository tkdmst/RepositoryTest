//ファイルの作り方わからず・・・

import java.util.Scanner;

public class HelloWorld {

	public static void main(String args[]){

		//標準入力の文字を読み込み
		Scanner sca = new Scanner(System.in);

		String Str = sca.next();
		System.out.println(Str);

		Str = sca.next();
		System.out.println(Str);

		sca.close();
	}
}
