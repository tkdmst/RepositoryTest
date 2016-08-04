public class TernaryOperation {

	public static void main(String[] args) {
		String password = "hoge";
		String pwd = "0";

		//今までの if{}else{}
		if(password.equals("hoge")){
			pwd = "(n/a)";
		}else{
			pwd = password;
		}
		System.out.println("絶対に間違えないマン：" + pwd);


		//次なる構造
		if(password.equals("hoge"))
			pwd = "(n/a)";
		else
			pwd = password;

		System.out.println("いつもの：" + pwd);


		//新しい構造 ?"":
		pwd = (password.equals("hoge"))?
				"(n/a)"
				:password;

		System.out.println("新バージョン：" + pwd);

	}
}

//1行,改行すれば3行に収まる
//使いこなせるまでは改行して、使いこなせたら強そう
