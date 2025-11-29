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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w;

@TaskDesc(name="Drinking brews", priority=25)
public class v
extends u {
    private /* synthetic */ w ae;
    private static /* synthetic */ String[] lIlIllIlllllI;
    private static /* synthetic */ int[] lIlIllIllllll;

    public v() {
        this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE;
    }

    private static boolean llIIIIIlllIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIIIIlllIIlll(String llllllllllllllIllIlIIIIlIlllllII, String llllllllllllllIllIlIIIIllIIIIIII) {
        llllllllllllllIllIlIIIIlIlllllII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIIlIlllllll = new StringBuilder();
        char[] llllllllllllllIllIlIIIIlIllllllI = llllllllllllllIllIlIIIIllIIIIIII.toCharArray();
        int llllllllllllllIllIlIIIIlIlllllIl = lIlIllIllllll[0];
        char[] llllllllllllllIllIlIIIIlIlllIlll = llllllllllllllIllIlIIIIlIlllllII.toCharArray();
        int llllllllllllllIllIlIIIIlIlllIllI = llllllllllllllIllIlIIIIlIlllIlll.length;
        int llllllllllllllIllIlIIIIlIlllIlIl = lIlIllIllllll[0];
        while (v.llIIIIIlllIlIlI(llllllllllllllIllIlIIIIlIlllIlIl, llllllllllllllIllIlIIIIlIlllIllI)) {
            char llllllllllllllIllIlIIIIllIIIIIlI = llllllllllllllIllIlIIIIlIlllIlll[llllllllllllllIllIlIIIIlIlllIlIl];
            llllllllllllllIllIlIIIIlIlllllll.append((char)(llllllllllllllIllIlIIIIllIIIIIlI ^ llllllllllllllIllIlIIIIlIllllllI[llllllllllllllIllIlIIIIlIlllllIl % llllllllllllllIllIlIIIIlIllllllI.length]));
            "".length();
            ++llllllllllllllIllIlIIIIlIlllllIl;
            ++llllllllllllllIllIlIIIIlIlllIlIl;
            "".length();
            if ((0x64 ^ 0x60) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIIlIlllllll);
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
        v llllllllllllllIllIlIIIIllIIlIIIl;
        if (v.llIIIIIlllIlIlI(Combat.getCurrentHealth(), this.i.eatAt())) {
            this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.BREWING;
            "".length();
            if (((30 + 177 - 99 + 145 ^ 22 + 29 - -37 + 93) & (150 + 177 - 280 + 185 ^ 105 + 118 - 186 + 123 ^ -" ".length())) != 0) {
                return ((0x6D ^ 1 ^ (0xC0 ^ 0xAB)) & (158 + 147 - 140 + 1 ^ 102 + 67 - 80 + 72 ^ -" ".length())) != 0;
            }
        } else if (v.llIIIIIlllIlIll(Combat.getMissingHealth()) && v.llIIIIIlllIllII(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH))) {
            llllllllllllllIllIlIIIIllIIlIIIl.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.RESTORING;
            "".length();
            if (-(0x7A ^ 0x72 ^ (0x23 ^ 0x2F)) > 0) {
                return ((0x1A ^ 0x7E ^ (0x46 ^ 0x1E)) & (0x1A ^ 0x74 ^ (0x32 ^ 0x60) ^ -" ".length())) != 0;
            }
        } else if (v.llIIIIIlllIllIl((Object)llllllllllllllIllIlIIIIllIIlIIIl.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.RESTORING)) {
            llllllllllllllIllIlIIIIllIIlIIIl.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE;
        }
        if (v.llIIIIIlllIllIl((Object)llllllllllllllIllIlIIIIllIIlIIIl.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE)) {
            return lIlIllIllllll[0];
        }
        Item llllllllllllllIllIlIIIIllIIlIIII = Inventory.getFirst(item -> {
            String string;
            String string2 = item.getName();
            if (v.llIIIIIlllIllIl((Object)this.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.BREWING)) {
                string = lIlIllIlllllI[lIlIllIllllll[1]];
                "".length();
                if (" ".length() <= -" ".length()) {
                    return ((173 + 173 - 312 + 162 ^ 157 + 138 - 111 + 11) & (0x63 ^ 0x64 ^ (0x2F ^ 9) & ~(0x7B ^ 0x5D) ^ -" ".length())) != 0;
                }
            } else {
                string = lIlIllIlllllI[lIlIllIllllll[2]];
            }
            return string2.contains(string);
        });
        if (v.llIIIIIlllIlllI(llllllllllllllIllIlIIIIllIIlIIII)) {
            return lIlIllIllllll[0];
        }
        var1_1.interact(lIlIllIlllllI[lIlIllIllllll[0]]);
        return lIlIllIllllll[1];
    }

    private static void llIIIIIlllIlIII() {
        lIlIllIlllllI = new String[lIlIllIllllll[3]];
        v.lIlIllIlllllI[v.lIlIllIllllll[0]] = v.llIIIIIlllIIllI("JPQfwE3LB1g=", "GFFCl");
        v.lIlIllIlllllI[v.lIlIllIllllll[1]] = v.llIIIIIlllIIllI("MTUe0w1E9ZEHAhVDYHvJQQ==", "mMbnE");
        v.lIlIllIlllllI[v.lIlIllIllllll[2]] = v.llIIIIIlllIIlll("FQQ/FAJmAyoCBCkDKg==", "FqOqp");
    }

    private static String llIIIIIlllIIllI(String llllllllllllllIllIlIIIIlIllIlIlI, String llllllllllllllIllIlIIIIlIllIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIlIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIlIllIlllI.init(lIlIllIllllll[2], llllllllllllllIllIlIIIIlIllIllll);
            return new String(llllllllllllllIllIlIIIIlIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIlIllIllIl) {
            llllllllllllllIllIlIIIIlIllIllIl.printStackTrace();
            return null;
        }
    }

    static {
        v.llIIIIIlllIlIIl();
        v.llIIIIIlllIlIII();
    }

    private static void llIIIIIlllIlIIl() {
        lIlIllIllllll = new int[4];
        v.lIlIllIllllll[0] = (0xBF ^ 0xC1 ^ (0xAD ^ 0xC3)) & (0x43 ^ 2 ^ (0x53 ^ 2) ^ -" ".length());
        v.lIlIllIllllll[1] = " ".length();
        v.lIlIllIllllll[2] = "  ".length();
        v.lIlIllIllllll[3] = "   ".length();
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

