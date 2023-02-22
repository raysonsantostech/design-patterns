package designpatterns.criacionais.builder;

public class DirectorBuilderGeradorPDF {

    private BuilderGeradorPDF builder;
    
    public DirectorBuilderGeradorPDF(BuilderGeradorPDF builder) {
        this.builder = builder;
    }

    public void build() {
        builder.setPageConfiguration();
        builder.setMargin();
        builder.setHeader();
        builder.setFooter();
    }

    public void buildNoHeader() {
        builder.setPageConfiguration();
        builder.setMargin();
        builder.setFooter();
    }

    public void buildNoFooter() {
        builder.setPageConfiguration();
        builder.setMargin();
        builder.setHeader();
    }

    public void buildNoHeaderNoFooter() {
        builder.setPageConfiguration();
        builder.setMargin();
    }

    public void setBuilder(BuilderGeradorPDF builder) {
        this.builder = builder;
    }
}
