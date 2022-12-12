public class SoalLogicKedua {
    public static void main(String[] args) {

//        soal01(9);
//        soal02(9);
//        soal03(9);
//        soal04(9);
//        soal05(9);
//        soal06(9);
        soal07(9);
    }
    public static void soal01(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 8 || i == 8 && j == 8) {
                    deret[i][j] = 9;
                }
                else if(i == 0 && j == 0 || i == 8 && j == 0){
                    deret[i][j] = 1;
                }
                else if(i == 1 && j == 7 || i == 7 && j == 7){
                    deret[i][j] = 8;
                }
                else if(i == 1 && j == 1 || i == 7 && j == 1){
                    deret[i][j] = 2;
                }
                else if(i == 2 && j == 6 || i == 6 && j == 6){
                    deret[i][j] = 7;
                }
                else if(i == 2 && j == 2 || i == 6 && j == 2){
                    deret[i][j] = 3;
                }
                else if(i == 3 && j == 5 || i == 5 && j == 5){
                    deret[i][j] = 6;
                }
                else if(i == 3 && j == 3 || i == 5 && j == 3){
                    deret[i][j] = 4;
                }
                else if(i == 4 && j == 4){
                    deret[i][j] = 5;
                }
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal02(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 || i == 1 && j == 0 || i == 2 && j == 0 || i == 3 && j == 0 ||
                        i == 4 && j == 0 || i == 5 && j == 0 || i == 6 && j == 0 || i == 7 && j == 0 ||
                        i == 8 && j == 0) {
                    deret[i][j] = 1;
                }
                else if(i == 0 && j == 1 || i == 8 && j == 1){
                    deret[i][j] = 3;
                }
                else if(i == 0 && j == 2 || i == 8 && j == 2){
                    deret[i][j] = 5;
                }
                else if(i == 0 && j == 3 || i == 8 && j == 3){
                    deret[i][j] = 7;
                }
                else if(i == 0 && j == 4 || i == 8 && j == 4){
                    deret[i][j] = 9;
                }
                else if(i == 0 && j == 5 || i == 8 && j == 5){
                    deret[i][j] = 11;
                }
                else if(i == 0 && j == 6 || i == 8 && j == 6){
                    deret[i][j] = 13;
                }
                else if(i == 0 && j == 7 || i == 8 && j == 7){
                    deret[i][j] = 15;
                }
                else if (i == 0 && j == 8 || i == 1 && j == 8 || i == 2 && j == 8 || i == 3 && j == 8 ||
                        i == 4 && j == 8 || i == 5 && j == 8 || i == 6 && j == 8 || i == 7 && j == 8 ||
                        i == 8 && j == 8) {
                    deret[i][j] = 17;
                }

            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal03(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 || i == 1 && j == 0 || i == 2 && j == 0 || i == 3 && j == 0 ||
                        i == 4 && j == 0 || i == 5 && j == 0 || i == 6 && j == 0 || i == 7 && j == 0 ||
                        i == 8 && j == 0) {
                    deret[i][j] = 0;
                }
                else if(i == 0 && j == 1 || i == 8 && j == 1 || i == 1 && j == 1|| i == 7 && j == 1){
                    deret[i][j] = 2;
                }
                else if(i == 0 && j == 2 || i == 8 && j == 2 || i == 2 && j == 2|| i == 6 && j == 2){
                    deret[i][j] = 4;
                }
                else if(i == 0 && j == 3 || i == 8 && j == 3 || i == 3 && j == 3|| i == 5 && j == 3){
                    deret[i][j] = 6;
                }
                else if(i == 0 && j == 4 || i == 8 && j == 4 || i == 4 && j == 4){
                    deret[i][j] = 8;
                }
                else if(i == 0 && j == 5 || i == 8 && j == 5 || i == 5 && j == 5|| i == 3 && j == 5){
                    deret[i][j] = 10;
                }
                else if(i == 0 && j == 6 || i == 8 && j == 6 || i == 6 && j == 6|| i == 2 && j == 6){
                    deret[i][j] = 12;
                }
                else if(i == 0 && j == 7 || i == 8 && j == 7 || i == 7 && j == 7|| i == 1 && j == 7){
                    deret[i][j] = 14;
                }
                else if (i == 0 && j == 8 || i == 1 && j == 8 || i == 2 && j == 8 || i == 3 && j == 8 ||
                        i == 4 && j == 8 || i == 5 && j == 8 || i == 6 && j == 8 || i == 7 && j == 8 ||
                        i == 8 && j == 8) {
                    deret[i][j] = 16;
                }

            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal04(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 || i == 1 && j == 0 || i == 2 && j == 0 || i == 3 && j == 0 ||
                        i == 4 && j == 0 || i == 5 && j == 0 || i == 6 && j == 0 || i == 7 && j == 0 ||
                        i == 8 && j == 0) {
                    deret[i][j] = 1;
                }
                else if(i == 0 && j == 1 || i == 8 && j == 1 || i == 4 && j == 1 ){
                    deret[i][j] = 1;
                }
                else if(i == 0 && j == 2 || i == 8 && j == 2 || i == 4 && j == 2 ){
                    deret[i][j] = 2;
                }
                else if(i == 0 && j == 3 || i == 8 && j == 3 || i == 4 && j == 3 ){
                    deret[i][j] = 3;
                }
                else if(((i >= 0 && i<=8) && j == 4) ){
                    deret[i][j] = 5;
                }
                else if(i == 0 && j == 5 || i == 8 && j == 5 || i == 4 && j == 5 ){
                    deret[i][j] = 8;
                }
                else if(i == 0 && j == 6 || i == 8 && j == 6 || i == 4 && j == 6){
                    deret[i][j] = 13;
                }
                else if(i == 0 && j == 7 || i == 8 && j == 7 || i == 4 && j == 7){
                    deret[i][j] = 21;
                }
                else if (i == 0 && j == 8 || i == 1 && j == 8 || i == 2 && j == 8 || i == 3 && j == 8 ||
                        i == 4 && j == 8 || i == 5 && j == 8 || i == 6 && j == 8 || i == 7 && j == 8 ||
                        i == 8 && j == 8) {
                    deret[i][j] = 34;
                }

            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal05(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i >= 0 && i<=8) && j == 0) || ((i >= 1 && i<=7) && j == 1) || ((i >= 2 && i<=6) && j == 2))  {
                    deret[i][j] = 1;
                }
                else if(((i >= 3 && i<=5) && j == 3) ){
                    deret[i][j] = 3;
                }
                else if(i == 4 && j == 4){
                    deret[i][j] = 5;
                }
                else if(((i >= 3 && i<=5) && j == 5) ){
                    deret[i][j] = 9;
                }
                else if(((i >= 2 && i<=6) && j == 6) ){
                    deret[i][j] = 17;
                }
                else if(((i >= 1 && i<=7) && j == 7) ){
                    deret[i][j] = 31;
                }
                else if(((i >= 0 && i<=8) && j == 8) ){
                    deret[i][j] = 57;
                }
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal06(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((j >= 0 && j<=8) && i == 0) || ((j >= 1 && j<=7) && i == 1))  {
                    deret[i][j] = 1;
                }
                else if(((j >= 2 && j<=6) && i == 2)){
                    deret[i][j] = 2;
                }
                else if(((j >= 3 && j<=5) && i == 3)){
                    deret[i][j] = 3;
                }
                else if(i == 4 && j == 4 ){
                    deret[i][j] = 5;
                }
                else if(((j >= 3 && j<=5) && i == 5)){
                    deret[i][j] = 8;
                }
                else if(((j >= 2 && j<=6) && i == 6)){
                    deret[i][j] = 13;
                }
                else if(((j >= 1 && j<=7) && i == 7)){
                    deret[i][j] = 21;
                }
                else if(((j >= 0 && j<=8) && i == 8)){
                    deret[i][j] = 21;
                }
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal07(int n){
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;
        // proses mengisi array ==> nilai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i >= 0 && i<=4) && j == 0) || ((j >= 0 && j<=4) && i == 8) || ((j >= 4 && j<=8) && i == 0) || ((i >= 4 && i<=8) && j == 8)){
                    deret[i][j] = 1;
                }
                else if(((i >= 1 && i<=4) && j == 1) || ((j >= 1 && j<=4) && i == 7) || ((j >= 4 && j<=7) && i == 1) || ((i >= 4 && i<=7) && j == 7) ){
                    deret[i][j] = 1;
                }
                else if(((i >= 2 && i<=4) && j == 2) || ((j >= 2 && j<=4) && i == 6) || ((j >= 4 && j<=6) && i == 2) || ((i >= 4 && i<=6) && j == 6) ){
                    deret[i][j] = 2;
                }
                else if(((i >= 3 && i<=5) && j == 3) || ((j >= 3 && j<=5) && i == 5) || ((j >= 3 && j<=5) && i == 3) || ((i >= 3 && i<=5) && j == 5) ){
                    deret[i][j] = 3;
                }
                else if(i ==4 && j == 4 ){
                    deret[i][j] = 5;
                }
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k]+"\t\t");
            }
            System.out.println("\n");
        }
    }
}
