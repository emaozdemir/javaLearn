package j13_ForEachLoop.bireysel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S01_forEach {
    public static void main(String[] args) {
        // verilen bir arrayde tekrar eden elementler için tekrar olanlari silip
        //tüm elemanlardan sadece 1 tane yapip eski arraye yeni halini atayip yazdirin;
        Integer[] sayiArr = {1, 3, 7, 1, 3, 7, 5, 3, 5, 5, 7, 6, 1, 6, 9, 8, 9, 7, 6};
        //arrayden bişey silip eklemek zor o yuzden bir bos list olusturalım;
        List<Integer> tekrarsizList = new ArrayList<>();
        for (Integer each: sayiArr) {
            if (!tekrarsizList.contains(each)) {
                tekrarsizList.add(each);
            }
        }
        System.out.println("tekrarsiz LİST ->"+tekrarsizList);//[1, 3, 7, 5, 6, 9, 8] tekrarsız list

        System.out.println("arr nin suanki hali "+ Arrays.toString(sayiArr));//[1, 3, 7, 1, 3, 7, 5, 3, 5, 5, 7, 6, 1, 6, 9, 8, 9, 7, 6]
        //şimdi biz tekrarsiz listi tekrarsız arrye cevireceğiz;

        sayiArr=new Integer[tekrarsizList.size()];//[null,null,null,null,null,null,null]//int olsaydı 0, Integre oldugu ıcın null
        for (int i = 0; i < sayiArr.length; i++) {
            sayiArr[i]=tekrarsizList.get(i);

        }
        System.out.println("arr nin son hali "+ Arrays.toString(sayiArr));//[1, 3, 7, 5, 6, 9, 8]



    }
}
