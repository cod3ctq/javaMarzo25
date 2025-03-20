import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

// ejemplo aetobuses
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa los kilometros");
        int km1=scan.nextInt();
        System.out.println("Ingresa el destino");
        String des1=scan.next();
        System.out.println("Ingresa si es tarjeta de credito o debito");
        String tar1=scan.next();

        Aeropuerto aer = new Aeropuerto();
        aer.vendeBoletoFisico(km1, des1);
        aer.venderBoletoOnline(km1, des1, tar1);

        System.out.println("Ingresa los kilometros");
        int km2=scan.nextInt();
        System.out.println("Ingresa el destino");
        String des2=scan.next();
        System.out.println("Ingresa si es tarjeta de credito o debito");
        String tar2=scan.next();

        Capu cap = new Capu();
        cap.vendeBoletoFisico(km2, des2);
        cap.venderBoletoOnline(km2, des2, tar2);

        System.out.println(cap);
        System.out.println(aer);


    }
}