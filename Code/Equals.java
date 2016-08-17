public class Equals {
	private static final String HOGE = "hoge",
								HO = "ho",
								GE = "ge",
								PLUS = HO + GE;

	public static void main(String args[]) {
		System.out.println("HOGE == PLUS ﾌｨｰﾙﾄﾞ は" + (HOGE == PLUS));				//true

		final String hoge = "hoge",
					ho = "ho",
					ge = "ge",
					plus = ho + ge;
		System.out.println("hoge == plus ﾛｰｶﾙ は" + (hoge == plus));				//false
		System.out.println("hoge.equals(plus) ﾛｰｶﾙ は" + (hoge.equals(plus)));		//true

		System.out.println("hoge == ho+ge ﾛｰｶﾙ は" + (hoge == ho + ge));			//false
		System.out.println("hoge.equals(ho+ge) ﾛｰｶﾙ は" + (hoge.equals(ho+ge)));	//true

		System.out.println("hoge ==\"hoge\" 文字列 は" + (hoge == "hoge"));			//true
		System.out.println("hoge ==\"ho\"+\"ge\" 文字 は" + (hoge == "ho"+"ge"));	//true

		System.out.println("hoge.conpareTo(\"hoge\")==0は" + (hoge.compareTo("hoge")==0));	//true
		System.out.println("hoge.conpareTo(\"hoge\")==1は" + (hoge.compareTo("hoge")==1));	//false

		System.out.println();

		System.out.println("ABCD");
		System.err.println("いろはに");
		System.out.println("EFG");
		System.err.println("ほへと");
	}
}

/*
	HOGE == PLUS ﾌｨｰﾙﾄﾞ はtrue

	hoge == plus ﾛｰｶﾙ はtrue
	hoge.equals(plus) ﾛｰｶﾙ はtrue

	hoge == ho+ge ﾛｰｶﾙ はtrue
	hoge.equals(ho+ge) ﾛｰｶﾙ はtrue

	hoge =="hoge" 文字 はtrue

	コンパイラの最適化に頼るべきではない！
	だから==じゃなくてequalsを正しく使うべき！
 */
/* 
  compareToは存在する(真)だと0
  ない(偽)だと0以外なので注意
*/

/*
	System.out.println()は標準出力
	System.err.println()はエラー表示
	・外部に書き込むとき
		標準出力はファイルに書き込む
		エラー表示はコンソールに表示
	ちなみにエラー表示は順番にされずに上か下にまとめられちゃうので注意
*/

