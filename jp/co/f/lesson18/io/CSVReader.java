package jp.co.f.lesson18.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.co.f.lesson18.entity.Player;

/**
 * CSVファイルを読み込むクラス
 * @author yukawarara
 */
public class CSVReader {
    public static final String SPLIT_COMMA = ",";
    private static final int CSV_DATA_MAX = 100;
    /**
     * ファイルを読み込んで指定した条件にあっている行の選手情報を返す
     * @return 選手情報が格納された配列
     * @param fileName ファイル名
     * @throws IOException ファイル読み込み時に例外が発生した場合
     */
    public List<Player> readAll(String fileName) throws IOException {
        int countPlayer = 0;
        String line;
        boolean isNotHeaderLine = false;
        Player[] temporaryPlayers = new Player[CSV_DATA_MAX];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                if (!isNotHeaderLine) {
                    isNotHeaderLine = true;
                    continue;
                }
                String[] fileElements = line.split(SPLIT_COMMA);
                if (fileElements.length != 4 || !Boolean.parseBoolean(fileElements[3])) {
                    continue;
                }
                temporaryPlayers[countPlayer++] = new Player(fileElements[0], Integer.parseInt(fileElements[1]), Long.parseLong(fileElements[2]));
            }
//            Player[] activePlayers = new Player[countPlayer];
//            for(int i = 0; i < countPlayer; i++) {
//                activePlayers[i] = temporaryPlayers[i];
//            }
//            return activePlayers;
            List<Player> activePlayerList = new ArrayList<>();
            for (int i = 0; i < countPlayer; i++) {
            	activePlayerList.add(temporaryPlayers[i]);
            }
            return activePlayerList;
        }
    }
}