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
public class Bus {
    public double penumpang; 
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru; 
    
    
    public Bus (int maxPenumpang){
        this.maxpenumpang = maxPenumpang;
        
        
    }
   
    
    public void addpenumpang (double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
            
        }else {
            this.penumpang = temp ; 
            counter++; 
            
            
        }
    }

    
    public void getpenumpang (int password){
            if (password==24){
                System.out.println("Password Benar");
            }else{
                System.out.println("Password Salah");
            }
            
               
        
    }
    public double getaverage(){
        return penumpang/counter; 
        
    }
    public void cetakpenumpang (){
        System.out.println("Penumpang bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimal seharusnya adalah "+maxpenumpang);
    }
    

}
