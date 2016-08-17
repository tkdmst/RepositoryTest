import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class WhatBigDecimal {

	public static void main(String[] args) {
		BigDecimal one = BigDecimal.ONE,
				two = BigDecimal.valueOf(2),
				three = new BigDecimal(3),
				ten = BigDecimal.TEN,
				zero = BigDecimal.ZERO;
		System.out.println(one + "," + two + "," + three + "," + ten + "," + zero);

		// 足し算 2+3 = 5
		BigDecimal five = two.add(three);
		System.out.println(five);

		// 引き算 2-3 = -1
		BigDecimal mainas1 = two.subtract(three);
		System.out.println(mainas1);

		// 掛け算 5*-1 = -5
		BigDecimal mainas5 = five.multiply(mainas1);
		System.out.println(mainas5);

		//べき乗(^) 2^3 = 8
		BigDecimal eight = two.pow(3);
		System.out.println(eight);

		//あまり 5%2 = 1
		BigDecimal amari = five.remainder(two);
		System.out.println(amari);

		// 割り算 5桁の下で四捨五入 2/3 = 0.66667
		BigDecimal halfUp = two.divide(three, 5, RoundingMode.HALF_UP);
		System.out.println("HALF_UP   = " + halfUp);

		// 割り算 5桁の下で切り上げ 2/3 = 0.6667
		BigDecimal up = two.divide(three, 4, RoundingMode.UP);
		System.out.println("UP(4桁)   = " + up);

		// 割り算 6桁の下で切り捨て 2/3 = 0.666666
		BigDecimal down = two.divide(three, 6, RoundingMode.DOWN);
		System.out.println("DOWN(6桁) = " + down);

		// 割り算 5桁の下でJIS丸め 2/3 = 0.66667
		BigDecimal halfEven = two.divide(three, 5, RoundingMode.HALF_EVEN);
		System.out.println("HALF_EVEN = " + halfEven);

		// スケール(小数点以下の数)が違っても正しいかを示せるのはcompareTo
		BigDecimal value = new BigDecimal("0.19"),
				value2 = new BigDecimal("0.190");
		System.out.println("equals   ：" + (value.equals(value2))); // false
		System.out.println("compareTo：" + (value.compareTo(value2) == 0)); // true

		// 0.19を小数点二桁で四捨五入する
		MathContext mc = new MathContext(1, RoundingMode.HALF_UP);
		System.out.println(value.round(mc));

		// 桁を揃える際に使えるメソッド
		BigDecimal bigValue = new BigDecimal("0.00000000019");
		System.out.println("そのまま表示する： " + bigValue.toPlainString());
		System.out.println("整数を１桁にする： " + bigValue.toString());
		System.out.println("整数を３桁にする： " + bigValue.toEngineeringString());

	}
}

/*
	1,2,3,10,0
	5
	-1
	-5
	8
	1
	HALF_UP   = 0.66667
	UP(4桁)   = 0.6667
	DOWN(6桁) = 0.666666
	HALF_EVEN = 0.66667
	equals   ：false
	compareTo：true
	そのまま表示する： 0.00000000019
	整数を１桁にする： 1.9E-10
	整数を３桁にする： 190E-12
	0.2
*/
/*
  細かい計算をするときに利用するBigDecimal
  必要に応じて便利に使いましょう。
*/
