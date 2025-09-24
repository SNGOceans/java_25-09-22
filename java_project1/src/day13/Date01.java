package day13;

import java.util.Calendar;

public class Date01 {

    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();

        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH)+1;
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        String day_of_the_week = ""; // 초기화 추가
        int num_DOW = rightNow.get(Calendar.DAY_OF_WEEK);

        switch(num_DOW) {
            case 1: day_of_the_week = "일"; break;
            case 2: day_of_the_week = "월"; break;
            case 3: day_of_the_week = "화"; break;
            case 4: day_of_the_week = "수"; break;
            case 5: day_of_the_week = "목"; break;
            case 6: day_of_the_week = "금"; break;
            case 7: day_of_the_week = "토"; break;
            default: day_of_the_week = "알 수 없음"; break;
        }

        System.out.println(year+"-0"+month+"-"+day+"("+day_of_the_week+")");
        
        int hour = rightNow.get(Calendar.HOUR);
        int minute = rightNow.get(Calendar.MINUTE);
        int second = rightNow.get(Calendar.SECOND);
        
        System.out.println(hour+":"+minute+":"+second);
        
        int AM_PM = rightNow.get(Calendar.AM_PM);
        String Str_AM_PM = "";

        switch(AM_PM) {
	        case 0: Str_AM_PM = "오전"; break;
	        case 1: Str_AM_PM = "오후"; break;
	        default: Str_AM_PM = "알 수 없음."; break;
        }
        
        String Strsecond = "";
        
        if (second >= 0 && second < 10) {
            Strsecond = "0" + second; // 앞에 0 붙이기
        } else {
            Strsecond = String.valueOf(second); // 그대로 문자열로 변환
        }
        
        System.out.println(Str_AM_PM+" "+hour+":"+minute+":"+Strsecond);
    }
}
