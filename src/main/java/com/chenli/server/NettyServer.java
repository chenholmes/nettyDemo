package com.chenli.server;

import com.chenli.codec.PacketDecoder;
import com.chenli.codec.PacketEncoder;
import com.chenli.server.handler.LoginRequestHandler;
import com.chenli.server.handler.MessageRequestHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.Date;

/**
 * <p>
 * <p>FileName: com.chenli.server</p>
 * <p>Date: 2018-10-16 09:32.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class NettyServer {

    public static final int PORT = 8000;

    public static void main(String[] args) {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup,workerGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG,1024)
                .childOption(ChannelOption.SO_KEEPALIVE,true)
                .childOption(ChannelOption.TCP_NODELAY,true)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {

                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new PacketDecoder());
                        ch.pipeline().addLast(new LoginRequestHandler());
                        ch.pipeline().addLast(new MessageRequestHandler());
                        ch.pipeline().addLast(new PacketEncoder());

                    }
                });

        bind(serverBootstrap,PORT);
    }

    private static void bind(final ServerBootstrap serverBootstrap,final int port) {
        serverBootstrap.bind(port).addListener(future -> {
            if(future.isSuccess()) {
                System.out.println(new Date() + ": 端口[" + port + "]绑定成功!");
            }else {
                System.err.println("端口[" + port + "]绑定失败!");
            }
        });
    }
}
