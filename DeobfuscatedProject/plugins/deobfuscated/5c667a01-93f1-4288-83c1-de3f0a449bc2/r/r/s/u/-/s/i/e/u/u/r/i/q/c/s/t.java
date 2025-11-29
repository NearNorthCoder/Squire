/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

@TaskDesc(name="Killing Giant Rats", priority=5001)
public class t
extends Task {
    private static /* synthetic */ int[] lIIlIllIllIIl;
    private static /* synthetic */ String[] lIIlIllIllIII;
    private final /* synthetic */ SquireScurriusConfig af;
    private final /* synthetic */ SquireScurrius ae;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void llllllllllllllIllllIlIIllllIIIIl;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (t.lIlIllIlIllIIIl(Static.getClient().getVarbitValue(lIIlIllIllIIl[2]), lIIlIllIllIIl[3])) {
            Prayer[] prayerArray = new Prayer[lIIlIllIllIIl[4]];
            prayerArray[t.lIIlIllIllIIl[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[t.lIIlIllIllIIl[1]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[t.lIIlIllIllIIl[5]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            0;
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            llllllllllllllIllllIlIIllllIIIIl.add(Prayer.PIETY);
            0;
        }
        int[] nArray = new int[lIIlIllIllIIl[5]];
        nArray[t.lIIlIllIllIIl[0]] = d.C;
        nArray[t.lIIlIllIllIIl[1]] = d.D;
        Projectile llllllllllllllIllllIlIIllllIIIII = Projectiles.getNearest((int[])nArray);
        if (t.lIlIllIlIlIllII(llllllllllllllIllllIlIIllllIIIII) && t.lIlIllIlIllIIlI(llllllllllllllIllllIlIIllllIIIII.getRemainingCycles(), lIIlIllIllIIl[6])) {
            if (t.lIlIllIlIlIlllI(llllllllllllllIllllIlIIllllIIIII.getId(), d.C)) {
                llllllllllllllIllllIlIIllllIIIIl.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                0;
                if (2 < 0) {
                    return null;
                }
            } else {
                llllllllllllllIllllIlIIllllIIIIl.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if ((136 + 183 - 220 + 89 ^ 144 + 136 - 254 + 158) == -1) {
                    return null;
                }
            }
        } else {
            llllllllllllllIllllIlIIllllIIIIl.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    private static void lIlIllIlIlIlIIl() {
        lIIlIllIllIII = new String[lIIlIllIllIIl[7]];
        t.lIIlIllIllIII[t.lIIlIllIllIIl[0]] = t."Scurrius";
        t.lIIlIllIllIII[t.lIIlIllIllIIl[1]] = t."Attack";
        t.lIIlIllIllIII[t.lIIlIllIllIIl[5]] = t."Eat";
        t.lIIlIllIllIII[t.lIIlIllIllIIl[4]] = t."Giant rat";
    }

    private static boolean lIlIllIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIlIlIlIII(String llllllllllllllIllllIlIIlllIIlllI, String llllllllllllllIllllIlIIlllIIllIl) {
        llllllllllllllIllllIlIIlllIIlllI = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIlllIlIIIl = new StringBuilder();
        char[] llllllllllllllIllllIlIIlllIlIIII = llllllllllllllIllllIlIIlllIIllIl.toCharArray();
        int llllllllllllllIllllIlIIlllIIllll = lIIlIllIllIIl[0];
        char[] llllllllllllllIllllIlIIlllIIlIIl = llllllllllllllIllllIlIIlllIIlllI.toCharArray();
        int llllllllllllllIllllIlIIlllIIlIII = llllllllllllllIllllIlIIlllIIlIIl.length;
        int llllllllllllllIllllIlIIlllIIIlll = lIIlIllIllIIl[0];
        while (t.lIlIllIlIllIIII(llllllllllllllIllllIlIIlllIIIlll, llllllllllllllIllllIlIIlllIIlIII)) {
            char llllllllllllllIllllIlIIlllIlIlII = llllllllllllllIllllIlIIlllIIlIIl[llllllllllllllIllllIlIIlllIIIlll];
            llllllllllllllIllllIlIIlllIlIIIl.append((char)(llllllllllllllIllllIlIIlllIlIlII ^ llllllllllllllIllllIlIIlllIlIIII[llllllllllllllIllllIlIIlllIIllll % llllllllllllllIllllIlIIlllIlIIII.length]));
            0;
            ++llllllllllllllIllllIlIIlllIIllll;
            ++llllllllllllllIllllIlIIlllIIIlll;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIIlllIlIIIl);
    }

    private static boolean lIlIllIlIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllIlIlIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t llllllllllllllIllllIlIIllllIIlll;
        if (t.lIlIllIlIlIlIll(this.ae.c() ? 1 : 0)) {
            return lIIlIllIllIIl[0];
        }
        String[] stringArray = new String[lIIlIllIllIIl[1]];
        stringArray[t.lIIlIllIllIIl[0]] = lIIlIllIllIII[lIIlIllIllIIl[0]];
        NPC llllllllllllllIllllIlIIllllIIllI = NPCs.getNearest((String[])stringArray);
        if (t.lIlIllIlIlIlIll(llllllllllllllIllllIlIIllllIIlll.af.focusRats() ? 1 : 0) && t.lIlIllIlIlIllII(llllllllllllllIllllIlIIllllIIllI)) {
            return lIIlIllIllIIl[0];
        }
        Iterator llllllllllllllIllllIlIIllllIIlIl = Static.getClient().getGraphicsObjects().iterator();
        while (t.lIlIllIlIlIllIl(llllllllllllllIllllIlIIllllIIlIl.hasNext() ? 1 : 0)) {
            GraphicsObject llllllllllllllIllllIlIIllllIIlII = (GraphicsObject)llllllllllllllIllllIlIIllllIIlIl.next();
            if (t.lIlIllIlIlIlllI(llllllllllllllIllllIlIIllllIIlII.getId(), d.B)) {
                return lIIlIllIllIIl[0];
            }
            0;
            if (3 > 0) continue;
            return ((0xF2 ^ 0xB0) & ~(0xEB ^ 0xA9)) != 0;
        }
        llllllllllllllIllllIlIIllllIIlIl = NPCs.getNearest(nPC -> {
            int n2;
            if (t.lIlIllIlIlIllIl(nPC.getName().equals(lIIlIllIllIII[lIIlIllIllIIl[4]]) ? 1 : 0) && t.lIlIllIlIlIlIll(nPC.isDead() ? 1 : 0)) {
                n2 = lIIlIllIllIIl[1];
                0;
                if ((0xA6 ^ 0xA2) <= 0) {
                    return ((0x5C ^ 0x46) & ~(0x42 ^ 0x58)) != 0;
                }
            } else {
                n2 = lIIlIllIllIIl[0];
            }
            return n2 != 0;
        });
        if (t.lIlIllIlIlIllll(llllllllllllllIllllIlIIllllIIlIl)) {
            int llllllllllllllIllllIlIIllllIIlII = Inventory.getCount(item -> {
                String[] stringArray = new String[lIIlIllIllIIl[1]];
                stringArray[t.lIIlIllIllIIl[0]] = lIIlIllIllIII[lIIlIllIllIIl[5]];
                return item.hasAction(stringArray);
            });
            if (t.lIlIllIlIllIIII(llllllllllllllIllllIlIIllllIIlII, llllllllllllllIllllIlIIllllIIlll.af.food())) {
                llllllllllllllIllllIlIIllllIIlll.ae.e(lIIlIllIllIIl[1]);
                return lIIlIllIllIIl[1];
            }
            return lIIlIllIllIIl[0];
        }
        var2_2.interact(lIIlIllIllIII[lIIlIllIllIIl[1]]);
        return lIIlIllIllIIl[1];
    }

    @Inject
    public t(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ae = squireScurrius;
        this.af = squireScurriusConfig;
    }

    private static void lIlIllIlIlIlIlI() {
        lIIlIllIllIIl = new int[8];
        t.lIIlIllIllIIl[0] = (0x8B ^ 0x9A) & ~(3 ^ 0x12);
        t.lIIlIllIllIIl[1] = 1;
        t.lIIlIllIllIIl[2] = -(0xFFFFFEAF & 0x717B) & (0xFFFFFFEF & 0x7F7F);
        t.lIIlIllIllIIl[3] = 0x10 ^ 0x79 ^ (0x2A ^ 0x4B);
        t.lIIlIllIllIIl[4] = 3;
        t.lIIlIllIllIIl[5] = 2;
        t.lIIlIllIllIIl[6] = 0xB0 ^ 0xAE;
        t.lIIlIllIllIIl[7] = 0x9D ^ 0x99;
    }

    private static boolean lIlIllIlIlIllIl(int n2) {
        return n2 != 0;
    }

    static {
        t.lIlIllIlIlIlIlI();
        t.lIlIllIlIlIlIIl();
    }

    private static boolean lIlIllIlIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIlIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIlIllII(Object object) {
        return object != null;
    }

    private static String lIlIllIlIlIIlll(String llllllllllllllIllllIlIIllIlllllI, String llllllllllllllIllllIlIIllIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIlllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIlllIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIlllIIIIII.init(lIIlIllIllIIl[5], llllllllllllllIllllIlIIlllIIIIIl);
            return new String(llllllllllllllIllllIlIIlllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIllIllllll) {
            llllllllllllllIllllIlIIllIllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIlIlllI(int n2, int n3) {
        return n2 == n3;
    }
}

