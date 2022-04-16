public class ArraySumAvg {
    public static void main(String[] args) {
        int num [] = {10, 3, 8, 7, 15, 6, 9, 16, 25, 18};
        int sum = 0, total =0;
        float avg= 0;

        for( int i = 0; i< num.length;i++)
        {
            if(num[i]%2 ==0 || num[i]%5==0)
            {
                total++;
                sum = num[i]+sum;



            }


        }
        System.out.println("Sum of the Divisible number: "+ sum);
        avg = (float) sum/total;
        System.out.println("Average of the Divisible number is: " +avg);

    }
}
