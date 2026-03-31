
    void main() {

        String nome;
        char genero;
        double altura, peso, imc;
        String classificacao = "";

        nome = IO.readln("Informe seu nome: ");
        genero = IO.readln("Informe seu gênero (M/F/N): ").toUpperCase().charAt(0);
        altura = Double.parseDouble(IO.readln("Informe sua altura (em metros): "));
        peso = Double.parseDouble(IO.readln("Informe seu peso (em kg): "));

        //IMC
        imc = peso / (altura * altura);

        //filtro gênero
        switch (genero) {

            case 'M':
                if (imc >= 40) {
                    classificacao = "Obesidade Morbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            case 'F':
            case 'N':
                if (imc >= 39) {
                    classificacao = "Obesidade Morbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            default:
                classificacao = "Genero invalidado";
        }

        //resultados
        IO.println("\n--- Resultado ---");
        IO.println("Nome: " + nome);
        IO.println("Genero: " + genero);
        IO.println("IMC: " + imc);
        IO.println("Classificacao: " + classificacao);
    }
