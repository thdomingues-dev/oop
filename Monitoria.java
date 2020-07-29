package monitoria;
public class Monitoria {
    public static void main(String[] args) {
      Video v[] = new Video[3];
      v[0] = new Video("Aula 1");
      v[1] = new Video("Aula 2");
      v[2] = new Video("Aula 3");
      
      Gafanhoto g[] = new Gafanhoto[2];
      g[0] = new Gafanhoto("cc", "Carlos", 22, "Masculino");
      g[1] = new Gafanhoto("m23", "Marluza", 22, "Feminino");
      
      Visualizacao vs[] = new Visualizacao[2];
      vs[0] = new Visualizacao(g[0], v[1]);
      vs[0].avaliar();
      vs[1] = new Visualizacao(g[0], v[0]);
      vs[1].avaliar(87.0f);
      System.out.println(vs[0].toString());
      System.out.println(vs[1].toString());
    }  
}
