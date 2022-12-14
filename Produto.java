package com.mycompany.bancarevista;
public abstract class Produto {
    public int codigo;
    public String nome;
    public double valorUnid;
    public int estoque;
    

    public Produto(int codigo, String nome, double valorUnid, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnid = valorUnid;
        this.estoque = estoque;
    }
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnid() {
        return valorUnid;
    }

    public void setValorUnid(double valorUnid) {
        this.valorUnid = valorUnid;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
     public void incluirEstoque(int quantidade){
        estoque = estoque + quantidade;
    }
    public void tirarEstoque(int quantidade){
        if (quantidade <= estoque){
        estoque = estoque - quantidade;    
        }
        else
        {
            System.out.println("estoque indisponível");
        }
        
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ","
                + " valorUnid=" + valorUnid + ", estoque=" + estoque + '}';
    }
    
    
    
}
    
    
    

