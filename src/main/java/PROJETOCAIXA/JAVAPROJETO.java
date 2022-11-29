/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package PROJETOCAIXA;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JAVAPROJETO {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        
        
        // INFORMAÇÕES QUE SERÃO CADASTRADAS //
        String nome;
        int senha;
        
        
        
        // PERGUNTAR INFORMAÇÕES //
        System.out.println("########### CADASTRO ###########");
        System.out.println("################################");
        System.out.println("INFORME SEU NOME");
        nome = Ler.next();
        
        System.out.println("INFORME UMA SENHA");
        senha = Ler.nextInt();
        
        
       
        
        
        // CRIAR ID DA CONTA COM NUMERO ALEATORO
        int idConta;
        Random numero = new Random();
        
        idConta = 1 + numero.nextInt(9999);
        
        
        // CRIA COM AS INFORMAÇÕES LIDAS UMA NOVA CONTA
        CADASTRO minhaConta = new CADASTRO(nome, idConta,senha);
        
        System.out.println("#############################");
        System.out.println("CADASTRO COMPLETO COM SUCESSO");
        System.out.println("#############################");
        System.out.println("Nome : " + nome);
        System.out.println("Numero da Conta: " + idConta);
        System.out.println("Senha Escolhida:" + senha);
        
        minhaConta.iniciar();
        
        
    }
}
