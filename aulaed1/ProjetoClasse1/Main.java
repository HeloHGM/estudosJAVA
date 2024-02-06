package aulaed1.ProjetoClasse1;


public class Main {
    public static void main(String[] args) {
    //instanciando um obj
        Pessoa teste= new Pessoa();
        teste.idade = 20;
        teste.nome= "Heloisa";
    System.out.println("O nome da pessoa é: " + teste.nome);
    System.out.println("A idade da pessoa é: " + teste.idade);

        Pessoa cobaia = new Pessoa();
        cobaia.nome = "LUCAS";
        cobaia.idade = 23;
    System.out.println("O nome da pessoa é: " + cobaia.nome);
    System.out.println("A idade da pessoa é: " + cobaia.idade);
    

        Aluno aluno1 = new Aluno();
        aluno1.matricula = 2023;
        aluno1.curso = "BCC";
    System.out.println("O curso do aluno é: " + aluno1.curso +"\nA matricula do aluno é: " + aluno1.matricula);

        Aluno aluno2 = new Aluno();
        aluno2.matricula = 2024;
        aluno2.curso = "TSI";
    System.out.println("O curso do aluno é: " + aluno2.curso +"\nA matricula do aluno é: " + aluno2.matricula);


        Aluno aluno3 = new Aluno();
        aluno3.matricula = 2025;
        aluno3.curso = "TI";
    System.out.println("O curso do aluno é: " + aluno3.curso +"\nA matricula do aluno é: " + aluno3.matricula);


        Professor professorGraduacao = new Professor();
        professorGraduacao.disciplina = "1";
        professorGraduacao.salario = 12000.00;
    System.out.println("A disciplina do professor é: " + professorGraduacao.disciplina +"\nO salário do professor é: " + professorGraduacao.salario);


        Professor professorTecnico = new Professor();
        professorTecnico.disciplina = "2";
        professorTecnico.salario = 1222.00;
    System.out.println("A disciplina do professor é: " + professorTecnico.disciplina +"\nO salário do professor é: " + professorTecnico.salario);





    }
    
}
