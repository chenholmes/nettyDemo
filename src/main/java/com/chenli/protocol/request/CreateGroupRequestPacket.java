package com.chenli.protocol.request;

import com.chenli.protocol.Packet;
import com.chenli.protocol.command.Command;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * <p>FileName: com.chenli.protocol.request</p>
 * <p>Date: 2018-10-20 19:37.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;
    @Override
    public Byte getCommand() {
        return Command.CREATE_GROUP_REQUEST;
    }
}
