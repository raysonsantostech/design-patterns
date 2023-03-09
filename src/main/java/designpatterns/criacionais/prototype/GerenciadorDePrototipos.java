package designpatterns.criacionais.prototype;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDePrototipos {
    
    private Map<String, Prototype> map;

    public GerenciadorDePrototipos() {

        ArtigoSBC sbc = new ArtigoSBC();
        sbc.setTitulo("Instructions for Authors of SBC Conferences Papers and Abstracts");
        sbc.setAutores("Luciana P. Nedel1 , Rafael H. Bordini2 , Flávio Rech Wagner1, Jomi F. Hübner3");
        sbc.setUniversidade("1Instituto de Informática – Universidade Federal do Rio Grande do Sul (UFRGS) \n\t\tCaixa Postal 15.064 – 91.501-970 – Porto Alegre – RS – Brazi");
        sbc.setDepartamento("2Department of Computer Science – University of DurhamDurham, U.K. \n\t\t3Departamento de Sistemas e Computação Universidade Regional de Blumenau (FURB) – Blumenau, SC – Brazil");
        sbc.setEmails("{nedel,flavio}@inf.ufrgs.br, R.Bordini@durham.ac.uk, jomi@inf.furb.br");
        sbc.setResumo("Resumo. Este meta-artigo descreve o estilo a ser usado na confecção de artigos e resumos de artigos para publicação nos anais das conferências organizadas pela SBC.");

        ArtigoABNT abnt = new ArtigoABNT();
        abnt.setTitulo("MODELO PARA ELABORAÇÃO E FORMATAÇÃO DE ARTIGOS CIENTÍFICOS");
        abnt.setAutor("Nome(s) do(s) autor(es) em ordem alfabética");
        abnt.setResumo("Este documento apresenta o modelo de elaboração e formatação de artigos científicos.");
        abnt.setPalavrasChave("Palavras-chave: (devem ser somente 3 palavras) Artigo Científico. Metodologia. Normas.");

        map = new HashMap<>();
        map.put("sbc", sbc.clonePrototype());
        map.put("abnt", abnt.clonePrototype());
    }

    public Prototype getInstance(String id) {
        return map.get(id);

    }


}
