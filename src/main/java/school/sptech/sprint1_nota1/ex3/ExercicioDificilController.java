package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        Integer enesimo = 0, soma = 0;

        if(n > 0){
            Integer[] escalas = new Integer[n];
            for(int i = 0; i < n; i++){
                enesimo = 1;

                if(i>1){
                    enesimo = escalas[i-1] + escalas[i-2];
                }

                soma += enesimo;
                escalas[i] = enesimo;
            }
        }

        ExercicioDificilResponse res = new ExercicioDificilResponse(enesimo, soma);
        return res;
    }
}
