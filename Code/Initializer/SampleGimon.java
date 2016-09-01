public class SampleGimon {

	static {
		System.out.println("SampleGimon：static");
	}

	{System.out.println("++++インスタンスイニシャライザ上++++");}

	SampleGimon(){
		System.out.println("コンストラクタ");
	}

	{System.out.println("++++インスタンスイニシャライザ中++++");}

	public static void main(String[] args) {
		System.out.println("メイン");
	}

	{System.out.println("++++インスタンスイニシャライザ下++++");}


}
/*
	SampleGimon：static
	メイン
*/

/*
	static→メインの実行
	イニシャライザは実行されない！

*/
