package hello.aop.member.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//클래스에 붙이는 애노테이션
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassAop {
}
