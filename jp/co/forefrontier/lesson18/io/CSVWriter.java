package jp.co.forefrontier.lesson18.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jp.co.forefrontier.lesson18.entity.Player;
/**
 * CSVファイルに書き込むクラス
 * @author yukawarara
 */
public class CSVWriter {
	/**
	 * 指定されたファイルに条件に応じて書き込んだり、
	 * @param activePlayer 選手情報
	 * @param outputMode 出力モード
	 * @throws IOException ファイル生成時に例外が発生した場合
	 */
	public void write(List<Player> activePlayerList, boolean outputMode) throws IOException {
		try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("/Users/yukawarara/desktop/java/output.csv")))) {
			for (int i = 0; i < activePlayerList.size(); i++){
				String active = activePlayerList.get(i).toString();
				int point = Integer.parseInt(active.substring(active.lastIndexOf(",")));
				for (int j = 1; j < activePlayerList.size(); j++) {
					String activein = activePlayerList.get(i).toString();
					int pointin = Integer.parseInt(activein.substring(activein.lastIndexOf(",")));
					if(point < pointin) {
						int temporary = point;
						point = pointin;
						pointin = temporary;
					}
				}
				if (outputMode) {
					writer.println(activePlayerList);
				} else {
					System.out.println(activePlayerList);
				}
				
			}
		}
	}
}
