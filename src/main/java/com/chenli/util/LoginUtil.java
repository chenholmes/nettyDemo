package com.chenli.util;

import com.chenli.attribute.Attributes;
import io.netty.channel.Channel;
import io.netty.util.Attribute;

/**
 * <p>
 * <p>FileName: com.chenli.util</p>
 * <p>Date: 2018-10-16 10:57.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class LoginUtil {

    public static void markAsLogin(Channel channel) {
        channel.attr(Attributes.LOGIN).set(true);
    }

    public static boolean hasLogin(Channel channel) {
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);
        return loginAttr.get() != null;
    }
}
