package grup2;

public class Lista {
    No nobase = new No();
    int tamanho=0;
    public void add(No no){
       No aux = new No();
       
    if(nobase==null){
        nobase = no; 
        
        tamanho++;
    }else{
          while(nobase!=null){
             aux=no;
             nobase=no.getProximo();
    }
    nobase=no;
    
    }
    }
