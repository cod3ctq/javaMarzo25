public class Camara {

    double mPix;
    int zoom;
    double aperturaF;
    double distF;
    int iso;

    public Camara(){

    }

    public Camara(double mPix, int zoom, double aperturaF, double distF, int iso) {
        this.mPix = mPix;
        this.zoom = zoom;
        this.aperturaF = aperturaF;
        this.distF = distF;
        this.iso = iso;
    }

    public double getmPix() {
        return mPix;
    }

    public void setmPix(double mPix) {
        this.mPix = mPix;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public double getAperturaF() {
        return aperturaF;
    }

    public void setAperturaF(double aperturaF) {
        this.aperturaF = aperturaF;
    }

    public double getDistF() {
        return distF;
    }

    public void setDistF(double distF) {
        this.distF = distF;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "mPix=" + mPix +
                ", zoom=" + zoom +
                ", aperturaF=" + aperturaF +
                ", distF=" + distF +
                ", iso=" + iso +
                '}';
    }
}
