/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Consuming -> ConsumingTask */
@TaskDesc(name="Consuming", priority=500, register=true)
public class ConsumingTask
extends Task {
    private final /* synthetic */ SquirePlunderConfig v;
    private static /* synthetic */ int[] lllllllIIIlI;
    private /* synthetic */ Instant x;
    private final /* synthetic */ Duration w;
    private static /* synthetic */ String[] lllllllIIIIl;

    private static void lIIlIlIIllIlIII() {
        lllllllIIIIl = new String[lllllllIIIlI[7]];
        e.lllllllIIIIl[e.lllllllIIIlI[0]] = e."Can't find selected food!";
        e.lllllllIIIIl[e.lllllllIIIlI[1]] = e."Eat";
        e.lllllllIIIIl[e.lllllllIIIlI[3]] = e."Can't find selected antipoison!";
        e.lllllllIIIIl[e.lllllllIIIlI[4]] = e."Drink";
        e.lllllllIIIIl[e.lllllllIIIlI[2]] = e."Drink";
        e.lllllllIIIIl[e.lllllllIIIlI[6]] = e."Eat";
    }

    @Inject
    public e(SquirePlunderConfig squirePlunderConfig) {
        this.w = Duration.ofSeconds(12L);
        this.v = squirePlunderConfig;
    }

    private static String lIIlIlIIllIIllI(String var13, String var19) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lllllllIIIlI[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lllllllIIIlI[3], var16);
            return new String(var18.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllIIII(int n2) {
        return n2 != 0;
    }

    private static int lIIlIlIIllIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIIlIlIIllIIlIl(String var1, String var2) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lllllllIIIlI[3], var4);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIllIlIIl() {
        lllllllIIIlI = new int[9];
        e.lllllllIIIlI[0] = (0xB7 ^ 0xAC) & ~(0x4C ^ 0x57);
        e.lllllllIIIlI[1] = 1;
        e.lllllllIIIlI[2] = 0x52 ^ 0x56;
        e.lllllllIIIlI[3] = 2;
        e.lllllllIIIlI[4] = 3;
        e.lllllllIIIlI[5] = 0x80 ^ 0x8C ^ (0x77 ^ 0x1D);
        e.lllllllIIIlI[6] = 0x51 ^ 0x54;
        e.lllllllIIIlI[7] = 0xAE ^ 0xA8;
        e.lllllllIIIlI[8] = 0x26 ^ 0x2E;
    }

    static {
        e.lIIlIlIIllIlIIl();
        e.lIIlIlIIllIlIII();
    }

    private static boolean lIIlIlIIllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIIllIlllI(int n2) {
        return n2 > 0;
    }

    private static String lIIlIlIIllIIlll(String var17, String var20) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var6 = var20.toCharArray();
        int var15 = lllllllIIIlI[0];
        char[] var10 = var17.toCharArray();
        int var5 = var10.length;
        int var11 = lllllllIIIlI[0];
        while (e.lIIlIlIIlllIIIl(var11, var5)) {
            char var21 = var10[var11];
            var3.append((char)(var21 ^ var6[var15 % var6.length]));
            0;
            ++var15;
            ++var11;
            0;
            if (2 != ((0x45 ^ 0x29 ^ (0x19 ^ 0x16)) & (0x6A ^ 0x2E ^ (0xB ^ 0x2C) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIIlIlIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIllIllIl(Object object) {
        return object == null;
    }

    public boolean run() {
        e var8;
        if (e.lIIlIlIIllIlIll(Combat.getCurrentHealth(), this.v.eatAt()) && e.lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        if (e.lIIlIlIIllIlIll(var8.v.eatAt(), Combat.getCurrentHealth())) {
            Item var12 = Inventory.getFirst(item -> {
                int n2;
                if (e.lIIlIlIIllIllll(item.getId(), this.v.foodID())) {
                    String[] stringArray = new String[lllllllIIIlI[1]];
                    stringArray[e.lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[6]];
                    if (e.lIIlIlIIlllIIII(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIlI[1];
                        0;
                        if (2 >= 1) return n2 != 0;
                        return ((0x8B ^ 0x8F ^ (0x7E ^ 0x46)) & (0x1F ^ 0x73 ^ (0x4C ^ 0x1C) ^ -1)) != 0;
                    }
                }
                n2 = lllllllIIIlI[0];
                return n2 != 0;
            });
            if (e.lIIlIlIIllIllIl(var12)) {
                Log.info((String)lllllllIIIIl[lllllllIIIlI[0]]);
                return lllllllIIIlI[0];
            }
            var12.interact(lllllllIIIIl[lllllllIIIlI[1]]);
            var8.sleep(lllllllIIIlI[2]);
            return lllllllIIIlI[1];
        }
        if (e.lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        System.out.println("time until anti: " + Duration.between(var8.x, Instant.now()).toSeconds());
        if (e.lIIlIlIIllIlllI(e.lIIlIlIIllIlIlI(Duration.between(var8.x, Instant.now()).toSeconds(), var8.w.toSeconds()))) {
            Item var12 = Inventory.getFirst(item -> {
                int n2;
                if (e.lIIlIlIIlllIIII(item.getName().startsWith(this.v.antiPoison()) ? 1 : 0)) {
                    String[] stringArray = new String[lllllllIIIlI[1]];
                    stringArray[e.lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[2]];
                    if (e.lIIlIlIIlllIIII(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIlI[1];
                        0;
                        if (-2 <= 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllllllIIIlI[0];
                return n2 != 0;
            });
            if (e.lIIlIlIIllIllIl(var12)) {
                Log.info((String)lllllllIIIIl[lllllllIIIlI[3]]);
                return lllllllIIIlI[0];
            }
            var12.interact(lllllllIIIIl[lllllllIIIlI[4]]);
            var8.sleep(lllllllIIIlI[3]);
            return lllllllIIIlI[1];
        }
        return lllllllIIIlI[0];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (e.lIIlIlIIllIllll(varbitChanged.getVarpId(), lllllllIIIlI[5])) {
            this.x = Instant.now();
        }
    }
}

