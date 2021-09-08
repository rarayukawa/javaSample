package sample9;
import java.io.File;
public class RenameFie2 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("使用法\n例");
			return;
		}
		String oldfilename = args[0];
		String newfilename = args[1];
		File oldfile = new File(oldfilename);
		File newfile = new File(newfilename);
		if (!oldfile.exists()) {
			System.out.println(oldfilename + "が見つかりません");
		} else if (newfile.exists()) {
			System.out.println(newfilename + "はすでに存在します");
		} else if (oldfile.renameTo(newfile)) {
			System.out.println(oldfilename + "を" + newfilename + "に変更しました");
		} else {
			System.out.println(oldfilename + "を" + newfilename + "に変更できませんでした");
		}
	}
}
