package ada.septimaback.springbootdemo.model;

import java.io.Serializable;

public class Mascota implements Serializable {
    private Integer id;
    private String duenie;
    private String nombre;
    private Integer edad;
    private String tipo;

    public Mascota() {
    }

    public Mascota(Integer id, String duenie, String nombre, Integer edad, String tipo) {
        this.id = id;
        this.duenie = duenie;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDuenie() {
        return duenie;
    }

    public void setDuenie(String duenie) {
        this.duenie = duenie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
