/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/**
 *
 * @author 17100518
 */
public class Linha {
    Ponto p1;
    Ponto p2;
    double size;

    public Linha(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.size = Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2) + Math.pow((p1.getY()-p2.getY()),2));
        
    }

    public Linha(Ponto3d p1, Ponto3d p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.size =Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2) + Math.pow((p1.getY()-p2.getY()),2)+ Math.pow(p1.getZ()-p2.getZ(),2));
    }

    
    @Override
    public String toString() {
        return "Linha " + "p1=" + p1 + ", p2=" + p2 + ", size=" + size + '}';
    }
  
    
   
}
