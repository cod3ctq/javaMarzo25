public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el asciento: ");
        int asc1 = sc.nextInt();
        System.out.println("Selecciona el tipo de pago (efectivo o tarjeta: ");
        String typeBuy1 = sc.next();
        System.out.println("Ingresa tu tarjeta debito o credito: ");
        String cardNumber1= sc.next();

        Tapo tap= new Tapo();
        tap.venderBoletoFisico(asc1,typeBuy1);
        tap.venderBoletoOnline(cardNumber1, asc1);

        System.out.println("Selecciona el asciento: ");
        int asc2 = sc.nextInt();
        System.out.println("Selecciona el tipo de pago (efectivo o tarjeta: ");
        String typeBuy2 = sc.next();
        System.out.println("Ingresa tu tarjeta debito o credito: ");
        String cardNumber2= sc.next();

        Aeropuerto aero = new Aeropuerto();
        aero.venderBoletoFisico(asc2,typeBuy2);
        aero.venderBoletoOnline(cardNumber2, asc2);

        System.out.println(tap);
        System.out.println(aero);
    }
}
