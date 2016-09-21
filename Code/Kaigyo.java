public class Kaigyo {
	public static void main(String[] args) {
		System.out.println("***printfの場合***");
		System.out.printf("\n%n");

		System.out.println("***printlnの場合***");
		System.out.print("\n%n");
		System.out.println();
		
		System.out.println("***タイプライター式改行***");
		System.out.print("\r\n");
	}
}
/*
	初歩的なことなんだろうが疑問に思ったのでちょこっとテストを
	printfだとどちらも改行になるが
	printlnだと%nは上手く行かない

	タイプライター式に\r\nとすると
	普通の改行と同じになる
	ただの\nだと↓に流すだけなのに対し、\r\nは最初に戻る動作をしている
	(\r\n≒%n)
*/
