/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.GameObject
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.GameObject;

@Singleton
public class E {
    private final /* synthetic */ Map<Integer, GameObject> aE;

    public GameObject g(int n2) {
        return this.aE.get(n2);
    }

    public void a(GameObject gameObject) {
        this.aE.put(gameObject.getId(), gameObject);
        0;
    }

    public E() {
        this.aE = new HashMap<Integer, GameObject>();
    }
}

