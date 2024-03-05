package dictionary;

import dictionary.api.Dictionary;

import java.util.HashMap;

public class ExtendedDictionary implements Dictionary {

    private final HashMap<String, String> map = new HashMap<>();
    public ExtendedDictionary() {
        map.put(
                "xml",
                "可延伸标记语言");
        map.put(
                "REST",
                "一种接口风格");
    }
    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }
}
