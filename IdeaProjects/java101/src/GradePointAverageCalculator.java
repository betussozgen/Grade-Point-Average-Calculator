//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class GradePointAverageCalculator {
    public static void main(String[] args) {

        //Değişkenleri oluşturduk.
        int math ,physics ,chemistry ,turkish , history, music;
        double average;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alıyoruz.
        System.out.println("Please enter your math grade:");
        math = input.nextInt();

        System.out.println("Please enter your physics grade:");
        physics = input.nextInt();

        System.out.println("Please enter your chemistry grade:");
        chemistry = input.nextInt();

        System.out.println("Please enter your turkish grade:");
        turkish = input.nextInt();

        System.out.println("Please enter your history grade:");
        history = input.nextInt();

        System.out.println("Please enter your music grade:");
        music = input.nextInt();


        average = (math + physics + chemistry + turkish + history + music) / 6;

        System.out.println("Average =" + average);

        //ODEV:
        //koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        System.out.println((average >= 60) ? "Passed the class" : "Failed the class");




    }
}