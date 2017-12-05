package nocheclase02;

import javax.swing.JOptionPane;

public class NocheClase02 {

    public static void main(String[] args) {
        //declaración de clase interna
        class Auto{
            //atributos
            String marca;
            String modelo;
            String color;
            int velocidad;
            
            //método constructor
            /**
             * Método deprecado por Carlos Ríos el 9/08/2017 por
             * ser inseguro. Usar en su reemplazo 
             * Auto(String marca,String modelo,String color)
             * @deprecated
             */
            @Deprecated
            public Auto(){}//Constructor vacio
            public Auto(String marca,String modelo,String color){
                this.marca=marca;
                this.modelo=modelo;
                this.color=color;
                this.velocidad=0;
            }
            
            //métodos
            public void acelerar(){ 
                //velocidad+=10; 
                //velocidad=(velocidad+10>100)?velocidad=100:velocidad+10;
                acelerar(10);
            }
            //método sobrecargado
            public void acelerar(int kms){
                velocidad+=kms;
                if(velocidad>100) velocidad=100;
            }
            public void frenar() { velocidad-=10; }
            
            public void velocidad(){System.out.println(velocidad);}
            public int getVelocidad(){return velocidad;}
            
            
            public String toString(){
                return marca+" "+modelo+" "+color+" "+velocidad;
            }
            
        }//end class Auto
        
        System.out.println("-- auto1 --");
        Auto auto1=new Auto();      // 0
        auto1.marca="Ford";
        auto1.modelo="Focus";
        auto1.color="Verde";
        
        auto1.acelerar();           //10
        auto1.acelerar();           //20
        auto1.frenar();             //10
        
        System.out.println(auto1.marca+" "+auto1.modelo+" "
                +auto1.color+" "+auto1.velocidad);
        
        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Rojo";
        
        for(int a=0;a<=60;a++) auto2.acelerar();
        
        System.out.println(auto2.marca+" "+auto2.modelo+" "
                +auto2.color+" "+auto2.velocidad);
        
        System.out.println("-- auto3 --");
        Auto auto3=new Auto("Ford", "Fiesta", "Blanco");
        auto3.acelerar();       //10
        auto3.acelerar(25);     //35
        auto3.velocidad();
        System.out.println(auto3.getVelocidad());
        
        //JOptionPane.showMessageDialog(null, auto3.getVelocidad());
        
        //Método toString()
        System.out.println(auto3.toString());
        System.out.println(auto3);
        
        int x;
        //System.out.println(x);
        //Error no se puede imprimir una variable no inicializada
    }//end main
    
}//end class
