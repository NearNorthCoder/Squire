/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Drinking Antifire Potion -> DrinkAntifireTask */
@TaskDesc(name="Drinking Antifire Potion", priority=110)
public class DrinkingAntifirePotionTask
extends w_Unknown {
    private static /* synthetic */ String[] lIlIllIIlIllI;
    private static /* synthetic */ int[] lIlIllIIlIlll;

    private static boolean llIIIIIIlIlIIll(Object object) {
        return object != null;
    }

    private static String llIIIIIIlIIlllI(String var9, String var15) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlIllIIlIlll[5]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIllIIlIlll[3], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIlIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        E var17;
        if (!E.llIIIIIIlIlIIIl(Combat.isSuperAntifired() ? 1 : 0) || E.llIIIIIIlIlIIlI(Combat.isAntifired() ? 1 : 0)) {
            return lIlIllIIlIlll[0];
        }
        NPC var3 = var17.cg.A();
        if (E.llIIIIIIlIlIIll(var3)) {
            return lIlIllIIlIlll[0];
        }
        int[] nArray = new int[lIlIllIIlIlll[1]];
        nArray[E.lIlIllIIlIlll[0]] = lIlIllIIlIlll[2];
        if (E.llIIIIIIlIlIIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlIlll[0];
        }
        Item var16 = Inventory.getFirst(item -> {
            int n2;
            if (E.llIIIIIIlIlIIlI(item.getName().toLowerCase().contains(lIlIllIIlIllI[lIlIllIIlIlll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIlIlll[1]];
                stringArray[E.lIlIllIIlIlll[0]] = lIlIllIIlIllI[lIlIllIIlIlll[3]];
                if (E.llIIIIIIlIlIIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIIlIlll[1];
                    0;
                    if (((139 + 148 - 172 + 35 ^ 39 + 140 - 148 + 112) & (0x38 ^ 0x45 ^ (0xD ^ 0x69) ^ -1)) == 0) return n2 != 0;
                    return ((62 + 14 - -11 + 57 ^ 109 + 140 - 64 + 8) & (0xEA ^ 0x83 ^ (0x8A ^ 0xB2) ^ -1)) != 0;
                }
            }
            n2 = lIlIllIIlIlll[0];
            return n2 != 0;
        });
        if (E.llIIIIIIlIlIlII(var16)) {
            return lIlIllIIlIlll[0];
        }
        var2_2.interact(lIlIllIIlIllI[lIlIllIIlIlll[0]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlIlll[1];
    }

    private static void llIIIIIIlIIllll() {
        lIlIllIIlIllI = new String[lIlIllIIlIlll[4]];
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[0]] = E."Drink";
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[1]] = E."antifire";
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[3]] = E."Drink";
    }

    private static boolean llIIIIIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    private static String llIIIIIIlIIllIl(String var2, String var10) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var5 = var10.toCharArray();
        int var8 = lIlIllIIlIlll[0];
        char[] var1 = var2.toCharArray();
        int var11 = var1.length;
        int var4 = lIlIllIIlIlll[0];
        while (E.llIIIIIIlIlIlIl(var4, var11)) {
            char var12 = var1[var4];
            var6.append((char)(var12 ^ var5[var8 % var5.length]));
            0;
            ++var8;
            ++var4;
            0;
            if ((58 + 136 - 53 + 10 ^ 33 + 122 - 119 + 111) > 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void llIIIIIIlIlIIII() {
        lIlIllIIlIlll = new int[6];
        E.lIlIllIIlIlll[0] = (0x48 ^ 4) & ~(0x39 ^ 0x75);
        E.lIlIllIIlIlll[1] = 1;
        E.lIlIllIIlIlll[2] = -(0xFFFFF7BF & 0x6A65) & (0xFFFFF7ED & 0x6FFF);
        E.lIlIllIIlIlll[3] = 2;
        E.lIlIllIIlIlll[4] = 3;
        E.lIlIllIIlIlll[5] = 0x6D ^ 0x65;
    }

    private static boolean llIIIIIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    protected E(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    static {
        E.llIIIIIIlIlIIII();
        E.llIIIIIIlIIllll();
    }
}

