/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Training;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author izzai
 */
public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String inputNama, String inputKelas, String inputMatkul, int inputNim) {
        nama = inputNama;
        kelas = inputKelas;
        matkulPraktikum = inputMatkul;
        nim = inputNim;
    }

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        HashMap<String, Mahasiswa> mahasiswa = new HashMap<>();
        String input;
        Mahasiswa data;

        mahasiswa.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mahasiswa.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
        mahasiswa.put("3", new Mahasiswa("Arro", "3D", "Pemrograman", 2020017));

        System.out.print("Masukkan ID : ");
        input = inpt.nextLine();
        data = mahasiswa.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas
                    + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}
