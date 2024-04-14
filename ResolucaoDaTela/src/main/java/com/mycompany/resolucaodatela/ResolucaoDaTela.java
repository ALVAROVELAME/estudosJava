/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author alvar
 */
public class ResolucaoDaTela {

    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit();
       
       Dimension d = tk.getScreenSize();
       System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
        
    }
}
