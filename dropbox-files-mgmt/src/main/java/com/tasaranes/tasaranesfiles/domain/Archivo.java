package com.tasaranes.tasaranesfiles.domain;

import java.io.Serializable;

/**
 * Created by T_DanielB6 on 18/04/2016.
 */
public class Archivo implements Serializable {

   private String nombre;
   private String tamano;
   private String ruta;
   private Tipo tipo;

   public Tipo getTipo() {
      return tipo;
   }

   public void setTipo(Tipo tipo) {
      this.tipo = tipo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getTamano() {
      return tamano;
   }

   public void setTamano(String tamano) {
      this.tamano = tamano;
   }

   public String getRuta() {
      return ruta;
   }

   public void setRuta(String ruta) {
      this.ruta = ruta;
   }

   @Override
   public String toString() {
      return nombre + " " + tamano;
   }
}
