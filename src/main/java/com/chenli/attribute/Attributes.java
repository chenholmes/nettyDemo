package com.chenli.attribute;

import com.chenli.session.Session;
import io.netty.util.AttributeKey;

/**
 * <p>
 * <p>FileName: com.chenli.attribute</p>
 * <p>Date: 2018-10-16 10:55.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
