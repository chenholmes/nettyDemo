package com.chenli.protocol.response;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.response</p>
 * <p>Date: 2018-10-20 20:02.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class CreateGroupResponsePacket extends Packet {

    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {
        return Command.CREATE_GROUP_RESPONSE;
    }
}
