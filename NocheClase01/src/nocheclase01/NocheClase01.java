package nocheclase01;

import javax.swing.JOptionPane;


/**
 * Clase principal del proyecto Clase1 del curso Objetos.
 *
 * @author Chris
 */
public class NocheClase01 {

    /**
     * Punto de entrada del proyecto
     *
     * @param args parametros ingresados desde consola.
     */
    public static void main(String[] args) {

        /*
        Curso: Programación Orientado a Objetos
        Duración: 150 hs
        Días: Lunes Miércoles Viernes 19:00 a 22:20 hs
        Profesor: Carlos Ríos  lawlercarlospatricio@gmail.com
        Materiales: Google Docs.
        
        Software:   JDK 8.X         www.oracle.com
                    Netbeans IDE    netbeans.org
        
        JDK: Java Development Kit    
        JDK Alternativo: OpenJDK
        
        IDE: Integrated Development Enviroment
        
        IDEs Alternativos: JDeveloper Eclipse Intellij
        
        Gestores de proyectos: Maven o Gradle
        
         */
        //Comentarios de una sola linea
        /* Bloque de comentarios */
        /**
         * Comentarios Java Doc debe colocarse antes de la declaración de clases
         * o antes de la declaración de métodos.
         */
        //Java C++ C# Visual Basic son lenguajes tipados fuerte.
        //php Python JavaScript son lenguajes tipados deviles.
        /*
        var a=2;
        a="hola";
        a=3.45;
        a=new Object();
         */
        {
            int g = 2;
            //String g="hola";
        }
        String g = "hola";

        //sout TAB     atajo para System.out.println();
        //Tipo de datos primitivos
        //Tipo de datos boolean     1 byte
        boolean bo = true;
        System.out.println(bo);
        bo = false;
        System.out.println(bo);

        //Tipo de datos byte        1byte   signed
        byte by = 125;
        System.out.println(by);

        //Tipo de datos short       2 bytes signed
        short sh = 2000;
        System.out.println(sh);

        //Tipo de datos int         4 bytes signed
        int i = 2000000000;
        System.out.println(i);

        //Tipo de datos long        8 bytes signed
        long lo = 2000000000;
        System.out.println(lo);

        lo = 3000000000L;
        System.out.println(lo);

        //Tipo de datos char        2 bytes unsigned
        char ch = 65;
        System.out.println(ch);
        ch += 32;
        System.out.println(ch);

        //tipo de datos float 32 bits
        float fl = 5.32F;
        System.out.println(fl);

        //tipo de datos double 64 bits
        double dl = 5.32;
        System.out.println(dl);

        fl = 10;
        dl = 10;
        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = 100;
        dl = 100;
        System.out.println(fl / 3);
        System.out.println(dl / 3);

        //Clase String
        String texto = "Hola Soy Una Cadena De Caracteres";
        System.out.println(texto);

        //Imprimir todo en mayusculas.
        for (int b = 0; b < texto.length(); b++) {
            char letra = texto.charAt(b);
            if (letra >= 97 && letra <= 122) {
                letra -= 32;
            }
            System.out.print((char) letra);
        }
        System.out.println();

        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());

        boolean log1 = true;

        if (log1) {
            System.out.println("verdad1");
        } else {
            System.out.println("falso1");
        }

        if(log1) System.out.println("verdad2");
        else System.out.println("falso2");
        
        // ? operador ternario dada la condicion evalua true o false
        System.out.println((log1)?"verdad3":"falso3");
        
        JOptionPane.showMessageDialog(null, texto);
        
        
    }

}
