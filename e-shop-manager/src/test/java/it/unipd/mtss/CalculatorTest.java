package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

/*
I nomi delle classi di test per essere eseguite come 
test devono rispettare le nomenclature 
che troviamo in 
https://maven.apache.org/surefire/maven-surefire-plugin/examples/inclusion-exclusion.html

Inoltre
È consigliato chiamare le classi di test come le classi di produzione aggiungendo il
suffisso Test ed inserire la classe nello stesso package della classe di produzione ma
nella cartella dei sorgenti di test. In questo modo nei test case sarà possibile
accedere sia ai metodi pubblici che prottetti, e sarà più semplice seprarere i test dal
codice di produzione.

Vedere le slide "Test di Unità"
*/


public class CalculatorTest{

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
        }
}