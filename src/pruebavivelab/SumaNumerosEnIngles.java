/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavivelab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author richard-usr
 */
public class SumaNumerosEnIngles {
    static boolean esValido = false;
    static ArrayList<String> palabraSencillas = null;
    
    public SumaNumerosEnIngles(){
    }

    public static boolean  validar( String numero ){
           
        //ArrayList<String> palabraSencillas = null;
        
        palabraSencillas = null;
        
        String[] numerosValidos = {
                    "zero","one","two","three","four","five","six","seven","eight","nine","ten",
                    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
                    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
                    "hundred","thousand","million","billion","trillion",
        };
        
        ArrayList<String> numerosEnIngles = new ArrayList<String>();
        for( String numeros: numerosValidos ){
            numerosEnIngles.add( numeros );
        }
        
          if ( numero != null && numero.length() > 0 ){
          
            numero = numero.replace("-", " ");
            numero = numero.toLowerCase();
            numero = numero.replace(" and", " ");
            numero = numero.replace("  "," ");
            String[] palabrasCortadas = numero.trim().split(" ");
            
            
            
            for( String palabra: palabrasCortadas ){
             
                
                //System.out.println( palabra );
                if( !numerosEnIngles.contains( palabra )  ){
                    esValido = false;
                    System.out.println("zero");
                    break;
                }else{
                    esValido = true;
                }
               
            }
            
            
            
            
            palabraSencillas = new ArrayList<String>();
            for( String palabras: palabrasCortadas ){
                palabraSencillas.add( palabras );
            }
            
           /* if( esValido ){
                palabraSencillas.add("1");
            }else{
                palabraSencillas.add("0");
                return null;
            }*/
          
          }
        
       
        return esValido;
        
    }
    
    public static ArrayList<String> pivot(){
        return palabraSencillas;
    }
    
    public static long  convertir( ArrayList<String> numeros ){
        
        
        
        //boolean esValido = false;
        long resultado = 0;
        long resultadoFinal = 0;
        //System.out.println( numeros.get( numeros.size()-1 ) );
        //if(  numeros.get( numeros.size()-1 ).equals("1") ){
        //    esValido = true;
        //}
        
        if( esValido ){
            
            for( String numero: numeros ){
                
                  if ( numero.equals("zero") )
                        {
                            resultado += 0;
                        }
                        else if ( numero.equals("one"))
                        {
                            resultado += 1;
                        }
                        else if (numero.equals("two"))
                        {
                            resultado += 2;
                        }
                        else if ( numero.equals("three"))
                        {
                            resultado += 3;
                        }
                        else if ( numero.equals("four"))
                        {
                            resultado += 4;
                        }
                        else if ( numero.equals("five"))
                        {
                            resultado += 5;
                        }
                        else if ( numero.equals("six"))
                        {
                            resultado += 6;
                        }
                        else if ( numero.equals("seven"))
                        {
                            resultado += 7;
                        }
                        else if ( numero.equals("eight"))
                        {
                            resultado += 8;
                        }
                        else if ( numero.equals("nine"))
                        {
                            resultado += 9;
                        }
                        else if ( numero.equals("ten"))
                        {
                            resultado += 10;
                        }
                        else if ( numero.equals("eleven"))
                        {
                            resultado += 11;
                        }
                        else if ( numero.equals("twelve"))
                        {
                            resultado += 12;
                        }
                        else if ( numero.equals("thirteen"))
                        {
                            resultado += 13;
                        }
                        else if ( numero.equals("fourteen"))
                        {
                            resultado += 14;
                        }
                        else if ( numero.equals("fifteen"))
                        {
                            resultado += 15;
                        }
                        else if ( numero.equals("sixteen"))
                        {
                            resultado += 16;
                        }
                        else if ( numero.equals("seventeen"))
                        {
                            resultado += 17;
                        }
                        else if ( numero.equals("eighteen"))
                        {
                            resultado += 18;
                        }
                        else if ( numero.equals("nineteen"))
                        {
                            resultado += 19;
                        }
                        else if ( numero.equals("twenty"))
                        {
                            resultado += 20;
                        }
                        else if ( numero.equals("thirty"))
                        {
                            resultado += 30;
                        }
                        else if ( numero.equals("forty"))
                        {
                            resultado += 40;
                        }
                        else if ( numero.equals("fifty"))
                        {
                            resultado += 50;
                        }
                        else if ( numero.equals("sixty"))
                        {
                            resultado += 60;
                        }
                        else if ( numero.equals("seventy"))
                        {
                            resultado += 70;
                        }
                        else if ( numero.equals("eighty"))
                        {
                            resultado += 80;
                        }
                        else if ( numero.equals("ninety"))
                        {
                            resultado += 90;
                        }
                        else if ( numero.equals("hundred"))
                        {
                            resultado *= 100;
                        }
                        else if ( numero.equals("thousand"))
                        {
                            resultado *= 1000;
                            resultadoFinal += resultado;
                            resultado = 0;
                        }
                        else if ( numero.equals("million"))
                        {
                            resultado *= 1000000;
                            resultadoFinal += resultado;
                            resultado = 0;
                        }
                        else if ( numero.equals("billion"))
                        {
                            resultado *= 1000000000;
                            resultadoFinal += resultado;
                            resultado = 0;
                        }
                        else if ( numero.equals("trillion"))
                        {
                            resultado *= 1000000000000L;
                            resultadoFinal += resultado;
                            resultado = 0;
                        }
            }
            
            resultadoFinal += resultado;
            resultado = 0;
                    
            //System.out.println(resultadoFinal);
            return resultadoFinal;
        
        }
        
        return 0;
    }
    
    public static void  sumar( ){
    
        String numero1;
        String numero2;
        long sum1 = 0, sum2 = 0, resultado;
        System.out.println("Escriba en ingles su primer entero");
        Scanner entrada = new Scanner(System.in); 
        numero1 = entrada.nextLine(); 
        
        
        if( ! numero1.equals(null)){
            validar(numero1); 
            sum1 = convertir( pivot() );
        }
        
        
        System.out.println("Escriba en ingles su segundo entero");
        numero2 = entrada.nextLine(); 
        
        if( ! numero2.equals(null) ){
            validar(numero2);
            sum2 = convertir( pivot()  );
        }
        resultado = sum1 + sum2;
        
        if(resultado < 0){
            System.out.println("zero");
        }else{
            System.out.println("La suma de los dos numeros es = "+resultado);
        }
        
        
    }   
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //convertir( validar("One hundred two thousand and thirty four") );
        System.out.println("SUMA DE DOS NUMEROS ENTEROS EN INGLES");
        System.out.println();
        sumar(  );
        
        
    }
    
    
}
