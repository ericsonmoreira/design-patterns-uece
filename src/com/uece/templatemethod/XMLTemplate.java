package com.uece.templatemethod;

public class XMLTemplate extends ReportTemplate {

    @Override
    public String getHeader() {
        return "<cake>\n";
    }

    @Override
    public String getContent() {
        return "<filling>morango</filling>\n";
    }

    @Override
    public String getFooter() {
        return "</cake>\n";
    }
}
