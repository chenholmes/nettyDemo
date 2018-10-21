package com.chenli.protocol.request;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import lombok.Data;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.request</p>
 * <p>Date: 2018-10-21 10:33.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return Command.LIST_GROUP_MEMBERS_REQUEST;
    }
}
