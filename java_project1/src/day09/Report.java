package day09;

import java.util.Arrays;

public class Report {
	// 이름    국어    영어    수학    합계    평균    등수
	// 생성자 (이름, 국어, 영어, 수학)
	// 기본생성자()
	// 합계 평균 계산메서드
	// 출력메서드
	// getter/setter
	
	private String name, lang, eng, math;
	private int sum, rank, lang_score, eng_score, math_score;
	private double average;
	
	// 기본 생성자
    public Report() {
        this.name = "박철수";
        
        this.lang = "국어";
        this.eng = "영어";
        this.math = "수학";
        
        this.lang_score = 0;
        this.eng_score = 0;
        this.math_score = 0;
        
        this.sum = 0;
        this.rank = 1;
        this.average = 0;
    }
    
    // 합계 계산 메서드
    public int sum(int[] scores) {
     	for(int i=0; i<scores.length; i++) {
     		sum +=scores[i];
     	}
     	return sum;
    }
    
    // 평균 계산 메서드
    public double average(int[] scores) {
    	double average = sum/scores.length;
    	return average;
    }
    
    public void print() {    	
		System.out.println("["+name+", "
							+lang_score+", "
							+eng_score+", "
							+math_score+", "
							+sum+", "
							+average+", "
							+rank+"]");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getLang_score() {
		return lang_score;
	}

	public void setLang_score(int lang_score) {
		this.lang_score = lang_score;
	}

	public int getEng_score() {
		return eng_score;
	}

	public void setEng_score(int eng_score) {
		this.eng_score = eng_score;
	}

	public int getMath_score() {
		return math_score;
	}

	public void setMath_score(int math_score) {
		this.math_score = math_score;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
}
