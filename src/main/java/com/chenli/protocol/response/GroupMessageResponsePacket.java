package com.chenli.protocol.response;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import com.chenli.session.Session;
import lombok.Data;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.response</p>
 * <p>Date: 2018-10-21 14:01.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private String message;

    private Session fromUser;

    @Override
    public Byte getCommand() {
        return Command.GROUP_MESSAGE_RESPONSE;
    }
}
