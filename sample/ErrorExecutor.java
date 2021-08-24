package sample;

import java.io.IOException;

public class ErrorExecutor {
	private static final String ERROR_MESSAGE = "×message error originalMessage[%s]×";
	private static final String NOMAL_MESSAGE = "★[%s]★";
	private static final String[] ARGUMNETS = {null, "正常値メッセージ", "1234"};
	
	public String messageConvert(String message) throws OriginalException, IOException {
		if (message == null || message.length() < 5) {
			throw new OriginalException(String.format(ERROR_MESSAGE, message));
		}
		// 例外をスローさせたいのでわざと無駄なコードを用意
		if (message.length() == 1000) {
			throw new IOException("これは発生しない");
		}

		return String.format(NOMAL_MESSAGE, message);
	}
	
	public static void main(String[] args) throws IOException {
		ErrorExecutor errorExecutor = new ErrorExecutor();
		for(String argument : ARGUMNETS) {
			try {
				System.out.println(errorExecutor.messageConvert(argument));
			} catch (OriginalException e) {
				System.out.println();
			}
		}
	}
}
