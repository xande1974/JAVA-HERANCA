package com.mycompany.bancarevista;
public class Revista extends Produto {
    private String editora;
    
    public Revista(){
        
    }

    public Revista(int codigo, String nome, double valorUnid, int estoque) {
        super(codigo, nome, valorUnid, estoque);
        
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Revista{" + "editora=" + editora + '}';
    }
    
    
    
    
}
