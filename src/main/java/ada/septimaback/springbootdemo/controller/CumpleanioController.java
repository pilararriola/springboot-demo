package ada.septimaback.springbootdemo.controller;

import ada.septimaback.springbootdemo.model.Cumpleanio;
import ada.septimaback.springbootdemo.service.CumpleanioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CumpleanioController {
    private CumpleanioService cumpleanioService;
    public CumpleanioController(CumpleanioService cumpleanioService){
        this.cumpleanioService = cumpleanioService;
    }

    @GetMapping("/cumpleanios")
    public List<Cumpleanio> cumpleanios(
            @RequestParam(value="mes", required = false) String mes){
        return cumpleanioService.cumpleanios(mes);
    }
}
