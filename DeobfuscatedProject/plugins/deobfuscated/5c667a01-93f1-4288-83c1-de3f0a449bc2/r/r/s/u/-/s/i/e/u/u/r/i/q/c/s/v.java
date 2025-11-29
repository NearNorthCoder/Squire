/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

@TaskDesc(name="Looting", blocking=true, priority=50000)
public class v
extends Task {
    private final /* synthetic */ SquireScurriusConfig aj;
    private static /* synthetic */ String[] lIIlIlIlIlllI;
    private static /* synthetic */ int[] lIIlIlIlIllll;
    private /* synthetic */ b c;
    private final /* synthetic */ SquireScurrius ai;

    private static void lIlIllIIIIllIll() {
        lIIlIlIlIllll = new int[7];
        v.lIIlIlIlIllll[0] = (0xE5 ^ 0x9E ^ (0x85 ^ 0xA0)) & (242 + 19 - 34 + 24 ^ 118 + 122 - 214 + 139 ^ -1);
        v.lIIlIlIlIllll[1] = 1;
        v.lIIlIlIlIllll[2] = 2;
        v.lIIlIlIlIllll[3] = 3;
        v.lIIlIlIlIllll[4] = 0xAC ^ 0x8B ^ (0x47 ^ 0x64);
        v.lIIlIlIlIllll[5] = 0x1A ^ 0x1F;
        v.lIIlIlIlIllll[6] = 0x1A ^ 0x12;
    }

    private static boolean lIlIllIIIIllllI(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public v(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.aj = squireScurriusConfig;
        this.ai = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIIIIllIlI() {
        lIIlIlIlIlllI = new String[lIIlIlIlIllll[5]];
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[0]] = v."Scurrius";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[1]] = v."Drop";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[2]] = v."Eat";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[3]] = v."Take";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[4]] = v."Eat";
    }

    private static String lIlIllIIIIlIlll(String llllllllllllllIllllIllIllIlIIlll, String llllllllllllllIllllIllIllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIllIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIllIlIlIIl.init(lIIlIlIlIllll[2], llllllllllllllIllllIllIllIlIlIlI);
            return new String(llllllllllllllIllllIllIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIllIlIlIII) {
            llllllllllllllIllllIllIllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIIllIIl(String llllllllllllllIllllIllIlllIIIlII, String llllllllllllllIllllIllIlllIIlIII) {
        llllllllllllllIllllIllIlllIIIlII = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIlllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllIlllIIIlll = new StringBuilder();
        char[] llllllllllllllIllllIllIlllIIIllI = llllllllllllllIllllIllIlllIIlIII.toCharArray();
        int llllllllllllllIllllIllIlllIIIlIl = lIIlIlIlIllll[0];
        char[] llllllllllllllIllllIllIllIllllll = llllllllllllllIllllIllIlllIIIlII.toCharArray();
        int llllllllllllllIllllIllIllIlllllI = llllllllllllllIllllIllIllIllllll.length;
        int llllllllllllllIllllIllIllIllllIl = lIIlIlIlIllll[0];
        while (v.lIlIllIIIlIIIII(llllllllllllllIllllIllIllIllllIl, llllllllllllllIllllIllIllIlllllI)) {
            char llllllllllllllIllllIllIlllIIlIlI = llllllllllllllIllllIllIllIllllll[llllllllllllllIllllIllIllIllllIl];
            llllllllllllllIllllIllIlllIIIlll.append((char)(llllllllllllllIllllIllIlllIIlIlI ^ llllllllllllllIllllIllIlllIIIllI[llllllllllllllIllllIllIlllIIIlIl % llllllllllllllIllllIllIlllIIIllI.length]));
            0;
            ++llllllllllllllIllllIllIlllIIIlIl;
            ++llllllllllllllIllllIllIllIllllIl;
            0;
            if ((77 + 24 - -24 + 74 ^ 129 + 30 - -22 + 13) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIllIlllIIIlll);
    }

    private static boolean lIlIllIIIIlllII(int n2) {
        return n2 == 0;
    }

    static {
        v.lIlIllIIIIllIll();
        v.lIlIllIIIIllIlI();
    }

    private static String lIlIllIIIIllIII(String llllllllllllllIllllIllIllIllIlII, String llllllllllllllIllllIllIllIllIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIllIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIllIllIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIllll[6]), "DES");
            Cipher llllllllllllllIllllIllIllIllIllI = Cipher.getInstance("DES");
            llllllllllllllIllllIllIllIllIllI.init(lIIlIlIlIllll[2], llllllllllllllIllllIllIllIllIlll);
            return new String(llllllllllllllIllllIllIllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIllIllIlIl) {
            llllllllllllllIllllIllIllIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIIlllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem llllllllllllllIllllIllIlllIllIIl;
        v llllllllllllllIllllIllIlllIlllII;
        if (v.lIlIllIIIIlllII(this.ai.c() ? 1 : 0)) {
            return lIIlIlIlIllll[0];
        }
        String[] stringArray = new String[lIIlIlIlIllll[1]];
        stringArray[v.lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[0]];
        NPC llllllllllllllIllllIllIlllIllIll = NPCs.getNearest((String[])stringArray);
        if (v.lIlIllIIIIlllIl(llllllllllllllIllllIllIlllIllIll)) {
            return lIIlIlIlIllll[0];
        }
        TileItem llllllllllllllIllllIllIlllIllIlI = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (!v.lIlIllIIIIlllII(d.v.contains(tileItem.getName()) ? 1 : 0) || v.lIlIllIIIIlllll(this.aj.lootBoosting() ? 1 : 0) && v.lIlIllIIIIlllll(d.y.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lIIlIlIlIllll[1];
                0;
                if (-(0x5E ^ 0x5A ^ (0x94 ^ 0x88) & ~(0x76 ^ 0x6A)) > 0) {
                    return ((0xCE ^ 0xA0 ^ (0xAD ^ 0x86)) & (193 + 80 - 219 + 146 ^ 27 + 113 - 107 + 108 ^ -1)) != 0;
                }
            } else {
                bl = lIIlIlIlIllll[0];
            }
            return bl;
        });
        if (v.lIlIllIIIIllllI(llllllllllllllIllllIllIlllIllIlI)) {
            llllllllllllllIllllIllIlllIllIIl = TileItems.getNearest(tileItem -> d.w.contains(tileItem.getName()));
            if (!v.lIlIllIIIIlllIl(llllllllllllllIllllIllIlllIllIIl) || v.lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                return lIIlIlIlIllll[0];
            }
            llllllllllllllIllllIllIlllIllIlI = llllllllllllllIllllIllIlllIllIIl;
        }
        if (v.lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
            llllllllllllllIllllIllIlllIllIIl = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (v.lIlIllIIIIlllIl(llllllllllllllIllllIllIlllIllIIl)) {
                llllllllllllllIllllIllIlllIllIIl.interact(lIIlIlIlIlllI[lIIlIlIlIllll[1]]);
                return lIIlIlIlIllll[1];
            }
            Item llllllllllllllIllllIllIlllIllIII = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIlIlIllll[1]];
                stringArray[v.lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[4]];
                return item.hasAction(stringArray);
            });
            if (v.lIlIllIIIIllllI(llllllllllllllIllllIllIlllIllIII)) {
                llllllllllllllIllllIllIlllIlllII.ai.e(lIIlIlIlIllll[1]);
                return lIIlIlIlIllll[0];
            }
            llllllllllllllIllllIllIlllIllIII.interact(lIIlIlIlIlllI[lIIlIlIlIllll[2]]);
            return lIIlIlIlIllll[1];
        }
        var2_2.interact(lIIlIlIlIlllI[lIIlIlIlIllll[3]]);
        return lIIlIlIlIllll[1];
    }
}

