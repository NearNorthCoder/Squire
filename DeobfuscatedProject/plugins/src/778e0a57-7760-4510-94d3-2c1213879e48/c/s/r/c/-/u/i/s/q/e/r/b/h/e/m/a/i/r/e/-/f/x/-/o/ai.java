/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Manage Overloads", priority=30000, blocking=true)
public class ai
extends Task {
    private final /* synthetic */ SquireChambersConfig cO;
    private static /* synthetic */ String[] lIlIIlIIlllI;
    private final /* synthetic */ SquireChambersPlugin cN;
    private static /* synthetic */ int[] lIlIIlIlIlIl;

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[2]]));
    }

    private static boolean llIllIIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public ai(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cN = squireChambersPlugin;
        this.cO = squireChambersConfig;
    }

    private static boolean llIllIIlIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIllIIIllllII(String lllllllllllllllIllIllIlIIlIIlIII, String lllllllllllllllIllIllIlIIlIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlIIlIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlIIlIIllII.init(lIlIIlIlIlIl[4], lllllllllllllllIllIllIlIIlIIllIl);
            return new String(lllllllllllllllIllIllIlIIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlIIlIIlIll) {
            lllllllllllllllIllIllIlIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlIIlIll(String lllllllllllllllIllIllIlIIlIllIlI, String lllllllllllllllIllIllIlIIlIllllI) {
        lllllllllllllllIllIllIlIIlIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIlIIlIlllIl = new StringBuilder();
        char[] lllllllllllllllIllIllIlIIlIlllII = lllllllllllllllIllIllIlIIlIllllI.toCharArray();
        int lllllllllllllllIllIllIlIIlIllIll = lIlIIlIlIlIl[1];
        char[] lllllllllllllllIllIllIlIIlIlIlIl = lllllllllllllllIllIllIlIIlIllIlI.toCharArray();
        int lllllllllllllllIllIllIlIIlIlIlII = lllllllllllllllIllIllIlIIlIlIlIl.length;
        int lllllllllllllllIllIllIlIIlIlIIll = lIlIIlIlIlIl[1];
        while (ai.llIllIIlIlIlII(lllllllllllllllIllIllIlIIlIlIIll, lllllllllllllllIllIllIlIIlIlIlII)) {
            char lllllllllllllllIllIllIlIIllIIIII = lllllllllllllllIllIllIlIIlIlIlIl[lllllllllllllllIllIllIlIIlIlIIll];
            lllllllllllllllIllIllIlIIlIlllIl.append((char)(lllllllllllllllIllIllIlIIllIIIII ^ lllllllllllllllIllIllIlIIlIlllII[lllllllllllllllIllIllIlIIlIllIll % lllllllllllllllIllIllIlIIlIlllII.length]));
            "".length();
            ++lllllllllllllllIllIllIlIIlIllIll;
            ++lllllllllllllllIllIllIlIIlIlIIll;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIlIIlIlllIl);
    }

    private static void llIllIIlIIllIl() {
        lIlIIlIlIlIl = new int[6];
        ai.lIlIIlIlIlIl[0] = 0x2E ^ 8 ^ (1 ^ 0x23);
        ai.lIlIIlIlIlIl[1] = (211 + 127 - 312 + 226 ^ 44 + 130 - -6 + 9) & ("  ".length() ^ (0x17 ^ 0x54) ^ -" ".length());
        ai.lIlIIlIlIlIl[2] = " ".length();
        ai.lIlIIlIlIlIl[3] = 0xFFFFD31D & 0x7EE6;
        ai.lIlIIlIlIlIl[4] = "  ".length();
        ai.lIlIIlIlIlIl[5] = "   ".length();
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[4]]));
    }

    static {
        ai.llIllIIlIIllIl();
        ai.llIllIIlIIllII();
    }

    private static void llIllIIlIIllII() {
        lIlIIlIIlllI = new String[lIlIIlIlIlIl[0]];
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[1]] = ai.llIllIIIllllII("ucxM1sKwrt4=", "haZds");
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[2]] = ai.llIllIIIllllII("sGj0Z4lARimGN6/fDbX90w==", "ThyPT");
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[4]] = ai.llIllIIIllllII("Q9IZkipMf/1OpMqi0xaG+Q==", "tXscU");
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[5]] = ai.llIllIIlIIlIll("Eg44MSg4", "SzLPK");
    }

    private static boolean llIllIIlIlIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ai lllllllllllllllIllIllIlIIlllIlII;
        if (!ai.llIllIIlIIlllI(u.bg(), lIlIIlIlIlIl[0]) || ai.llIllIIlIIllll(Players.getLocal().getPlane())) {
            return lIlIIlIlIlIl[1];
        }
        int[] nArray = new int[lIlIIlIlIlIl[2]];
        nArray[ai.lIlIIlIlIlIl[1]] = lIlIIlIlIlIl[3];
        if (ai.llIllIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIlIlIl[1];
        }
        NPC lllllllllllllllIllIllIlIIlllIIll = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIlIlIlIl[2]];
            stringArray[ai.lIlIIlIlIlIl[1]] = lIlIIlIIlllI[lIlIIlIlIlIl[5]];
            if (ai.llIllIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0) && ai.llIllIIlIlIIII(this.cN.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIlIlIlIl[2];
                "".length();
                if ("  ".length() >= (0xA8 ^ 0xB5 ^ (0x5F ^ 0x46))) {
                    return ((12 + 71 - -28 + 55 ^ 66 + 66 - 40 + 43) & (96 + 163 - 58 + 30 ^ 26 + 186 - 62 + 48 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIlIlIlIl[1];
            }
            return n2 != 0;
        });
        if (ai.llIllIIlIlIIIl(lllllllllllllllIllIllIlIIlllIIll)) {
            return lIlIIlIlIlIl[1];
        }
        TileItem lllllllllllllllIllIllIlIIlllIIlI = TileItems.getNearest(tileItem -> {
            int n2;
            if (ai.llIllIIlIlIIll(tileItem.getId(), lIlIIlIlIlIl[3]) && ai.llIllIIlIlIIII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ai.llIllIIlIlIIII(this.cN.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIlIlIlIl[2];
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0xA7 ^ 0x81) & ~(0x1C ^ 0x3A)) != 0;
                }
            } else {
                n2 = lIlIIlIlIlIl[1];
            }
            return n2 != 0;
        });
        if (ai.llIllIIlIlIIlI(lllllllllllllllIllIllIlIIlllIIlI)) {
            return lIlIIlIlIlIl[1];
        }
        if (ai.llIllIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIllIllIlIIlllIlII.cN.x();
            "".length();
            return lIlIIlIlIlIl[2];
        }
        var2_2.interact(lIlIIlIIlllI[lIlIIlIlIlIl[1]]);
        return lIlIIlIlIlIl[2];
    }

    private static boolean llIllIIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIIlIlIIlI(Object object) {
        return object == null;
    }
}

