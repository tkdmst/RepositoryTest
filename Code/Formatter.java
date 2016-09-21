import java.util.Date;

public class Formatter {

	public static void main(String[] args) {

		System.out.println("**数値系**");
		// 10進数で表示
		System.out.printf("%d%n", 1000);
		// 8進数で表示
		System.out.printf("%o%n", 1000);
		// 16進数で表示
		System.out.printf("%x%n", 1000);

		// 桁の最低ラインを指定する 足りない桁を0埋めする
		System.out.printf("%02d%n", 1000);
		System.out.printf("%05o%n", 1000);
		System.out.printf("%06x%n", 1000);

		System.out.println("**文字系**");
		// 文字の出力
		System.out.printf("%c%n", 'a');
		// 文字列の出力
		System.out.printf("%s%n", "abc");
		// 真偽値の文字列を出力 引数がBoolean型でない場合はtrue
		System.out.printf("%b%n", true);
		System.out.printf("%b%n", Boolean.FALSE);

		System.out.println("**日付系**");
		// 出力設定した数だけ引数も必要
		System.out.printf("%tY / %tm / %td%n", new Date(), new Date(), new Date());
		System.out.printf("%tH ： %tM%n", new Date(), new Date());
		System.out.printf("%tS秒, %tLﾐﾘ秒%n", new Date(), new Date());
		// m/d/y
		System.out.printf("%tD%n", new Date());
		// Y-m-d
		System.out.printf("%tF%n", new Date());
		// H:M:S
		System.out.printf("%tT%n", new Date());

	}
}
/*
	***数値系**
	1000
	1750
	3e8
	1000
	01750
	0003e8
	**文字系**
	a
	abc
	true
	false
	**日付系**
	2016 / 09 / 21
	11 ： 40
	45秒, 482ﾐﾘ秒
	09/21/16
	2016-09-21
	11:40:45

	見たとおりの結果
	一通りやっておくべきだと思い実行
	絶対忘れるからそのときのための実行結果！
*/
