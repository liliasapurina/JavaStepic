package TextAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    SpamAnalyzer (String[] keywords){
        this.keywords = keywords;
    }

    protected String[] getKeywords(){
        return keywords;
    }

    protected Label getLabel(){
        return Label.SPAM;
    }
}
