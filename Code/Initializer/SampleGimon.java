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
	ささいな疑問とはいえ、インスタンスイニシャライザが存在する意味が気になったので、実験。
	だがこのクラスだけでは解決できず･･･2に進む！
*/
