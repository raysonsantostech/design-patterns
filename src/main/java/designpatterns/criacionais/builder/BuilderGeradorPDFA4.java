package designpatterns.criacionais.builder;

public class BuilderGeradorPDFA4 implements BuilderGeradorPDF {

    private GeradorPDF geradorPDF;

    public BuilderGeradorPDFA4() {
        this.geradorPDF = new GeradorPDF();
    }

    public GeradorPDF getGeradorPDF() {
        return geradorPDF;
    }

    @Override
    public void setPageConfiguration() {
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(210);
        this.geradorPDF.setPageSizeY(297);
        this.geradorPDF.setPageColor("#ffffff");
        this.geradorPDF.setEncode("UTF-8");        
    }

    @Override
    public void setMargin() {
        this.geradorPDF.setMarginTop(30);
        this.geradorPDF.setMarginRight(20);
        this.geradorPDF.setMarginBottom(30);
        this.geradorPDF.setMarginLeft(20);
                
    }

    @Override
    public void setHeader() {

        this.geradorPDF.setHasHeader(true);
        this.geradorPDF.setHeaderHeigh(15);        
    }

    @Override
    public void setFooter() {
        this.geradorPDF.setHasFooter(true);
        this.geradorPDF.setFooterHeigh(15);
    }
    
}
