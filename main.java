
public class main {
    public static void main(String[] args) {
        
        // PESSOAS
        Pessoa[] p = new Pessoa[5];
        p[0] = new Pessoa("Isaias", 21, "Masculino");
        p[1] = new Pessoa("Luiza", 16, "Feminino");
        p[2] = new Pessoa("Jonas", 44, "Masculino");
        p[3] = new Pessoa("Rosa", 43, "Feminino");
        p[4] = new Pessoa("Francisco", 60, "Masculino");
        
        // LIVROS 
        Livro[] l = new Livro[5];
        l[0] = new Livro("Bilbia", "vários", 1000, 432, true,p[0]);
        l[1] = new Livro("12 Regras", "Jordan P.", 275, 102, false,p[1]);
        l[2] = new Livro("As Crônicas de Nárnia", "C.S Lewis", 800, 55, false,p[3]);
        l[3] = new Livro("Psicologia Financeira", "Morgan Housel", 270, 167, false,p[2]);
        l[4] = new Livro("O ego é seu inimigo", "Ryan Holiday", 300, 23, true,p[4]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
        
        l[2].abrir();
        l[2].folhear(100);
        l[2].avançarPag();
        System.out.println(l[2].detalhes());
    }
    }
    