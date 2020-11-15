package cn.platform.spring.cas;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**
 * CasClientApplication 启动类
 *
 * @author op.nie-dongjia
 * @date 2016/10/31
 */
@ServletComponentScan
@SpringBootApplication
@EnableCasClient
public class CasClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasClientApplication.class, args);
    }
}
