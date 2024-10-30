package br.com.fiap.main;

import br.com.fiap.beans.Tecnico;
import br.com.fiap.beans.Equipamentos;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.AgendaManutencao;
import br.com.fiap.beans.Estacao;
import br.com.fiap.beans.Instalacao;
import br.com.fiap.beans.Linha;
import br.com.fiap.beans.Manutencao;
import br.com.fiap.beans.RelatorioManutencao;
import br.com.fiap.beans.Via;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        Tecnico objTecnico = new Tecnico(
                texto("Nome"),
                texto("CPF"),
                inteiro("Id do Técnico"),
                texto("Especialidade")
        );

        Endereco objEndTecnico = new Endereco(
                texto("Logradouro do Técnico"),
                texto("CEP"),
                texto("Bairro"),
                inteiro("Número"),
                texto("Cidade")
        );

        objTecnico.setEndereco(objEndTecnico);

        Manutencao objManutencao = new Manutencao(
                inteiro("Id da Manutenção"),
                texto("Tipo de Manutenção"),
                texto("Descrição"),
                texto("Data da manutenção")
        );

        objManutencao.setTecnicoResponsavel(objTecnico);

        AgendaManutencao objAgenda = new AgendaManutencao(
                texto("Data prevista"),
                texto("Descrição"),
                inteiro("Id da Agenda")
        );

        objAgenda.setManutencao(objManutencao);
        objAgenda.setTecnicoResponsavel(objTecnico);

        RelatorioManutencao objRelatorio = new RelatorioManutencao(
                inteiro("Id do Relatório"),
                texto("Data do Relatório"),
                texto("Descrição Relatório"),
                texto("Status")
        );

        objRelatorio.setTecnicoResponsavel(objTecnico);
        objRelatorio.setManutencao(objManutencao);

        Equipamentos objEquipamentos = new Equipamentos(
                inteiro("Id do Equipamento"),
                texto("Tipo de equipamento"),
                texto("Status dos equipamentos")
        );

        objManutencao.setEquipamentosUtilizados(objEquipamentos);

        Estacao objEstacao = new Estacao(
                texto("Nome da Estação"),
                inteiro("Id da Estação")
        );

        Endereco objEndEstacao = new Endereco(
                texto("Logradouro da Estação"),
                texto("CEP"),
                texto("Bairro"),
                inteiro("Número"),
                texto("Cidade")
        );

        objEstacao.setEndereco(objEndEstacao);

        Linha objLinha = new Linha(
                inteiro("Id da Linha"),
                texto("Nome da linha")
        );

        objLinha.setEstacoes(objEstacao);
        objEstacao.setLinhas(objLinha);

        Via objVia = new Via(
                inteiro("Id da Via"),
                real("Extensão"),
                texto("Data da última manutenção")
        );

        objVia.setManutencoes(objManutencao);
        objVia.setEstacao(objEstacao);

        Instalacao objInstalacao = new Instalacao(
                inteiro("Código da Instalação"),
                texto("Tipo de Instalação"),
                texto("Status da instalação"),
                texto("Última Instalação")
        );

        objInstalacao.setManutencao(objManutencao);
        objInstalacao.setEstacao(objEstacao);
        
        
        System.out.println("=== Dados do Técnico ===\n" + objTecnico);
        System.out.println("=== Endereço do Técnico ===\n" + objEndTecnico);
        System.out.println("=== Dados da Manutenção ===\n" + objManutencao);
        System.out.println("=== Agenda de Manutenção ===\n" + objAgenda);
        System.out.println("=== Relatório de Manutenção ===\n" + objRelatorio);
        System.out.println("=== Equipamentos Utilizados ===\n" + objEquipamentos);
        System.out.println("=== Dados da Estação ===\n" + objEstacao);
        System.out.println("=== Endereço da Estação ===\n" + objEndEstacao);
        System.out.println("=== Linha da Estação ===\n" + objLinha);
        System.out.println("=== Via ===\n" + objVia);
        System.out.println("=== Instalação ===\n" + objInstalacao);


        
    }
}
