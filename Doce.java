package com.mycompany.bancarevista;

public class Doce extends Produto{
    private String marca;
    
    public Doce(){
        
    }

    public Doce(String marca, int codigo, String nome, double valorUnid, int estoque) {
        super(codigo, nome, valorUnid, estoque);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Doce{" + "marca=" + marca + '}';
    }
    
    
    
}
