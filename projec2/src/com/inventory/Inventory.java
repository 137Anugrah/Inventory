package com.inventory;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Inventory {
    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodesepatu = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] jumlah = new int[50];
    String[] nama = new String[50];



    public void masukkanData(){
        try{
            for(int i=0;i < semua;i++){
                System.out.println("Produk nomer");
                System.out.println("nama produk  ");

                run.nextLine();
                kodesepatu[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("harga produk : ");
                harga[i]= run.nextInt();
                System.out.println("stok produk : ");
                stok[i]= run.nextInt();
                jumlah[i]=stok[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("nomer yang anda masukkan harus angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("masukkan nomer produk : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("yang anda masukkan lebih dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("nomer produk : "+kodesepatu[i]);
            System.out.println("nama produk : "+ nama[i]);
            System.out.println("harga produk : "+harga[i]);
            System.out.println("stok produk : "+stok[i]);
            System.out.println("nilai produk : "+jumlah[i]);
        }
    }
}


