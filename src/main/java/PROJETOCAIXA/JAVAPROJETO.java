

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
        String nome;
        int senha;
        int idConta = 0;
        
         CADASTRO[] listaContas = new CADASTRO[10];
         
          for (int i = 0; i < listaContas.length; i++) {
            listaContas[i] = new CADASTRO("", 0, 0);
        }
         
        // INFORMAÇÕES QUE SERÃO CADASTRADAS //
        int opcao = -1;
            while(opcao != 0){
        
                System.out.println("[1] - CRIAR CONTA");
                System.out.println("[2] - JA TENHO CONTA");
                
                
                
                opcao = Ler.nextInt();
                
                switch(opcao){

        
                case 1:
                    
         for (int i = 0; i < listaContas.length; i++) {           
             if(listaContas[i].getIdConta() == 0){
        // PERGUNTAR INFORMAÇÕES //
        System.out.println("########### CADASTRO ###########");
        System.out.println("################################");
        System.out.println("INFORME SEU NOME");
        nome = Ler.next();
        
        System.out.println("INFORME UMA SENHA");
        senha = Ler.nextInt();    

        // CRIAR ID DA CONTA COM NUMERO ALEATORIO
        
        Random numero = new Random();
        
        idConta = 1 + numero.nextInt(9999);    
        
        
        
        
        
            
        listaContas[i].armazenaPessoa(nome, idConta, senha);
        
        listaContas[i].iniciar();
        i = listaContas.length;
        }
             
         }
                
        
        
        
        
        
       //METODO DE CADASTRO
       //  CADASTRO minhaConta = new CADASTRO(nome, idConta, senha);
      //  minhaConta.armazenaPessoa(nome, idConta,senha);
        
      //  System.out.println("Nome : " + minhaConta.getNome());
      //  System.out.println("Numero da Conta: " + minhaConta.getIdConta());
      //  System.out.println("Senha Escolhida:" + minhaConta.getSenha());
        
        
        break;
        
        
                        case 2:
                            
       System.out.println("#########");
       System.out.println("BEM VINDO");
       System.out.println("INFORME SUA CONTA");
       idConta = Ler.nextInt();
                          
       for (int i = 0; i < listaContas.length; i++) {
   
            
        listaContas[i].buscarContaLogin(idConta);
        
        }
        break;
        
                }
    }
    }
}
