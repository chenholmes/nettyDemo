package com.chenli.server.handler;

import com.chenli.protocol.PacketCodeC;
import com.chenli.protocol.request.MessageRequestPacket;
import com.chenli.protocol.response.MessageResponsePacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;

/**
 * <p>
 * <p>FileName: com.chenli.server.handler</p>
 * <p>Date: 2018-10-16 21:22.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class MessageRequestHandler extends SimpleChannelInboundHandler<MessageRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageRequestPacket messageRequestPacket) throws Exception {
        System.out.println(new Date() + ": 收到客户端消息: " + messageRequestPacket.getMessage());

        MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
        messageResponsePacket.setMessage("服务端回复【" + messageRequestPacket.getMessage() + "】");

        channelHandlerContext.channel().writeAndFlush(messageResponsePacket);
    }
}
