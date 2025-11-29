/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Venom -> CureVenomTask */
@TaskDesc(name="Venom", priority=110, register=true)
public class J
extends w {
    private static /* synthetic */ int[] lIlIllIIlllIl;
    private static /* synthetic */ String[] lIlIllIIlllII;
    private static final /* synthetic */ Duration co;
    private /* synthetic */ Instant cp;

    @Inject
    protected J(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (J.llIIIIIIlllIIlI(varbitChanged.getVarpId(), lIlIllIIlllIl[3])) {
            this.cp = Instant.now();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        J var21;
        int var13;
        int n2;
        if (!J.llIIIIIIllIllIl(Combat.isVenomed() ? 1 : 0) || J.llIIIIIIllIlllI(Combat.isPoisoned() ? 1 : 0)) {
            n2 = lIlIllIIlllIl[0];
            0;
            
            }
        } else {
            n2 = lIlIllIIlllIl[1];
        }
        if (!J.llIIIIIIllIlllI(var13 = n2) || J.llIIIIIIllIllll(var21.cp)) {
            return lIlIllIIlllIl[1];
        }
        if (J.llIIIIIIlllIIII(J.llIIIIIIllIllII(Duration.between(var21.cp, Instant.now()).toSeconds(), co.toSeconds()))) {
            return lIlIllIIlllIl[1];
        }
        int[] nArray = new int[lIlIllIIlllIl[0]];
        nArray[J.lIlIllIIlllIl[1]] = lIlIllIIlllIl[2];
        if (J.llIIIIIIlllIIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlllIl[1];
        }
        Item var20 = Inventory.getFirst(item -> {
            boolean bl;
            if (!J.llIIIIIIllIllIl(item.getName().toLowerCase().contains(lIlIllIIlllII[lIlIllIIlllIl[0]]) ? 1 : 0) || !J.llIIIIIIllIllIl(item.getName().contains(lIlIllIIlllII[lIlIllIIlllIl[4]]) ? 1 : 0) || J.llIIIIIIllIlllI(item.getName().toLowerCase().contains(lIlIllIIlllII[lIlIllIIlllIl[5]]) ? 1 : 0)) {
                Item var14;
                String[] stringArray = new String[lIlIllIIlllIl[0]];
                stringArray[J.lIlIllIIlllIl[1]] = lIlIllIIlllII[lIlIllIIlllIl[6]];
                if (J.llIIIIIIllIlllI(var14.hasAction(stringArray) ? 1 : 0)) {
                    bl = lIlIllIIlllIl[0];
                    0;
                    if (-1 < 3) return bl;
                    return false;
                }
            }
            bl = lIlIllIIlllIl[1];
            return bl;
        });
        if (J.llIIIIIIllIllll(var20)) {
            return lIlIllIIlllIl[1];
        }
        var2_2.interact(lIlIllIIlllII[lIlIllIIlllIl[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlllIl[0];
    }

    private static boolean llIIIIIIllIllll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIlllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIIIllIIlll(String var8, String var15) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIllIIlllIl[4], var6);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIllIlIII(String var1, String var18) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlIllIIlllIl[8]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lIlIllIIlllIl[4], var5);
            return new String(var23.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIllIlIIl(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var9 = var11.toCharArray();
        int var7 = lIlIllIIlllIl[1];
        char[] var22 = var12.toCharArray();
        int var19 = var22.length;
        int var16 = lIlIllIIlllIl[1];
        while (J.llIIIIIIlllIIll(var16, var19)) {
            char var4 = var22[var16];
            var3.append((char)(var4 ^ var9[var7 % var9.length]));
            0;
            ++var7;
            ++var16;
            0;
            if (((0x4D ^ 0x3A ^ (0x33 ^ 0x52)) & (0x58 ^ 0x3A ^ (0x4E ^ 0x3A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llIIIIIIlllIIIl(Object object) {
        return object != null;
    }

    static {
        J.llIIIIIIllIlIll();
        J.llIIIIIIllIlIlI();
        co = Duration.ofSeconds(5L);
    }

    private static boolean llIIIIIIllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIlllIIII(int n2) {
        return n2 < 0;
    }

    private static void llIIIIIIllIlIlI() {
        lIlIllIIlllII = new String[lIlIllIIlllIl[7]];
        J.lIlIllIIlllII[J.lIlIllIIlllIl[1]] = J."Drink";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[0]] = J."poison";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[4]] = J."dote";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[5]] = J."venom";
        J.lIlIllIIlllII[J.lIlIllIIlllIl[6]] = J."Drink";
    }

    private static void llIIIIIIllIlIll() {
        lIlIllIIlllIl = new int[9];
        J.lIlIllIIlllIl[0] = 1;
        J.lIlIllIIlllIl[1] = (0xF3 ^ 0xB1) & ~(0xCB ^ 0x89);
        J.lIlIllIIlllIl[2] = 0xFFFF8FDB & 0x75ED;
        J.lIlIllIIlllIl[3] = 0xBC ^ 0xB2 ^ (0x6E ^ 6);
        J.lIlIllIIlllIl[4] = 2;
        J.lIlIllIIlllIl[5] = 3;
        J.lIlIllIIlllIl[6] = 0xC4 ^ 0xC0;
        J.lIlIllIIlllIl[7] = 0x26 ^ 0x44 ^ (0xCB ^ 0xAC);
        J.lIlIllIIlllIl[8] = 0x6E ^ 0x66;
    }

    private static boolean llIIIIIIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIIllIlllI(int n2) {
        return n2 != 0;
    }

    private static int llIIIIIIllIllII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

