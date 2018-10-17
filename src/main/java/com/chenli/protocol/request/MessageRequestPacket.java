package com.chenli.protocol.request;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import lombok.Data;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.request</p>
 * <p>Date: 2018-10-16 19:38.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }
}
