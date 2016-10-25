# spring_cloud_samples
spring_cloud 构建微服务demo，正在研究学习ing

本文主要从 http://blog.didispace.com/categories/Spring-Cloud/ 中学习而来<br />
spring cloud 中文社区：http://springcloud.cn/ 

eureka_server：服务注册<br />
compute-service8888 和 compute-service8889：为简单的服务客户端<br />
ribbon_client：服务客户端，引入ribbonf做负载均衡，请求compute-service8888 和 compute-service8889内提供的服务，同时引入hystrix、Hystrix<br />
feign_client：服务客户端， 请求compute-service8888 和 compute-service8889内提供的服务，同时引入hystrix、Hystrix
