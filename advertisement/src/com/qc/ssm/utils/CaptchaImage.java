package com.qc.ssm.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CaptchaImage {

    public static final String CAPTCHA_CODE_KEY = "CAPTCHA_CODE_KEY";// 放到session中的key
    private final Random random = new Random();
    private final String randString = "123456789ABCDEFGHJKLMNPQRSTUVWXYZ";// 随机产生的字符串

    private int width = 80;// 图片宽
    private int height = 26;// 图片高
    private int lineSize = 40;// 干扰线数量

    public CaptchaImage() {

    }

    public CaptchaImage(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public CaptchaImage(int width, int height, int fontSize) {
        this.width = width;
        this.height = height;
        this.lineSize = fontSize;
    }

    /**
     * 生成随机图片
     */
    public byte[] buildImage(String randomString) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // BufferedImage类是具有缓冲区的Image类,Image类是用于描述图像信息的类
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_BGR);
        Graphics g = image.getGraphics();// 产生Image对象的Graphics对象,改对象可以在图像上进行各种绘制操作
        g.fillRect(0, 0, width, height);
        g.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
        g.setColor(getRandColor(110, 133));
        // 绘制干扰线
        for (int i = 0; i <= lineSize; i++) {
            drowLine(g);
        }
        // 绘制随机字符
        drowString(g, randomString, randomString.length());
        g.dispose();
        try {
            ImageIO.write(image, "JPEG", out);// 将内存中的图片通过流动形式输出到客户端
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toByteArray();
    }

    /*
     * 获得字体
     */
    private Font getFont() {
        return new Font("Fixedsys", Font.CENTER_BASELINE, 18);
    }

    /*
     * 获得颜色
     */
    private Color getRandColor(int fc, int bc) {
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc - 16);
        int g = fc + random.nextInt(bc - fc - 14);
        int b = fc + random.nextInt(bc - fc - 18);
        return new Color(r, g, b);
    }

    /*
     * 绘制字符串
     */
    private void drowString(Graphics g, String randomString, int i) {
        g.setFont(getFont());
        g.setColor(new Color(random.nextInt(101), random.nextInt(111),
                random.nextInt(121)));
        g.translate(random.nextInt(3), random.nextInt(3));
        g.drawString(randomString, 13, 16);
    }

    /*
     * 绘制干扰线
     */
    private void drowLine(Graphics g) {
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        int xl = random.nextInt(13);
        int yl = random.nextInt(15);
        g.drawLine(x, y, x + xl, y + yl);
    }

    /**
     * 生成随机字符串
     * @param count,字符串长度
     * @return
     */
    public String buildText(int count) {
        StringBuffer sb = new StringBuffer(count);
        for (int i = 0; i < count; i++) {
            sb.append(randString.charAt(random.nextInt(randString.length())));
        }
        return sb.toString();

    }

    /*
     * 获取随机的字符
     */
    public String getRandomString(int num) {
        return String.valueOf(randString.charAt(num));
    }

    public static void main(String[] args) throws IOException {
        CaptchaImage ci = new CaptchaImage();
        FileOutputStream out = new FileOutputStream("D:/test1.jpg");
        String key = ci.buildText(4);
        out.write(ci.buildImage(key));
        out.flush();
        out.close();
    }
}