import java.util.Scanner;
import java.text.DecimalFormat;

public class jarak2titik{

    
    public static void main(String[] args){
        System.out.println("Nama: Lulu Alfina Zahra");
        System.out.println("NIM: 064002100004");
        System.out.println("Rabu, 06 April 2022");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        int x1,y1,x2,y2;
        double hasil;
        
        System.out.println("Masukkan nilai X1: ");
        x1 = input.nextInt();
        
        System.out.println("Masukkan nilai Y1: ");
        y1 = input.nextInt();
        
        System.out.println("Masukkan nilai X2: ");
        x2 = input.nextInt();
        
        System.out.println("Masukkan nilai Y2: ");
        y2 = input.nextInt();
        
        hasil = Double.valueOf(Math.sqrt(((x2-x1)^2)+((y2-y1)^2)));
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Jarak kedua titik adalah " + (df.format(hasil)));
    }
}