package org.moran;

import java.lang.annotation.*;

/**
 * 异步
 * @author BaiYang
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AsyncDSTB {
    String values() default "";
}
