package com.chenli.util;

import java.util.UUID;

/**
 * <p>
 * <p>FileName: com.chenli.util</p>
 * <p>Date: 2018-10-20 20:00.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class IDUtil {

    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
