/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
public class Main {
    public static void main(String[] args) {
        Mobil_Baru mobilBaru = new Mobil_Baru("Toyota", "Avanza", "3 Tahun");
        Mobil_Bekas mobilBekas = new Mobil_Bekas("Honda", "Civic", 2018, 200000000);
        Dealer dealer = new Dealer("MobilIndo", mobilBaru, mobilBekas);
        dealer.info();
    }
}
