package me.zhengjie.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lzh
 * @description redis存储获取工具类,redis内以数据库形式存取。
 */
@Component
public class RedisTemplateUtils {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void setObject(String key, Object value) {
        redisTemplate.opsForValue().set(key, value, null);
    }

    public void setObject(String key, Object value, Long timeOut) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getObject(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
