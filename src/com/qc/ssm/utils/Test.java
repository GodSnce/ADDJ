package com.qc.ssm.utils;

import com.qc.ssm.request.HttpRequest;

import java.io.IOException;
//import com.chuanglan.sms.response.SmsSendResponse;
//import com.chuanglan.sms.util.ChuangLanSmsUtil;

/**
 * @author tianyh
 * @Description:普通短信发送
 */
public class Test {

    public static void main(String[] args) throws IOException {
//        String uuid = UUID.randomUUID().toString().replace("-", "");
//        System.out.println(uuid);
        //创建客户端
//        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
//        BufferedReader in = null;
//        //创建请求Get实例
//        HttpGet httpGet = new HttpGet("http://advertiser.dingyueads.com/chart/advertiserAdSum?sort=log_date%3Adesc&user_id=&beginDate=&endDate=&start=1&pageSize=10");
//
//        //设置头部信息进行模拟登录（添加登录后的Cookie）
//        httpGet.setHeader("Accept", "text/html,application/xhtml+xml," +
//                "application/xml;q=0.9,image/webp,*/*;q=0.8");
//        httpGet.setHeader("Accept-Encoding", "gzip, deflate, sdch, br");
//        httpGet.setHeader("Accept-Language", "zh-CN,zh;q=0.8");
//        httpGet.setHeader("Cookie", "sid=b3a53e4d-ae25-457e-8b9b-2fd0995dd2e0");
//        httpGet.setHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36" +
//                " (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
//
//        try {
//            //客户端执行httpGet方法，返回响应
//            CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpGet);
//            HttpEntity entity = closeableHttpResponse.getEntity();
//            InputStream content = entity.getContent();
//            in = new BufferedReader(new InputStreamReader(content,"utf-8"));
//            String line;
//            String result = "";
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }
//            //得到服务响应状态码
//            if (closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
//
//                System.out.println(result);
//
//                //打印所有响应头
//                Header[] headers = closeableHttpResponse.getAllHeaders();
//                for (Header header : headers) {
//                    System.out.println(header.getName() + ": " + header.getValue());
//                }
//            }
//            else {
//                //如果是其他状态码则做其他处理
//            }
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            closeableHttpClient.close();
//        }
//        String s = HttpRequest.sendPost("http://advertiser.dingyueads.com/chart/advertiserAdSum", "sort=log_date%3Adesc&user_id=&beginDate=&endDate=&start=1&pageSize=10");
//        System.out.println(s);

        String callback = HttpRequest.sendGet_callback("http://www.91ud.com/app/");
        System.out.println(callback);
    }
}


