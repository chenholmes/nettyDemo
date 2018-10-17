package com.chenli.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * <p>
 * <p>FileName: com.chenli.protocol</p>
 * <p>Date: 2018-10-13 19:47.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public abstract class Packet {

    @JSONField(deserialize = false,serialize = false)
    private Byte version = 1;

    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
