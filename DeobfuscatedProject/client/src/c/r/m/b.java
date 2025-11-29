/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

public class b
implements CookieJar {
    private /* synthetic */ Map<String, Cookie> u;

    private static boolean lIllllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        void lllllIIIIIlIlIl;
        if (b.lIlllII(this.u)) {
            this.u = new HashMap<String, Cookie>();
        }
        Iterator lllllIIIIIlIlII = lllllIIIIIlIlIl.iterator();
        while (b.lIlllIl(lllllIIIIIlIlII.hasNext() ? 1 : 0)) {
            b lllllIIIIIlIllI;
            Cookie lllllIIIIIlIIll = (Cookie)lllllIIIIIlIlII.next();
            lllllIIIIIlIllI.u.put(lllllIIIIIlIIll.name(), lllllIIIIIlIIll);
            "".length();
            "".length();
            if ("   ".length() >= 0) continue;
            return;
        }
    }

    private static boolean lIlllIl(int n) {
        return n != 0;
    }

    private static boolean lIlllII(Object object) {
        return object == null;
    }

    public Collection<Cookie> b() {
        return this.u.values();
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (b.lIllllI(this.u)) {
            return new ArrayList<Cookie>(this.u.values());
        }
        return new ArrayList<Cookie>();
    }
}
