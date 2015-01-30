/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.edu.padroes.testes;

import ifpb.edu.padroes.singleton.ManagerProperties;

/**
 *
 * @author Magdiel Ildefonso
 */
public class App {
    public static void main(String[] args) {
        ManagerProperties m = ManagerProperties.getInstance();
        
        m.writeProperties("int","17");
        System.out.println(m.readProperties());
    }
}
