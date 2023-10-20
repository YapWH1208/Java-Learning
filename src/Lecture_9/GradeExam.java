package Lecture_9;

public class GradeExam {
    public static void main(String[] args){
        char[][] grade = {{'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}};

        char[] key = {'D','B','D','C','C','D','A','E','A','D'};
        int[] mark = new int[8];

        for(int i=0; i<grade.length; i++){
            int count = 0;
            for(int j=0; j<grade[i].length; j++){
                if(grade[i][j] == key[j]){
                    count ++;
                }
            }
            mark[i] = count;
        }

        for(int marks: mark)System.out.print(marks + " ");
    }
}
