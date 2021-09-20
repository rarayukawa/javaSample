package jp.co.f.lesson18.entity;

/**
 * 選手の情報をもつクラス
 * @author yukawarara
 */
public class Player {
    private String name;
    private int age;
    private long point;
    private String teamName;
   
    /**
     * 選手の名前、年齢、得点数を初期化する
     * @param name 名前
     * @param age 年齢
     * @param point 得点数
     */
    public Player(String name, int age, long point, String teamName) {
    	private static final String F = "(";
    	private static final String S = ")";
    	private static final String SPEACE = " ";
        this.name = name;
        this.age = age;
        this.point = point;
        this.teamName = teamName;
    }
    
    /**
     * 選手の名前を取得
     * @return 名前
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * 選手の年齢を取得
     * @return 年齢
     */
    public int getAge() {
        return this.age;
    }
    
   /**
    * 選手の得点数を取得
    * @return 得点数
    */
    public long getPoint() {
        return this.point;
    }
    
    public String getTeamName() {
    	return this.teamName;
    }
   /**
    * 選手情報を返す
    * @return 選手情報
    */
    @Override
    public String toString() {
        return this.getTeamName() + SPEACE + String.format("%,d", this.getPoint()) + SPEACE + this.getName() + F + this.getAge() + S;
    }
}