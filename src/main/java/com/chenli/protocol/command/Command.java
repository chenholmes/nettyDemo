package com.chenli.protocol.command;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.command</p>
 * <p>Date: 2018-10-13 20:00.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public interface Command {

    Byte LOGIN_REQUEST = 1;

    Byte LOGIN_RESPONSE = 2;

    Byte MESSAGE_REQUEST = 3;

    Byte MESSAGE_RESPONSE = 4;
}
