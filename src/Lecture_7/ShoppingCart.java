package Lecture_7;

public class ShoppingCart {
    public static void main(String[] args){
        double totalPrice = calculateTotalPrice(19.99,29.99,9.95,5.49,14.99);
        System.out.println("Total Price: $"+totalPrice);
    }

    public static double calculateTotalPrice(double... list){
        if(list.length==0)return 0.0;
        double sum=0;
        for(double i:list) sum += i;
        return sum;
    }
}
