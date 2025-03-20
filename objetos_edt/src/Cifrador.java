import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//clase: es un modelo o plantilla resultado de alguna abstraccion de algo
// un conjunto de "que" y "como"
public class Cifrador {

    //Atributos - QUE
    String original;
    String cifrado;

    //Miembros por default

    //metodo constructor lleno (pide todos los datos desde el incio)
    public Cifrador(String cifrado, String original) {
        this.cifrado = cifrado;
        this.original = original;
    }

    // metodo contructor vacio.
    public Cifrador() {

    }

    public String getCifrado() {
        return cifrado;
    }

    public void setCifrado(String cifrado) {
        this.cifrado = cifrado;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "Cifrador{" +
                "original='" + getOriginal() + '\'' +
                ", cifrado='" + getCifrado() + '\'' +
                '}';
    }

    //Comportamiento de la clase (COMO)
    //Las clases tienen coportamiento de 3 formas diferentes
    // 1: metodos nativos
    public String leerArchivo(String ruta) {

        File file = new File(ruta); // representacion del archivo
        String linea = "";
        try { // INTENTA.....
            FileReader fr = new FileReader(file); //cache
            File file2 = new File("C:\\Users\\edtor\\OneDrive\\Escritorio\\escritura.txt");
            BufferedReader br = new BufferedReader(fr); // lector
            FileWriter fw = new FileWriter(file2);

            while ((linea = br.readLine()) != null) {
                fw.write(this.cifrar(linea)+"\n");
                //    System.out.println(Linea);
            }
            fw.close();
        } catch (Exception ex) {  // atrapa......
            ex.printStackTrace();
            System.out.println("Aqui deberia de hacer otra cosa aunque halla fallado");
        }

        return null;

    }

    public String cifrar(String linea) {
        String abc = "abcdefghijklmnñopqrstvwxyz";
        String cifrado = "";
        String temp = "";
        //Analizar el contenido de la cadena para filtrar
        //que la línea tenga una longitud mayo
        // r a cero
        if (linea.length() > 0) {

            for (int i = 0; i < linea.length(); i++) {
                temp = linea.charAt(i) + "";
                temp = temp.toLowerCase();
                //Si no es un espacio en blanco
//                if (!temp.equals(" ")) { //si no es un espacio en blanco
//
//                    if (temp.equals("z") || temp.equals("Z")){
//                     cifrado = cifrado + "a";
//                    }
//
//                } else {
//                    cifrado = cifrado+"<>"
//                }
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
        System.out.println(cifrado);
        return cifrado;
    }
}
        //2: metodos heredados (regularmente se sobreescriben)
        //3: metodos implementados (usando interfaces)

// INVESTIGAR QUE ES HERENCIA, CONCEPTO Y SU USO
//              SOBRECARGA Y SOBREESCRITURA


