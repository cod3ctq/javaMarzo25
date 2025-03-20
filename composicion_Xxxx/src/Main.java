public class Main {
    public static void main(String[] args) {

        Celular cel = new Celular("Nokia","policarbonato","gris",800);
        Camara c1 = new Camara(5,10,1.7,2.4,400);
        Camara c2 = new Camara(5,10,1.7,2.4,400);
        Camara c3 = new Camara(5,10,1.7,2.4,400);
        Camara c4 = new Camara(5,10,1.7,2.4,400);
        Camara c5 = new Camara(5,10,1.7,2.4,400);

        Camara[] cams = {c1};
        Camara[] cams2 = {c2,c3,c4,c5};
        Procesador proc = new Procesador("Texas Instruments",2,332);
        Procesador proc2 = new Procesador("Qualcomm",8,3000);
        Smartphone sm = new Smartphone("Nokia","Policarbonato","Negro",120,"N95 8GB", "Symbian S60",cams, proc);
        Smartphone sm2 = new Smartphone("Samsung","Cristal","Negro",5000,"S23 Ultra", "Android 14",cams2, proc2);
        System.out.println(sm);
        System.out.println(sm2);

    }
}