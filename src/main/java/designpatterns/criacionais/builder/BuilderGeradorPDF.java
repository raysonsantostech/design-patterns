package designpatterns.criacionais.builder;

public interface BuilderGeradorPDF {

    public GeradorPDF getGeradorPDF();

    public void setPageConfiguration();
    
    public void setMargin();
    
    public void setHeader();
    
    public void setFooter();    
}
