package TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    protected String[] getKeywords(){
        String[] keywords = {":(", "=(", ":|"};
        return keywords;
    }

    protected Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}
