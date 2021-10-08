package com.uece.templatemethod;

public class HTMLTemplate extends ReportTemplate {

    @Override
    public String getHeader() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "<title>Document</title>\n" +
                "</head>";
    }

    @Override
    public String getContent() {
        return "<body>\n" +
                "Filling: Morango\n" +
                "</body>\n";
    }

    @Override
    public String getFooter() {
        return "</html>\n";
    }
}
