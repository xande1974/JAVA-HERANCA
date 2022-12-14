package com.mycompany.bancarevista;

public class Bebida extends Produto {
    private String tipo;
    
    public Bebida(){
        
    }

    public Bebida(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bebida{" + "tipo=" + tipo + '}';
    }
    
    

    
    
}

    