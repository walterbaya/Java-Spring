package com.educacionit.spring.beginning.class01.test;

//Utilizamos JUNIT

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Walter
 */
public class CalculadoraTest {
    
    //anotación que pertenece a JUNIT
    //Un Test es un método en una clase
    //debe de retornar void si o si
    //el metodo no debe de recibir parametros.
    @Test
    public void divOkTest(){
        //AAA 
        /*Corresponde a las tres partes
        que conforman a un test, la primera
        es Arrange de arreglo, donde empezamos
        a organizar*/
        
        //Arrange
        Calculadora cal = new Calculadora();
        int expected = 4;
        int a = 8;
        int b = 2;
   
        //ACT de ejecutar
        
        int r = cal.div(a,b);
        
        //ASSERT comprobacion de que lo que buscamos está funcionando.
        //retorna una expresion booleana
        Assert.assertTrue(expected == r);
        
        
    }
}
