/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus;

/**
 *
 * @author GAMES
 */
public class Ujibus {

    
    public static void main(String[] args) {
        Bus besar = new Bus(5 );
        besar.getpenumpang(17);
        besar.getpenumpang(24);
        besar.cetakpenumpang();
        
        
        besar.addpenumpang(2);
        besar.cetakpenumpang();
        
        
        besar.addpenumpang(1);
        besar.cetakpenumpang();
        
        
        besar.addpenumpang(2);
        besar.cetakpenumpang();

        besar.addpenumpang(2);
        besar.cetakpenumpang();
        
        
        
        
        
    }
    
}
