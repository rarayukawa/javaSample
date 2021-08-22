package sample;

public class SampleException extends Exception {
	private int code;
    public SampleException(int code, String message) {
      super(message);
      this.code = code;
    }
    public int getCode() {
    return code;
  }

}
