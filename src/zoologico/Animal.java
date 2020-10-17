/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author diego
 */
public class Animal {
    private int idade;
    private String nome;
    private double peso;
    private boolean acordado;
    
    public void emiteSom() {
        System.out.println("TESTETTTTTTEEEEE");
    }
    
    public void comer() {
        
    }
    
    public void dormir() {
        System.out.println("ZZZZZZZZZZZZZZ");
    }
    
    public void seLocomover() {

    }
    
    //this, retorna o nome desse próprio objeto
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAcordado() {
        return acordado;
    }

    public void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }
    
    // Consutrutor vazio, que define valores padrão, mas que passa pelo construtor principal
    public Animal() {
        this("",0,0,false);
    }
    
    // Definido como construtor principal
    public Animal(String nome, int idade, double peso, boolean acordado) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.acordado = acordado;
    }
}

