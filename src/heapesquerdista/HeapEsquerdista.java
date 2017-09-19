/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapesquerdista;

/**
 *
 * @author gabrielsantos
 */
// Exercicio 2A
public class HeapEsquerdista {
    private NoHeapEsquerdista raiz;

    public HeapEsquerdista(NoHeapEsquerdista raiz) {
        this.raiz = raiz;
    }

    public HeapEsquerdista() {
        this.raiz = null;
    }
    
    public boolean verificaRaizVaza(){
        return raiz == null;
    }
    
    public void eliminaHeapEsq(){
        this.raiz = null;
    }
    
    public void insere(int x){
        this.raiz = criaHeap(new NoHeapEsquerdista(x), raiz);
    }
    
    public void criaHeap(HeapEsquerdista k){
        if(this == k)
            return;
        this.raiz = criaHeap(raiz, k.raiz);
    }
    
    // Exercicio 2B
    private NoHeapEsquerdista criaHeap(NoHeapEsquerdista x, NoHeapEsquerdista y) {
       if(x == null)
           return y;
       if(y == null)
           return x;
       if(x.getElemento() > y.getElemento()){
           NoHeapEsquerdista aux = x;
           x = y;
           y = aux;
       }
       
       x.setDir(criaHeap(x.getDir(), y)); 
       
       if(x.getEsq() == null){
           x.setEsq(x.getDir());
           x.setDir(null);
       }else{
           if(x.getEsq().getValor() < x.getDir().getValor()){
               NoHeapEsquerdista aux = x.getEsq();
               x.setEsq(x.getDir());
               x.setDir(aux);
           }
           x.setValor(x.getDir().getValor()+1);
       }
       return x;
    }  
    
    public int deletaMininoValor(){
        if(verificaRaizVaza()){
            return -1;
        }
        int min = this.raiz.getValor();
        raiz = criaHeap(raiz.getEsq(), raiz.getDir());
        return min;
    }
    
    public void imprime(){
        imprime(raiz);
        System.out.println();
    }

    private void imprime(NoHeapEsquerdista raiz) {
        if(raiz != null){
            imprime(raiz.getEsq());
            System.out.print(raiz.getElemento() + "");
            imprime(raiz.getDir());
        }
    }
    
}

