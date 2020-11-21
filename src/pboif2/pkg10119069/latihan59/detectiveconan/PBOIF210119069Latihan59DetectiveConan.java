/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program detective conan
 */
public class PBOIF210119069Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karakter conan = new Karakter("Conan Edogawa (Shinichi Kudo)","Tokyo",true,"Investigasi");
        conan.tampilKarakter();
        
        Karakter ran = new Karakter("Ran Mouri","Osaka",false,"Karate");
        ran.tampilKarakter();
        
        Karakter ai = new Karakter("Ai Haibara (Shiho Miyano / Sherry)","Tokyo",true,"Kimia dan Farmasi");
        ai.tampilKarakter();
    }
    
}
