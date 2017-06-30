public class Quiz {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label res;

        for(TextAnalyzer analyzer: analyzers){
            res = analyzer.processText(text);
            if(res != Label.OK){
                return res;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) throws Exception {
        String[] spamWords = {"козел", "собака"};
        KeywordAnalyzer spam = new SpamAnalyzer(spamWords);
        KeywordAnalyzer negative = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLong = new TooLongTextAnalyzer(10);

        TextAnalyzer[] analyzers = {spam, negative, tooLong};
        System.out.println(checkLabels(analyzers, "Лала козел ллаfv"));
    }
}
