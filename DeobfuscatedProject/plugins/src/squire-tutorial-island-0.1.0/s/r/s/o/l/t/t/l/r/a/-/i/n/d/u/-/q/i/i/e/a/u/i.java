/*
 * Decompiled with CFR 0.152.
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class i {
    public static <T> Collector<T, ?, List<T>> x() {
        return Collectors.toCollection(ArrayList::new);
    }

    public static <T> List<T> a(T ... TArray) {
        return new ArrayList<T>(Arrays.asList(TArray));
    }
}

