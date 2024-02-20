package j11_Arrays.Tasks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int [] arr={12, 14 , 21 ,23 , 10 ,4};
        double sum=0;
        int count=0;
        for ( int i=0; i<arr.length; i++ ){
            sum+=arr[i];
            count++;
        }
        System.out.println(sum/count);

    }
}