package ada.septimaback.springbootdemo.service;

import ada.septimaback.springbootdemo.model.Cumpleanio;
import ada.septimaback.springbootdemo.persistence.CumpleanioStorage;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CumpleanioService {
    private List<Cumpleanio> cumpleanios;

    private CumpleanioStorage cumpleanioStorage;
    public CumpleanioService(CumpleanioStorage cumpleanioStorage) {

        this.cumpleanioStorage = cumpleanioStorage;
    }

    public List<Cumpleanio> cumpleanios(String mes){
        cumpleanios = cumpleanioStorage.cumpleanios();

        if(mes == null) {
            return cumpleanios;
        } else {
            return cumpleanios.stream().filter(
                    cumpleanio -> cumpleanio.getMes().equals(mes))
                    .collect(Collectors.toList());
        }

    }
}
