/**
 * File : LambdaHashmap.java
 * Penulis : Abida Akbar Rusyadin
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060119120041", "Abida");
        mahasiswa.put("24060119140041", "Agam");

        mahasiswa.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}