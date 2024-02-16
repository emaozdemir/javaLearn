package j08_Loops.Loop02_WhileLoop.task;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
        int count = 0;
        int i = 999;
        while (i >= 100) {
            if (i % 4 == 0 && i % 6 == 0) {
                count++;
                System.out.print(i+">");

            }
            i--;
        }

        System.out.println("\n3 basamakli 4 ve 6 ya tam bolunebilen tam sayilar adedi => " + count);


    }

}
