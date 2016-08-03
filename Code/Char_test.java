
public class Char_test {
	public static void main(String[] args) {
    		step1();
	 	step2();
	}
	
	public static void step1(){
		System.out.print("改行は↓\nです\n");
		System.out.print("行頭は←\rです\r");
		System.out.println("プリントラインはenter");
		System.out.print("水平\tタブ\n");
		System.out.print("バック\bスペース\r");
		System.out.print("半角\fスペース\n");
		System.out.print("ヌルだから\0表示なし\r");
		// この机は"1500円"です と表示したい;
		System.out.print("この机は\"1500円\"です\n");
		// これで表示できる
		System.out.print("改行のエスケープシーケンスは\nです\r");
		System.out.print("\\ \' \"");
		// \' \\ \' \t \" \\ \" で'\' \t "\"になる
		System.out.println("\'\\\'\t\"\\\"");
	}
		
	public static void step2(){	
		char a = 'a', ab = '1', ac = 'あ';
		// char b = "b"; char型は1文字専用なので""は不可
		// char c = 'cd'; 上に同じく不可
		char non = '\0'; // nonはヌル文字となるため、表示されず
		System.out.println("可能：" + a + ", " + non + ", " + ab + ", " + ac);


		// char型の配列に代入してるだけ
		char hairetsu[] = { 'お', 'は', 'よ', 'う' };
		// Stringのこんちはをchar型に直す
		char hairetsu2[] = "こんちは".toCharArray();
		System.out.println(hairetsu[0]);
		System.out.println(hairetsu[1]);
		System.out.println(hairetsu2[0]);
		System.out.println(hairetsu2[1]);

		// こ+ん じゃなくて 数字+数字になる
		System.out.println(hairetsu2[0] + hairetsu2[1]);

		// aはStringに変換されているのでそのまま表示される
		System.out.println('a');

		// どちらの意味もおなじになる
		System.out.println(('A' + 'B') + "=" + (65 + 66));

		// 16進数に変更して表示している
		System.out.println("Aの16進数：" + Integer.toHexString('A'));
		System.out.println(Integer.toHexString('A' + 'A'));
		// この場合は16進数の文字 に変換してから合算してるため、どちらも表示されるだけになる
		System.out.println(Integer.toHexString('A') + Integer.toHexString('A'));
	}
}
