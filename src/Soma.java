public class Soma {
    int soma = 0;

    public int somar(int... values) {
        for (int i : values) {
            soma += i;
        }

        return soma;
    }
}
