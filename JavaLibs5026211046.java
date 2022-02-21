/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalibs5026211046;

import javax.swing.JOptionPane;

/**
 *
 * @author Danish
 */
public class JavaLibs5026211046 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
   //Kotak Selamat Datang
        JOptionPane.showMessageDialog(
        null,
            "Selamat datang di Program ini, klik Ok untuk melanjutkan",
            "Selamat datang!",
            1);
     //1)Nama Box
        String namaUser = (String) JOptionPane.showInputDialog(null,
                "Masukkan nama lengkap: ",
                "Nama Lengkap",
                1,
                null,
                null,
                "Masukkan nama lengkap di sini");
     //2)Nama Panggilan Box
       String inputNamaPanggilan = JOptionPane.showInputDialog("Masukkan nama panggilan: ");
       String namaPanggilan = inputNamaPanggilan;
     //3)Umur Box
        String inputUmur = JOptionPane.showInputDialog("Masukkan umur");  
     int umurUser = Integer.parseInt(inputUmur);
     //4)Double Box
        String inputDouble = JOptionPane.showInputDialog("Masukkan IPK yang kamu harapkan \nsemester ini(0.0 - 4.0): ");
        double IPKHarapan = Double.parseDouble(inputDouble);
     //5)Pet Box
     String inputPet = JOptionPane.showInputDialog("Masukkan nama hewan yang kamu suka: ");
     String userPet = inputPet;
     //6)Pertanyaan mengenai Pet
    String[] option = {"punya", "tidak punya"};
    String userChoice = (String)JOptionPane.showInputDialog(null,
                "Apakah kamu memiliki "+userPet +"?",
                "",
                1,
                null,
                option,
                option[1]);
    //7)Pertanyaan Hobi
    String inputHobby = JOptionPane.showInputDialog("Hobi yang kamu suka lakukan adalah: ");
    String userHobby = inputHobby;
    
    //8)Pertanyaan uang bulanan
    String inputUangSebulan = JOptionPane.showInputDialog("Berapa kira-kira pengeluaranmu dalam sebulan?");
    int UangSebulan = Integer.parseInt(inputUangSebulan);
    
    //9)Berat Badan Ideal
    String inputHeight = JOptionPane.showInputDialog("Berapakah tinggi badanmu dalam meter?");
    double userHeight = Double.parseDouble (inputHeight);
    //variabel buat nyimpen nilai berat badan ideal
    double BeratBadanIdeal = (userHeight*100 - 100)+ (userHeight*100 - 100)*0.1;
    
    //10) yang ingin disampaikan untuk user dirinya seminggu ke depan
    String inputPesan = JOptionPane.showInputDialog("apa yang mau kamu sampaikan\nuntuk orang yang lelah?");
    String userPesan = inputPesan;
    
        //code terakhir buat nunjukkin semuanyaa
    JOptionPane.showMessageDialog(
            null,
            "Hai "+namaUser +"!"+
            "\nnama panggilanmu adalah "+namaPanggilan +
            "\numurmu adalah "+umurUser +" tahun"+
            "\nhobi "+namaPanggilan +" adalah "+userHobby +
            "\nIPK yang kamu harapkan semester ini adalah "+IPKHarapan +
            "\nhewan kesukaanmu adalah "+userPet +
            "\nkamu "+userChoice +" "+userPet +
            "\npengeluaranmu per harinya adalah "+(UangSebulan/30) +
            "\nberat badan idealmu adalah "+BeratBadanIdeal +
            "\n"+userPesan,
            "Terima kasih sudah mengisi! Berikut adalah hasilnya!",
            1);
    }
    
}
