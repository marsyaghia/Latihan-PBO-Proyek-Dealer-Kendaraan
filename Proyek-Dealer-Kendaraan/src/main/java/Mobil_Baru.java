/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
class Mobil_Baru extends Mobil implements Kendaraan{
    private String garansi;

    public Mobil_Baru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }
    
    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + " (Garansi: " + garansi + ")");
    }
}
