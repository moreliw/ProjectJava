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
    private double numeroA;
    private double numeroB;
    
    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    public double SomarNumeros(double numA, double numB){
        return (numA + numB);
    }
    
    public double SubtrairNumeros(double numA, double numB){
        return (numA - numB);
    }
    
    public double MultiplicarNumeros(double numA, double numB){
        return (numA * numB);
    }
    
    public double DividirNumeros(double numA, double numB){
        return (numA / numB);
    }
}
