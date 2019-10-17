package ada.septimaback.springbootdemo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cumpleanio")
public class Cumpleanio implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String mes;
    private Integer dia;

    public Cumpleanio(){

    }

    public Cumpleanio(Long id, String nombre, String mes, Integer dia){
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
