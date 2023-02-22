package designpatterns.criacionais.builder;

public class BuilderGeradorPDFA3 implements BuilderGeradorPDF {

    private GeradorPDF geradorPDF;

    public BuilderGeradorPDFA3() {
        this.geradorPDF = new GeradorPDF();
    }

    public GeradorPDF getGeradorPDF() {
        return geradorPDF;
    }

    @Override
    public void setPageConfiguration() {
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(297);
        this.geradorPDF.setPageSizeY(420);
        this.geradorPDF.setPageColor("#ffffff");
        this.geradorPDF.setEncode("UTF-8");        
    }

    @Override
    public void setMargin() {
        this.geradorPDF.setMarginTop(60);
        this.geradorPDF.setMarginRight(40);
        this.geradorPDF.setMarginBottom(60);
        this.geradorPDF.setMarginLeft(40);
    }

    @Override
    public void setHeader() {
        this.geradorPDF.setHasHeader(false);
        this.geradorPDF.setHeaderHeigh(0);
    }

    @Override
    public void setFooter() {
        this.geradorPDF.setHasFooter(false);
        this.geradorPDF.setFooterHeigh(0);
    }

}