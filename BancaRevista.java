
package com.mycompany.bancarevista;

public class BancaRevista {

    public static void main(String[] args) {
        Revista r1 = new Revista();
        Bebida b = new Bebida();
        Doce d = new Doce();
     
        r1.setNome("Placar");
        b.setNome("refri");
        d.setMarca("Lacta");
        
        System.out.println(r1.toString());
        System.out.println(b.toString());
        System.out.println(d.toString());
        
       
        
    }
}
