/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;

public final class GameEnum28
extends Enum<h> {
    private final  int levelRequired;
    
    private static final  h[] $VALUES;
    
    public static final  /* enum */ h DASHING_KEBBIT;
    public static final  /* enum */ h DARK_KEBBIT;
    public static final  /* enum */ h SPOTTED_KEBBIT;
    private final  int kebbitId;

    /*
     * WARNING - void declaration
     */
    public static NPC s() {
        void var1;
        int n2 = Skills.getLevel((Skill)Skill.HUNTER);
        ArrayList arrayList = new ArrayList();
        h[] hArray = h.values();
        int n3 = hArray.length;
        int var2 = lllIllIlllll[0];
        while (h.lIIIllIllIIllll(var2, (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            if (h.lIIIllIllIlIIII(var5.t(), (int)var3)) {

                if (1 <= 0) {
                    return null;
                }
            } else {
                void var6;
                var6.add(var5);

            }
            ++var2;

            if ((0x86 ^ 0x82) >= 0) continue;
            return null;
        }
        return NPCs.getNearest((int[])arrayList.stream().mapToInt(h::u).toArray());
    }

    public int u() {
        return this.kebbitId;
    }

        return String.valueOf(var7);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIIIllIllIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private GameEnum28(int n3, int n4) {
        this.levelRequired = n3;
        this.kebbitId = n4;
    }

    static {
        h.lIIIllIllIIlllI();
        h.lIIIllIllIIllIl();
        DASHING_KEBBIT = new GameEnum28(lllIllIlllll[1], lllIllIlllll[2]);
        DARK_KEBBIT = new GameEnum28(lllIllIlllll[4], lllIllIlllll[5]);
        SPOTTED_KEBBIT = new GameEnum28(lllIllIlllll[7], lllIllIlllll[8]);
        h[] hArray = new h[lllIllIlllll[9]];
        hArray[h.lllIllIlllll[0]] = DASHING_KEBBIT;
        hArray[h.lllIllIlllll[3]] = DARK_KEBBIT;
        hArray[h.lllIllIlllll[6]] = SPOTTED_KEBBIT;
        $VALUES = hArray;
    }

    public int t() {
        return this.levelRequired;
    }

    private static boolean lIIIllIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIllIIllIl() {
        lllIllIllllI = new String[lllIllIlllll[9]];
        h.lllIllIllllI[h.lllIllIlllll[0]] = "DASHING_KEBBIT";
        h.lllIllIllllI[h.lllIllIlllll[3]] = "DARK_KEBBIT";
        h.lllIllIllllI[h.lllIllIlllll[6]] = "SPOTTED_KEBBIT";
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum28.class, string);
    }
}

