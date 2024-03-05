/**
 * 程序入口。测试功能
 */
public class DictionaryDemo {
    public static void main(String[] args) {
        //获取 DictionaryService 实例
        DictionaryService dictionary = DictionaryService.getInstance();
        System.out.println(lookup(dictionary, "book"));
        System.out.println(lookup(dictionary, "editor"));
        System.out.println(lookup(dictionary, "xml"));
        System.out.println(lookup(dictionary, "REST"));
    }

    public static String lookup(DictionaryService dictionary, String word) {
        String outputString = word + ":";
        String definition = dictionary.getDefinition(word);
        return definition == null ? outputString + "Cannot find definition for this word!!" : outputString + definition;
    }
}
