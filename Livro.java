
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    
    
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa p) {
      this.titulo = titulo;
      this.autor = autor;
      this.totPaginas = totPaginas;
      this.pagAtual = 0;
      this.aberto = false;
      this.leitor = p;
  }
  
   
  public String detalhes() {
      return "=======Livro==== \n titulo=" + titulo + ",\n autor=" + autor + ", \n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual
              + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + "." + ", \n idade: " + leitor.getIdade() + ", \n sexo: " + leitor.getSexo() 
              + "\n ==============================";
  }
  
  
  
  public String getTitulo() {
      return titulo;
  }
  
  
  
  public void setTitulo(String titulo) {
      this.titulo = titulo;
  }
  
  
  
  public String getAutor() {
      return autor;
  }
  
  
  
  public void setAutor(String autor) {
      this.autor = autor;
  }
  
  
  
  public int getTotPaginas() {
      return totPaginas;
  }
  
  
  
  public void setTotPaginas(int totPaginas) {
      this.totPaginas = totPaginas;
  }
  
  
  
  public int getPagAtual() {
      return pagAtual;
  }
  
  
  
  public void setPagAtual(int pagAtual) {
      this.pagAtual = pagAtual;
  }
  
  
  
  public boolean getAberto() {
      return aberto;
  }
  
  
  
  public void setAberto(boolean aberto) {
      this.aberto = aberto;
  }
  
  
  
  public Pessoa getLeitor() {
      return leitor;
  }
  
  
  
  public void setLeitor(Pessoa leitor) {
      this.leitor = leitor;
  }
  
  
  
  public void leitor(){
        
    }
  
  
  @Override
  public void abrir() {
       this.setAberto(true);
      
  }
  
  
  @Override
  public void fechar() {;
      this.setAberto(false);
  }
  
  
  @Override
  public void avançarPag() {
      this.setPagAtual(this.getPagAtual() + 1);
  }
  
  
  @Override
  public void voltarPag(){
      this.setPagAtual(this.getPagAtual() -1);
  }
  
  @Override
  public void status() {
      System.out.println("\n ======== LIVRO ========");
      System.out.println("\n NOME DO LEITOR." );
      System.out.println("\n NOME DO LIVRO " + this.getTitulo());
      System.out.println("\n TOTAL DE PÁGINAS DO LIVRO: " + this.getTotPaginas());
      System.out.println("\n PÁGINA ATUAL DO LEITOR: " + this.getPagAtual());
      System.out.println("\n LIVRO ESTÁ ABERTO? " + this.getAberto());
      
  }
  
  public void folhear(int p) {
      this.pagAtual = p;
  }
  }
  