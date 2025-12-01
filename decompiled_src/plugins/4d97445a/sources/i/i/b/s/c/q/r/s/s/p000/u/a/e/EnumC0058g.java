package i.i.b.s.c.q.r.s.s.p000.u.a.e;

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
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/g.class */
public final class EnumC0058g {
    public static final /* synthetic */ EnumC0058g MELEE;
    public static final /* synthetic */ EnumC0058g RANGE;
    private static final /* synthetic */ EnumC0058g[] $VALUES;
    private final /* synthetic */ Color color;
    private static /* synthetic */ int[] lllIlllI;
    public static final /* synthetic */ EnumC0058g MAGE;
    private final /* synthetic */ Skill type;
    private static final /* synthetic */ Map<Integer, EnumC0058g> MAP;
    private final /* synthetic */ int npcId;
    private static /* synthetic */ String[] lllIllIl;

    private static String llIIlllIII(String llIlIIllIllIIll, String llIlIIllIllIIlI) {
        String llIlIIllIllIIll2 = new String(Base64.getDecoder().decode(llIlIIllIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIllIllIIIl = new StringBuilder();
        char[] llIlIIllIllIIII = llIlIIllIllIIlI.toCharArray();
        int llIlIIllIlIllll = lllIlllI[0];
        char[] charArray = llIlIIllIllIIll2.toCharArray();
        int llIlIIllIlIlIII = charArray.length;
        int i2 = lllIlllI[0];
        while (llIIllllIl(i2, llIlIIllIlIlIII)) {
            llIlIIllIllIIIl.append((char) (charArray[i2] ^ llIlIIllIllIIII[llIlIIllIlIllll % llIlIIllIllIIII.length]));
            "".length();
            llIlIIllIlIllll++;
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llIlIIllIllIIIl);
    }

    public Skill L() {
        return this.type;
    }

    public int K() {
        return this.npcId;
    }

    static {
        llIIllllII();
        llIIlllIll();
        RANGE = new EnumC0058g(lllIllIl[lllIlllI[0]], lllIlllI[0], lllIlllI[1], Skill.RANGED, Color.GREEN);
        MAGE = new EnumC0058g(lllIllIl[lllIlllI[2]], lllIlllI[2], lllIlllI[3], Skill.MAGIC, Color.BLUE);
        MELEE = new EnumC0058g(lllIllIl[lllIlllI[4]], lllIlllI[4], lllIlllI[5], Skill.ATTACK, Color.RED);
        EnumC0058g[] enumC0058gArr = new EnumC0058g[lllIlllI[6]];
        enumC0058gArr[lllIlllI[0]] = RANGE;
        enumC0058gArr[lllIlllI[2]] = MAGE;
        enumC0058gArr[lllIlllI[4]] = MELEE;
        $VALUES = enumC0058gArr;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        EnumC0058g[] values = values();
        int length = values.length;
        int llIlIIllIllllll = lllIlllI[0];
        while (llIIllllIl(llIlIIllIllllll, length)) {
            EnumC0058g enumC0058g = values[llIlIIllIllllll];
            builder.put(Integer.valueOf(enumC0058g.K()), enumC0058g);
            "".length();
            llIlIIllIllllll++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        MAP = builder.build();
    }

    private static String llIIlllIIl(String llIlIIllIIlIIIl, String llIlIIllIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIllIIlIIlI) {
            llIlIIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private EnumC0058g(String str, int i2, int i3, Skill skill, Color color) {
        this.npcId = i3;
        this.type = skill;
        this.color = color;
    }

    @Nullable
    public static EnumC0058g b(NPC npc) {
        return MAP.get(Integer.valueOf(npc.getId()));
    }

    public Color M() {
        return this.color;
    }

    private static void llIIllllII() {
        lllIlllI = new int[8];
        lllIlllI[0] = (248 ^ 198) & ((250 ^ 196) ^ (-1));
        lllIlllI[1] = (-1) & 5867;
        lllIlllI[2] = " ".length();
        lllIlllI[3] = (-8467) & 14334;
        lllIlllI[4] = "  ".length();
        lllIlllI[5] = (-((-8061) & 32639)) & (-1) & 30447;
        lllIlllI[6] = "   ".length();
        lllIlllI[7] = 101 ^ 109;
    }

    private static String llIIlllIlI(String llIlIIllIIllllI, String llIlIIllIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIllIIlllIl.getBytes(StandardCharsets.UTF_8)), lllIlllI[7]), "DES");
            Cipher llIlIIllIlIIIII = Cipher.getInstance("DES");
            llIlIIllIlIIIII.init(lllIlllI[4], secretKeySpec);
            return new String(llIlIIllIlIIIII.doFinal(Base64.getDecoder().decode(llIlIIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIllIIlllll) {
            llIlIIllIIlllll.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIll() {
        lllIllIl = new String[lllIlllI[6]];
        lllIllIl[lllIlllI[0]] = llIIlllIII("JzQ0NRc=", "uuzrR");
        lllIllIl[lllIlllI[2]] = llIIlllIIl("oyKQs4n38r4=", "oXruX");
        lllIllIl[lllIlllI[4]] = llIIlllIlI("Q9QYu4P9N/E=", "DoZCu");
    }

    private static boolean llIIllllIl(int i2, int i3) {
        return i2 < i3;
    }

    public static EnumC0058g e(int i2) {
        return MAP.get(Integer.valueOf(i2));
    }

    public static EnumC0058g valueOf(String str) {
        return (EnumC0058g) Enum.valueOf(EnumC0058g.class, str);
    }

    public static EnumC0058g[] values() {
        return (EnumC0058g[]) $VALUES.clone();
    }
}
