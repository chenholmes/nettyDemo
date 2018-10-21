package com.chenli.client.console;

import com.chenli.protocol.request.MessageRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * <p>
 * <p>FileName: com.chenli.client.console</p>
 * <p>Date: 2018-10-20 19:28.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public class SendToUserConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发送消息给某个某个用户：");

        String toUserId = scanner.nextLine();
        String message = scanner.nextLine();

        channel.writeAndFlush(new MessageRequestPacket(toUserId,message));
    }
}
