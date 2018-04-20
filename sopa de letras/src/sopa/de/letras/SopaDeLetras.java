/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopa.de.letras;

import java.util.ArrayList;

/**
 *
 * @author CISCO
 */
public class SopaDeLetras {

    private String[][] sopa;
    private ArrayList<Palabra> palabras;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SopaDeLetras sopaDeLetras = new SopaDeLetras();
        sopaDeLetras.iniciar();
    }

    private void iniciar() {
        sopa = new String[10][10];
        palabras = new ArrayList<>();
        crearPalabras();
        insertarPalabras();
        motrarSopa();
    }

    private void crearPalabras() {
        palabras.add(new Palabra(0, 0, 9, 0, "tecnologia"));
        palabras.add(new Palabra(1, 2, 1, 8, "ciencia"));
        palabras.add(new Palabra(8, 0, 8, 9, "innovacion"));
        palabras.add(new Palabra(0, 5, 8, 5, "industria"));
        palabras.add(new Palabra(0, 8, 3, 8, "java"));    
    }

    private void insertarPalabras() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopa[i][j]="-";
            }
        }
        for (int k = 0; k <palabras.size();k++) {
            String[] parts = palabras.get(k).getValor().split("");
            if(palabras.get(k).getPosIniX()==palabras.get(k).getPosFinX()){
                int j=0;
                for(int i=palabras.get(k).getPosIniY(); i<palabras.get(k).getPosFinY();i++){   
                    sopa[i][palabras.get(k).getPosIniX()]=parts[j];
                    j++;
                } 
            } else {
                int j=0;
                for(int i=palabras.get(k).getPosIniX(); i<palabras.get(k).getPosFinX();i++){   
                    sopa[palabras.get(k).getPosIniY()][i]=parts[j];
                    j++;
                }
            }
        }
    }

    private void motrarSopa() {
        for (String[] strings : sopa) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.print("\n");
        }
    }

    
    
}
