package vendingmachine;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class VendingMachine {

    Scanner keyboard = new Scanner(System.in);
    int pilihankopi;
    int pilihtoping;
    ArrayList<Coffee> Kopi = new ArrayList<>();
    ArrayList<Topping> Toping = new ArrayList<>();

    public static void main(String[] args) {
        VendingMachine VM = new VendingMachine();
        VM.Main();
    }

    public void Main() {
        Coffee cf = new Coffee();
        Coffee ak = new Coffee();
        Coffee kl = new Coffee();
        Topping tp = new Topping();
        Topping tp1 = new Topping();
        Topping tp2 = new Topping();

        cf.setNamaKopi("Arabica");
        ak.setNamaKopi("Robusta");
        kl.setNamaKopi("Flores");
        cf.setAsalKopi("Timur Tengah");
        ak.setAsalKopi("Eropa");
        kl.setAsalKopi("Asia");
        tp.setTopping("Boba");
        tp1.setTopping("Susu");
        tp2.setTopping("Cream");
        Kopi.add(cf);
        Kopi.add(ak);
        Kopi.add(kl);
        Toping.add(tp);
        Toping.add(tp1);
        Toping.add(tp2);
        System.out.println("KOPI\n");
        System.out.println("<1> PESAN KOPI & TOPPING");
        System.out.println("<2> KELUAR");
        System.out.print("Pilih :");
        pilihankopi = keyboard.nextInt();
        switch (pilihankopi) {
            case 1:
                for (int i = 0; i < Kopi.size(); i++) {
                    int a = 1 + i;
                    System.out.println(a + ". " + Kopi.get(i).getNamaKopi());
                }
                System.out.print("PILIH KOPI :");
                pilihankopi = keyboard.nextInt() - 1;
                menu3();

                break;
            case 2:
                System.out.println("ANDA KELUAR");
                break;
        }

    }

    public void menu2() {
        System.out.println("<1> PESAN KOPI & TOPPING");
        System.out.println("<2> KELUAR");
    }
    public void menu3(){
        System.out.println("PILIH TOPPING");
        for(int i=0;i<Kopi.size();i++){
            int a= i+1;
            System.out.println(a + "." + Toping.get(i).getTopping());
        }
            System.out.print("PILIH TOPPING : ");
            pilihtoping= keyboard.nextInt();
            System.out.println("PESANAN BERHASIL DIPESAN");
            System.out.println("KOPI ANDA : " + Kopi.get(pilihankopi).getNamaKopi() + " Asal : " + Kopi.get(pilihankopi).getAsalKopi());
     }

}
