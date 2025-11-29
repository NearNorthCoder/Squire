/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.widgets.Prayers
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.widgets.Prayers;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class w
extends Task {
    private final /* synthetic */ SquireScurrius ak;
    private static /* synthetic */ String[] lIIlIllIlIIlI;
    private static /* synthetic */ int[] lIIlIllIlIlIl;

    @Inject
    public w(SquireScurrius squireScurrius) {
        this.ak = squireScurrius;
    }

    private static boolean lIlIllIlIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIllIlIIlIIll() {
        lIIlIllIlIIlI = new String[lIIlIllIlIlIl[1]];
        w.lIIlIllIlIIlI[w.lIIlIllIlIlIl[0]] = w.lIlIllIlIIlIIIl("ofO7G0yudZaGEx/U3VQXAQ==", "WGSoy");
        w.lIIlIllIlIIlI[w.lIIlIllIlIlIl[2]] = w.lIlIllIlIIlIIlI("BgYoKjdhHSgw", "AoIDC");
    }

    private static void lIlIllIlIIlIlll() {
        lIIlIllIlIlIl = new int[4];
        w.lIIlIllIlIlIl[0] = (88 + 16 - 42 + 82 ^ 60 + 28 - 12 + 52) & (0xAF ^ 0xB4 ^ (0xCC ^ 0xC7) ^ -" ".length());
        w.lIIlIllIlIlIl[1] = "  ".length();
        w.lIIlIllIlIlIl[2] = " ".length();
        w.lIIlIllIlIlIl[3] = 0x1D ^ 0x5E ^ (0x25 ^ 0x4B);
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void llllllllllllllIllllIlIlIIlIIlllI;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());
        "".length();
        int[] nArray = new int[lIIlIllIlIlIl[1]];
        nArray[w.lIIlIllIlIlIl[0]] = d.C;
        nArray[w.lIIlIllIlIlIl[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (w.lIlIllIlIIlllII(projectile) && w.lIlIllIlIIlllIl(projectile.getRemainingCycles(), lIIlIllIlIlIl[3])) {
            if (w.lIlIllIlIIllllI(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            } else {
                llllllllllllllIllllIlIlIIlIIlllI.add(Prayer.PROTECT_FROM_MAGIC);
                "".length();
                "".length();
                if ((128 + 51 - 60 + 42 ^ 69 + 102 - 157 + 151) == -" ".length()) {
                    return null;
                }
            }
        } else {
            llllllllllllllIllllIlIlIIlIIlllI.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        }
        return arrayList;
    }

    private static boolean lIlIllIlIIlllII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIllIll(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (w.lIlIllIlIIllIIl(this.ak.c() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        String[] stringArray = new String[lIIlIllIlIlIl[1]];
        stringArray[w.lIIlIllIlIlIl[0]] = lIIlIllIlIIlI[lIIlIllIlIlIl[0]];
        stringArray[w.lIIlIllIlIlIl[2]] = lIIlIllIlIIlI[lIIlIllIlIlIl[2]];
        NPC llllllllllllllIllllIlIlIIlIlIIIl = NPCs.getNearest((String[])stringArray);
        if (w.lIlIllIlIIllIlI(llllllllllllllIllllIlIlIIlIlIIIl)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        if (w.lIlIllIlIIllIll(Prayers.getPoints())) {
            w llllllllllllllIllllIlIlIIlIlIIlI;
            llllllllllllllIllllIlIlIIlIlIIlI.ak.e(lIIlIllIlIlIl[2]);
            return lIIlIllIlIlIl[0];
        }
        Prayers.flick(this.x());
        "".length();
        return lIIlIllIlIlIl[0];
    }

    static {
        w.lIlIllIlIIlIlll();
        w.lIlIllIlIIlIIll();
    }

    private static boolean lIlIllIlIIllIlI(Object object) {
        return object == null;
    }

    private static String lIlIllIlIIlIIlI(String llllllllllllllIllllIlIlIIIllIlIl, String llllllllllllllIllllIlIlIIIllIlII) {
        llllllllllllllIllllIlIlIIIllIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIlIIIllIIll = new StringBuilder();
        char[] llllllllllllllIllllIlIlIIIllIIlI = llllllllllllllIllllIlIlIIIllIlII.toCharArray();
        int llllllllllllllIllllIlIlIIIllIIIl = lIIlIllIlIlIl[0];
        char[] llllllllllllllIllllIlIlIIIlIlIll = llllllllllllllIllllIlIlIIIllIlIl.toCharArray();
        int llllllllllllllIllllIlIlIIIlIlIlI = llllllllllllllIllllIlIlIIIlIlIll.length;
        int llllllllllllllIllllIlIlIIIlIlIIl = lIIlIllIlIlIl[0];
        while (w.lIlIllIlIIlllll(llllllllllllllIllllIlIlIIIlIlIIl, llllllllllllllIllllIlIlIIIlIlIlI)) {
            char llllllllllllllIllllIlIlIIIllIllI = llllllllllllllIllllIlIlIIIlIlIll[llllllllllllllIllllIlIlIIIlIlIIl];
            llllllllllllllIllllIlIlIIIllIIll.append((char)(llllllllllllllIllllIlIlIIIllIllI ^ llllllllllllllIllllIlIlIIIllIIlI[llllllllllllllIllllIlIlIIIllIIIl % llllllllllllllIllllIlIlIIIllIIlI.length]));
            "".length();
            ++llllllllllllllIllllIlIlIIIllIIIl;
            ++llllllllllllllIllllIlIlIIIlIlIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIlIIIllIIll);
    }

    private static boolean lIlIllIlIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIlIIlIIIl(String llllllllllllllIllllIlIlIIlIIIlIl, String llllllllllllllIllllIlIlIIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIlIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIlIIlIIIlll.init(lIIlIllIlIlIl[1], llllllllllllllIllllIlIlIIlIIlIII);
            return new String(llllllllllllllIllllIlIlIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIlIIlIIIllI) {
            llllllllllllllIllllIlIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIIllllI(int n2, int n3) {
        return n2 == n3;
    }
}

