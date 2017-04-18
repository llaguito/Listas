package Profesor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santiago
 */
public class Persona {
    private String nome;
    private String dni;
    private int altura;
 public Persona(){
   
 }   
    
  public Persona(String n,String d,int altura){
      this.nome=n;
      this.dni=d;
      this.altura=altura;
  }  
  public String getPersona(){
    String datos;
    datos=this.nome+"-"+this.dni;
    return datos;
    
}
  public int getAltura(){
    return this.altura;
  }
  
  public void setPersona(String n,String d,int altura){
      this.nome=n;
      this.dni=d;
      this.altura=altura;
  }  
  public void setnome(String n){
      this.nome=n;
     }  
  public void setdni(String d){
     
      this.dni=d;
    
  }  
  public void sealtura(int altura){
     
      this.altura=altura;
  }  
}
    
  
  

