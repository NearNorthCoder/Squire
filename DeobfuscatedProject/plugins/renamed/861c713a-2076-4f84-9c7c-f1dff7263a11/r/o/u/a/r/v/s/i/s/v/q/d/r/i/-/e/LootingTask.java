/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.g_Unknown;

/* TASK: Looting -> LootingTask */
@TaskDesc(name="Looting", blocking=true, priority=50000)
public class LootingTask
extends Task {
    private final /* synthetic */ SquireVardorvis at;
    private static /* synthetic */ String[] lIlIlIIlIlllI;
    private /* synthetic */ e l;
    private final /* synthetic */ SquireVardorvisConfig au;
    private static /* synthetic */ int[] lIlIlIIlIllll;

    private static void lIlllllIIIIlIII() {
        lIlIlIIlIllll = new int[6];
        B.lIlIlIIlIllll[0] = (0xF7 ^ 0xC4) & ~(0x5B ^ 0x68);
        B.lIlIlIIlIllll[1] = 1;
        B.lIlIlIIlIllll[2] = 2;
        B.lIlIlIIlIllll[3] = 3;
        B.lIlIlIIlIllll[4] = 0 ^ 0x5F ^ (0xDB ^ 0x80);
        B.lIlIlIIlIllll[5] = 0x62 ^ 0x57 ^ (0x3B ^ 6);
    }

    @Inject
    public B(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.au = squireVardorvisConfig;
        this.at = squireVardorvis;
        this.l = squireVardorvis.j();
    }

    private static boolean lIlllllIIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlllllIIIIIlIl(String var10, String var6) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIlIIlIllll[2], var11);
            return new String(var5.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (B.lIlllllIIIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIlIllll[0];
        }
        TileItem var9 = TileItems.getNearest(tileItem -> g.Q.contains(tileItem.getName()));
        if (B.lIlllllIIIIlIlI(var9)) {
            if (B.lIlllllIIIIlIIl(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && B.lIlllllIIIIlIIl(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                return lIlIlIIlIllll[0];
            }
            var9 = TileItems.getNearest(tileItem -> tileItem.getName().startsWith(lIlIlIIlIlllI[lIlIlIIlIllll[3]]));
            if (B.lIlllllIIIIlIlI(var9)) {
                return lIlIlIIlIllll[0];
            }
        }
        if (B.lIlllllIIIIlIll(Inventory.isFull() ? 1 : 0)) {
            Item var3 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIlIlIIlIllll[1]];
                stringArray[B.lIlIlIIlIllll[0]] = lIlIlIIlIlllI[lIlIlIIlIllll[2]];
                return item.hasAction(stringArray);
            });
            if (B.lIlllllIIIIlIlI(var3)) {
                B var4;
                var4.at.c(lIlIlIIlIllll[1]);
                return lIlIlIIlIllll[0];
            }
            var3.interact(lIlIlIIlIlllI[lIlIlIIlIllll[0]]);
            return lIlIlIIlIllll[1];
        }
        var1_1.interact(lIlIlIIlIlllI[lIlIlIIlIllll[1]]);
        return lIlIlIIlIllll[1];
    }

    private static boolean lIlllllIIIIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIIIIIlll() {
        lIlIlIIlIlllI = new String[lIlIlIIlIllll[4]];
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[0]] = B."Eat";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[1]] = B."Take";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[2]] = B."Eat";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[3]] = B."Super combat potion";
    }

    private static boolean lIlllllIIIIlIlI(Object object) {
        return object == null;
    }

    static {
        B.lIlllllIIIIlIII();
        B.lIlllllIIIIIlll();
    }

    private static String lIlllllIIIIIllI(String var1, String var8) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIllll[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIlIIlIllll[2], var13);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

