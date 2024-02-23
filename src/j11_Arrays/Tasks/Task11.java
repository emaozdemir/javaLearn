package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int sumPound = 0;
        int sumDolar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("£")) {
                sumPound += Integer.parseInt(arr[i].replace("£", ""));//2.opsion->replaceAll("[^0-9]", ""))

            } else {
                sumDolar += Integer.parseInt(arr[i].replace("$",""));

            }
        }
        System.out.println(sumPound);
        System.out.println(sumDolar);

    }
}
