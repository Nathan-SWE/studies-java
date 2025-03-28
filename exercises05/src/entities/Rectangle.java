/*
Programa para ler os valores de largura e altura de um retângulo.
E exibir sua área, perímetro, e diagonal. 
*/

package entities;

public class Rectangle {
    public double height;
    public double width;

    public double calcArea (){
        return this.height * this.width;
    }
    
    public double calcPerimeter (){
        return 2 * (this.height + this.width);        
    }

    public double calcDiagonal (){
        return Math.sqrt((height * height) + (width * width));
    }

    public String toString() {
        return String.format("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f", calcArea(), calcPerimeter(), calcDiagonal());
    }
}

