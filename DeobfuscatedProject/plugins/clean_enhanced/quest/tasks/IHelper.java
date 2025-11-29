/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IHelper {
    public static <T> Collector<T, ?, List<T>> x() {
        return Collectors.toCollection(ArrayList::new);
    }

    public static <T> List<T> a(T ... TArray) {
        return new ArrayList<T>(Arrays.asList(TArray));
    }
}

