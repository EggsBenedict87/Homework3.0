public class Main {
    public static void main(String[] args) {
        double[] numbers={ 12.3, -45.5, 1.1, -99.9, 56.7, 22.8, 10.1, -34.8, -45.7, 48.9, 87.5, -12.9, 65.9, -86.2, 66.6 };
        boolean scp=false;
        int count=0;
        double sum=0;
        for (double num: numbers)
        {
            if (num < 0) {
                scp=true;
            }
            if (scp && num>0) {
                sum+=num;
                count++;
            }
            System.out.print(num+" ");

        }
        System.out.println("\nКоличество положительных чисел"+count);
        System.out.println("среднее число" + sum/count);
    }
}