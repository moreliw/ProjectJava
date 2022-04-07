/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author William Moreli
 */
public class Calculator {
    private int numeroA;
    private int numeroB;
    
    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    public int SomarNumeros(int numA, int numB){
        return (numA + numB);
    }
    
    public int SubtrairNumeros(int numA, int numB){
        return (numA - numB);
    }
    
    public int MultiplicarNumeros(int numA, int numB){
        return (numA * numB);
    }
    
    public int DividirNumeros(int numA, int numB){
        return (numA / numB);
    }
}
