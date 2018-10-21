package com.chenli.session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 * <p>FileName: com.chenli.session</p>
 * <p>Date: 2018-10-20 13:20.</p>
 *
 * @author <a href="mailto:chenli2767@qianmi.com">of2767-陈笠</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Session {

    private String userId;

    private String userName;
}
