package designpatterns.criacionais.builder;

public class Cliente {
    public static void main(String[] args) {
        BuilderGeradorPDF builderA4 = new BuilderGeradorPDFA4();
        DirectorBuilderGeradorPDF director = new DirectorBuilderGeradorPDF(builderA4);
        director.build();
        GeradorPDF pdfA4 = builderA4.getGeradorPDF();
        System.out.println(pdfA4.toString());

        BuilderGeradorPDF builderA3 = new BuilderGeradorPDFA3();
        
        director.setBuilder(builderA3);
        director.build();

        GeradorPDF pdfA3 = builderA3.getGeradorPDF();
        System.out.println(pdfA3.toString());

    }    
}
