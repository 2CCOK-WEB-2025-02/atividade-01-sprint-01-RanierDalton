package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        if(palavra == null){
            return false;
        }

        String[] palavras = palavra.split("");
        String[] palavrasAux = new String[palavra.length()];
        int j = 0;

        for(int i = palavras.length -1; i >=0 ; i--) {
            palavrasAux[j] = palavras[i];
            j++;
        }

        String palavraAux = String.join("", palavrasAux);

        if(palavra.equalsIgnoreCase(palavraAux)){
            return true;
        }

        return false;
    }
}
