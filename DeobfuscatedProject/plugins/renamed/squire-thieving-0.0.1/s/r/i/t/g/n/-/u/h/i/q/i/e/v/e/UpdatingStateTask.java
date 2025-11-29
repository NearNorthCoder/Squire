/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a_Unknown;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.EEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.FEnum;

/* TASK: Updating state -> UpdatingstateTask */
@TaskDesc(name="Updating state", priority=2147482310)
public class UpdatingStateTask
extends a_Unknown {
    private static /* synthetic */ String[] lIIlllIIIIlII;
    private static /* synthetic */ int[] lIIlllIIIIlIl;

    private static boolean lIllIIlIIlIllII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIIlIIlIIlIl() {
        lIIlllIIIIlII = new String[lIIlllIIIIlIl[10]];
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[0]] = B."Open";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[1]] = B."Eat";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[2]] = B."Drink";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[4]] = B."Eat";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[5]] = B."Drink";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[6]] = B."Eat";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[7]] = B."Drink";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[8]] = B."gem bag";
        B.lIIlllIIIIlII[B.lIIlllIIIIlIl[9]] = B."Open";
    }

    private static String lIllIIlIIlIIIll(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var21 = var4.toCharArray();
        int var1 = lIIlllIIIIlIl[0];
        char[] var23 = var3.toCharArray();
        int var17 = var23.length;
        int var15 = lIIlllIIIIlIl[0];
        while (B.lIllIIlIIlIlllI(var15, var17)) {
            char var20 = var23[var15];
            var13.append((char)(var20 ^ var21[var1 % var21.length]));
            0;
            ++var1;
            ++var15;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIllIIlIIlIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIIlIIlIIlII(String var18, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlllIIIIlIl[2], var11);
            return new String(var8.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIlIIllI() {
        lIIlllIIIIlIl = new int[11];
        B.lIIlllIIIIlIl[0] = (0xAB ^ 0x86 ^ 1) & (0xC ^ 0x67 ^ (0x3F ^ 0x78) ^ -1);
        B.lIIlllIIIIlIl[1] = 1;
        B.lIIlllIIIIlIl[2] = 2;
        B.lIIlllIIIIlIl[3] = 0xFFFFF697 & 0x5BFF;
        B.lIIlllIIIIlIl[4] = 3;
        B.lIIlllIIIIlIl[5] = 90 + 157 - 221 + 145 ^ 15 + 118 - 39 + 81;
        B.lIIlllIIIIlIl[6] = 0x2F ^ 0x25 ^ (0x12 ^ 0x1D);
        B.lIIlllIIIIlIl[7] = 0x38 ^ 0x3E;
        B.lIIlllIIIIlIl[8] = 0x3E ^ 0x39;
        B.lIIlllIIIIlIl[9] = 0x9B ^ 0x93;
        B.lIIlllIIIIlIl[10] = 0x82 ^ 0xBC ^ (0x94 ^ 0xA3);
    }

    private static boolean lIllIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIlIIlIIIlI(String var9, String var12) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIlIl[9]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lIIlllIIIIlIl[2], var5);
            return new String(var22.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIlIIl(Object object) {
        return object != null;
    }

    static {
        B.lIllIIlIIlIIllI();
        B.lIllIIlIIlIIlIl();
    }

    @Inject
    public B(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIlIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIIlIIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean l() {
        int var2;
        int n2;
        int var19;
        int n3;
        B var14;
        if (B.lIllIIlIIlIIlll(this.p.depositSeedVault() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        if (B.lIllIIlIIlIlIII(var14.p.pickpocketFoodAmount())) {
            return lIIlllIIIIlIl[0];
        }
        if (B.lIllIIlIIlIIlll(var14.o.j() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            int n2;
            if (B.lIllIIlIIlIIlll(item.getName().toLowerCase().contains(lIIlllIIIIlII[lIIlllIIIIlIl[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIlIl[1]];
                stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[9]];
                if (B.lIllIIlIIlIIlll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIIlIl[1];
                    0;
                    if (-1 != 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllIIIIlIl[0];
            return n2 != 0;
        });
        if (B.lIllIIlIIlIIlll(var14.p.gemBag() ? 1 : 0) && B.lIllIIlIIlIlIIl(var6)) {
            var6.interact(lIIlllIIIIlII[lIIlllIIIIlIl[0]]);
        }
        if (B.lIllIIlIIlIIlll(Inventory.contains(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[lIIlllIIIIlIl[1]];
                    stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[6]];
                    if (!B.lIllIIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIIlllIIIIlIl[1]];
                    stringArray2[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[7]];
                    if (!B.lIllIIlIIlIIlll(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = lIIlllIIIIlIl[1];
                0;
                if (null == null) return n2 != 0;
                return false;
            }
            n2 = lIIlllIIIIlIl[0];
            return n2 != 0;
        }) ? 1 : 0) && B.lIllIIlIIlIlIlI(Combat.getMissingHealth())) {
            n3 = lIIlllIIIIlIl[1];
            0;
            if (3 <= ((41 + 3 - -51 + 71 ^ 60 + 74 - 46 + 91) & (101 + 38 - 120 + 148 ^ 72 + 147 - 159 + 118 ^ -1))) {
                return ((0x27 ^ 0x73 ^ (0x36 ^ 0x26)) & (0x43 ^ 0x6D ^ (0xA9 ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            n3 = var19 = lIIlllIIIIlIl[0];
        }
        if (!B.lIllIIlIIlIlIll((Object)var14.p.pickpocketTarget(), (Object)f.VYRE) || B.lIllIIlIIlIllII((Object)var14.p.pickpocketTarget(), (Object)f.ELF)) {
            n2 = lIIlllIIIIlIl[1];
            0;
            if (((173 + 22 - 24 + 20 ^ 30 + 66 - -29 + 38) & (0x27 ^ 0x55 ^ (0x53 ^ 0x3D) ^ -1)) == (22 + 105 - 102 + 109 ^ 90 + 84 - 61 + 17)) {
                return ((0x3F ^ 0x22 ^ (0x56 ^ 0x5A)) & (0x5D ^ 0x24 ^ (0x55 ^ 0x3D) ^ -1)) != 0;
            }
        } else {
            n2 = lIIlllIIIIlIl[0];
        }
        if (B.lIllIIlIIlIIlll(var2 = n2) && B.lIllIIlIIlIllIl(Inventory.getFreeSlots(), lIIlllIIIIlIl[2])) {
            if (B.lIllIIlIIlIIlll(var19)) {
                String[] stringArray = new String[lIIlllIIIIlIl[2]];
                stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[1]];
                stringArray[B.lIIlllIIIIlIl[1]] = lIIlllIIIIlII[lIIlllIIIIlIl[2]];
                Inventory.getFirst(item -> {
                    int n2;
                    block3: {
                        block2: {
                            String[] stringArray = new String[lIIlllIIIIlIl[1]];
                            stringArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[4]];
                            if (!B.lIllIIlIIlIlIII(item.hasAction(stringArray) ? 1 : 0)) break block2;
                            String[] stringArray2 = new String[lIIlllIIIIlIl[1]];
                            stringArray2[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[5]];
                            if (!B.lIllIIlIIlIIlll(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                        }
                        n2 = lIIlllIIIIlIl[1];
                        0;
                        if (null == null) return n2 != 0;
                        return ((0x69 ^ 0x61 ^ (0xFC ^ 0xA3)) & (119 + 175 - 69 + 11 ^ 102 + 161 - 143 + 67 ^ -1)) != 0;
                    }
                    n2 = lIIlllIIIIlIl[0];
                    return n2 != 0;
                }).interact(stringArray);
                return lIIlllIIIIlIl[1];
            }
            var14.o.b(lIIlllIIIIlIl[1]);
            return lIIlllIIIIlIl[1];
        }
        if (B.lIllIIlIIlIIlll(Inventory.isFull() ? 1 : 0)) {
            var14.o.b(lIIlllIIIIlIl[1]);
            return lIIlllIIIIlIl[1];
        }
        if (B.lIllIIlIIlIlIll((Object)var14.p.pickpocketFood(), (Object)e.NONE)) {
            int[] nArray = new int[lIIlllIIIIlIl[1]];
            nArray[B.lIIlllIIIIlIl[0]] = var14.p.pickpocketFood().x();
            if (B.lIllIIlIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && B.lIllIIlIIlIllIl(Combat.getCurrentHealth(), var14.p.eatHP())) {
                var14.o.b(lIIlllIIIIlIl[1]);
                return lIIlllIIIIlIl[1];
            }
        }
        if (B.lIllIIlIIlIIlll(var14.p.dodgyNecklace() ? 1 : 0)) {
            int[] nArray = new int[lIIlllIIIIlIl[1]];
            nArray[B.lIIlllIIIIlIl[0]] = lIIlllIIIIlIl[3];
            if (B.lIllIIlIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                var14.o.b(lIIlllIIIIlIl[1]);
                return lIIlllIIIIlIl[1];
            }
        }
        return lIIlllIIIIlIl[0];
    }
}

