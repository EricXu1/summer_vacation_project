package com.demo.server_part;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
@ResponseBody
public class ServerPartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerPartApplication.class, args);
    }

    @PostMapping(path = "/shortforecast")
    public String shortforecast(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/shortforecast";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "bbc0fdc738a3877f3f72f69b1a4d30fe");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/forecast24hours")
    public String forecast24hours(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/forecast24hours";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "1b89050d9f64191d494c806f78e8ea36");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/aqiforecast5days")
    public String aqiforecast5days(@RequestBody Map<String,String> geoinfo){
        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/aqiforecast5days";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "17dbf48dff33b6228f3199dce7b9a6d6");

        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/alert")
    public String alert(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/alert";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "d01246ac6284b5a591f875173e9e2a18");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    @PostMapping(path = "/index")
    public String LifeIndex(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/index";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "42b0c7e2e8d00d6e80d92797fe5360fd");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/condition")
    public String condition(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/condition";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "ff826c205f8f4a59701e64e9e64e01c4");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/forecast15days")
    public String forecast15days(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/forecast15days";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "7538f7246218bdbf795b329ab09cc524");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/limit")
    public String limit(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/limit";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "c712899b393c7b262dd7984f6eb52657");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @PostMapping(path = "/aqi")
    public String aqi(@RequestBody Map<String,String> geoinfo){
        System.out.println(geoinfo.get("lat"));
        System.out.println(geoinfo.get("lon"));

        String host = "http://aliv8.data.moji.com";
        String path = "/whapi/json/aliweather/aqi";
        String method = "POST";
        String appcode = "3d767313993f43c4aec9e3df28726328";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("lat", geoinfo.get("lat"));
        bodys.put("lon", geoinfo.get("lon"));
        bodys.put("token", "6e9a127c311094245fc1b2aa6d0a54fd");


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            return (EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    @Bean
    public Connector connector(){
        Connector connector=new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(8080);
        connector.setSecure(false);
        connector.setRedirectPort(443);
        return connector;
    }

    @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory(Connector connector){
        TomcatServletWebServerFactory tomcat=new TomcatServletWebServerFactory(){
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint=new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection=new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection);
                context.addConstraint(securityConstraint);
            }
        };
        tomcat.addAdditionalTomcatConnectors(connector);
        return tomcat;
    }

}
