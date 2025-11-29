/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown;

/* TASK: Fighting -> FightingTask */
@TaskDesc(name="Fighting")
public class FightingTask
extends Task {
    private final /* synthetic */ SquireShamansPlugin an;
    private final /* synthetic */ c ao;
    private final /* synthetic */ SquireShamanConfig ap;
    private static /* synthetic */ int[] lIIlIllllIIll;
    private static /* synthetic */ String[] lIIlIllllIIlI;
    private static final /* synthetic */ Logger am;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2;
        void var17;
        t var6;
        NPC nPC = this.ao.o();
        Player player = Players.getLocal();
        if (!t.lIlIlllIIIIIIII(nPC) || !t.lIlIlllIIIIIIIl(this.ap.room().x().contains((Locatable)player) ? 1 : 0) || t.lIlIlllIIIIIIIl(player.isMoving() ? 1 : 0)) {
            return lIIlIllllIIll[0];
        }
        Item var10 = Inventory.getFirst(item -> {
            boolean bl;
            if (!t.lIlIlllIIIIIlIl(item.getId(), this.ap.weapon()) || t.lIlIlllIIIIIIll(item.getId(), this.an.d())) {
                bl = lIIlIllllIIll[2];
                0;
                if (((0x5F ^ 0x7B) & ~(0xA8 ^ 0x8C)) != 0) {
                    return false;
                }
            } else {
                bl = lIIlIllllIIll[0];
            }
            return bl;
        });
        if (t.lIlIlllIIIIIIII(var10)) {
            String[] stringArray = new String[lIIlIllllIIll[1]];
            stringArray[t.lIIlIllllIIll[0]] = lIIlIllllIIlI[lIIlIllllIIll[0]];
            stringArray[t.lIIlIllllIIll[2]] = lIIlIllllIIlI[lIIlIllllIIll[2]];
            stringArray[t.lIIlIllllIIll[3]] = lIIlIllllIIlI[lIIlIllllIIll[3]];
            var10.interact(stringArray);
            return lIIlIllllIIll[2];
        }
        if (t.lIlIlllIIIIIIII(var17.getInteracting())) {
            return lIIlIllllIIll[0];
        }
        WorldPoint var15 = var17.getWorldLocation();
        if (t.lIlIlllIIIIIIlI(var6.ao.a(var15) ? 1 : 0)) {
            return lIIlIllllIIll[0];
        }
        if (t.lIlIlllIIIIIIll(var2.getAnimation(), lIIlIllllIIll[4])) {
            return lIIlIllllIIll[0];
        }
        if (t.lIlIlllIIIIIlII(var6.ao.a(var15, (NPC)var2).distanceTo(var15), lIIlIllllIIll[2])) {
            var2.interact(lIIlIllllIIlI[lIIlIllllIIll[1]]);
            return lIIlIllllIIll[2];
        }
        return lIIlIllllIIll[0];
    }

    @Inject
    public t(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig) {
        this.an = squireShamansPlugin;
        this.ao = c2;
        this.ap = squireShamanConfig;
    }

    static {
        t.lIlIllIllllllll();
        t.lIlIllIlllllllI();
        am = LoggerFactory.getLogger(t.class);
    }

    private static boolean lIlIlllIIIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlllIIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlllIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlllllllI() {
        lIIlIllllIIlI = new String[lIIlIllllIIll[5]];
        t.lIIlIllllIIlI[t.lIIlIllllIIll[0]] = t."Wield";
        t.lIIlIllllIIlI[t.lIIlIllllIIll[2]] = t."Wear";
        t.lIIlIllllIIlI[t.lIIlIllllIIll[3]] = t."Equip";
        t.lIIlIllllIIlI[t.lIIlIllllIIll[1]] = t."Attack";
    }

    private static String lIlIllIllllllII(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var13 = var12.toCharArray();
        int var4 = lIIlIllllIIll[0];
        char[] var9 = var11.toCharArray();
        int var19 = var9.length;
        int var1 = lIIlIllllIIll[0];
        while (t.lIlIlllIIIIIllI(var1, var19)) {
            char var8 = var9[var1];
            var18.append((char)(var8 ^ var13[var4 % var13.length]));
            0;
            ++var4;
            ++var1;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIlIlllIIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlllIIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIlIllIllllllIl(String var7, String var16) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIIlIllllIIll[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIlIllllIIll[3], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllllllll() {
        lIIlIllllIIll = new int[7];
        t.lIIlIllllIIll[0] = (0xC ^ 2 ^ (0xC4 ^ 0x9D)) & (0x65 ^ 0x18 ^ (8 ^ 0x22) ^ -1);
        t.lIIlIllllIIll[1] = 3;
        t.lIIlIllllIIll[2] = 1;
        t.lIIlIllllIIll[3] = 2;
        t.lIIlIllllIIll[4] = 0xFFFFBBFC & 0x5FF3;
        t.lIIlIllllIIll[5] = 0x8A ^ 0x8E;
        t.lIIlIllllIIll[6] = 23 + 189 - 65 + 57 ^ 100 + 12 - 85 + 169;
    }

    private static boolean lIlIlllIIIIIIIl(int n2) {
        return n2 != 0;
    }
}

