package com.company;

public class Main {

    public static void main(String[] args) {
	String palindrom = "Води, Сахара, хасидов";
	String buffer = palindrom.toLowerCase(); //toLowerCase єто делает все буквы на маленькие(нижний регистр)
        System.out.println(buffer);
        buffer = buffer.replaceAll( " ", ""); //меняет regex: на replecement
        buffer = buffer.replaceAll( "-", "");
        buffer = buffer.replaceAll( ",", "");
        System.out.println(buffer);
        String backward = "";

        //GUI - grafic user interface - frontend

        //начинаем с последнего //до 0 елемента //с каждым шагом
        // елемента буфера      //включительно  //уменьшая(і)на единичку
        for (int i = buffer.length()-1; i >=0; i--) {
backward += buffer.charAt(i);
//прицепляем к backward букву из буффера и до нулевой букви
            System.out.println(backward);

            boolean result = backward.equals(buffer);
            System.out.println(result);

            int[] arrey = new int[5];
            arrey[0] = 10;
            arrey[1] = 2;
            arrey[2] = 3;
            arrey[3] = 40;
            arrey[4] = 50;

            for (int j = 0; j < arrey.length; j++) {

                if (arrey[i]>=10){
                    System.out.println(arrey[i]);
                }

            }
            System.out.println(arrey[3]);

            int ageOffMyFriend// ето називается CamelCase!!!

            int areaOfMyGarden;
        }
    }
}
