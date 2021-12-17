package com.uece.questions.mediator;

/**
 * 14. Mediator: Crie um sistema que permita a comunicação entre professor e alunos de  uma sala de aula de forma a
 * suportar que novos alunos entrem a qualquer momento. Seu  sistema deve prover uma forma de professor enviar um
 * trabalho para todos os alunos, um  aluno enviar seu trabalho direto para o professor, e alunos trocarem mensagens
 * entre si. Use  o padrão Mediator para implementar o sistema.
 */

public class Main {
    public static void main(String[] args) {
        MensagemMediator mediator = new MensagemMediator();

        Professor professor = new Professor("Girafales", mediator);
        Aluno quico = new Aluno("Quico", mediator);
        Aluno chaves = new Aluno("Chaves", mediator);

        // setando os colaboradores no mediador
        mediator.addColaborador(quico);
        mediator.addColaborador(chaves);
        mediator.addColaborador(professor);

        mediator.enviarTrabalhoParaAlunos("trabalho");

        mediator.enviarTrabalhoDoAlunoParaProfessor(quico, "vc não vai com minha cara?");

        mediator.enviarMensagemAlunoParaAluno(chaves, quico, "Zaz Zaz Zaz");

        // Cadastrando outro aluno
        Aluno chiquinha = new Aluno("Maria Antonieta de Las Neves", mediator);
        mediator.addColaborador(chiquinha);

        mediator.enviarTrabalhoParaAlunos("trabalho 2");
    }
}
