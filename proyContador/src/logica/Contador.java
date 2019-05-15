/*
 * Clase contador.java
 * @Version 0.1
 */
package logica;

/**
 * Clase que permite implementar un contador
 * @author Estudiantes
 */
public class Contador {
    private int valor;
    
    /**
     * Método que retorna el valor del cronómetro
     * @return el valor del contador
    */

    public int getValor() {
        return valor;
    }
    
    /**
     * Método que establece el valor del cronómetro
     * @param valor: entero que se setea en el atributo de la clase
    */

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Contador() {
        this.valor = 0;
    }
    
    /**
     * Método que avanza el valor del cronómetro
    */
    
    public void avanzar(){
        this.valor += 1;
    }
    
    /**
     * Método que retrocede el valor del cronómetro
     */
    
    public void retroceder(){
        this.valor -= 1;
    }
    
    /**
     * Método que reinicia el valor del contador
     */
    
    public void borrar(){
        this.valor = 0;
    }
    
}
