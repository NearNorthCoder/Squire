package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.am  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/am.class */
public final class EnumC0013am {
    private static final /* synthetic */ EnumC0013am[] $VALUES;
    private static /* synthetic */ String[] llIllllIl;
    public static final /* synthetic */ EnumC0013am ECTOFUNTUS;
    private static /* synthetic */ int[] llIlllllI;
    public static final /* synthetic */ EnumC0013am SLIME_COLLECTION;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ EnumC0013am ECTO_UPSTAIRS;

    public WorldArea bp() {
        return this.area;
    }

    private static void llIIIIIIIlI() {
        llIllllIl = new String[llIlllllI[11]];
        llIllllIl[llIlllllI[0]] = llIIIIIIIIl("LAkWFjU8BBYMIA==", "iJBYs");
        llIllllIl[llIlllllI[5]] = llIIIIIIIIl("Ahk5BjYSCj4dKA4IPg==", "GZmIi");
        llIllllIl[llIlllllI[6]] = llIIIIIIIIl("NB8AOz04EAY6NCIQHT83KQ==", "gSIvx");
    }

    public static EnumC0013am[] values() {
        return (EnumC0013am[]) $VALUES.clone();
    }

    private EnumC0013am(String str, int i2, WorldArea worldArea) {
        this.area = worldArea;
    }

    static {
        llIIIIIIIll();
        llIIIIIIIlI();
        ECTOFUNTUS = new EnumC0013am(llIllllIl[llIlllllI[0]], llIlllllI[0], new WorldArea(llIlllllI[1], llIlllllI[2], llIlllllI[3], llIlllllI[4], llIlllllI[0]));
        ECTO_UPSTAIRS = new EnumC0013am(llIllllIl[llIlllllI[5]], llIlllllI[5], new WorldArea(llIlllllI[1], llIlllllI[2], llIlllllI[3], llIlllllI[4], llIlllllI[5]));
        SLIME_COLLECTION = new EnumC0013am(llIllllIl[llIlllllI[6]], llIlllllI[6], new WorldArea(llIlllllI[7], llIlllllI[8], llIlllllI[9], llIlllllI[10], llIlllllI[0]));
        EnumC0013am[] enumC0013amArr = new EnumC0013am[llIlllllI[11]];
        enumC0013amArr[llIlllllI[0]] = ECTOFUNTUS;
        enumC0013amArr[llIlllllI[5]] = ECTO_UPSTAIRS;
        enumC0013amArr[llIlllllI[6]] = SLIME_COLLECTION;
        $VALUES = enumC0013amArr;
    }

    private static void llIIIIIIIll() {
        llIlllllI = new int[12];
        llIlllllI[0] = ((33 ^ 21) ^ (236 ^ 198)) & (((((151 + 47) - 144) + 106) ^ (((178 + 125) - 126) + 13)) ^ (-" ".length()));
        llIlllllI[1] = (-257) & 3906;
        llIlllllI[2] = (-((-9115) & 29595)) & (-8257) & 32247;
        llIlllllI[3] = (109 ^ 97) ^ (93 ^ 66);
        llIlllllI[4] = 61 ^ 47;
        llIlllllI[5] = " ".length();
        llIlllllI[6] = "  ".length();
        llIlllllI[7] = (-(((111 + 128) - 104) + 18)) & (-16390) & 20223;
        llIlllllI[8] = (-((-21) & 22647)) & (-2) & 32511;
        llIlllllI[9] = (34 ^ 0) ^ (24 ^ 63);
        llIlllllI[10] = 35 ^ 42;
        llIlllllI[11] = "   ".length();
    }

    public static EnumC0013am valueOf(String str) {
        return (EnumC0013am) Enum.valueOf(EnumC0013am.class, str);
    }

    private static boolean llIIIIIIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static String llIIIIIIIIl(String lIlIllIllIIllII, String lIlIllIllIIIllI) {
        String str = new String(Base64.getDecoder().decode(lIlIllIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIllIllIIIllI.toCharArray();
        int lIlIllIllIIlIII = llIlllllI[0];
        char[] charArray2 = str.toCharArray();
        int lIlIllIllIIIIIl = charArray2.length;
        int i2 = llIlllllI[0];
        while (llIIIIIIlII(i2, lIlIllIllIIIIIl)) {
            char lIlIllIllIIllIl = charArray2[i2];
            sb.append((char) (lIlIllIllIIllIl ^ charArray[lIlIllIllIIlIII % charArray.length]));
            "".length();
            lIlIllIllIIlIII++;
            i2++;
            "".length();
            if (" ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public boolean bo() {
        return this.area.contains(Players.getLocal().getWorldLocation());
    }
}
