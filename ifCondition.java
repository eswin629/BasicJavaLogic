import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        String input = scanner.next();
        int nilai = stringConverter(input);
        //        nilai 0-20 E
            if(nilai>=0 && nilai<=20){
                System.out.println("nilai E");
            }
        //        nilai 21-40 D
            else if (nilai>=21 && nilai<=40) {
                System.out.println("nilai D");
            }
        //        nilai 41-60 C
            else if (nilai>=41 && nilai<=60) {
                System.out.println("nilai C");
            }
        //        nilai 61-80 B
            else if (nilai>=61 && nilai<=80) {
                System.out.println("nilai B");
            }
        //        nilai 80-100 A
            else if (nilai>=81 && nilai<=100) {
                System.out.println("nilai A");
            }

    }

    public  static Integer stringConverter(String input){
    int result = 0;
    try {
        result = Integer.parseInt(input);
    }catch (Exception e){
        System.out.println("Error: "+ e.getMessage());
    }
    return  result;
    }


public static void sampleConvert(Scanner scanner){
    //        input pertama
    System.out.println("Masukkan input1: ");
    String input1 = scanner.next();
    System.out.println("Hasil angka: "+input1);

    //        input Kedua
    System.out.println("Masukkan input2: ");
    String input2 = scanner.next();
    System.out.println("Hasil kata: "+input2);

    int angka1 =0;
    int angka2 =0;
    try {
        angka1 = Integer.parseInt(input1);
        angka2 = Integer.parseInt(input2);
    }catch (Exception e){
        System.out.println("Error"+ e.getMessage());
    }
    System.out.println("hitung...");
    int hasil = angka1+angka2;
    System.out.println("hasil jumlah = "+hasil);
}
}
