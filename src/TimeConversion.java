public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("12:05:45PM"));
    }
    public static String timeConversion(String s){
        String time = s.substring(0,s.indexOf('M') - 1);
        String timeSign = s.substring(8,10);
        String res = "";
        if(s.charAt(0) == '1' && s.charAt(1) == '2' && timeSign.equals("AM")){
                res = time.substring(time.indexOf(':'));
                res = "00" + res;
        }
        else if (s.charAt(0) == '1' && s.charAt(1) == '2' && timeSign.equals("PM")) {
            res = time;
        }
        else if (timeSign.equals("PM")){
            int hours;
            if(s.substring(0,3).charAt(0) == '0'){
                hours = Integer.parseInt(s.substring(1,2)) + 12;
            }
            else{
                hours = Integer.parseInt(s.substring(0,3)) + 12;
            }
            res = hours + time.substring(time.indexOf(':'));
        }
        else{
            res = time;
        }
        return res;
    }
}
