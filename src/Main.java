//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Nicolas Tesla");
        pessoa1.setEmail("tesla@gmail.com");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Email: " + pessoa1.getEmail());

        pessoa1.logar();

        Professor prof1 = new Professor("Albert","albert@gmail.com" );
        System.out.println("O professor é " + prof1.getNome());


        Turma estruturaDados =
                new Turma("Estrutura de Dados",
                        prof1,
                        30);

        //System.out.println(estruturaDados.getNome());

        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        Aluno a2 = new Aluno();
        a2.setNome("Patrícia");
        estruturaDados.inserirAluno(a1);
        estruturaDados.inserirAluno(a2);
        estruturaDados.listarAlunos();




    }
}