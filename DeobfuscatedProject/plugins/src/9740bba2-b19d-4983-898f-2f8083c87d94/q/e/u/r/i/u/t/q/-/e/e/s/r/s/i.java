/*
 * Decompiled with CFR 0.152.
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class i {
    public static <T> Collector<T, ?, List<T>> w() {
        return Collectors.toCollection(ArrayList::new);
    }

    public static <T> List<T> a(T ... TArray) {
        return new ArrayList<T>(Arrays.asList(TArray));
    }
}

