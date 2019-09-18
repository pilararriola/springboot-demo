package ada.septimaback.springbootdemo.persistence;

import ada.septimaback.springbootdemo.model.Cumpleanio;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class CumpleanioStorage {
    private ObjectMapper objectMapper;

    public CumpleanioStorage(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    public List<Cumpleanio> cumpleanios() {
        try {
            return objectMapper.readValue(
                    new File("src/main/resources/cumpleanios.json"),
                    new TypeReference<List<Cumpleanio>>() {}
                    );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
