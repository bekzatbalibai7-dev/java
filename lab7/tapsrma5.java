public class tapsrma5 {
    public static void main(String[] args) {
        double[] D=new double[17];
        double sum=0;

        for(int i=0;i<17;i++){
            D[i]=Math.random()*100;
            sum+=D[i];
        }

        double avg=sum/17;
        System.out.println("Орташа мән = "+avg);
    }
}