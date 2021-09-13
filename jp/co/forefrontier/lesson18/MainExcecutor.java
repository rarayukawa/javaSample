package jp.co.forefrontier.lesson18;
import java.io.File;
import java.io.IOException;

import jp.co.forefrontier.lesson18.io.CSVReader;
import jp.co.forefrontier.lesson18.io.CSVWriter;

/**
 * Lesson18 課題Ver1.0を実施するクラス
 * @author yukawarara
 */
public class MainExcecutor {
    private static final String ARGUMENTS_ERROR_MESSAGE = "正しいファイル名を指定してください";
    /**
     * コマンドライン引数で指定されたファイルの選手情報を出力する
     * @param args ファイル名 配列の1つ目に設定する
     * @throws IOException コマンドライン引数の入出力に例外が発生した場合
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 2 || !new File(args[0]).exists()) {
            System.out.println(ARGUMENTS_ERROR_MESSAGE);
            return;
        }
        new CSVWriter().write(new CSVReader().readAll(args[0]), Boolean.parseBoolean(args[1]));
    }
}
