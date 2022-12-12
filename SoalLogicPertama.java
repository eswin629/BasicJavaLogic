public class SoalLogicPertama {
    public static void main(String[] args) {
//        soal01(9);
//        soal02(9);
//        soal03(9);
//        soal04(9);
//        soal05(9);
//        soal06(9);
//        soal07(9);
//        soal08(9);
//        soal09(9);
        soal10(9);
    }


    public static void soal01(int n){
        int[] deret = new int[n];
        // 0 2 4 6 8 10 12
        for (int i = 0; i < deret.length; i++){

                deret[i] = i;

            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal02(int n){
        int[] deret = new int[n];
        // 0 2 4 6 8 10 12
        for (int i = 0; i < deret.length; i++){

            if (i == 0){
                deret[i] = 1;
            }
            else if (i == 2) {
                deret[i] = 2;
            }
            else if (i == 4) {
                deret[i] = 3;
            }
            else if (i == 6) {
                deret[i] = 4;
            }
            else if (i == 8) {
                deret[i] = 5;
            }
            else{
                if(i == 1){
                    deret[i] = 3;
                }
                else if( i==3 ){
                    deret[i] = deret[1]+deret[1];
                }
                else if(i==5){
                    deret[i] = deret[1]+deret[1]+deret[1];
                }
                else if(i==7){
                    deret[i] = deret[1]+deret[1]+deret[1]+deret[1];
                }
            }

            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal03(int n){
        int[] deret = new int[n];
        // 0 2 4 6 8 10 12
        for (int i = 0; i < deret.length; i++){

            deret[i] = i*2;

            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal04(int n){
        int[] deret = new int[n];
        // 1  1  2  3  5  8 13  21
        // 0  1  2  3  4  5  6  7
        for (int i = 0; i < deret.length; i++){
            if(i == 0 || i == 1){
                // deret ke i => 0, 1
                deret[i] = 1;
            }else {
                deret[i] = deret[i-1] + deret[i-2];
            }
            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal05(int n){
        int[] deret = new int[n];
        // 1  1  2  3  5  8 13  21
        // 0  1  2  3  4  5  6  7
        for (int i = 0; i < deret.length; i++){
            if(i == 0 || i == 1 || i == 2){
                // deret ke i => 0, 1
                deret[i] = 1;
            }
            else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal06(int n){
        int[] deret = new int[n];
        // 2 3 5 7 11 13 17 19 23
        // 0 1 2 3 4 5 6 7 8
        // +1, +2,  +2, +4,+2,+4,+2,+4

        for (int i = 0; i < deret.length; i++){
            if(i == 0){
                // deret ke i => 0, 1
                deret[i] = 2;
            }
            else if(i == 1 ){
                // deret ke i => 0, 1
                deret[i] = deret[i-1]+1;
            }
            else if(i == 2){

                deret[i] = deret[i-1]+deret[i-2];
            }
            else if(i == 3 ){
                // deret ke i => 0, 1
                deret[i] = deret[i-1]+deret[i-3];
            }
            else if(i == 4 ){
                deret[i] = deret[i-1]+deret[i-2]-deret[i-3]+deret[i-4];
            }
            else if(i == 5 || i == 6 || i == 7 || i == 8){
                deret[i] = deret[i-1]+deret[i-2]-deret[i-3];
            }
            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal07(int n){
        char[] deret = new char[n];

        for (int i = 0; i < deret.length; i++){
            if(i == 0){
                deret[i] = 'A';
            }
            else if(i == 1 ){
                deret[i] = 'B';
            }
            else if(i == 2 ){
                deret[i] = 'C';
            }
            else if(i == 3 ){
                deret[i] = 'D';
            }
            else if(i == 4 ){
                deret[i] = 'E';
            }
            else if(i == 5 ){
                deret[i] = 'F';
            }
            else if(i == 6 ){
                deret[i] = 'G';
            }
            else if(i == 7 ){
                deret[i] = 'H';
            }
            else if(i == 8 ){
                deret[i] = 'I';
            }

            System.out.print("\t"+deret[i]);
        }
    }
    public static void soal08(int n){
        char[] deret = new char[n];

        for (int i = 0; i < deret.length; i++){
            if(i == 0){
                deret[i] = 'A';
            }
            else if(i == 2 ){
                deret[i] = 'C';
            }
            else if(i == 4 ){
                deret[i] = 'E';
            }

            else if(i == 6 ){
                deret[i] = 'G';
            }
            else if(i == 8 ){
                deret[i] = 'I';
            }
            else if(i == 1 ){
                deret[i] = '2';
            }
            else if(i == 3 ){
                deret[i] = '4';
            }
            else if(i == 5 ){
                deret[i] = '6';
            }
            else if(i == 7 ){
                deret[i] = '8';
            }

            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal09(int n){
        int[] deret = new int[n];

        for (int i = 0; i < deret.length; i++){
            if(i == 0){
                // deret ke i => 0, 1
                deret[i] = 1;
            }
            else if(i == 1 ){
                // deret ke i => 0, 1
                deret[i] = deret[i-1]*3;
            }
            else if(i > 1 && i<9){

                deret[i] = deret[i-1]*3;
            }

            System.out.print("\t"+deret[i]);
        }
    }

    public static void soal10(int n){
        int[] deret = new int[n];

        for (int i = 0; i < deret.length; i++){
            if(i == 0){
                deret[i] = 0;
            }
            else if(i == 1 ){
                deret[i] = 1;
            }
            else if(i >= 2 && i <= 8 ){
                deret[i] = i*i*i;
            }
            System.out.print("\t"+deret[i]);
        }
    }

}
