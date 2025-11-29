/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum;

/* TASK: Drinking brews -> DrinkingbrewsTask */
@TaskDesc(name="Drinking brews", priority=25)
public class DrinkingBrewsTask
extends u_Unknown {
    private /* synthetic */ w ae;
    private static /* synthetic */ String[] lIlIllIlllllI;
    private static /* synthetic */ int[] lIlIllIllllll;

    public v() {
        this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.NONE;
    }

    private static boolean llIIIIIlllIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIIIIlllIIlll(String var2, String var6) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var11 = var6.toCharArray();
        int var12 = lIlIllIllllll[0];
        char[] var5 = var2.toCharArray();
        int var15 = var5.length;
        int var3 = lIlIllIllllll[0];
        while (v.llIIIIIlllIlIlI(var3, var15)) {
            char var14 = var5[var3];
            var13.append((char)(var14 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var3;
            0;
            if ((0x64 ^ 0x60) > 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean llIIIIIlllIllII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        v var16;
        if (v.llIIIIIlllIlIlI(Combat.getCurrentHealth(), this.i.eatAt())) {
            this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.BREWING;
            0;
            if (((30 + 177 - 99 + 145 ^ 22 + 29 - -37 + 93) & (150 + 177 - 280 + 185 ^ 105 + 118 - 186 + 123 ^ -1)) != 0) {
                return ((0x6D ^ 1 ^ (0xC0 ^ 0xAB)) & (158 + 147 - 140 + 1 ^ 102 + 67 - 80 + 72 ^ -1)) != 0;
            }
        } else if (v.llIIIIIlllIlIll(Combat.getMissingHealth()) && v.llIIIIIlllIllII(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH))) {
            var16.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.RESTORING;
            0;
            if (-(0x7A ^ 0x72 ^ (0x23 ^ 0x2F)) > 0) {
                return ((0x1A ^ 0x7E ^ (0x46 ^ 0x1E)) & (0x1A ^ 0x74 ^ (0x32 ^ 0x60) ^ -1)) != 0;
            }
        } else if (v.llIIIIIlllIllIl((Object)var16.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.RESTORING)) {
            var16.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.NONE;
        }
        if (v.llIIIIIlllIllIl((Object)var16.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.NONE)) {
            return lIlIllIllllll[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            String string;
            String string2 = item.getName();
            if (v.llIIIIIlllIllIl((Object)this.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.WEnum.BREWING)) {
                string = lIlIllIlllllI[lIlIllIllllll[1]];
                0;
                if (1 <= -1) {
                    return ((173 + 173 - 312 + 162 ^ 157 + 138 - 111 + 11) & (0x63 ^ 0x64 ^ (0x2F ^ 9) & ~(0x7B ^ 0x5D) ^ -1)) != 0;
                }
            } else {
                string = lIlIllIlllllI[lIlIllIllllll[2]];
            }
            return string2.contains(string);
        });
        if (v.llIIIIIlllIlllI(var8)) {
            return lIlIllIllllll[0];
        }
        var1_1.interact(lIlIllIlllllI[lIlIllIllllll[0]]);
        return lIlIllIllllll[1];
    }

    private static void llIIIIIlllIlIII() {
        lIlIllIlllllI = new String[lIlIllIllllll[3]];
        v.lIlIllIlllllI[v.lIlIllIllllll[0]] = v."Drink";
        v.lIlIllIlllllI[v.lIlIllIllllll[1]] = v."Saradomin brew";
        v.lIlIllIlllllI[v.lIlIllIllllll[2]] = v."Super restore";
    }

    private static String llIIIIIlllIIllI(String var4, String var9) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIllIllllll[2], var7);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        v.llIIIIIlllIlIIl();
        v.llIIIIIlllIlIII();
    }

    private static void llIIIIIlllIlIIl() {
        lIlIllIllllll = new int[4];
        v.lIlIllIllllll[0] = (0xBF ^ 0xC1 ^ (0xAD ^ 0xC3)) & (0x43 ^ 2 ^ (0x53 ^ 2) ^ -1);
        v.lIlIllIllllll[1] = 1;
        v.lIlIllIllllll[2] = 2;
        v.lIlIllIllllll[3] = 3;
    }

    private static boolean llIIIIIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlllIlllI(Object object) {
        return object == null;
    }

    private static boolean llIIIIIlllIlIll(int n2) {
        return n2 <= 0;
    }
}

