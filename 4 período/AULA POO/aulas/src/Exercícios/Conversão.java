package Exercícios;

import javax.swing.JOptionPane;

//1. Faça um programa que realize a conversão de celsius para farenheight (F = C * 1.8 + 32) 
public class Conversão {
    public static void main(String[] args) {

        while (true) {
            try { 
            float C = Float.parseFloat(JOptionPane.showInputDialog(null, "Indique o número de °Celsius"));
            float F = (C * 1.8f + 32f);
            JOptionPane.showMessageDialog(null, String.format("Em Farenheight fica %.2f", F, "°"));
            break;
            } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Digite um número");
            }
        }
    }
}
