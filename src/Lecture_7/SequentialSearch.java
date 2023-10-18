package Lecture_7;

public class SequentialSearch {
    public static void main(String[] args){
        System.out.println(sequentialSearch(new int[]{1,2,3,4,5,6,7}, 4));
    }

    public static int sequentialSearch(int[] list, int target){
        if(list.length == 0) return 0;
        for(int i=0; i<list.length;i++){
            if(list[i] == target) return i;
        }
        System.out.println("Target not found");
        return 0;
    }
}
