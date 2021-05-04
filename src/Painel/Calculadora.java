/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Painel;

/**
 *
 * @author mathe
 */
public class Calculadora {
    
    private double resultado;
    
    
    public void funcoes(double n1, double n2, int escolha){
        
        switch(escolha){
            case 1:
                
                  soma(n1, n2);
                  break;
            case 2:
                 
                 subtracao(n1, n2);
                 break;
            case 3:
                divisão(n1, n2);
                break;
        
        
            case 4:
            
                multiplicação(n1, n2);
                 break;
                
            default:
                break;
        
        }}

    public double getResultado() {
        return resultado;
    }
        
    public void soma (double a, double b){
    double soma1 = b+a;
        resultado = soma1; 
    
    }
    
    public  void subtracao (double a ,double b){
    double sub = a-b;
            resultado = sub;
    }
    
    public  void multiplicação (double a, double b){
    double mult = a*b;
    resultado = mult;
    }
    
    public  void divisão (double a, double b){
    double div = a/b;
    resultado = div;
    }
}
