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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.FEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Filling Vials -> FillingvialsTask */
@TaskDesc(name="Filling Vials", priority=3, blocking=true)
public class FillingVialsTask
extends n_Unknown {
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
        E var7;
        if (E.lIIIIIIIlIIIlII(this.bS.p() ? 1 : 0)) {
            return llIIllllllll[1];
        }
        if (E.lIIIIIIIlIIIlIl(var7.ba.I().isEmpty() ? 1 : 0)) {
            return llIIllllllll[1];
        }
        Item var6 = Inventory.getFirst((int[])f.VIAL.ad());
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (E.lIIIIIIIlIIIlII(e.X.contains(tileObject.getId()) ? 1 : 0) && E.lIIIIIIIlIIIlII(tileObject.getName().equals(llIIlllllllI[llIIllllllll[1]]) ? 1 : 0)) {
                n2 = llIIllllllll[2];
                0;
                
                }
            } else {
                n2 = llIIllllllll[1];
            }
            return n2 != 0;
        });
        if (!E.lIIIIIIIlIIIllI(var4) || E.lIIIIIIIlIIIlll(var6)) {
            return llIIllllllll[1];
        }
        var1_1.useOn((TileObject)var2_2);
        this.bS.e(llIIllllllll[0]);
        return llIIllllllll[2];
    }

    private static String lIIIIIIIlIIIIIl(String var8, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIllllllll[3], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlIIIlIl(int n2) {
        return n2 == 0;
    }
}

