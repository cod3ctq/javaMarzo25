public class Celular {

    String fabricante;
    String material;
    String color;
    double mAh;


    public Celular(){}

    public Celular(String fabricante, String material, String color, double mAh) {
        this.fabricante = fabricante;
        this.material = material;
        this.color = color;
        this.mAh = mAh;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getmAh() {
        return mAh;
    }

    public void setmAh(double mAh) {
        this.mAh = mAh;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "fabricante='" + fabricante + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", mAh=" + mAh +
                '}';
    }

    public void llamar(String numero){
        System.out.println("Llamando al: "+numero+"...");
    }

    public void mandarMsj(String numero, String mensaje){
        System.out.println("Enviando: "+mensaje+" al "+numero+"...");
    }



}
