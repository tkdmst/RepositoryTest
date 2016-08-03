import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// List問題
public class EqualList {
	/** ＝で繋ぐ変数はfinalが付けられず。 */
	private final List<String> org = new ArrayList<String>();
	private final List<String> arrayListAdd = new ArrayList<String>();
	private List<String> arrayListEqual = new ArrayList<String>();
	private final List<String> linkListAdd = new LinkedList<String>();
	private List<String> linkListEqual = new LinkedList<String>();

	public static void main(String[] args) {
		PrimitiveTest2 pTest2 = new PrimitiveTest2();
		System.out.println("---ArrayListの場合---");
		pTest2.array();
		System.out.println("\n" + "---LinkedListの場合---");
		pTest2.linked();
	}

	private void array() {
		/** オリジナルの作成 */
		org.add("0");
		org.add("1");
		org.add("2");
		System.out.println("original：" + org);

		/** AddにOriを流用 */
		arrayListAdd.addAll(org);
		System.out.println("aListAdd：" + arrayListAdd);

		/** EqualにOriを代入 */
		arrayListEqual = org;
		System.out.println("aListEqual: " + arrayListEqual);

		/** == の結果と .equals の結果 */
		System.out.println("\n" + "original == aListAdd : " + (org == arrayListAdd));
		System.out.println("original == aListEqual : " + (org == arrayListEqual));

		System.out.println("original.equals(aListAdd) : " + (org.equals(arrayListAdd)));
		System.out.println("original.equals(aListEqual) : " + (org.equals(arrayListEqual)));
		System.out.println("aListAdd.equals(aListEqual) : " + (arrayListAdd.equals(arrayListEqual)));

		/**
		 * Addから要素を1つ消すが、変わらず。
		 * つまり、オブジェクトが異なる
		 */
		arrayListAdd.remove("0");
		System.out.println("\n" + "*** addAllしたリストの項目の削除");
		System.out.println("original：" + org);
		System.out.println("aListAdd：" + arrayListAdd);
		/**
		 * 一方、Equalsを変更すると変わる
		 * つまり、オブジェクトは一緒
		 */
		arrayListEqual.add("3");
		System.out.println("\n" + "*** equalしたリストの項目の追加");
		System.out.println("original：" + org);
		System.out.println("aListEqual：" + arrayListEqual);
	}

	private void linked() {
		/**
		 * AddはOriを流用
		 * EqualはOriを代入
		 */
		linkListAdd.addAll(org);
		linkListEqual = org;
		System.out.println("lListAdd：" + linkListAdd);
		System.out.println("lListEqual：" + linkListEqual);

		/** == の結果と .equals の結果 */
		System.out.println("\n" + "original == lListAdd : " + (org == linkListAdd));
		System.out.println("original == lListEqual : " + (org == linkListEqual));

		System.out.println("original.equals(lListAdd) : " + (org.equals(linkListAdd)));
		System.out.println("original.equals(lListEqual) : " + (org.equals(linkListEqual)));
	}
}
/*
	基本的にArrayListとLinkedListの動きは同じ
	List.addAllとしたリストは元のリストと異なるオブジェクトとなる。
	List = list としたリストは元のリストにも影響を及ぼす。

	=で新しいものを代入する場合はﾌｨｰﾙﾄﾞの状態でfinalはつけられないが、
	元々クラス内で定められたメソッドを使う際は、問題ない。
	
	配列も似たような動き= .equal　は上手く使い分けること
*/
