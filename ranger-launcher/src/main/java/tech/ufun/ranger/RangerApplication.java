package tech.ufun.ranger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Springboot启动类
 *
 * @author zhanglei
 * @date 2020/3/4 15:07
 */
@SpringBootApplication
public class RangerApplication {
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(RangerApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");

        System.out.println("启动成功");
        System.out.println("访问地址：http://localhost:" + port + path);
        System.out.println("访问地址：http://" + ip + ":" + port + path);
    }
}
