package com.qc.ssm.utils;

import org.junit.Test;

import java.util.Random;

/**
 * 生成唯一的渠道号
 */
public class CreateChannel {

    @Test
    public void test(){
            int flag = new Random().nextInt(999999);
            if (flag < 100000)
            {
                flag += 100000;
            }
            System.out.println(flag);
    }

}
