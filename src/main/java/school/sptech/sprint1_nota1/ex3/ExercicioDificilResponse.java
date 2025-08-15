package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {
    private Integer enesimoTermo;
    private Integer soma;

    public ExercicioDificilResponse(Integer enesimoTermo, Integer soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public Integer getSoma() {
        return soma;
    }

    public Integer getEnesimoTermo() {
        return enesimoTermo;
    }
}
