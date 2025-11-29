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

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
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

@TaskDesc(name="Pickup enhance", priority=30000, blocking=true)
public class ah
extends Task {
    private final /* synthetic */ SquireChambersConfig cM;
    private static /* synthetic */ String[] lIIlllllIIII;
    private final /* synthetic */ SquireChambersPlugin cL;
    private static /* synthetic */ int[] lIIlllllIIIl;

    private static boolean llIlIIlIIlIIll(Object object) {
        return object != null;
    }

    static {
        ah.llIlIIlIIlIIlI();
        ah.llIlIIlIIlIIIl();
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[3]]));
    }

    private static boolean llIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public ah(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cL = squireChambersPlugin;
        this.cM = squireChambersConfig;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[2]]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ah lllllllllllllllIlllIlIIIllllIIll;
        if (!ah.llIlIIlIIlIIll(this.cL.C()) || ah.llIlIIlIIlIlII(this.cL.C().e().contains((Object)N.VESPULA) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        if (!ah.llIlIIlIIlIlIl(u.bg(), lIIlllllIIIl[1]) || ah.llIlIIlIIlIlII(Players.getLocal().getPlane())) {
            return lIIlllllIIIl[0];
        }
        if (ah.llIlIIlIIlIllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIlllllIIII[lIIlllllIIIl[1]])) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        NPC lllllllllllllllIlllIlIIIllllIIlI = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIlllllIIIl[2]];
            stringArray[ah.lIIlllllIIIl[0]] = lIIlllllIIII[lIIlllllIIIl[5]];
            if (ah.llIlIIlIIlIllI(nPC.hasAction(stringArray) ? 1 : 0) && ah.llIlIIlIIlIllI(this.cL.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIIlllllIIIl[2];
                "".length();
                if (((0x50 ^ 0x7D) & ~(0x94 ^ 0xB9)) < ((0x85 ^ 0xC1) & ~(0xD5 ^ 0x91))) {
                    return ((0x6B ^ 0x46) & ~(0x2E ^ 3)) != 0;
                }
            } else {
                n2 = lIIlllllIIIl[0];
            }
            return n2 != 0;
        });
        if (ah.llIlIIlIIlIIll(lllllllllllllllIlllIlIIIllllIIlI)) {
            return lIIlllllIIIl[0];
        }
        TileItem lllllllllllllllIlllIlIIIllllIIIl = TileItems.getNearest(tileItem -> {
            int n2;
            if (ah.llIlIIlIIllIII(tileItem.getId(), lIIlllllIIIl[4]) && ah.llIlIIlIIlIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ah.llIlIIlIIlIllI(this.cL.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIIlllllIIIl[2];
                "".length();
                if (null != null) {
                    return ((0xE6 ^ 0xAC ^ 29 + 40 - 10 + 68) & (3 + 98 - -21 + 15 ^ 103 + 136 - 105 + 54 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIlllllIIIl[0];
            }
            return n2 != 0;
        });
        if (ah.llIlIIlIIlIlll(lllllllllllllllIlllIlIIIllllIIIl)) {
            return lIIlllllIIIl[0];
        }
        if (ah.llIlIIlIIlIllI(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIlllIlIIIllllIIll.cL.x();
            "".length();
            return lIIlllllIIIl[2];
        }
        var2_2.interact(lIIlllllIIII[lIIlllllIIIl[0]]);
        return lIIlllllIIIl[2];
    }

    private static void llIlIIlIIlIIlI() {
        lIIlllllIIIl = new int[8];
        ah.lIIlllllIIIl[0] = (61 + 199 - 144 + 92 ^ 12 + 88 - -8 + 50) & (0x38 ^ 6 ^ (0x3E ^ 0x4E) ^ -" ".length());
        ah.lIIlllllIIIl[1] = 0xF ^ 0xB;
        ah.lIIlllllIIIl[2] = " ".length();
        ah.lIIlllllIIIl[3] = "  ".length();
        ah.lIIlllllIIIl[4] = -(0xFFFFBF11 & 0x62FF) & (0xFFFFF7FD & 0x7BFE);
        ah.lIIlllllIIIl[5] = "   ".length();
        ah.lIIlllllIIIl[6] = 128 + 138 - 249 + 123 ^ 132 + 72 - 134 + 67;
        ah.lIIlllllIIIl[7] = 0x29 ^ 0x5B ^ (0xE ^ 0x74);
    }

    private static boolean llIlIIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIIlIIlIlll(Object object) {
        return object == null;
    }

    private static String llIlIIlIIIllll(String lllllllllllllllIlllIlIIIlllIIIIl, String lllllllllllllllIlllIlIIIllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllIllllI.getBytes(StandardCharsets.UTF_8)), lIIlllllIIIl[7]), "DES");
            Cipher lllllllllllllllIlllIlIIIlllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIlllIIIll.init(lIIlllllIIIl[3], lllllllllllllllIlllIlIIIlllIIlII);
            return new String(lllllllllllllllIlllIlIIIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIlllIIIlI) {
            lllllllllllllllIlllIlIIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlIIlIlII(int n2) {
        return n2 == 0;
    }

    private static String llIlIIlIIlIIII(String lllllllllllllllIlllIlIIIlIllllll, String lllllllllllllllIlllIlIIIllIIIIll) {
        lllllllllllllllIlllIlIIIlIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIllIIIIlI = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIllIIIIIl = lllllllllllllllIlllIlIIIllIIIIll.toCharArray();
        int lllllllllllllllIlllIlIIIllIIIIII = lIIlllllIIIl[0];
        char[] lllllllllllllllIlllIlIIIlIlllIlI = lllllllllllllllIlllIlIIIlIllllll.toCharArray();
        int lllllllllllllllIlllIlIIIlIlllIIl = lllllllllllllllIlllIlIIIlIlllIlI.length;
        int lllllllllllllllIlllIlIIIlIlllIII = lIIlllllIIIl[0];
        while (ah.llIlIIlIIllIIl(lllllllllllllllIlllIlIIIlIlllIII, lllllllllllllllIlllIlIIIlIlllIIl)) {
            char lllllllllllllllIlllIlIIIllIIIlIl = lllllllllllllllIlllIlIIIlIlllIlI[lllllllllllllllIlllIlIIIlIlllIII];
            lllllllllllllllIlllIlIIIllIIIIlI.append((char)(lllllllllllllllIlllIlIIIllIIIlIl ^ lllllllllllllllIlllIlIIIllIIIIIl[lllllllllllllllIlllIlIIIllIIIIII % lllllllllllllllIlllIlIIIllIIIIIl.length]));
            "".length();
            ++lllllllllllllllIlllIlIIIllIIIIII;
            ++lllllllllllllllIlllIlIIIlIlllIII;
            "".length();
            if (((96 + 138 - 116 + 39 ^ 92 + 166 - 123 + 55) & (146 + 130 - 114 + 8 ^ 57 + 136 - 119 + 63 ^ -" ".length())) == ((0x28 ^ 0x5C ^ (2 ^ 0x7C)) & (0x38 ^ 0x1D ^ (0x4A ^ 0x65) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIIllIIIIlI);
    }

    private static String llIlIIlIIIlllI(String lllllllllllllllIlllIlIIIllIlIlII, String lllllllllllllllIlllIlIIIllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIllIlIllI.init(lIIlllllIIIl[3], lllllllllllllllIlllIlIIIllIlIlll);
            return new String(lllllllllllllllIlllIlIIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIllIlIlIl) {
            lllllllllllllllIlllIlIIIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlIIlIIlIIIl() {
        lIIlllllIIII = new String[lIIlllllIIIl[6]];
        ah.lIIlllllIIII[ah.lIIlllllIIIl[0]] = ah.llIlIIlIIIlllI("bM9aa/F5cPQ=", "FKRgQ");
        ah.lIIlllllIIII[ah.lIIlllllIIIl[2]] = ah.llIlIIlIIIlllI("vjD8lMEZX79ICva+KY+xdA==", "GmHde");
        ah.lIIlllllIIII[ah.lIIlllllIIIl[3]] = ah.llIlIIlIIIllll("+GgyHsI5lXz16MO1LUYeeA==", "eqkmJ");
        ah.lIIlllllIIII[ah.lIIlllllIIIl[5]] = ah.llIlIIlIIIlllI("MNLigedXZvk=", "UDMiM");
        ah.lIIlllllIIII[ah.lIIlllllIIIl[1]] = ah.llIlIIlIIlIIII("JjM5NwQkYT0gCTcvOys=", "VAXNa");
    }
}

