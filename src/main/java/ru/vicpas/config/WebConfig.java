package ru.vicpas.config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("ru")
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        //.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        return viewResolver;
    }

//    @Bean
//    public ViewResolver resourceBundleViewResolver() {
//        ResourceBundleViewResolver bean = new ResourceBundleViewResolver();
//        bean.setBasename("/WEB-INF/pages");
//        return bean;
//    }




//    private final ApplicationContext applicationContext;
//
//    public WebConfig(ApplicationContext applicationContext) {
//        this.applicationContext = applicationContext;
//    }
//
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver() {
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("/WEB-INF/pages/");
//        templateResolver.setSuffix(".html");
//        return templateResolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setEnableSpringELCompiler(true);
//        return templateEngine;
//    }
//
//
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        resolver.setCharacterEncoding("UTF-8");
////        resolver.setContentType("text/html; charset=UTF-8");
//        //resolver.setCharacterEncoding("UTF-8");
//        registry.viewResolver(resolver);
//    }

    /////////////////////





//    @Autowired
//    WebApplicationContext webApplicationContext;
//
//    @Bean
//    public SpringResourceTemplateResolver getTemplateResolver() {
//
//        SpringResourceTemplateResolver templateResolver = new
//                SpringResourceTemplateResolver();
//
//        templateResolver.setApplicationContext(webApplicationContext);
////        templateResolver.setPrefix("/WEB-INF/templates/");
//        templateResolver.setPrefix("/pages/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML5");
//
//        return templateResolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//
//        templateEngine.setTemplateResolver(getTemplateResolver());
//        templateEngine.setEnableSpringELCompiler(true);
//
//        return templateEngine;
//    }
//
//    @Bean
//    ThymeleafViewResolver configureViewResolvers() {
//
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//
//        resolver.setTemplateEngine(templateEngine());
//        resolver.setOrder(1);
//        resolver.setViewNames(new String[] {"*.html"});
//
//        return resolver;
//    }
//
//    @Bean
//    public UrlBasedViewResolver getUrlBasedViewResolver() {
//
//        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
//
//        viewResolver.setViewClass(JstlView.class);
////        viewResolver.setPrefix("/WEB-INF/views/");
//        viewResolver.setPrefix("/pages/");
//        viewResolver.setSuffix("");
//        viewResolver.setOrder(2);
//
//        return viewResolver;
//
//    }
    /////////////////////////////////////////

//    @Bean
//    public SpringResourceTemplateResolver springResourceTemplateResolver() {
//        return new SpringResourceTemplateResolver();
//    }
//
//    @Bean
//    public ViewResolver viewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine((ISpringTemplateEngine) templateEngine());
//        resolver.setCharacterEncoding("UTF-8");
//        return resolver;
//    }
//
//    @Bean
//    public TemplateEngine templateEngine() {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setEnableSpringELCompiler(true);
//        engine.setTemplateResolver(templateResolver());
//        return engine;
//    }
//
//    private ITemplateResolver templateResolver() {
//        springResourceTemplateResolver().setPrefix("/pages/");
//        springResourceTemplateResolver().setTemplateMode(TemplateMode.HTML);
//        return springResourceTemplateResolver();
//    }

}