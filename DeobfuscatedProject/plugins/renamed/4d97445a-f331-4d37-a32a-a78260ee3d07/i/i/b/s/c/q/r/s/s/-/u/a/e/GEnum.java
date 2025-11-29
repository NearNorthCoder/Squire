/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  javax.annotation.Nullable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

public final class GEnum
extends Enum<g> {
    public static final /* synthetic */ /* enum */ g MELEE;
    public static final /* synthetic */ /* enum */ g RANGE;
    private static final /* synthetic */ g[] $VALUES;
    private final /* synthetic */ Color color;
    private static /* synthetic */ int[] lllIlllI;
    public static final /* synthetic */ /* enum */ g MAGE;
    private final /* synthetic */ Skill type;
    private static final /* synthetic */ Map<Integer, g> MAP;
    private final /* synthetic */ int npcId;
    private static /* synthetic */ String[] lllIllIl;

    private static String llIIlllIII(String llIlIIllIlIlllI, String llIlIIllIlIllIl) {
        llIlIIllIlIlllI = new String(Base64.getDecoder().decode(llIlIIllIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIllIllIIIl = new StringBuilder();
        char[] llIlIIllIllIIII = llIlIIllIlIllIl.toCharArray();
        int llIlIIllIlIllll = lllIlllI[0];
        char[] llIlIIllIlIlIIl = llIlIIllIlIlllI.toCharArray();
        int llIlIIllIlIlIII = llIlIIllIlIlIIl.length;
        int llIlIIllIlIIlll = lllIlllI[0];
        while (g.llIIllllIl(llIlIIllIlIIlll, llIlIIllIlIlIII)) {
            char llIlIIllIllIlII = llIlIIllIlIlIIl[llIlIIllIlIIlll];
            llIlIIllIllIIIl.append((char)(llIlIIllIllIlII ^ llIlIIllIllIIII[llIlIIllIlIllll % llIlIIllIllIIII.length]));
            0;
            ++llIlIIllIlIllll;
            ++llIlIIllIlIIlll;
            0;
            if (2 != 0) continue;
            return null;
        }
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
            RANGE = new g(lllIlllI[1], Skill.RANGED, Color.GREEN);
            MAGE = new g(lllIlllI[3], Skill.MAGIC, Color.BLUE);
            MELEE = new g(lllIlllI[5], Skill.ATTACK, Color.RED);
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
                0;
                ++llIlIIllIllllll;
                0;
                if (3 == 3) continue;
                break block1;
            }
            MAP = builder.build();
        }
    }

    private static String llIIlllIIl(String llIlIIllIIIllll, String llIlIIllIIIlllI) {
        try {
            SecretKeySpec llIlIIllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIllIIlIIll = Cipher.getInstance("Blowfish");
            llIlIIllIIlIIll.init(lllIlllI[4], llIlIIllIIlIlII);
            return new String(llIlIIllIIlIIll.doFinal(Base64.getDecoder().decode(llIlIIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIllIIlIIlI) {
            llIlIIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private g(int n3, Skill skill, Color color) {
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

    private static void llIIllllII() {
        lllIlllI = new int[8];
        g.lllIlllI[0] = (0xF8 ^ 0xC6) & ~(0xFA ^ 0xC4);
        g.lllIlllI[1] = 0xFFFFFFFF & 0x16EB;
        g.lllIlllI[2] = 1;
        g.lllIlllI[3] = 0xFFFFDEED & 0x37FE;
        g.lllIlllI[4] = 2;
        g.lllIlllI[5] = -(0xFFFFE083 & 0x7F7F) & (0xFFFFFFFF & 0x76EF);
        g.lllIlllI[6] = 3;
        g.lllIlllI[7] = 0x65 ^ 0x6D;
    }

    private static String llIIlllIlI(String llIlIIllIIllllI, String llIlIIllIIllIll) {
        try {
            SecretKeySpec llIlIIllIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIllIIllIll.getBytes(StandardCharsets.UTF_8)), lllIlllI[7]), "DES");
            Cipher llIlIIllIlIIIII = Cipher.getInstance("DES");
            llIlIIllIlIIIII.init(lllIlllI[4], llIlIIllIlIIIIl);
            return new String(llIlIIllIlIIIII.doFinal(Base64.getDecoder().decode(llIlIIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIllIIlllll) {
            llIlIIllIIlllll.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIll() {
        lllIllIl = new String[lllIlllI[6]];
        g.lllIllIl[g.lllIlllI[0]] = g."RANGE";
        g.lllIllIl[g.lllIlllI[2]] = g."MAGE";
        g.lllIllIl[g.lllIlllI[4]] = g."MELEE";
    }

    private static boolean llIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static g e(int n2) {
        return MAP.get(n2);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }
}

