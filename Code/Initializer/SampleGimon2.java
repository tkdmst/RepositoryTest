public class SampleGimon2 {

	static {
		System.out.println("SampleGimon2：static");
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SampleGimon sg = new SampleGimon();
		System.out.println("1回目");
		SampleGimon sg2 = new SampleGimon();
		System.out.println("2回目");
	}
}
/*
	SampleGimon2：static
	SampleGimon：static
	++++インスタンスイニシャライザ上++++
	++++インスタンスイニシャライザ中++++
	++++インスタンスイニシャライザ下++++
	コンストラクタ
	1回目
	++++インスタンスイニシャライザ上++++
	++++インスタンスイニシャライザ中++++
	++++インスタンスイニシャライザ下++++
	コンストラクタ
	2回目
*/
/*
	<インスタンス化開始>
	staticの読みこみ
	イニシャライザを全部読み込み
	コンストラクタの読みこみ
	<インスタンス化終了>

	ってことかな。
	上から順に流してくれるから素直ないい子のイニシャライザですね
*/
