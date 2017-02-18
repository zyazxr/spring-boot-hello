# spring-boot-hello


Spring Boot -- Spring Data JPA 总结 -- 持久化操作.
---------------------
1、需要添加相应的依赖包;
2、需要在application.properties文件添加配置信息；
3、需要创建一个实体类,比如Cat;
4、需要创建一个接口继承CrudRepository;
5、需要创建一个Service;
6、需要创建一个Controller;
7、代码测试；






1、当我们修改了方法的返回值，是能够进行热部署的；
2、当我们重新创建了一个方法，是能够进行热部署的；
3、当我们重新创建了一个Class,是能够进行热部署的；



我们要使用第三方的json解析框架的话：
1、我们需要在pom.xml中引入相应的依赖；
2、需要在App.java中继承WebMvcConfigurerAdapter重写方法：configureMessageConverters 添加我们自己定义的json解析框架;
2.1 @Bean注入第三方的json解析框架：

@Bean
public HttpMessageConverters fastJsonHttpMessageConverters() {
	// 1、需要先定义一个 convert 转换消息的对象;
	FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
	
	//2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
	FastJsonConfig fastJsonConfig = new FastJsonConfig();
	fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	
	//3、在convert中添加配置信息.
	fastConverter.setFastJsonConfig(fastJsonConfig);
	
	
	HttpMessageConverter<?> converter = fastConverter;
	return new HttpMessageConverters(converter);
}






1、第1节 Spring Boot之Hello World
-------------------------------------------------
1、新建一个HelloController;

2、编写Spring Boot 启动类;

3、进行访问测试，默认的端口号是8080;
