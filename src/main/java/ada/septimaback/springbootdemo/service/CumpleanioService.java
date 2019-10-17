package ada.septimaback.springbootdemo.service;

import ada.septimaback.springbootdemo.model.Cumpleanio;
import ada.septimaback.springbootdemo.persistence.CumpleanioRepository;
import ada.septimaback.springbootdemo.persistence.CumpleanioStorage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CumpleanioService {
    private List<Cumpleanio> cumpleanios;

    private CumpleanioRepository cumpleanioRepository;
    public CumpleanioService(CumpleanioRepository cumpleanioRepository) {

        this.cumpleanioRepository = cumpleanioRepository;
    }

    public List<Cumpleanio> cumpleanios(String mes){
        cumpleanios = cumpleanioRepository.findAll();

        if(mes == null) {
            return cumpleanios;
        } else {
            return cumpleanios.stream().filter(
                    cumpleanio -> cumpleanio.getMes().equals(mes))
                    .collect(Collectors.toList());
        }
    }

    public Cumpleanio addCumpleanio(Cumpleanio cumpleanio) {
        return cumpleanioRepository.save(cumpleanio);
    }
}
