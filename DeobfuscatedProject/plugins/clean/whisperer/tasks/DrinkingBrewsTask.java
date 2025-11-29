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
package gg.squire.whisperer.tasks;

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
import gg.squire.whisperer.tasks.WhispererTaskBase;
import gg.squire.whisperer.tasks.GameEnum;

@TaskDesc(name="Drinking brews", priority=25)
public class DrinkingBrewsTask
extends WhispererTaskBase {
    private  w ae;

    public DrinkingBrewsTask() {
        this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE;
    }

    private static boolean llIIIIIlllIllIl(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var1);
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
        v var2;
        if (v.llIIIIIlllIlIlI(Combat.getCurrentHealth(), this.i.eatAt())) {
            this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.BREWING;

            if (((30 + 177 - 99 + 145 ^ 22 + 29 - -37 + 93) & (150 + 177 - 280 + 185 ^ 105 + 118 - 186 + 123 ^ -1)) != 0) {
                return ((0x6D ^ 1 ^ (0xC0 ^ 0xAB)) & (158 + 147 - 140 + 1 ^ 102 + 67 - 80 + 72 ^ -1)) != 0;
            }
        } else if (v.llIIIIIlllIlIll(Combat.getMissingHealth()) && v.llIIIIIlllIllII(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH))) {
            var2.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.RESTORING;

            if (-(0x7A ^ 0x72 ^ (0x23 ^ 0x2F)) > 0) {
                return ((0x1A ^ 0x7E ^ (0x46 ^ 0x1E)) & (0x1A ^ 0x74 ^ (0x32 ^ 0x60) ^ -1)) != 0;
            }
        } else if (v.llIIIIIlllIllIl((Object)var2.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.RESTORING)) {
            var2.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE;
        }
        if (v.llIIIIIlllIllIl((Object)var2.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE)) {
            return lIlIllIllllll[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            String string;
            String string2 = item.getName();
            if (v.llIIIIIlllIllIl((Object)this.ae, (Object)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.BREWING)) {
                string = lIlIllIlllllI[lIlIllIllllll[1]];

                if (1 <= -1) {
                    return ((173 + 173 - 312 + 162 ^ 157 + 138 - 111 + 11) & (0x63 ^ 0x64 ^ (0x2F ^ 9) & ~(0x7B ^ 0x5D) ^ -1)) != 0;
                }
            } else {
                string = lIlIllIlllllI[lIlIllIllllll[2]];
            }
            return string2.contains(string);
        });
        if (v.llIIIIIlllIlllI(var3)) {
            return lIlIllIllllll[0];
        }
        var1_1.interact(lIlIllIlllllI[lIlIllIllllll[0]]);
        return lIlIllIllllll[1];
    }

    private static void llIIIIIlllIlIII() {
        lIlIllIlllllI = new String[lIlIllIllllll[3]];
        v.lIlIllIlllllI[v.lIlIllIllllll[0]] = "Drink";
        v.lIlIllIlllllI[v.lIlIllIllllll[1]] = "Saradomin brew";
        v.lIlIllIlllllI[v.lIlIllIllllll[2]] = "Super restore";
    }

    static {
        v.llIIIIIlllIlIIl();
        v.llIIIIIlllIlIII();
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

