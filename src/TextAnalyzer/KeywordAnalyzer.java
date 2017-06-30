package TextAnalyzer;

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text){
        for(String word: getKeywords()){
            if (text.contains(word)){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
