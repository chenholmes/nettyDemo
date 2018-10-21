package com.chenli.server.handler;

import com.chenli.protocol.request.HeartBeatRequestPacket;
import com.chenli.protocol.response.HeartBeatResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;

/**
 * <p>
 * <p>FileName: com.chenli.server.handler</p>
 * <p>Date: 2018-10-21 17:22.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class HeartBeatRequestHandler extends SimpleChannelInboundHandler<HeartBeatRequestPacket> {
    public static final HeartBeatRequestHandler INSTANCE = new HeartBeatRequestHandler();

    private HeartBeatRequestHandler() {

    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HeartBeatRequestPacket requestPacket) {
        System.out.println(new Date() + " 心跳机制...");
        ctx.writeAndFlush(new HeartBeatResponsePacket());
    }
}
