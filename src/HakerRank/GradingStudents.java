package HakerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        for(int i = 0; i < grades.size(); i ++){
            int number = grades.get(i);
            if(number >= 38) {
                if (number % 10 == 3) {
                    grades.set(i, number + 2);
                } else if (number % 10 == 4) {
                    grades.set(i, number + 1);
                } else if (number % 10 == 8) {
                    grades.set(i, number + 2);
                } else if (number % 10 == 9) {
                    grades.set(i, number + 1);
                }
            }
        }
        return grades;
    }

}
