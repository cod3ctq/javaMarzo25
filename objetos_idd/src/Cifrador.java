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
    public String LeerArchivo (String ruta){

        File file = new File(ruta);// representacion del archivo
        File file2 = new File("C:\\Users\\ThinkPad\\Desktop\\escritura.txt");
        String Linea= "";
        try{ // INTENTA.....
            FileReader fr = new FileReader(file); //cache
            BufferedReader br = new BufferedReader(fr); // lector
            FileWriter fw = new FileWriter(file2);

            while ((Linea=br.readLine())!=null){
                fw.write(this.cifrar(Linea)+ "\n");


               // System.out.println(this.cifrar(Linea));
            }
            fw.close();
        } catch (Exception ex){  // atrapa......
            ex.printStackTrace();
            System.out.println("Aqui deberia de hacer otra cosa aunque halla fallado");
        }

        return  null;

    }
    public String cifrar (String Linea){
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        String temp = "";
        String cifrado="";
        //analizar el contenido de la cadena para filtrar
        // que la linea tenga una longitud mayor a cero
        if (Linea.length()>0){

            for (int i=0; i<Linea.length(); i++){

                temp = Linea.charAt(i)+"";
                temp = temp.toLowerCase();
                // si no es un espacio en blanco
                if(temp.equals(" ")){               //si no es un espacio en blanco
                    cifrado = cifrado+"<>";
                }else if(temp.equals("z")){
                    cifrado = cifrado + "a";
                } else if (temp.equals(",") || temp.equals("(") || temp.equals(")") ) {
                    cifrado = cifrado+"#";

                }else {
                    try {
                        cifrado = cifrado + Integer.parseInt(temp)+1;

                    }catch (Exception ex){
                        System.out.println(ex.getMessage());
                        cifrado = cifrado + abc.charAt(abc.indexOf(temp)+1);
                    }
                }
            }

        }
        return cifrado;
    }


    //2: metodos heredados (regularmente se sobreescriben)
    //3: metodos implementados (usando interfaces)

}
