package com.company;

public class Main {

    public static void main(String[] args) {
	String palindrom ="12345";
	//идея: создадим строку, также только задам на перед
       String noovaya = "";
        for (int i = 0; i < palindrom.length(); i++) {
            noovaya+=palindrom.charAt(palindrom.length()-1-i);

        }
        System.out.println(noovaya);
        System.out.println(palindrom.equals(noovaya));
        System.out.println("не тупо________");
        noovaya= "";//присваивает к строке Новая пустую строку
        //цикл от номера последнего символа до 0 включительно
        //с шагом единица
        for (int i = palindrom.length()-1; i >=0; i--) {
            //лепим к строке Новая каждий символ строки ПАЛИНДРОМ начиная с конца
            noovaya+=palindrom.charAt(i);
        }
        System.out.println(noovaya);
    }
}
