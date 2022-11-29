/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETOCAIXA;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CADASTRO {
    Scanner Ler = new Scanner(System.in);
    private String nome;
    private int idConta;
    private int senha;

    
    
    private int saldoTotal ;
    
    private int quantidadeDebitos;
    
    
   

   String extrato[] = new String[10];
    
    
    public CADASTRO(String nome, int idConta, int senha ){
        this.senha = senha;
        this.nome = nome;
        this.idConta = idConta;
        this.saldoTotal = saldoTotal;
        
        this.quantidadeDebitos = quantidadeDebitos;
        }

    public int getQuantidadeDebitos() {
        return quantidadeDebitos;
    }

    public void setQuantidadeDebitos(int quantidadeDebitos) {
        this.quantidadeDebitos = quantidadeDebitos;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    
    public void armazenaPessoa(String nome, int idConta, int senha ){
    this.nome = nome;
    this.idConta = idConta;
    this.senha = senha;
    System.out.println("#############################");
    System.out.println("### CADASTRADO COM SUCESSO###");
    System.out.println("#############################");
    }
    
    
    
    
    
    // INICIAR
    public void iniciar(){
        int opcao = -1;
        Scanner Ler = new Scanner(System.in);
        
        do {
            Menu();//chamada do metodo 
            opcao = Ler.nextInt();
            escolherOpcao(opcao);//wchamada do metodo
        } while (opcao != 0);
    }
    
    
     public void Menu(){
         
        System.out.println("[1] - DEPOSITO");
        System.out.println("[2] - EXTRATO");
        System.out.println("[3] - DEBITAR");
        System.out.println("[4] - EM MANUTENÇÃO");
        System.out.println("[5] - EM MANUTENÇÃO");
        System.out.println("[6] - VERIFICAR INFORMAÇÕES DO CADASTRO");
        System.out.println("[0] - DESLOGAR");
    }
     
        public void escolherOpcao(int opcao){
            int valores;
            Scanner Ler = new Scanner(System.in);
            //INICIA AS OPÇÕES
            switch(opcao){
           
            
                
            //INICIAR          DEPOSITAR            //
                case 1:
                
            System.out.println("SALDO ATUAL : R$" + saldoTotal);   
            System.out.println("############################");
            System.out.println("DIGITE O VALOR PARA DEPOSITO");
            valores = Ler.nextInt();
                
                Depositar(valores);
                 System.out.println("### FIM DA OPERAÇÃO DEPOSITO ###");        
            
                 
                 
                 // INICIAR         FAZER EXTRATO DEPOSITO + //
                 for(int i = 0; i < extrato.length ; i ++){
                     if(extrato[i] == null){
                     extrato[i] = "+R$" + valores;
                     i = extrato.length;
                     
                     }
                     else{
                         System.out.println("vetor " + i + " esta ocupado" +" VAI PARA O PROXIMO VETOR");
                     }
                     }
                 // FIM         EXTRATO DEPOSITO + //
                 
                 break;
            //FIM          DEPOSITAR            //
            
            
            //-----------------------------------------------------------------\\   
            
            
            
            //INICIAR          EXTRATO            //
                case 2:
                for(int i = 0; i < extrato.length ; i ++){
                if(extrato[i] != null){
                    System.out.println(extrato[i]);        
                    }
               
                }
                System.out.println("##################################");
                System.out.println("Valor total em conta R$" + saldoTotal);
                System.out.println("##################################");
               
                break;
            //FIM          EXTRATO            //
            
            
            //-----------------------------------------------------------------\\  
            
            
             //INICIAR          DEBITAR            //
                case 3:
               
                System.out.println("SALDO ATUAL : R$" + saldoTotal);   
                System.out.println("############################");
                System.out.println("DIGITE O VALOR PARA RETIRAR/DEBITAR");
                    valores = Ler.nextInt();
                    Debitar(valores);
                    
                    
                    
                    // INICIAR         FAZER EXTRATO DE DEBITO/RETIRAR - //
                    for(int i = 0; i < extrato.length ; i ++){
                     if(extrato[i] == null){
                     extrato[i] = "-R$" + valores;
                     i = extrato.length;
                     
                     }
                     else{
                         System.out.println("vetor " + i + " esta ocupado" +" VAI PARA O PROXIMO VETOR");
                     }
                    }
                    //FIM           EXTRATO DEBITO/RETIRAR - //
                    
                    
                    
                break;
            //FIM          DEBITAR            //
            
            
            //-----------------------------------------------------------------\\  
            
            
             //INICIAR          XXXXX            //
                case 4:
                System.out.println("[2] - C");        
           
                
                
                break;
            //FIM          XXXXX            //
            
            
            //-----------------------------------------------------------------\\  
            
            
             //INICIAR          XXXXXX            //
                case 5:
                System.out.println("[2] - C");        
            
                
                
                break;
            //FIM          XXXXXX            //
            
            
            //-----------------------------------------------------------------\\  
            
            //INICIAR          VERIFICAR DADOS            //
             case 6:
                 verificarCadastro();
                 
            break;
            //FIM          VERIFICAR DADOS            //
            
            
            //-----------------------------------------------------------------\\  
            
            
            //INICIAR          XXXXXX            //
                case 10:
                System.out.println("DESLOGAR");        
                
                
                
                break;
            //FIM          XXXXXX            //
            
            
            //-----------------------------------------------------------------\\
            }
}
        
        public void Depositar(int valor){
        
        saldoTotal = saldoTotal + valor;
        System.out.println("############################");
        System.out.println("DEPOSITO EFETUADO COM SUCESSO");
        System.out.println("############################");
        System.out.println("Seu saldo atual é de R$" + saldoTotal);
        
        
        }
        
        public void Debitar(int valor){
        int saldoAntigo = saldoTotal;
        saldoTotal = saldoTotal - valor;
        
        
        System.out.println("############################");
        System.out.println("DEBITO EFETUADO COM SUCESSO");
        System.out.println("############################");
        System.out.println("SALDO ANTIGO R$"+saldoAntigo);
        System.out.println("Foi retirado/debitado -R$" + valor);
        System.out.println("Seu saldo atual é de R$" + saldoTotal);
        
        
        
        }
        
        public void verificarCadastro(){
            System.out.println("############################");
            System.out.println("DADOS CADASTRADOS");
            System.out.println("Nome : " + this.nome);
            System.out.println("Numero da Conta : " + this.idConta); 
            System.out.println("Senha : " + this.senha);
            System.out.println("############################");
            System.out.println("FIM DA CONSULTA DE CADASTRO");
            System.out.println("############################");
            
        }
        
        public void buscarContaLogin(int conta){
        if(this.idConta == conta){
        System.out.println("############################");
        System.out.println("A CONTA FOI ENCONTRADA");
        System.out.println("Nome :" + this.nome );
        System.out.println("Saldo :" + this.saldoTotal );
        
        System.out.println("############################");
        System.out.println("DIGITE SUA SENHA");
        int senha;
        senha = Ler.nextInt();
        
        if(this.senha == senha){
        System.out.println("############################");
        System.out.println("LOGIN EFETUADO");
        iniciar();
        }
        else{
        System.out.println("SENHA INVALIDA - OPERAÇÃO CANCELADA - TENTE NOVAMENTE");
        }
        
        }
        
        
        }
       
        }




