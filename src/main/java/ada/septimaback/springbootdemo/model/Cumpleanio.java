package ada.septimaback.springbootdemo.model;

import java.io.Serializable;

public class Cumpleanio implements Serializable {
    private String nombre;
    private String mes;
    private Integer dia;

    public Cumpleanio(){

    }

    public Cumpleanio(String nombre, String mes, Integer dia){
        this.nombre = nombre;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
}
