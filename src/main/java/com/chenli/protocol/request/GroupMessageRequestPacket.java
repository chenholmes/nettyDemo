package com.chenli.protocol.request;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.request</p>
 * <p>Date: 2018-10-21 12:37.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupMessageRequestPacket extends Packet {

    private String groupId;

    private String message;

    @Override
    public Byte getCommand() {
        return Command.GROUP_MESSAGE_REQUEST;
    }
}
