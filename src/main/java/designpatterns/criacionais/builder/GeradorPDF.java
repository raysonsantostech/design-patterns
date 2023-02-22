package designpatterns.criacionais.builder;

public class GeradorPDF {

    private String pageOrientation = "portrait";
    private String unit = "mm";
    private int PageSizeX = 210;
    private int PageSizeY = 297;
    private int marginTop = 30;
    private int marginRight = 20;
    private int marginBottom = 30;
    private int marginLeft = 20;
    private boolean hasHeader = false;
    private int headerHeigh = 0;
    private boolean hasFooter = false;
    private int footerHeigh = 0;
    private String pageColor = "inffffff"; 
    private String encode = "UTF-8";
    
    public String getPageOrientation() {
        return pageOrientation;
    }
    public void setPageOrientation(String pageOrientation) {
        this.pageOrientation = pageOrientation;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public int getPageSizeX() {
        return PageSizeX;
    }
    public void setPageSizeX(int pageSizeX) {
        PageSizeX = pageSizeX;
    }
    public int getPageSizeY() {
        return PageSizeY;
    }
    public void setPageSizeY(int pageSizeY) {
        PageSizeY = pageSizeY;
    }
    public int getMarginTop() {
        return marginTop;
    }
    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }
    public int getMarginRight() {
        return marginRight;
    }
    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }
    public int getMarginBottom() {
        return marginBottom;
    }
    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }
    public int getMarginLeft() {
        return marginLeft;
    }
    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }
    public boolean isHasHeader() {
        return hasHeader;
    }
    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }
    public int getHeaderHeigh() {
        return headerHeigh;
    }
    public void setHeaderHeigh(int headerHeigh) {
        this.headerHeigh = headerHeigh;
    }
    public boolean isHasFooter() {
        return hasFooter;
    }
    public void setHasFooter(boolean hasFooter) {
        this.hasFooter = hasFooter;
    }
    public int getFooterHeigh() {
        return footerHeigh;
    }
    public void setFooterHeigh(int footerHeigh) {
        this.footerHeigh = footerHeigh;
    }
    public String getPageColor() {
        return pageColor;
    }
    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }
    public String getEncode() {
        return encode;
    }
    public void setEncode(String encode) {
        this.encode = encode;
    }
    @Override
    public String toString() {
        return "### GeradorPDF ###"
                + "\n pageOrientation=" + pageOrientation 
                + "\n unit=" + unit + "\n PageSizeX=" + PageSizeX
                + "\n PageSizeY=" + PageSizeY + "\n marginTop=" + marginTop + "\n marginRight=" + marginRight
                + "\n marginBottom=" + marginBottom + "\n marginLeft=" + marginLeft + "\n hasHeader=" + hasHeader
                + "\n headerHeigh=" + headerHeigh + "\n hasFooter=" + hasFooter + "\n footerHeigh=" + footerHeigh
                + "\n pageColor=" + pageColor + "\n encode=" + encode + "\n";
    }

    
}
