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
public class NoHeapEsquerdista {
    private int elemento, valor=0;
    private NoHeapEsquerdista esq;
    private NoHeapEsquerdista dir;
            
    public NoHeapEsquerdista(int elemento, NoHeapEsquerdista esq, NoHeapEsquerdista dir) {
        this.elemento = elemento;
        this.dir = dir;
        this.esq = esq;
        this.valor = 0;
    }

    public NoHeapEsquerdista(int elemento) {
        this.elemento = elemento;
    }

    public NoHeapEsquerdista getEsq() {
        return esq;
    }

    public void setEsq(NoHeapEsquerdista esq) {
        this.esq = esq;
    }

    public NoHeapEsquerdista getDir() {
        return dir;
    }

    public void setDir(NoHeapEsquerdista dir) {
        this.dir = dir;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
