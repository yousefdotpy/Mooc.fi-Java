import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String , ArrayList<String>> translation;
    public DictionaryOfManyTranslations(){
        translation = new HashMap<>();
    }
    public void add(String word, String translation){
        this.translation.putIfAbsent(word,new ArrayList<>());
        ArrayList<String> translations = this.translation.get(word);
        translations.add(translation);

    }
    public ArrayList<String> translate(String word){
        for (String string: translation.keySet()) {
            if (string.equals(word)) {
                return translation.get(string);
            }
        }
        return new ArrayList<>();
    }
    public void remove(String word){
        translation.remove(word);
    }

}
