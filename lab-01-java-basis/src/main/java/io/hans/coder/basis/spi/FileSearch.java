package io.hans.coder.basis.spi;

import java.util.List;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/31 15:41
 */
public class FileSearch implements Search {

    @Override
    public List<String> searchDoc(String keyWork) {
        System.out.println("文件搜索, keyword = " + keyWork);
        return null;
    }
    
}
