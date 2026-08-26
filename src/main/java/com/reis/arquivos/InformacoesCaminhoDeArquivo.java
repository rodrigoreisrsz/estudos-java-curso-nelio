package com.reis.arquivos;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InformacoesCaminhoDeArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
    }


}
