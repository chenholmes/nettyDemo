package com.chenli.protocol.response;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import com.chenli.session.Session;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.response</p>
 * <p>Date: 2018-10-21 10:46.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {
        return Command.LIST_GROUP_MEMBERS_RESPONSE;
    }
}
