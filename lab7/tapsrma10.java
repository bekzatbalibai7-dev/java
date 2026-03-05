public class tapsrma10 {
    public static void main(String[] args) {
        double[][] D=new double[7][7];
        double sum=0;

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                D[i][j]=Math.random()*50;
                if(i==j) sum+=D[i][j];
            }
        }

        System.out.println("Орташа мән = "+sum/7);
    }
}