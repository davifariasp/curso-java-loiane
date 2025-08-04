package org.example.intermediario.enums;

public enum OperacoesMatematicas {

    SOMAR("+"){
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRAIR("-"){
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAR("*"){
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVIDIR("/"){
        @Override
        public double executarOperacao(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return x / y;
        }
    };

    final String operador;

    OperacoesMatematicas(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString(){
        return String.valueOf(operador);
    }

    public abstract double executarOperacao(double x, double y);
}
