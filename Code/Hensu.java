public class Hensu {
	/* finalをつけたならば初期化が終わるまでに値を入れなきゃいけない！ */
	static final int INT;
	final int inT;
	final int iNT;
	// static初期化ブロック
	static {INT = 20;}
	// コンストラクタ
	Hensu() {inT = 3;}
	// インスタンス初期化ブロック
	{iNT= 10;}


	static int intInt;
	static double doubleDouble;
	static long longLong;
	static Integer integer;
	static byte byteByte;

	static char charChar;
	static String string;
	static boolean bool;

	static String[] arg;

	public static void main(String[] args) {
		System.out.println(intInt); // 0
		System.out.println(doubleDouble); // 0.0
		System.out.println(longLong); // 0
		System.out.println(integer); // null
		System.out.println(byteByte); // 0

		System.out.println(charChar); // ""
		System.out.println(string); // null
		System.out.println(bool); // false

		System.out.println(arg);

		int i = 3;
		System.out.println("フィールド変数=" + Hensu.intInt);
		System.out.println("ローカル変数=" + i);
	}
}

/*
 * フィールド変数は勝手に初期化されている！
 * ちなみにローカルは初期化が必要です
 * static変数ならばクラス名.変数名でアタックできるので便利便利
 */
 
 
 //変数で遊んでみたﾖ
 
