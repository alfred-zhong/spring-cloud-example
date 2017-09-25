# Spring Cloud 例子

项目简介
* eureka-server 作为服务注册发现中心，通常启动 1 个即可，且必须有。
* eureka-client，eureka-client-2 作为服务提供者，可启动若干。
* service-feign 作为服务消费者，亦可作为服务提供者，可启动若干。
* service-ribbon 客户端负载均衡器，它可以很好地控制HTTP和TCP客户端的行为。Feign已经使用Ribbon，所以如果您使用@FeignClient，则可不管。