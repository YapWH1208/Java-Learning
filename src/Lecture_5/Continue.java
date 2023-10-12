package Lecture_5;

public class Continue {
    public static void main(String[] args){
        int sum=0;
        int number=0;

        while(number<20){
            number ++;
            if(number == 10 || number == 11)continue;
            sum += number;
        }
        System.out.println("The sum is " + sum);

        int ans = 0;
        for(int i=0;i<=20;i++){
            ans += i;
        }
        System.out.println("Answer is " + ans);
    }
}
