package jp.co.forefrontier.lesson18.entity;

import jp.co.forefrontier.lesson18.io.CSVReader;

/**
 * 選手の情報をもつクラス
 * @author yukawarara
 */
public class Player {
    private String name;
    private int age;
    private long point;
   
    /**
     * 選手の名前、年齢、得点数を初期化する
     * @param name 名前
     * @param age 年齢
     * @param point 得点数
     */
    public Player(String name, int age, long point) {
        this.name = name;
        this.age = age;
        this.point = point;
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
    
   /**
    * 選手情報を返す
    * @return 選手情報
    */
    @Override
    public String toString() {
        return this.getName() + CSVReader.SPLIT_COMMA + this.getAge() + CSVReader.SPLIT_COMMA + this.getPoint();
    }
}