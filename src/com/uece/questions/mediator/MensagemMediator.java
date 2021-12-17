package com.uece.questions.mediator;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {

    private ArrayList<Colaborador> colaboradores;

    public MensagemMediator() {
        this.colaboradores = new ArrayList<Colaborador>();
    }

    public void addColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    @Override
    public void enviar(String mensagem, Colaborador colaborador) {
        for (Colaborador c: colaboradores) {
            if (!c.equals(colaborador)) {
                c.receberMensagem(mensagem);
            }
        }
    }

    public void enviarTrabalhoParaAlunos(String trabalho) {
        for (Colaborador c: colaboradores) {
            if (c instanceof Aluno) {
                c.receberMensagem(trabalho);
            }
        }
    }

    public void enviarTrabalhoDoAlunoParaProfessor(Aluno aluno, String trabalho) {
        for (Colaborador c: colaboradores) {
            if (c instanceof Professor) {
                c.receberMensagem(trabalho + " de: " + aluno);
            }
        }
    }

    public void enviarMensagemAlunoParaAluno(Aluno alunoRemetente, Aluno alunoReceptor, String mensagem) {
        for (Colaborador c: colaboradores) {
            if (c instanceof Aluno && c.nome == alunoReceptor.nome) {
                c.receberMensagem(mensagem + " de: " + alunoRemetente);
            }
        }
    }
}
