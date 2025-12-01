package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.i  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/i.class */
public class i {
    public static <T> Collector<T, ?, List<T>> w() {
        return Collectors.toCollection(ArrayList::new);
    }

    public static <T> List<T> a(@Nonnull T... tArr) {
        return new ArrayList(Arrays.asList(tArr));
    }
}
