package io.hans.coder.basis.spi;

import java.util.List;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/31 15:42
 */
public class DatabaseSearch implements Search {
    @Override
    public List<String> searchDoc(String keyWork) {
        System.out.println("数据搜索, keyword = " + keyWork);
        return null;
    }
}
