# spring-cloud-example
记录过程中的问题      
1.     
PROBLEM:

        Description:
        The bean 'proxyRequestHelper', defined in class path resource [org/springframework/cloud/netflix/zuul/ZuulProxyAutoConfiguration$NoActuatorConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/zuul/ZuulProxyAutoConfiguration$EndpointConfiguration.class] and overriding is disabled.
        Action:
        Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
REASON:         
         SpringBoot 2.1.5.RELEASE 和SpringCloud Finchley.RELEASE 版本没有匹配上,降低springboot版本为2.0.3.RELEASE
        
      
