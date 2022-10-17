package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // @Component scan 이 알아서 bean으로 등록해주고 알아서 스플링으로 올려주는 역할을 함
        basePackages = "hello.core", // 탐색할 패키지의 시작위치 지정하는 방법.
        basePackageClasses = AutoAppConfig.class,
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = Configuration.class)) // 기존 @Configuration들을 살리기 위해서 사용한 코드임
public class AutoAppConfig {


}
