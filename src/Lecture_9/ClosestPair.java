package Lecture_9;

public class ClosestPair {
    public static void main(String[] args){
        double[][] coord = {{-1,3},{-1,-1},{1,1},{2,0.5},{2,-1},{3,3},{4,2},{4,-0.5}};
        double min = Double.POSITIVE_INFINITY;
        double distance;
        int c1=0,c2=0;

        for(int i=1; i< coord.length; i++){
            for(int j=i+1; j<coord.length; j++){
                distance = Math.sqrt(Math.pow(coord[i][0]-coord[j][0],2)+Math.pow(coord[i][1]-coord[j][1],2));
                if(distance<min){
                    min = distance;
                    c1 = i;
                    c2 = j;
                }
            }
        }

        System.out.printf("The closest pair is (%.1f,%.1f) and (%.1f,%.1f) which has distance of %.2f",
                coord[c1][0], coord[c1][1], coord[c2][0], coord[c2][1], min);
    }
}
