/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author alvar
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc = 0; cc<=3; cc++) {
            System.out.println(cc);
        }
        System.out.println("repetição aninhada");
        for (int i = 0; i <= 3; i++){
            System.out.println("passo1: " + i);
            for (int j = 0; j <= 3; j++) {
                System.out.println("passo2: " + j);
            }
        }
    }
    
}
