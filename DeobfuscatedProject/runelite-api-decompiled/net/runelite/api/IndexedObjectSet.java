/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface IndexedObjectSet<T>
extends Iterable<T> {
    public T byIndex(int var1);

    default public Stream<T> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    @Override
    default public Spliterator<T> spliterator() {
        return Spliterators.spliterator(this.iterator(), 0L, 17);
    }
}

