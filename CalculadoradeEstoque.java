/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TamaraPrussak
 */
public class CalculadoradeEstoque {
    public static void main(String[] args){
        double livroJava8 = 59.90;
        double livroTDD = 59.90;
double soma = livroJava8 + livroTDD;
System.out.println("O total em estoque é "+soma);

if (soma < 150){
    System.out.println("Seu estoque está muito baixo");
}else{
    System.out.println("Seu estoque está bom");
}
    }
}
