package OnlineLecture;

public class Ex3 {

    public static void main(String[] args) {

        double [] intArr = new double[5];

        intArr [0] = 0.5;
        intArr [1] = 1.5;
        intArr [2] = 2.5;
        intArr [3] = 3.5;
        intArr [4] = 4.5;

        double sum = 0;

        for ( int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        double mean = sum / intArr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);


    }
}
