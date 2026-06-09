import java.util.Scanner;
public class Menghitung_Lembur_Array {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double[] arrayGaji = {5000000, 6500000, 9500000};
double[] arrayLembur = {30, 32, 34, 36, 38};
int indexGaji = -1;

System.out.print("Nama kamu adalah :");
String nama = input.nextLine();

System.out.print("Golongan gaji kamu : ");
String golongan = input.nextLine();

System.out.print("Jam lembur kamu : ");
int lembur = input.nextInt();

if(golongan.equals("A")) {
    indexGaji = 0;
}else if(golongan.equals("B")) {
    indexGaji = 1;
}else if(golongan.equals("C")) {
    indexGaji = 2;
}

if(indexGaji == -1){
    System.out.println("Golongan tidak valid");
    return;
}

double gajiPokok = arrayGaji[indexGaji];

int indexLembur = -1;
double persenLembur = 0;

if(lembur == 0) {
    persenLembur = 0;
} else if(lembur == 1) {
    indexLembur = 0;
} else if(lembur == 2) {
    indexLembur = 1;
} else if(lembur == 3) {
    indexLembur = 2;
} else if(lembur == 4) {
    indexLembur = 3;
} else{
    indexLembur = 4;
}

if(indexLembur != -1) {
    persenLembur = arrayLembur[indexLembur];
}

double gajiLembur = gajiPokok * (persenLembur / 100.0);
double totalGaji = gajiPokok + gajiLembur;

System.out.println("Nama : " + nama);
System.out.println("Golongan gaji : " + golongan);
System.out.println("Gaji pokok kamu adalah : " + gajiPokok);
System.out.println("jam lembur kamu adalah : " + lembur);
System.out.println("Persen gaji kamu adalah : " + persenLembur + "%");
System.out.println("gaji lembur kamu adalah : " + gajiLembur);
System.out.println("===================================================");
System.out.println("Total gaji kamu adalah : " + totalGaji);
    }
}