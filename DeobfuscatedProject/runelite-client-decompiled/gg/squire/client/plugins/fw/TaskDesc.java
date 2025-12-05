/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.plugins.fw;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface TaskDesc {
    public String name() default "";

    public int priority() default 0;

    public boolean register() default false;

    public boolean blocking() default false;

    public boolean client() default false;

    public boolean stoppable() default false;

    public boolean instant() default false;
}

