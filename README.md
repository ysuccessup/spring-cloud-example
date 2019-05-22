# spring-cloud-example
记录过程中的问题      
1. Problem: SpringBoot 2.1.5.RELEASE 和SpringCloud Finchley.RELEASE 版本不匹配

        Description:
        The bean 'proxyRequestHelper', defined in class path resource [org/springframework/cloud/netflix/zuul/ZuulProxyAutoConfiguration$NoActuatorConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/zuul/ZuulProxyAutoConfiguration$EndpointConfiguration.class] and overriding is disabled.
        Action:
        Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
   REASON: 降低SpringBoot版本为2.0.3.RELEASE 或者升级SpringCloud版本为G
2. Problem: zuul请求超时    
        
        com.netflix.zuul.exception.ZuulException: Forwarding error
   Reason: 添加配置 ribbon:  ReadTimeout: 3000 ConnectTimeout: 3000
        
3. Problem:  spring-cloud-feign启动报错：A component required a bean of type 'com.ysuccess.feign.service.HiService' that could not be found.      

   Reason: FeignApplication 添加 @EnableFeignClients