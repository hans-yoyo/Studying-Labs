package io.hans.coder.basis.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/31 15:43
 */
public class SpiTestMain {

    public static void main(String[] args) {
        ServiceLoader<Search> loader = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = loader.iterator();
        while (iterator.hasNext()) {
            iterator.next().searchDoc("hello spi");
        }
    }

}
