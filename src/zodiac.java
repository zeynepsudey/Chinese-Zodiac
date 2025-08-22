import java.util.Scanner;

public class zodiac {

    public static void main(String[] args) {
        int year, result;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        year = inp.nextInt();

        result = year % 12;

        switch(result){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : Maymun"); break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz"); break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek"); break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz"); break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Fare"); break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Öküz"); break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan"); break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Tavşan"); break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Ejderha"); break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Yılan"); break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : At"); break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : Koyun"); break;
        }
    }
}

        /*

        if statement kullanarak yapım :

        if(result == 0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }else if(result == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }else if(result == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }else if(result == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }else if(result == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }else if(result == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }else if(result == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }else if(result == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }else if(result == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }else if(result == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }else if(result == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }else if(result == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }*/
