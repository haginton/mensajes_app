/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

/**
 *
 * @author jonat
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fecha_mesaje;
    
    public Mensajes(){
        
    }

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mesaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mesaje = fecha_mesaje;
    }
    
    

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mesaje() {
        return fecha_mesaje;
    }

    public void setFecha_mesaje(String fecha_mesaje) {
        this.fecha_mesaje = fecha_mesaje;
    }
    
    
}
