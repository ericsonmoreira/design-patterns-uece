package com.uece.templatemethod;

// TODO: implementar quando o professor colocar os slides no classhome
public abstract class ReportTemplate {

    public String getTemplate() {
        return this.getHeader() + this.getContent() + this.getFooter();
    }

    public abstract String getHeader();
    public abstract String getContent();
    public abstract String getFooter();

}
