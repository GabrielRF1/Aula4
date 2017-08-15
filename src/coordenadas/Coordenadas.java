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
public class Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto pa = new Ponto(10, 20);
        Ponto pb = new Ponto(8, 18);

        Linha linhaum = new Linha(pa, pb);

        System.out.println(pa.toString() + "\n\n"
                + pb.toString() + "\n\n"
                + linhaum.toString()+"\n\n\n\n");

        Ponto3d p3 = new Ponto3d(7, 8, 9);
        Ponto3d p4 = new Ponto3d(9, 99, 10);

        Linha linhadois = new Linha(p3, p4);

        System.out.println(p3.toString() + "\n\n"
                + p4.toString() + "\n\n"
                + linhadois.toString());
    }

}
