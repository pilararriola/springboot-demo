package ada.septimaback.springbootdemo.service;

import ada.septimaback.springbootdemo.model.Mascota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MascotaService {
    private List<Mascota> mascotas = new ArrayList<>(
            Arrays.asList(
                    new Mascota(1,"Ruben","Lulu",10,"gato"),
                    new Mascota(2, "Dani", "Pipo",5,"conejo")
            )
    );

    public Mascota agregarMascota(Mascota nuevaMascota) {
        nuevaMascota.setId(3);
        mascotas.add(nuevaMascota);
        return nuevaMascota;
    }
}
