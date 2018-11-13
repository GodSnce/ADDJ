package com.qc.ssm.request;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lishanglai on 2017/8/7.
 */
public class HttpRequest2 {

    private static Logger LOGGER = LoggerFactory.getLogger(HttpRequest.class);

    private static PoolingHttpClientConnectionManager cm = null;

    static {
        LayeredConnectionSocketFactory sslsf = null;
        try {
            sslsf = new SSLConnectionSocketFactory(SSLContext.getDefault());
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("创建SSL连接失败");
        }
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("https", sslsf)
                .register("http", new PlainConnectionSocketFactory())
                .build();
        cm =new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        cm.setMaxTotal(200);
        cm.setDefaultMaxPerRoute(20);
    }

    private static CloseableHttpClient getHttpClient() {
        CloseableHttpClient httpClient = HttpClients.custom()
                .setConnectionManager(cm)
                .build();
        return httpClient;
    }

    public static String get(String url, String param) {
        // 创建默认的httpClient实例
        CloseableHttpClient httpClient = HttpRequest2.getHttpClient();
        CloseableHttpResponse httpResponse = null;
        // 发送get请求
        try {
            // 用get方法发送http请求
            HttpGet get = new HttpGet(url + "?" + param);
            LOGGER.info("执行get请求, uri: " + get.getURI());
            httpResponse = httpClient.execute(get);
            // response实体
            org.apache.http.HttpEntity entity = httpResponse.getEntity();
            if (null != entity) {
                String response = EntityUtils.toString(entity);
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                LOGGER.info("响应状态码:" + statusCode);
                LOGGER.info("响应内容:" + response);
                if (statusCode == HttpStatus.OK.value()) {
                    // 成功
                    return response;
                } else {
                    return null;
                }
            }
            return null;
        } catch (IOException e) {
            LOGGER.error("httpclient请求失败", e);
            return null;
        } finally {
            if (httpResponse != null) {
                try {
                    EntityUtils.consume(httpResponse.getEntity());
                    httpResponse.close();
                } catch (IOException e) {
                    LOGGER.error("关闭response失败", e);
                }
            }
        }
    }

    public static void main(String[] args){
        HttpRequest2.get("http://localhost:8080/indexLogin/login.do","mz=lijiayu&abvd=123456&imagecode=tt");
    }
}
