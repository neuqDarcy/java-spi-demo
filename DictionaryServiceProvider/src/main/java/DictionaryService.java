import dictionary.api.Dictionary;

import java.util.Iterator;
import java.util.ServiceLoader;

// 提供服务的核心类。
// 1. 加载实现 SPI 接口的扩展类
// 2. 遍历扩展类，查询结果
public class DictionaryService {
    private static DictionaryService service;
    private ServiceLoader<Dictionary> loader;
    private DictionaryService() {
        loader = ServiceLoader.load(Dictionary.class);
    }

    //单例设计模式
    public synchronized static DictionaryService getInstance() {
        if (service == null) {
            service = new DictionaryService();
        }
        return service;
    }

    public String getDefinition(String word) {
        String definition = null;
        Iterator<Dictionary> dictionaries = loader.iterator();
        while (definition == null && dictionaries.hasNext()) {
            Dictionary d = dictionaries.next();
            definition = d.getDefinition(word);
        }
        return definition;
    }
}
