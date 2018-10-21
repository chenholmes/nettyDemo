package com.chenli.client.console;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * <p>
 * <p>FileName: com.chenli.client.console</p>
 * <p>Date: 2018-10-20 19:19.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
public interface ConsoleCommand {

    void exec(Scanner scanner, Channel channel);
}
