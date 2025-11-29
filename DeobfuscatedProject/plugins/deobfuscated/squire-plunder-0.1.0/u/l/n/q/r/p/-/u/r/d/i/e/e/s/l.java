/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.c;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.k;

@TaskDesc(name="Plundering Urns", priority=1)
public class l
extends k {
    private static /* synthetic */ int[] llllllIllIIl;
    private final /* synthetic */ Set<Integer> E;
    private static /* synthetic */ String[] llllllIllIII;

    static {
        l.lIIlIlIIlIIIIlI();
        l.lIIlIlIIlIIIIIl();
    }

    private static void lIIlIlIIlIIIIlI() {
        llllllIllIIl = new int[7];
        l.llllllIllIIl[0] = -(0xFFFFFC8F & 0x27F3) & (0xFFFFFF9F & 0x77EF);
        l.llllllIllIIl[1] = -(0xFFFFAFB9 & 0x7C77) & (0xFFFFFF3E & Short.MAX_VALUE);
        l.llllllIllIIl[2] = -(0xFFFFE4F5 & 0x1FDB) & (0xFFFFF7FF & 0x5FDF);
        l.llllllIllIIl[3] = (0x8D ^ 0x89) & ~(0x73 ^ 0x77);
        l.llllllIllIIl[4] = 1;
        l.llllllIllIIl[5] = 0xA ^ 2;
        l.llllllIllIIl[6] = 2;
    }

    private static void lIIlIlIIlIIIIIl() {
        llllllIllIII = new String[llllllIllIIl[4]];
        l.llllllIllIII[l.llllllIllIIl[3]] = l."Search";
    }

    private static boolean lIIlIlIIlIIIlIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected l(a a2, Client client) {
        super(a2, client);
        this.E = ImmutableSet.of((Object)llllllIllIIl[0], (Object)llllllIllIIl[1], (Object)llllllIllIIl[2]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        void lllllllllllllllIIlIIllIllIlIllIl;
        l lllllllllllllllIIlIIllIllIlIlllI;
        c c2 = c.f();
        if (l.lIIlIlIIlIIIIll((Object)c2)) {
            return llllllIllIIl[3];
        }
        if (l.lIIlIlIIlIIIlII(lllllllllllllllIIlIIllIllIlIlllI.D.b((c)lllllllllllllllIIlIIllIllIlIllIl) ? 1 : 0)) {
            return llllllIllIIl[3];
        }
        TileObject lllllllllllllllIIlIIllIllIlIllII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.lIIlIlIIlIIIlIl(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && l.lIIlIlIIlIIIlIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llllllIllIIl[4];
                0;
                if (null != null) {
                    return ((1 ^ (0x17 ^ 0x4B)) & (19 + 54 - -102 + 21 ^ 67 + 12 - -20 + 54 ^ -1)) != 0;
                }
            } else {
                n2 = llllllIllIIl[3];
            }
            return n2 != 0;
        });
        if (l.lIIlIlIIlIIIIll(lllllllllllllllIIlIIllIllIlIllII)) {
            return llllllIllIIl[3];
        }
        var2_2.interact(llllllIllIII[llllllIllIIl[3]]);
        return llllllIllIIl[4];
    }

    private static String lIIlIlIIlIIIIII(String lllllllllllllllIIlIIllIllIlIIIII, String lllllllllllllllIIlIIllIllIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIllIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIllIIlllll.getBytes(StandardCharsets.UTF_8)), llllllIllIIl[5]), "DES");
            Cipher lllllllllllllllIIlIIllIllIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIllIlIIIlI.init(llllllIllIIl[6], lllllllllllllllIIlIIllIllIlIIIll);
            return new String(lllllllllllllllIIlIIllIllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIllIlIIIIl) {
            lllllllllllllllIIlIIllIllIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlIIIlII(int n2) {
        return n2 == 0;
    }
}

