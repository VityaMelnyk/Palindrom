package com.company;

public class Main {

    public static void main(String[] args) {
	String palindrom = "Аргентина манит негра";
	String buffer = palindrom.toLowerCase(); //toLowerCase єто делает все буквы на маленькие(нижний регистр)
        System.out.println(buffer);
        buffer = buffer.replaceAll( " ", ""); //
        System.out.println(buffer);
        String backward = "";
        //начинаем с последнего //до 0 елемента //с каждым шагом
        // елемента буфера      //включительно  //уменьшая(і)на единичку
        for (int i = buffer.length()-1; i >=0; i--) {
backward += buffer.charAt(i);
//прицепляем к backward букву из буффера и до нулевой букви
        }
    }
}
