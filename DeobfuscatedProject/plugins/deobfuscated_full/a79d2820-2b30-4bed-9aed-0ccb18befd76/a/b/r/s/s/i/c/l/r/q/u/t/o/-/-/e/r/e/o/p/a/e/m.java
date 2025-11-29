/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

public abstract class m
extends a {
    private static /* synthetic */ int[] lIlIllllllll;
    private static /* synthetic */ String[] lIlIlllllllI;

    static {
        m.lllIIIllIIIllI();
        m.lllIIIllIIIlIl();
    }

    private static boolean lllIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllIIIlll(Object object) {
        return object != null;
    }

    public boolean m() {
        if (m.lllIIIllIIlIII(Combat.getSpecEnergy(), lIlIllllllll[2])) {
            return lIlIllllllll[0];
        }
        if (m.lllIIIllIIlIIl(Combat.getMissingHealth())) {
            return lIlIllllllll[0];
        }
        if (m.lllIIIllIIlIII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER))) {
            return lIlIllllllll[0];
        }
        if (m.lllIIIllIIlIII(Movement.getRunEnergy(), lIlIllllllll[3])) {
            return lIlIllllllll[0];
        }
        return lIlIllllllll[1];
    }

    private static void lllIIIllIIIlIl() {
        lIlIlllllllI = new String[lIlIllllllll[4]];
        m.lIlIlllllllI[m.lIlIllllllll[1]] = m."Portal";
        m.lIlIlllllllI[m.lIlIllllllll[0]] = m."Lock";
    }

    private static String lllIIIllIIIIll(String var4, String var12) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var5 = var12.toCharArray();
        int var13 = lIlIllllllll[1];
        char[] var10 = var4.toCharArray();
        int var2 = var10.length;
        int var6 = lIlIllllllll[1];
        while (m.lllIIIllIIlIII(var6, var2)) {
            char var8 = var10[var6];
            var11.append((char)(var8 ^ var5[var13 % var5.length]));
            0;
            ++var13;
            ++var6;
            0;
            if ((138 + 1 - 99 + 145 ^ 38 + 152 - 4 + 3) == (106 + 31 - 62 + 57 ^ 101 + 99 - 136 + 64)) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    public boolean l() {
        boolean bl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (m.lllIIIllIIlIlI(tileObject.getName().equals(lIlIlllllllI[lIlIllllllll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllllllll[0]];
                stringArray[m.lIlIllllllll[1]] = lIlIlllllllI[lIlIllllllll[0]];
                if (m.lllIIIllIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllllllll[0];
                    0;
                    if (-1 <= 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIllllllll[1];
            return n2 != 0;
        });
        if (m.lllIIIllIIIlll(tileObject2)) {
            bl = lIlIllllllll[0];
            0;
            
            }
        } else {
            bl = lIlIllllllll[1];
        }
        return bl;
    }

    private static void lllIIIllIIIllI() {
        lIlIllllllll = new int[6];
        m.lIlIllllllll[0] = 1;
        m.lIlIllllllll[1] = (125 + 125 - 228 + 129 ^ 63 + 109 - 159 + 140) & (0x12 ^ 0x4B ^ (0xDB ^ 0x8C) ^ -1);
        m.lIlIllllllll[2] = 154 + 44 - 159 + 127 ^ 44 + 151 - 66 + 65;
        m.lIlIllllllll[3] = 0xF4 ^ 0xC6;
        m.lIlIllllllll[4] = 2;
        m.lIlIllllllll[5] = 0x98 ^ 0x90;
    }

    private static boolean lllIIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIllIIlIIl(int n2) {
        return n2 > 0;
    }

    private static String lllIIIllIIIlII(String var7, String var3) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlIllllllll[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIlIllllllll[4], var1);
            return new String(var14.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}

