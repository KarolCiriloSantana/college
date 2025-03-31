package Exercícios;

import javax.swing.JOptionPane;

//2. Faça um programa que leia uma data no formato DD/MM/AAAA e indique se ela é válida. 
public class Data {
    public static void main(String[] args) {

        String data = (JOptionPane.showInputDialog(null, "Informe a data no formato DD/MM/AAAA ")).strip();

        String[] dados = data.split("/");

        if (dados.length == 3) {
            try {
                int dia = Integer.parseInt(dados[0]);
                int mes = Integer.parseInt(dados[1]);
                int ano = Integer.parseInt(dados[2]);
                if (dados[0].length() == 2 && dados[1].length() == 2 && dados[2].length() == 4) { // pode
                    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
                        JOptionPane.showMessageDialog(null, "ERRO! data inválida");
                    } else {
                        // dias de cada mês
                        if (mes == 2) { // Fevereiro
                            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                            if (bissexto && dia > 29) {
                                JOptionPane.showMessageDialog(null, "ERRO! data inválida");
                            } else if (!bissexto && dia > 28) {
                                JOptionPane.showMessageDialog(null, "ERRO! data inválida");
                            } else {
                                JOptionPane.showMessageDialog(null, "Data: " + data + " válida");
                            }
                        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // Abril, Junho, Setembro, Novembro
                            if (dia > 30) {
                                JOptionPane.showMessageDialog(null, "ERRO! data inválida");
                            } else {
                                JOptionPane.showMessageDialog(null, "Data: " + data + " válida");
                            }
                        } else { // Outros meses
                            JOptionPane.showMessageDialog(null, "Data: " + data + " válida");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ERRO! data inválida, escreva no formato DD/MM/AAAA");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Formato inválido");
            }

        } else {
            JOptionPane.showMessageDialog(null, "ERRO! data inválida, escreva no formato DD/MM/AAAA");
        }
    }
}