package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
        int sayi = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(sayi + " ");
                sayi++;
            }
            System.out.println();
        }



    }
}


