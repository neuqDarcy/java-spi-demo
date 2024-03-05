package dictionary;

import dictionary.api.Dictionary;

import java.util.HashMap;

public class GeneralDictionary implements Dictionary {
    private final HashMap<String, String> map = new HashMap<>();
    public GeneralDictionary() {
        map.put(
                "book",
                "书籍");
        map.put(
                "editor",
                "编辑");
    }
    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }
}
