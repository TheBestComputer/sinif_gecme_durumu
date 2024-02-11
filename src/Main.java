
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Matematik notunuz : ");
        mat = scanner.nextInt();
        
        System.out.print("Fizik notunuz : ");
        fizik = scanner.nextInt();
        
        System.out.print("Turkce notunuz : ");
        turkce = scanner.nextInt();
        
        System.out.print("Kimya notunuz : ");
        kimya = scanner.nextInt();
        
        System.out.print("Muzik notunuz : ");
        muzik = scanner.nextInt();
        
        mat = mat < 0 || mat > 100 ? 0 : mat;
        fizik = fizik < 0 || fizik > 100 ? 0 : fizik;
        turkce = turkce < 0 || turkce > 100 ? 0 : turkce;
        kimya = kimya < 0 || kimya > 100 ? 0 : kimya;
        muzik = muzik < 0 || muzik > 100 ? 0 : muzik;
        
        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        
        if(avarage <= 55){
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere! ");
            System.out.println("Ortalamniz : " + avarage);
        }
        else{
            System.out.println("Tebrikler sinif gectiniz ! ");
            System.out.println("Ortalamaniz : " + avarage);
        }
        
    }
}
