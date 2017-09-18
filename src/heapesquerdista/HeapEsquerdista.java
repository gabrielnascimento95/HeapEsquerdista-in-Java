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
       
       
       return x;
    }
    
    
}
