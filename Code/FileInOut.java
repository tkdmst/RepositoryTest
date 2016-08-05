import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) {
		BufferedWriter out=null;
		BufferedReader in = null;

		try {
			out = new BufferedWriter(new FileWriter("test.txt",false));
			out.write("hello,");
			out.flush();
			in = new BufferedReader(new FileReader("test.txt"));
			String str;
			while ((str = in.readLine()) != null)
				System.out.println(str);

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
		/*	try{
				if(out != null)
					out.close;
				if(in != null)
					in.close;
			}catch(IOException e){
				e.printStackTrace();
			}*/
		}
	}
}
/*
  恥ずかしながらよく忘れるBufferedの構文
  一応ね！！判りやすくしたいから！！
*/
