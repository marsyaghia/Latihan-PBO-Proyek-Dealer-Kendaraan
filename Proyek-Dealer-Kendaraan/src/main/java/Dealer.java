/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
class Dealer {
    private String nama;
    private Mobil_Baru mobilBaru;
    private Mobil_Bekas mobilBekas;

    public Dealer(String nama, Mobil_Baru mobilBaru, Mobil_Bekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }

    public String getNama() {
        return nama;
    }
    
    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
