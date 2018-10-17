package com.chenli.protocol.request;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import lombok.Data;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.request</p>
 * <p>Date: 2018-10-13 19:56.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class LoginRequestPacket extends Packet {

    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}
