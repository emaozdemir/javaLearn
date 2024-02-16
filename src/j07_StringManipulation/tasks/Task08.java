package j07_StringManipulation.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(harfDepo.charAt(18)+""+harfDepo.charAt(4)+""+harfDepo.charAt(12)+""+harfDepo.charAt(0));

        int s1 = harfDepo.indexOf('S');
        int s2 = harfDepo.indexOf('E');
        int s3 = harfDepo.indexOf('M');
        int s4 = harfDepo.indexOf('A');
        System.out.println(harfDepo.charAt(s1)+""+harfDepo.charAt(s2)+""+harfDepo.charAt(s3)+""+harfDepo.charAt(s4));
        System.out.println((harfDepo.indexOf('S')));

    }
}
