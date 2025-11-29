/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling Vials", priority=3, blocking=true)
public class E
extends n {
    private final /* synthetic */ b bS;
    private static /* synthetic */ int[] llIIllllllll;
    private static /* synthetic */ String[] llIIlllllllI;

    private static boolean lIIIIIIIlIIIlll(Object object) {
        return object == null;
    }

    private static void lIIIIIIIlIIIIlI() {
        llIIlllllllI = new String[llIIllllllll[2]];
        E.llIIlllllllI[E.llIIllllllll[1]] = E."Water Pump";
    }

    static {
        E.lIIIIIIIlIIIIll();
        E.lIIIIIIIlIIIIlI();
    }

    private static boolean lIIIIIIIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIlIIIllI(Object object) {
        return object != null;
    }

    @Inject
    public E(c c2, b b2) {
        d[] dArray = new d[llIIllllllll[0]];
        dArray[E.llIIllllllll[1]] = d.FIRST_ROTATION_CREATE;
        dArray[E.llIIllllllll[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[E.llIIllllllll[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
        this.bS = b2;
    }

    private static void lIIIIIIIlIIIIll() {
        llIIllllllll = new int[4];
        E.llIIllllllll[0] = 3;
        E.llIIllllllll[1] = (138 + 60 - 90 + 34 ^ 170 + 49 - 142 + 101) & (0x68 ^ 0x1A ^ (0x38 ^ 0x76) ^ -1);
        E.llIIllllllll[2] = 1;
        E.llIIllllllll[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_2;
        void var1_1;
        E lllllllllllllllIlIIIlllIlllIIlIl;
        if (E.lIIIIIIIlIIIlII(this.bS.p() ? 1 : 0)) {
            return llIIllllllll[1];
        }
        if (E.lIIIIIIIlIIIlIl(lllllllllllllllIlIIIlllIlllIIlIl.ba.I().isEmpty() ? 1 : 0)) {
            return llIIllllllll[1];
        }
        Item lllllllllllllllIlIIIlllIlllIIlII = Inventory.getFirst((int[])f.VIAL.ad());
        TileObject lllllllllllllllIlIIIlllIlllIIIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (E.lIIIIIIIlIIIlII(e.X.contains(tileObject.getId()) ? 1 : 0) && E.lIIIIIIIlIIIlII(tileObject.getName().equals(llIIlllllllI[llIIllllllll[1]]) ? 1 : 0)) {
                n2 = llIIllllllll[2];
                0;
                if (null != null) {
                    return ((0x34 ^ 0x15) & ~(0x3C ^ 0x1D)) != 0;
                }
            } else {
                n2 = llIIllllllll[1];
            }
            return n2 != 0;
        });
        if (!E.lIIIIIIIlIIIllI(lllllllllllllllIlIIIlllIlllIIIll) || E.lIIIIIIIlIIIlll(lllllllllllllllIlIIIlllIlllIIlII)) {
            return llIIllllllll[1];
        }
        var1_1.useOn((TileObject)var2_2);
        this.bS.e(llIIllllllll[0]);
        return llIIllllllll[2];
    }

    private static String lIIIIIIIlIIIIIl(String lllllllllllllllIlIIIlllIllIllIIl, String lllllllllllllllIlIIIlllIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllIllIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllIllIllIll.init(llIIllllllll[3], lllllllllllllllIlIIIlllIllIlllII);
            return new String(lllllllllllllllIlIIIlllIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllIllIllIlI) {
            lllllllllllllllIlIIIlllIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlIIIlIl(int n2) {
        return n2 == 0;
    }
}

