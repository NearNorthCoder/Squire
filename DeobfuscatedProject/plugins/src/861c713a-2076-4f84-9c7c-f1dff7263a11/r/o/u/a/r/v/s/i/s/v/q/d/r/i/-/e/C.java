/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.g;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class C
extends Task {
    private static /* synthetic */ String[] lIlIlIIIIlllI;
    private static /* synthetic */ int[] lIlIlIIIIllll;

    public boolean run() {
        int[] nArray = new int[lIlIlIIIIllll[0]];
        nArray[C.lIlIlIIIIllll[1]] = g.T;
        nArray[C.lIlIlIIIIllll[2]] = g.U;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[lIlIlIIIIllll[2]];
        stringArray[C.lIlIlIIIIllll[1]] = lIlIlIIIIlllI[lIlIlIIIIllll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!C.lIllllIlIIllIlI(nPC) || !C.lIllllIlIIllIlI(nPC.getInteracting()) || C.lIllllIlIIllIll(tileObject)) {
            Prayers.disableAll();
            return lIlIlIIIIllll[1];
        }
        if (C.lIllllIlIIlllII(Prayers.getPoints())) {
            return lIlIlIIIIllll[1];
        }
        Prayers.flick(this.W());
        "".length();
        return lIlIlIIIIllll[1];
    }

    private static boolean lIllllIlIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lIllllIlIIlllII(int n2) {
        return n2 <= 0;
    }

    private static void lIllllIlIIllIIl() {
        lIlIlIIIIllll = new int[7];
        C.lIlIlIIIIllll[0] = "  ".length();
        C.lIlIlIIIIllll[1] = " ".length() & ~" ".length();
        C.lIlIlIIIIllll[2] = " ".length();
        C.lIlIlIIIIllll[3] = -(0xFFFFF5FB & 0x4A3F) & (0xFFFFEFFF & 0x5F7F);
        C.lIlIlIIIIllll[4] = 0x59 ^ 0xC ^ (0xDB ^ 0x86);
        C.lIlIlIIIIllll[5] = "   ".length();
        C.lIlIlIIIIllll[6] = 0xA6 ^ 0x9A;
    }

    static {
        C.lIllllIlIIllIIl();
        C.lIllllIlIIllIII();
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> W() {
        void llllllllllllllIllIllIIIlllIlllIl;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (C.lIllllIlIIlllIl(Static.getClient().getVarbitValue(lIlIlIIIIllll[3]), lIlIlIIIIllll[4])) {
            Prayer[] prayerArray = new Prayer[lIlIlIIIIllll[5]];
            prayerArray[C.lIlIlIIIIllll[1]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[C.lIlIlIIIIllll[2]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[C.lIlIlIIIIllll[0]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            "".length();
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        } else {
            llllllllllllllIllIllIIIlllIlllIl.add(Prayer.PIETY);
            "".length();
        }
        int[] nArray = new int[lIlIlIIIIllll[2]];
        nArray[C.lIlIlIIIIllll[1]] = g.S;
        Projectile llllllllllllllIllIllIIIlllIlllII = Projectiles.getNearest((int[])nArray);
        if (C.lIllllIlIIllIlI(llllllllllllllIllIllIIIlllIlllII) && C.lIllllIlIIllllI(llllllllllllllIllIllIIIlllIlllII.getRemainingCycles(), lIlIlIIIIllll[6]) && C.lIllllIlIIlllll(llllllllllllllIllIllIIIlllIlllII.getRemainingCycles())) {
            llllllllllllllIllIllIIIlllIlllIl.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        } else {
            llllllllllllllIllIllIIIlllIlllIl.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        }
        return arrayList;
    }

    private static boolean lIllllIlIIlllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIlIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIlIIlIlll(String llllllllllllllIllIllIIIlllIlIIlI, String llllllllllllllIllIllIIIlllIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIlllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIlllIlIllI.init(lIlIlIIIIllll[0], llllllllllllllIllIllIIIlllIlIlll);
            return new String(llllllllllllllIllIllIIIlllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIlllIlIlIl) {
            llllllllllllllIllIllIIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIIllIII() {
        lIlIlIIIIlllI = new String[lIlIlIIIIllll[2]];
        C.lIlIlIIIIlllI[C.lIlIlIIIIllll[1]] = C.lIllllIlIIlIlll("gsXjIw6fQ95tB44g6qc5SA==", "wcFxv");
    }

    private static boolean lIllllIlIIlllIl(int n2, int n3) {
        return n2 != n3;
    }
}

