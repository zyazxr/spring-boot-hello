

------在spring boot中如何使用模板引擎的步骤：

1、在pom.xml文件中添加相应的依赖包，thymeleaf和freemarker；
2、在application.properties文件中添加配置信息，开发过程建议关闭缓存；
3、编写模板文件，thymeleaf的默认的后缀是.html,freemarker的默认后缀是.ftl;
4、编写访问模板文件的controller建立请求映射地址；
-----------------------------------
同时 我们知道了：thymeleaf和freemarker可以并存使用。




----------代码Hello World 之 404 ------
1、确认访问地址是否正确：
   （1）确认端口号，默认是8080，这个可以在启动的控制台进行查看；
   （2）确认访问的URI地址是否填写正确，这个在启动的控制台查看是否被映射了。

2、确定注解是否正确，使用@RestController而不是@Controller,
   另外@RestController等价于@Controller和@ResponseBody;
   
3、确定包的路径是否正确
   我们需要知道的是：Spring Boot默认情况下可以扫描到的是
   @SpringBootApplication所在的类的同包或者子包下的类。
   
4、  确定类引入的包的路径是否正确
@RestController：import org.springframework.web.bind.annotation.RestController
@RequestMapping("/helo33")：import org.springframework.web.bind.annotation.RequestMapping



问题的提出：默认的端口号是8080，那么如何进行修改为80或者8081呢？

问题的提出：如何配置上下文(项目的名称)？ http://127.0.0.1:8080/springboot/hello




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
