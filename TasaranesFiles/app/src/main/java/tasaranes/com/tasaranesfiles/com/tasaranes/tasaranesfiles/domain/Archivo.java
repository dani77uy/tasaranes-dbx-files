package tasaranes.com.tasaranesfiles.com.tasaranes.tasaranesfiles.domain;

import java.io.FileInputStream;

/**
 * Created by T_DanielB6 on 17/04/2016.
 */
public class Archivo {

    private int id;
    private String nombre;
    private Tipo tipo;
    private String ruta;
    private long tamano;
    private FileInputStream fis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public static void convertToFileInputStream() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof FileInputStream) {
            
        }
        return false;
    }

}
