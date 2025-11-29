/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.d;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Looting", priority=10, blocking=true)
public class j
extends Task {
    private static /* synthetic */ int[] lIIlllIlllIl;
    private final /* synthetic */ SquireBlueDragonKiller F;
    private static /* synthetic */ String[] lIIlllIlllII;

    private static void llIlIIIlIlIIIl() {
        lIIlllIlllII = new String[lIIlllIlllIl[3]];
        j.lIIlllIlllII[j.lIIlllIlllIl[0]] = j.llIlIIIlIIllll("9T84yfzHnLg=", "lZZsq");
        j.lIIlllIlllII[j.lIIlllIlllIl[1]] = j.llIlIIIlIIllll("jzarfLLzuSE=", "JvJyE");
        j.lIIlllIlllII[j.lIIlllIlllIl[2]] = j.llIlIIIlIlIIII("ZHUZsEPYfO4=", "surZA");
    }

    public boolean run() {
        j lllllllllllllllIlllIlIlIlIIIIIlI;
        if (j.llIlIIIlIlIIll(this.F.c().isEmpty() ? 1 : 0)) {
            return lIIlllIlllIl[0];
        }
        if (j.llIlIIIlIlIIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlllIlllIl[1];
        }
        if (j.llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item lllllllllllllllIlllIlIlIlIIIIIIl = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlllIlllIl[1]];
                stringArray[j.lIIlllIlllIl[0]] = lIIlllIlllII[lIIlllIlllIl[2]];
                return item.hasAction(stringArray);
            });
            if (j.llIlIIIlIlIlII(lllllllllllllllIlllIlIlIlIIIIIIl)) {
                lllllllllllllllIlllIlIlIlIIIIIlI.F.c().clear();
                return lIIlllIlllIl[0];
            }
            lllllllllllllllIlllIlIlIlIIIIIIl.interact(lIIlllIlllII[lIIlllIlllIl[0]]);
            lllllllllllllllIlllIlIlIlIIIIIlI.sleep(lIIlllIlllIl[2]);
            return lIIlllIlllIl[1];
        }
        Iterator<d> lllllllllllllllIlllIlIlIlIIIIIIl = lllllllllllllllIlllIlIlIlIIIIIlI.F.c().iterator();
        while (j.llIlIIIlIlIIll(lllllllllllllllIlllIlIlIlIIIIIIl.hasNext() ? 1 : 0)) {
            d lllllllllllllllIlllIlIlIlIIIIIII = lllllllllllllllIlllIlIlIlIIIIIIl.next();
            int[] nArray = new int[lIIlllIlllIl[1]];
            nArray[j.lIIlllIlllIl[0]] = lllllllllllllllIlllIlIlIlIIIIIII.r();
            TileItem lllllllllllllllIlllIlIlIIlllllll = TileItems.getFirstAt((WorldPoint)lllllllllllllllIlllIlIlIlIIIIIII.o(), (int[])nArray);
            if (j.llIlIIIlIlIlII(lllllllllllllllIlllIlIlIIlllllll)) {
                lllllllllllllllIlllIlIlIlIIIIIlI.F.c().remove(lllllllllllllllIlllIlIlIlIIIIIII);
                "".length();
                "".length();
                if ((0x64 ^ 0x60) >= " ".length()) break;
                return ((0x3C ^ 0x7B) & ~(0xD6 ^ 0x91)) != 0;
            }
            if (j.llIlIIIlIlIIll(lllllllllllllllIlllIlIlIlIIIIIlI.a(lllllllllllllllIlllIlIlIIlllllll) ? 1 : 0)) {
                lllllllllllllllIlllIlIlIIlllllll.interact(lIIlllIlllII[lIIlllIlllIl[1]]);
                return lIIlllIlllIl[1];
            }
            "".length();
            if ("   ".length() >= -" ".length()) continue;
            return ((0x94 ^ 0x80) & ~(0x2E ^ 0x3A)) != 0;
        }
        return lIIlllIlllIl[0];
    }

    private static boolean llIlIIIlIlIIll(int n) {
        return n != 0;
    }

    private static void llIlIIIlIlIIlI() {
        lIIlllIlllIl = new int[5];
        j.lIIlllIlllIl[0] = (3 ^ 0x3E ^ (0x6E ^ 0x12)) & (0xB1 ^ 0xB5 ^ (0x20 ^ 0x65) ^ -" ".length());
        j.lIIlllIlllIl[1] = " ".length();
        j.lIIlllIlllIl[2] = "  ".length();
        j.lIIlllIlllIl[3] = "   ".length();
        j.lIIlllIlllIl[4] = 65 + 4 - -32 + 75 ^ 130 + 70 - 170 + 154;
    }

    private static boolean llIlIIIlIlIlII(Object object) {
        return object == null;
    }

    @Inject
    public j(SquireBlueDragonKiller squireBlueDragonKiller) {
        this.F = squireBlueDragonKiller;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(TileItem tileItem) {
        boolean bl;
        block3: {
            block2: {
                if (!j.llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) break block2;
                if (!j.llIlIIIlIlIIll(tileItem.isStackable() ? 1 : 0)) break block3;
                int[] nArray = new int[lIIlllIlllIl[1]];
                nArray[j.lIIlllIlllIl[0]] = tileItem.getId();
                if (!j.llIlIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            bl = lIIlllIlllIl[1];
            "".length();
            if (-" ".length() <= 0) return bl;
            return ((0x3B ^ 0x64 ^ (0xC5 ^ 0x80)) & (0xD8 ^ 0xC2 ^ (0x5D ^ 0x67) & ~(0x55 ^ 0x6F) ^ -" ".length())) != 0;
        }
        bl = lIIlllIlllIl[0];
        return bl;
    }

    private static String llIlIIIlIIllll(String lllllllllllllllIlllIlIlIIllIIllI, String lllllllllllllllIlllIlIlIIllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIIllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIIllIlIlI.init(lIIlllIlllIl[2], lllllllllllllllIlllIlIlIIllIlIll);
            return new String(lllllllllllllllIlllIlIlIIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIIllIlIIl) {
            lllllllllllllllIlllIlIlIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIlIlIIII(String lllllllllllllllIlllIlIlIIlllIIll, String lllllllllllllllIlllIlIlIIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), lIIlllIlllIl[4]), "DES");
            Cipher lllllllllllllllIlllIlIlIIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIlIIlllIlll.init(lIIlllIlllIl[2], lllllllllllllllIlllIlIlIIllllIII);
            return new String(lllllllllllllllIlllIlIlIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIIlllIllI) {
            lllllllllllllllIlllIlIlIIlllIllI.printStackTrace();
            return null;
        }
    }

    static {
        j.llIlIIIlIlIIlI();
        j.llIlIIIlIlIIIl();
    }
}

