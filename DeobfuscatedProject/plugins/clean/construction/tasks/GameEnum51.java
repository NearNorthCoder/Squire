/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  javax.annotation.Nullable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 */
package gg.squire.construction.tasks;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;

public final class GameEnum51
extends Enum<g> {
    public static final  /* enum */ g MELEE;
    public static final  /* enum */ g RANGE;
    private static final  g[] $VALUES;
    private final  Color color;
    
    public static final  /* enum */ g MAGE;
    private final  Skill type;
    private static final  Map<Integer, g> MAP;
    private final  int npcId;

        return String.valueOf(llIlIIllIllIIIl);
    }

    public Skill L() {
        return this.type;
    }

    public int K() {
        return this.npcId;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void llIlIIlllIIIIII;
            g.llIIllllII();
            g.llIIlllIll();
            RANGE = new GameEnum51(lllIlllI[1], Skill.RANGED, Color.GREEN);
            MAGE = new GameEnum51(lllIlllI[3], Skill.MAGIC, Color.BLUE);
            MELEE = new GameEnum51(lllIlllI[5], Skill.ATTACK, Color.RED);
            g[] gArray = new g[lllIlllI[6]];
            gArray[g.lllIlllI[0]] = RANGE;
            gArray[g.lllIlllI[2]] = MAGE;
            gArray[g.lllIlllI[4]] = MELEE;
            $VALUES = gArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            g[] gArray2 = g.values();
            int n2 = gArray2.length;
            int llIlIIllIllllll = lllIlllI[0];
            while (g.llIIllllIl(llIlIIllIllllll, (int)llIlIIlllIIIIII)) {
                void llIlIIlllIIIIlI;
                void llIlIIlllIIIIIl;
                void llIlIIllIlllllI = llIlIIlllIIIIIl[llIlIIllIllllll];
                llIlIIlllIIIIlI.put((Object)llIlIIllIlllllI.K(), (Object)llIlIIllIlllllI);

                ++llIlIIllIllllll;

                if (3 == 3) continue;
                break block1;
            }
            MAP = builder.build();
        }
    }

    private GameEnum51(int n3, Skill skill, Color color) {
        this.npcId = n3;
        this.type = skill;
        this.color = color;
    }

    @Nullable
    public static g b(NPC nPC) {
        return MAP.get(nPC.getId());
    }

    public Color M() {
        return this.color;
    }

    private static void llIIlllIll() {
        lllIllIl = new String[lllIlllI[6]];
        g.lllIllIl[g.lllIlllI[0]] = "RANGE";
        g.lllIllIl[g.lllIlllI[2]] = "MAGE";
        g.lllIllIl[g.lllIlllI[4]] = "MELEE";
    }

    private static boolean llIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static g e(int n2) {
        return MAP.get(n2);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum51.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }
}

