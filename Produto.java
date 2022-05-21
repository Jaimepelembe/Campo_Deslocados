package Campo_Deslocados;

import java.io.*;
import java.util.Vector;
public class Produto {
    private String tipo;
    private String nome;
    private float quantidade;
     private int codigo;
    private String data_prod;
    private String data_val;
    
  BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
    
    public Produto() throws IOException{
          
      Byte t=Validacao.ValidarByte((byte)1, (byte)4,"Introduza o tipo do produto: \n1.Carnes e Ovos \n2.Carboidratos\n3.Leites e derivados \n4.Gorduras");
       
        String k="";
        switch(t){
            case 1: k="Carnes e Ovos"; this.tipo=k;
         Byte aux=Validacao.ValidarByte((byte)1, (byte)5,"Introduza o nome: \n1.Carne \n 2.Ovo \n3.Palone\n4.Fiambre\n5.Rachel");
         
       
          switch(aux){
              case 1:  this.nome="Carne";break;
              case 2: this.nome="Ovo";break;
              case 3:  this.nome="Palone";break;
              case 4:  this.nome="Fiambre";break;
              case 5:  this.nome="Rachel";break;
          };break;
            
            case 2: k="Carboidratos"; this.tipo= k;
          Byte b=Validacao.ValidarByte((byte)1, (byte)5,"Introduza o nome: \n1.Arroz \n2.Massa \n3.Acucar\n4.Farrinha\n5.Sal");
         
          switch(b){
              case 1:  this.nome="Arroz";break;
              case 2: this.nome="Massa";break;
              case 3:  this.nome="Acucar";break;
              case 4:  this.nome="Farrinha";break;
              case 5:  this.nome="Sal";break;
          }; break;
   
            case 3: k="Leites e derivados";this.tipo= k;
            
         Byte c=Validacao.ValidarByte((byte)1, (byte)3,"Introduza o nome: \n1.Leite \n 2.Queijo \n3.Iogurte");
         switch(c){
              case 1:  this.nome="Leite";break;
              case 2: this.nome="Queijo";break;
              case 3:  this.nome="Iogurte";break;} break;
              
              
            case 4: k="Gorduras";this.tipo= k;
            
         Byte d=Validacao.ValidarByte((byte)1, (byte)4,"Introduza o nome: \n1.Oleo\n2.Azeite \n3.Manteiga\n4.Chocolate");
         switch(d){
              case 1:  this.nome="Oleo";break;
              case 2: this.nome="Azeite";break;
              case 3:  this.nome="Manteiga";break;
              case 4:  this.nome="Chocolate";break;}
              break;}
        System.out.println("Introduza a data de fabricacao: ");
        this.data_prod=Data();
        
        System.out.println("Introduza a data de Validade: ");
        this.data_val=Data();
        this.quantidade=setQuantidade();
        this.setCodigo(); }
    
    public Produto(String nome, float quantidade, String tipo,int codigo){
      this.nome = nome;
      this.quantidade = quantidade;
      this.codigo = codigo;
      this.tipo = tipo;}
    
    
    
    public String getTipo(){return tipo;}
    public String getNome(){return nome;}
    
    public float setQuantidade() throws IOException{
        float q=Validacao.ValidarFloat(1f, 1000000f,"Digite a quantidade");
        return q;}
    public float getQuantidade(){return quantidade;  }
   
    public int setCodigo() {this.codigo = (int) (100000000 * Math.random()); return codigo;}
    public int getCodigo() {return codigo;}

    public String Data() throws IOException{
      int a,b,c;
      String data;
       a=Validacao.ValidarInt(1, 31,"Introduza o dia ");
       b=Validacao.ValidarInt(1, 12,"Introduza o mes ");
       c=Validacao.ValidarInt(2000, 2022,"Introduza o ano ");
      data=a+"/"+b+"/"+c;
     return data;
    //19/05/2022
//SubString
    }

    public String getData_prod() {return data_prod;}
    public String getData_val() {return data_val;}
    

    public String toString(){return "Nome: "+nome+ "\tTipo: "+tipo+"\tQuantidade: "+quantidade;
    }
    
    
}
