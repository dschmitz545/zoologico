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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal cachorro  = new Animal();
        cachorro.nome = "Lola";
        
        cachorro.emiteSom();
        System.out.println("Meu animal se chama " + cachorro.nome);
        
    }
    
}
