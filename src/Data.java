package src;

import java.lang.annotation.Documented;
/**
 * kelas ini merupakan kelas annotation yang berisi annotation multivalue
 */

@Documented
public @interface Data {
    String author();
    String date();
    String description();

}
