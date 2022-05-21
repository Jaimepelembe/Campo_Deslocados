/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campo_Deslocados;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;




/**
 *
 * @author multi
 */
public class GerirProduto {

//Atributos
private String Tipo;
private String nome;
private float quantidade;
private Vector<Produto> lista;
  BufferedReader x= new BufferedReader(new InputStreamReader(System.in));

//Construtor
public GerirProduto() {}

//Modificadores 
public String getTipo() {return Tipo;}
public void setTipo(String Tipo) {this.Tipo = Tipo;}

public String getNome() {return nome;}
public void setNome(String nome) {this.nome = nome;}

public float getQuantidade() {return quantidade;}
public void setQuantidade(float quantidade) {this.quantidade = quantidade;}

public Vector<Produto> getLista() {return lista;}
public void setLista(Vector<Produto> lista) {this.lista = lista;}

//Metodo para adicionar um produto a um Vector de produtos
public Vector<Produto> AdicionarProduto() throws IOException{
BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
boolean loop = true;
byte aux=0;
Vector<Produto> produtos= new Vector();

do{    
Produto p= new Produto();

//armazenar os produtos num vector
produtos.add(p);

System.out.println("Voce quer adicionar outro produto? \n1.Sim \n2.Nao");
     aux=Byte.parseByte(x.readLine());
     if(aux==1){}
     else
     if(aux==2){loop= false;}   
}while(loop==true);
this.lista=produtos;
return produtos;}

//Metodo para calcular a quantidade total de um tipo de produto
public void quantTotal(Vector<Produto> produtos) throws IOException{
float carnes=0,carbo=0,leite=0,gordura=0,tudo=0;

for(int i=0; i< produtos.size();i++){
if(produtos.elementAt(i).getTipo().equalsIgnoreCase("Carnes e Ovos")){
carnes=carnes+produtos.elementAt(i).getQuantidade();}

else
if(produtos.elementAt(i).getTipo().equalsIgnoreCase("Carboidratos")){
carbo=carbo+produtos.elementAt(i).getQuantidade();}  

else
if(produtos.elementAt(i).getTipo().equalsIgnoreCase("Leites e derivados")){
leite=leite+produtos.elementAt(i).getQuantidade();} 

else
if(produtos.elementAt(i).getTipo().equalsIgnoreCase("Gorduras")){
gordura=gordura+produtos.elementAt(i).getQuantidade();}   
tudo=tudo+produtos.elementAt(i).getQuantidade();}  

    System.out.println();
     Byte aux=Validacao.ValidarByte((byte)1, (byte)5,"Voce deseja visualizar a quantidade total de que produto? \n1.Carnes e Ovos\n2.Caboidratos\n3.Leites e derivados\n4.Gordura.\n5.Todos");
   switch(aux){
    case 1: System.out.println("Carnes e Ovos: "+carnes);break;
    case 2: System.out.println("Caboidratos: "+carbo+"kg"); break;       
    case 3: System.out.println("Leites e derivados"+leite+"kg"); break; 
    case 4: System.out.println("Gordura: "+gordura+"kg");break; 
    case 5: System.out.println("------Quantidade Total de Todos produto disponivel no Campo------ ");
    System.out.println("Carnes e Ovos: "+carnes+"kg");
    System.out.println("Caboidratos: "+carbo+"kg");
    System.out.println("Leites e derivados"+leite+"kg");
    System.out.println("Gordura: "+gordura+"kg");
    System.out.println("A quantida total de produtos: "+tudo +"kg");
   }
     
  
}

public void Remover(Vector<Produto> lista) throws IOException{
byte prod=Validacao.ValidarByte((byte)1, (byte)4,"Que tipo de produto quer remover? \n1.Carnes e Ovos\n2.Caboidratos\n3.Leites e derivados\n4.Gordura");
String tipo="",nome="";
    switch(prod){
    case 1: tipo="Carnes e Ovos";
    Byte aux=Validacao.ValidarByte((byte)1, (byte)5,"Introduza o nome: \n1.Carne \n 2.Ovo \n3.Palone\n4.Fiambre\n5.Rachel");
    switch(aux){case 1:nome="Carne";break;
              case 2:  nome="Ovo";break;
              case 3:  nome="Palone";break;
              case 4:  nome="Fiambre";break;
              case 5:  nome="Rachel";break;
          };break;
    
    
    case 2: tipo="Caboidratos";
    Byte b=Validacao.ValidarByte((byte)1, (byte)5,"Introduza o nome: \n1.Arroz \n2.Massa \n3.Acucar\n4.Farrinha\n5.Sal");
    switch(b){ case 1: nome="Arroz";break;
              case 2:  nome="Massa";break;
              case 3:  nome="Acucar";break;
              case 4:  nome="Farrinha";break;
              case 5:  nome="Sal";break;};
    break;
    case 3:tipo="Leites e derivados";
    Byte c=Validacao.ValidarByte((byte)1, (byte)3,"Introduza o nome: \n1.Leite \n 2.Queijo \n3.Iogurte");
    switch(c){case 1: nome="Leite";break;
              case 2: nome="Queijo";break;
              case 3: nome="Iogurte";break;}
    break;
    case 4:tipo="Gordura";
    Byte d=Validacao.ValidarByte((byte)1, (byte)4,"Introduza o nome: \n1.Oleo\n2.Azeite \n3.Manteiga\n4.Chocolate");
    switch(d){case 1: nome="Oleo";break;
              case 2: nome="Azeite";break;
              case 3: nome="Manteiga";break;
              case 4: nome="Chocolate";break;}
    break;
    
}
for(int i=0; i<lista.size();i++){
if(lista.elementAt(i).getTipo()==tipo && lista.elementAt(i).getNome()==nome){
    System.out.println("Produto "+(i+1)+" ,codigo: "+lista.elementAt(i).getCodigo());
    System.out.println("Introduza o codigo do produto que quer remover: ");
    int codigo=Integer.parseInt(x.readLine());
    if(lista.elementAt(i).getCodigo()==codigo){lista.removeElementAt(i);
        System.out.println("O Produto foi removido com sucesso");
        lista.trimToSize();
    this.lista=lista;
    }
}
} 
    
    
}


//metodo para indicar a informacao do total dos produtos de um determinado nome
public void printProdutos(Vector<Produto> list){
    
    for(int i=0; i<list.size();i++){
    System.out.println("-----Informacoes do produto----- " +(i+1) );
    System.out.println("Tipo: "+list.elementAt(i).getTipo());
    System.out.println("Nome: "+list.elementAt(i).getNome());
    System.out.println("Quantidade: "+list.elementAt(i).getQuantidade());
    System.out.println("Codigo: "+list.elementAt(i).getCodigo());
    System.out.println("Data de producao: "+list.elementAt(i).getData_prod());
    System.out.println("Data de Validade: "+list.elementAt(i).getData_val()); }
    


}
    public static void main(String[] args) throws IOException {
        GerirProduto g = new GerirProduto();
        
      Validacao vp = null;
      //vp.validarByte("", (byte)1, (byte)3)
        
        Vector aux;
        aux=g.AdicionarProduto();
         g.quantTotal(aux);
        //g.printProdutos(aux);
        g.Remover(aux);
        
       
    }
}      
   



    
