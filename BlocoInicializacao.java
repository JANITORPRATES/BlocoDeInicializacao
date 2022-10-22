public class BlocoInicializacao {
    //construtores
    BlocoInicializacao(int x) {
          System.out.println("Construtor c/ arg");
    }
    BlocoInicializacao() {
          System.out.println("Construtor s/ arg");
    }

    //blocos de inicialização
    static {
          System.out.println("Bloco estático 1");
    }
    {
          System.out.println("Bloco de inst. 1");
    }
    {
          System.out.println("Bloco de inst. 2");
    }
    static {
          System.out.println("Bloco estático 2");
    }

    public static void main(String[] args) {
          /* Ordem de execução: blocos estáticos 1 e
           * 2; ao chamar o construtor Java() serão
           * executados os blocos de instância 1 e
           * 2; logo depois o código do construtor 
           * será executado; ao chamar o construtor
           * Java(int x) os blocos de instância
           * serão executados novamente; logo depois
           * o código do construtor com argumento 
           * será executado*/
          new BlocoInicializacao();
          new BlocoInicializacao(7);
    }
}