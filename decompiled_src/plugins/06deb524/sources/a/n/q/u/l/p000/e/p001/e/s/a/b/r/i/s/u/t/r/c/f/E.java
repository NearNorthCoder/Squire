package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.GameObject;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.E  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/E.class */
public class E {
    private final /* synthetic */ Map<Integer, GameObject> aE = new HashMap();

    public GameObject g(int i) {
        return this.aE.get(Integer.valueOf(i));
    }

    public void a(GameObject gameObject) {
        this.aE.put(Integer.valueOf(gameObject.getId()), gameObject);
        "".length();
    }
}
