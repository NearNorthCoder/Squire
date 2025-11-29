package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.i  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/i.class */
public class C0008i {
    public static <T> Collector<T, ?, List<T>> x() {
        return Collectors.toCollection(ArrayList::new);
    }

    public static <T> List<T> a(@Nonnull T... tArr) {
        return new ArrayList(Arrays.asList(tArr));
    }
}
