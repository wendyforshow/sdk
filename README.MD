### 这是一个springboot2.3.1+Dubbo2.7.7+zookeeper3.4.14搭建的一套demo
- 初学踩过很多关于版本的坑 (蓝色文字可点击进入传送站学习，如有异常请留言，我会及时更新)

1.Dubbo 2.5.x 版本及以前 推荐 [Zkclient](https://www.jianshu.com/p/d6de2d21d744)来集成zookeeper 

2.Dubbo 2.6.x 版本及以后 推荐 [Curator](http://www.throwable.club/2018/12/16/zookeeper-curator-usage/#Zookeeper%E5%AE%A2%E6%88%B7%E7%AB%AFCurator%E4%BD%BF%E7%94%A8%E8%AF%A6%E8%A7%A3)来集成zookeeper

2.关于Dubbo的版本选择可以使用xml配置可以使用yml配置百度基本上关于xml更多实例，本demo基于dubbo-spring-boot-starter依赖包开发，基于yml配置Dubbo服务属性及注册中心

- 该demo基于maven module模块式开发 

-----------sdk------------

sdk-consumer:消费者(客户端)

sdk-provider:生产者(服务端)

|______service:基础业务内容

|______api:提供其他服务依赖