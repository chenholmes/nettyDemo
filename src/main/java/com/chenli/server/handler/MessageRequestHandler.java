package com.chenli.server.handler;

import com.chenli.protocol.request.MessageRequestPacket;
import com.chenli.protocol.response.MessageResponsePacket;
import com.chenli.session.Session;
import com.chenli.util.SessionUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
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
@ChannelHandler.Sharable
public class MessageRequestHandler extends SimpleChannelInboundHandler<MessageRequestPacket> {

    public static final MessageRequestHandler INSTANCE = new MessageRequestHandler();

    protected MessageRequestHandler(){}

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageRequestPacket messageRequestPacket) throws Exception {
        System.out.println(new Date() + ": 收到客户端消息: " + messageRequestPacket.getMessage());

        Session session = SessionUtil.getSession(channelHandlerContext.channel());

        MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
        messageResponsePacket.setFromUserId(session.getUserId());
        messageResponsePacket.setFromUserName(session.getUserName());
        messageResponsePacket.setMessage(messageRequestPacket.getMessage());

        Channel toChannel = SessionUtil.getChannel(messageRequestPacket.getToUserId());
        if (toChannel != null && SessionUtil.hasLogin(toChannel)) {
            toChannel.writeAndFlush(messageResponsePacket).addListener(future -> {
                if(future.isDone()) {

                }
            });
        } else {
            System.err.println("[" + session.getUserId() + "] 不在线，发送失败!");
        }

    }
}
