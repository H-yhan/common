
package com.tuya.penglai.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by smartbruce on 2017/3/29.
 */
@Configuration
@EnableRedisHttpSession(redisNamespace = "penglai", maxInactiveIntervalInSeconds = 1800)
public class HttpSessionConfig {
}
