package com.mycompany.aula04;
public class Caneta {
   private String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;
   
   public Caneta(){
      this.tampar();
      this.cor = "Azul";
   }  
    
   public String getModelo() {
        return this.modelo;
   }
   public void setModelo(String m){
            this.modelo = m;
   }
   public float getPonta(){
       return this.ponta;
   }
   public void setPonta (float p){
       this.ponta = p;
   }
   
   public void tampar(){
       this.tampada = true;
   }
   public void destampar(){
       this.tampada = false;
   }   
   public void status (){
       System.out.println("SOBRE A CANETA:");
       System.out.println("Modelo; " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.cor);
       System.out.println("Tampada: " + this.tampada);
   }
}
