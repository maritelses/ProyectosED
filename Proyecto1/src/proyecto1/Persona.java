/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author alumno
 */
public class Persona {
    
    private String numeroDeTelefono;
    private String nombre;
    
    public Persona (String numeroDeTelefono){
        
    
    super();
    this.numeroDeTelefono = numeroDeTelefono;
   
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    public String getNombre(){
    
        return nombre;
    
    
    }
    
    
}
