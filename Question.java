public class Question {

	public static void main(String[] args) {
		String password = "obakyu";

		//今までの if{}else{}
		String pwd = "0";
		if(password.equals("obakyu")){
			pwd = "(n/a)";
		}else{
			pwd = password;
		}


		//次なる構造
		if(password.equals("obakyu"))
			pwd = "(n/a)";
		else
			pwd = password;

		System.out.println("いつもの：" + pwd);


		//新しい構造 ?"":
		pwd = (password.equals("obakyu"))?
				"(n/a)"
				:password;

		System.out.println("新バージョン：" + pwd);

	}
}

//5行が本来1行に収まる
//使いこなせるまでは改行して、使いこなせたら強そう
