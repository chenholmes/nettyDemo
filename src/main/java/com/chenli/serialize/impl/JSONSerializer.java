package com.chenli.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.chenli.serialize.Serializer;
import com.chenli.serialize.SerializerAlogrithm;

/**
 * <p>
 * <p>FileName: com.chenli.serialize.impl</p>
 * <p>Date: 2018-10-13 20:14.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlogrithm() {
        return SerializerAlogrithm.JSON;
    }

    @Override
    public byte[] serilize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserlize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes,clazz);
    }
}
