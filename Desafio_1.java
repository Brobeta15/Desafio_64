/*
Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
*/

import java.util.Scanner;

public class Desafio_1{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        boolean entradaValida = false;
        int quantidadeMinima = 0;
        int quantidadeMaxima = 0;
        
        while(!entradaValida){
            try{
                System.out.println(" Informe a quantidade máxima do seu estoque: ");
                quantidadeMaxima = sc.nextInt();
                entradaValida = true;

            }catch(Exception e){

                System.out.println("Letras e simbolos não são válidos.");
                sc.nextLine();
            }
        }
        entradaValida = false;

        while(!entradaValida){
            try{
                System.out.println(" Informe a quantidade mínima do seu estoque: ");
                quantidadeMinima = sc.nextInt();
                entradaValida = true;
                sc.nextLine();

            }catch(Exception e){

                System.out.println("Letras e simbolos não são válidos.");
            }
        }
        int estoqueMedio = (quantidadeMaxima + quantidadeMinima)/2;

        System.out.println("O estoque médio é: "+estoqueMedio);

        sc.close();
    }
}
