/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

/**
 *
 * @author gerar
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            if(i==8)
                break;
            System.out.print(i+"-");
        }
        System.out.print("");
        for (int i = 1; i<=10; i++){
            if(i==8)
                continue;
            System.out.print(i+"-");
        }
    }
    
}
