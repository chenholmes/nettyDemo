package com.chenli.serialize;

import com.chenli.serialize.impl.JSONSerializer;

/**
 * <p>
 * <p>FileName: com.chenli.serialize</p>
 * <p>Date: 2018-10-13 20:05.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public interface Serializer {

    byte getSerializerAlogrithm();

    byte[] serilize(Object object);

    <T> T deserlize(Class<T> clazz,byte[] bytes);

    byte JSON_SERIALIZER = 1;

    Serializer DETAULF = new JSONSerializer();
}
