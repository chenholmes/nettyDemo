package com.chenli.codec;

import com.chenli.protocol.Packet;
import com.chenli.protocol.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * <p>
 * <p>FileName: com.chenli.codec</p>
 * <p>Date: 2018-10-16 21:28.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class PacketEncoder extends MessageToByteEncoder<Packet> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Packet packet, ByteBuf byteBuf) throws Exception {
        PacketCodeC.INSTANCE.encode(byteBuf,packet);
    }
}
