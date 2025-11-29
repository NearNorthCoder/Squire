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

/* TASK: Looting -> LootingTask */
@TaskDesc(name="Looting", priority=10, blocking=true)
public class j
extends Task {
    private static /* synthetic */ int[] lIIlllIlllIl;
    private final /* synthetic */ SquireBlueDragonKiller F;
    private static /* synthetic */ String[] lIIlllIlllII;

    private static void llIlIIIlIlIIIl() {
        lIIlllIlllII = new String[lIIlllIlllIl[3]];
        j.lIIlllIlllII[j.lIIlllIlllIl[0]] = j."Eat";
        j.lIIlllIlllII[j.lIIlllIlllIl[1]] = j."Take";
        j.lIIlllIlllII[j.lIIlllIlllIl[2]] = j."Eat";
    }

    public boolean run() {
        j var2;
        if (j.llIlIIIlIlIIll(this.F.c().isEmpty() ? 1 : 0)) {
            return lIIlllIlllIl[0];
        }
        if (j.llIlIIIlIlIIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlllIlllIl[1];
        }
        if (j.llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item var11 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlllIlllIl[1]];
                stringArray[j.lIIlllIlllIl[0]] = lIIlllIlllII[lIIlllIlllIl[2]];
                return item.hasAction(stringArray);
            });
            if (j.llIlIIIlIlIlII(var11)) {
                var2.F.c().clear();
                return lIIlllIlllIl[0];
            }
            var11.interact(lIIlllIlllII[lIIlllIlllIl[0]]);
            var2.sleep(lIIlllIlllIl[2]);
            return lIIlllIlllIl[1];
        }
        Iterator<d> var11 = var2.F.c().iterator();
        while (j.llIlIIIlIlIIll(var11.hasNext() ? 1 : 0)) {
            d var7 = var11.next();
            int[] nArray = new int[lIIlllIlllIl[1]];
            nArray[j.lIIlllIlllIl[0]] = var7.r();
            TileItem var10 = TileItems.getFirstAt((WorldPoint)var7.o(), (int[])nArray);
            if (j.llIlIIIlIlIlII(var10)) {
                var2.F.c().remove(var7);
                0;
                0;
                if ((0x64 ^ 0x60) >= 1) break;
                return false;
            }
            if (j.llIlIIIlIlIIll(var2.a(var10) ? 1 : 0)) {
                var10.interact(lIIlllIlllII[lIIlllIlllIl[1]]);
                return lIIlllIlllIl[1];
            }
            0;
            if (3 >= -1) continue;
            return false;
        }
        return lIIlllIlllIl[0];
    }

    private static boolean llIlIIIlIlIIll(int n) {
        return n != 0;
    }

    private static void llIlIIIlIlIIlI() {
        lIIlllIlllIl = new int[5];
        j.lIIlllIlllIl[0] = (3 ^ 0x3E ^ (0x6E ^ 0x12)) & (0xB1 ^ 0xB5 ^ (0x20 ^ 0x65) ^ -1);
        j.lIIlllIlllIl[1] = 1;
        j.lIIlllIlllIl[2] = 2;
        j.lIIlllIlllIl[3] = 3;
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
            0;
            if (-1 <= 0) return bl;
            return ((0x3B ^ 0x64 ^ (0xC5 ^ 0x80)) & (0xD8 ^ 0xC2 ^ (0x5D ^ 0x67) & ~(0x55 ^ 0x6F) ^ -1)) != 0;
        }
        bl = lIIlllIlllIl[0];
        return bl;
    }

    private static String llIlIIIlIIllll(String var14, String var4) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIlllIlllIl[2], var9);
            return new String(var1.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIlIlIIII(String var12, String var8) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlllIlllIl[4]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIIlllIlllIl[2], var3);
            return new String(var13.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        j.llIlIIIlIlIIlI();
        j.llIlIIIlIlIIIl();
    }
}

