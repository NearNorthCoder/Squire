/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.jshell;

import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import jdk.jshell.EvalException;

class RemappingThrowable
extends Throwable {
    private final String source;
    private final Map<String, Integer> offsets;
    private final Throwable wrapped;
    private final Map<Throwable, Throwable> dejaVu;

    public RemappingThrowable(String source, Map<String, Integer> offsets, Throwable other) {
        this(source, offsets, other, new HashMap<Throwable, Throwable>());
    }

    private RemappingThrowable(String source, Map<String, Integer> offsets, Throwable other, Map<Throwable, Throwable> dejaVu) {
        this.source = source;
        this.offsets = offsets;
        this.wrapped = other;
        this.dejaVu = dejaVu;
        dejaVu.put(this.wrapped, this);
        this.setStackTrace((StackTraceElement[])Stream.of(this.wrapped.getStackTrace()).map(e -> {
            Integer boxOffset = (Integer)offsets.get(e.getFileName());
            if (boxOffset == null) {
                return e;
            }
            int offset = boxOffset;
            int line = e.getLineNumber();
            for (int i = 0; i <= offset && i < source.length(); ++i) {
                if (source.charAt(i) != '\n') continue;
                ++line;
            }
            return new StackTraceElement(Strings.isNullOrEmpty(e.getClassName()) ? "Shell" : e.getClassName(), Strings.isNullOrEmpty(e.getMethodName()) ? "global" : e.getMethodName(), "", line);
        }).toArray(StackTraceElement[]::new));
        if (this.wrapped.getCause() != null) {
            this.initCause(this.remap(this.wrapped.getCause()));
        }
        for (Throwable suppressed : this.wrapped.getSuppressed()) {
            this.addSuppressed(this.remap(suppressed));
        }
    }

    private Throwable remap(Throwable other) {
        Throwable remap = this.dejaVu.get(other);
        if (remap == null) {
            remap = new RemappingThrowable(this.source, this.offsets, other, this.dejaVu);
        }
        return remap;
    }

    @Override
    public String getMessage() {
        return this.wrapped.getMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return this.wrapped.getLocalizedMessage();
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public String toString() {
        String className = this.wrapped instanceof EvalException ? ((EvalException)this.wrapped).getExceptionClassName() : this.wrapped.getClass().getName();
        String message = this.wrapped.getLocalizedMessage();
        if (message == null) {
            return className;
        }
        return className + ": " + message;
    }
}

