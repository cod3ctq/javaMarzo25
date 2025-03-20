import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Cifrador {

    // Clase: Es un modelo o plantilla resultado de una abtraccion(concepto)
    // de algo.
    // QUE- COMO
    // Atributos -  QUE

    String original;
    String cifrado;

    // Miembros por default
    public Cifrador() {// metodo constructor vacio (contiene el nombre de la clase)

    }

    // Metodo conctructor lleno (pide todo desde el inicio)
    public Cifrador(String original, String cifrado) {
        this.original = original;
        this.cifrado = cifrado;
    }

    //getter & setters
    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getCifrado() {
        return cifrado;
    }

    public void setCifrado(String cifrado) {
        this.cifrado = cifrado;
    }

    @Override
    public String toString() {
        return "Cifrador{" +
                "original='" + original + '\'' +
                ", cifrado='" + cifrado + '\'' +
                '}';
    }
      /*
  Herencia
  Encapsulamiento
  Abstraccion
  Polimorfismo
   */
    //comportamiento de la clase (COMO)

    // las clase aqduieren comportamiento de 3 formas
    // 1: Metodos nativos
    public String leerArchivo(String ruta) {

        File file = new File(ruta); // Representacion de archivo
        File file2 = new File("C:\\Users\\user\\Desktop\\escritura.txt");

        String linea = ""; // variable aux
        try {  // intenta ......
            FileReader fr = new FileReader(file); // cache
            BufferedReader br = new BufferedReader(fr); // lector
            FileWriter fw = new FileWriter(file2);
           // fw.write(linea);

            while ((linea = br.readLine()) != null) {
                fw.write(this.cifrar(linea)+"\n");
            }
           fw.close();
        } catch (Exception ex) { // atrapa ...
            ex.printStackTrace();
            System.out.println("Aqui deberia hacer otra cosa");
        }
        return null;
    }

    public String cifrar(String linea) {
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        String cifrado = "";
        String temp = "";
// analizar el contenido de la cadena para filtrar
        // que la linea tenga una longitud mayor a cero
        if (linea.length() > 0) {

            for (int i = 0; i < linea.length(); i++) {
                temp = linea.charAt(i) + "";
                temp = temp.toLowerCase();
                // si no es un espacio en blanco
                if (temp.equals(" ")) { //si no es un espacio en blanco
                    cifrado = cifrado + "<>";
                } else if (temp.equals("z")) {
                    cifrado = cifrado + "a";
                } else if (temp.equals(",") || temp.equals("(") || temp.equals(")")) {
                    cifrado = cifrado + "*";
                } else {
                    try {
                        cifrado = cifrado + Integer.parseInt(temp) + 1;
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        cifrado = cifrado + abc.charAt(abc.indexOf(temp) + 1);

                    }
                }
            }

        }

        return cifrado;
    }


    // 2 : Metodos heredados (regularmente se sobreescriben)
    // 3 : Metodos implementados (usando interfaces)

    // herencia,
    // sobrecarga y sobreescritura


}
