package jp.co.f.lesson18.io;

import java.util.List;

import jp.co.f.lesson18.entity.Player;

public interface CSVWriter {
	void writer(List<Player> playerList);
}
