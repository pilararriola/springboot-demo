package ada.septimaback.springbootdemo.controller;

import ada.septimaback.springbootdemo.model.Mascota;
import ada.septimaback.springbootdemo.service.MascotaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    private MascotaService mascotaService;
    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @PostMapping("/mascotas")
    public Mascota addMascota(@RequestBody Mascota mascota) {
        return mascotaService.agregarMascota(mascota);
    }
}
