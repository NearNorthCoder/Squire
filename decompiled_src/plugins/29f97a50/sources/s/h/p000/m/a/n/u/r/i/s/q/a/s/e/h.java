package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.input.Keyboard;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.h  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/h.class */
public final class h {
    private static /* synthetic */ int[] lIIllIIIIIIll;
    private static /* synthetic */ String[] lIIllIIIIIIlI;
    private final /* synthetic */ Predicate<Item> test;
    private final /* synthetic */ Consumer<Item> execution;
    public static final /* synthetic */ h CONSTRUCTION_CAPE;
    public static final /* synthetic */ h SKILLS_NECKLACE;
    private final /* synthetic */ boolean stopping;
    public static final /* synthetic */ h ECTOPHIAL;
    private final /* synthetic */ boolean leaveRoom;
    public static final /* synthetic */ h FARMING_CAPE;
    public static final /* synthetic */ h ARDY_CLOAK;
    public static final /* synthetic */ h HOUSE_TELEPORT;
    private static final /* synthetic */ h[] $VALUES;
    private final /* synthetic */ boolean fairy;

    private static boolean lIlIlllIIllllIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlllIIllIlII(String llllllllllllllIllllIIllIIlIIllII, String llllllllllllllIllllIIllIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIllIIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIllIIlIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIllIIlIIlllI.init(lIIllIIIIIIll[6], llllllllllllllIllllIIllIIlIIllll);
            return new String(llllllllllllllIllllIIllIIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIIlIIllIl) {
            llllllllllllllIllllIIllIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIIllIlll() {
        lIIllIIIIIIlI = new String[lIIllIIIIIIll[23]];
        lIIllIIIIIIlI[lIIllIIIIIIll[0]] = lIlIlllIIllIlII("g99NljKjgAOFYXadOZidiw==", "lLTfE");
        lIIllIIIIIIlI[lIIllIIIIIIll[3]] = lIlIlllIIllIlIl("DgoHIxI1HR8=", "ZokFb");
        lIIllIIIIIIlI[lIIllIIIIIIll[6]] = lIlIlllIIllIlIl("Ay4qDQE=", "FCZyx");
        lIIllIIIIIIlI[lIIllIIIIIIll[8]] = lIlIlllIIllIllI("nKDmV9UElm8=", "LDVCy");
        lIIllIIIIIIlI[lIIllIIIIIIll[10]] = lIlIlllIIllIllI("R07DGZ0L8j8=", "qgKBN");
        lIIllIIIIIIlI[lIIllIIIIIIll[11]] = lIlIlllIIllIlII("zJxHuKpRaxU=", "TVNRd");
        lIIllIIIIIIlI[lIIllIIIIIIll[12]] = lIlIlllIIllIlIl("AD0RLyAgdhYmLzg6GSAp", "SVxCL");
        lIIllIIIIIIlI[lIIllIIIIIIll[14]] = lIlIlllIIllIlII("6eqhXCjtV4NaeCgPe2Yd6gDP4EfwSGmx", "SaMdi");
        lIIllIIIIIIlI[lIIllIIIIIIll[17]] = lIlIlllIIllIlIl("NSAONic3PgUuMw==", "trJox");
        lIIllIIIIIIlI[lIIllIIIIIIll[18]] = lIlIlllIIllIlII("M8PfwQRZw/1l+Rhf/5hfAA==", "tYvxN");
        lIIllIIIIIIlI[lIIllIIIIIIll[19]] = lIlIlllIIllIlII("pkfdZklLDYL+NLe2X+e6IQ==", "tlHbI");
        lIIllIIIIIIlI[lIIllIIIIIIll[20]] = lIlIlllIIllIllI("awBAnUswjrg7Ycpcf99CRg==", "xYKMq");
        lIIllIIIIIIlI[lIIllIIIIIIll[21]] = lIlIlllIIllIlIl("NSACFQ09Jg8bBSMk", "saPXD");
        lIIllIIIIIIlI[lIIllIIIIIIll[22]] = lIlIlllIIllIllI("CZJM4XSGAPmk0458Akjl984CtadKWIad", "pWvuV");
    }

    private static boolean lIlIlllIIlllIll(int i) {
        return i != 0;
    }

    private static String lIlIlllIIllIlIl(String llllllllllllllIllllIIllIIIlIllll, String llllllllllllllIllllIIllIIIlIlllI) {
        String llllllllllllllIllllIIllIIIlIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIllIIIlIllIl = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIllIIIlIlllI.toCharArray();
        int llllllllllllllIllllIIllIIIlIlIll = lIIllIIIIIIll[0];
        char[] charArray2 = llllllllllllllIllllIIllIIIlIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIIIIll[0];
        while (lIlIlllIIlllllI(i, length)) {
            char llllllllllllllIllllIIllIIIllIIII = charArray2[i];
            llllllllllllllIllllIIllIIIlIllIl.append((char) (llllllllllllllIllllIIllIIIllIIII ^ charArray[llllllllllllllIllllIIllIIIlIlIll % charArray.length]));
            "".length();
            llllllllllllllIllllIIllIIIlIlIll++;
            i++;
            "".length();
            if (((68 ^ 125) & ((122 ^ 67) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIllIIIlIllIl);
    }

    public Consumer<Item> B() {
        return this.execution;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    static {
        lIlIlllIIlllIII();
        lIlIlllIIllIlll();
        ARDY_CLOAK = new h(lIIllIIIIIIlI[lIIllIIIIIIll[17]], lIIllIIIIIIll[0], item -> {
            if (lIlIlllIIllllII(item.getId(), lIIllIIIIIIll[15]) && lIlIlllIIllllIl(item.getId(), lIIllIIIIIIll[16])) {
                ?? r0 = lIIllIIIIIIll[3];
                "".length();
                return (122 ^ 126) <= ((94 ^ 107) & ((14 ^ 59) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIIIll[0];
        }, item2 -> {
            item2.interact(lIIllIIIIIIlI[lIIllIIIIIIll[14]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[3], lIIllIIIIIIll[0]);
        SKILLS_NECKLACE = new h(lIIllIIIIIIlI[lIIllIIIIIIll[18]], lIIllIIIIIIll[3], item3 -> {
            if (lIlIlllIIlllIll(item3.getName().startsWith(lIIllIIIIIIlI[lIIllIIIIIIll[12]]) ? 1 : 0) && lIlIlllIIlllIIl(item3.getId(), lIIllIIIIIIll[13])) {
                ?? r0 = lIIllIIIIIIll[3];
                "".length();
                return (-" ".length()) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIIIll[0];
        }, item4 -> {
            item4.interact(lIIllIIIIIIlI[lIIllIIIIIIll[10]]);
            Keyboard.type(lIIllIIIIIIlI[lIIllIIIIIIll[11]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[3]);
        HOUSE_TELEPORT = new h(lIIllIIIIIIlI[lIIllIIIIIIll[19]], lIIllIIIIIIll[6], item5 -> {
            if (lIlIlllIIlllIlI(item5.getId(), lIIllIIIIIIll[9])) {
                ?? r0 = lIIllIIIIIIll[3];
                "".length();
                return ((247 ^ 148) & ((27 ^ 120) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIIIll[0];
        }, item6 -> {
            item6.interact(lIIllIIIIIIlI[lIIllIIIIIIll[8]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        ECTOPHIAL = new h(lIIllIIIIIIlI[lIIllIIIIIIll[20]], lIIllIIIIIIll[8], item7 -> {
            if (lIlIlllIIlllIlI(item7.getId(), lIIllIIIIIIll[7])) {
                ?? r0 = lIIllIIIIIIll[3];
                "".length();
                return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIIIll[0];
        }, item8 -> {
            item8.interact(lIIllIIIIIIlI[lIIllIIIIIIll[6]]);
        }, lIIllIIIIIIll[3], lIIllIIIIIIll[3], lIIllIIIIIIll[0]);
        FARMING_CAPE = new h(lIIllIIIIIIlI[lIIllIIIIIIll[21]], lIIllIIIIIIll[10], item9 -> {
            if (!lIlIlllIIlllIIl(item9.getId(), lIIllIIIIIIll[4]) || lIlIlllIIlllIlI(item9.getId(), lIIllIIIIIIll[5])) {
                ?? r0 = lIIllIIIIIIll[3];
                "".length();
                return ((((78 + 128) - 103) + 43) ^ (((70 + 124) - 57) + 13)) <= (((63 ^ 37) ^ (27 ^ 97)) & (((230 ^ 150) ^ (28 ^ 12)) ^ (-" ".length()))) ? ((((41 + 83) - 121) + 125) ^ (((144 + 172) - 145) + 13)) & (((81 ^ 104) ^ " ".length()) ^ (-" ".length())) : r0;
            }
            return lIIllIIIIIIll[0];
        }, item10 -> {
            item10.interact(lIIllIIIIIIlI[lIIllIIIIIIll[3]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        CONSTRUCTION_CAPE = new h(lIIllIIIIIIlI[lIIllIIIIIIll[22]], lIIllIIIIIIll[11], item11 -> {
            if (!lIlIlllIIlllIIl(item11.getId(), lIIllIIIIIIll[1]) || lIlIlllIIlllIlI(item11.getId(), lIIllIIIIIIll[2])) {
                ?? r0 = lIIllIIIIIIll[3];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIIIIll[0];
        }, item12 -> {
            item12.interact(lIIllIIIIIIlI[lIIllIIIIIIll[0]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        h[] hVarArr = new h[lIIllIIIIIIll[12]];
        hVarArr[lIIllIIIIIIll[0]] = ARDY_CLOAK;
        hVarArr[lIIllIIIIIIll[3]] = SKILLS_NECKLACE;
        hVarArr[lIIllIIIIIIll[6]] = HOUSE_TELEPORT;
        hVarArr[lIIllIIIIIIll[8]] = ECTOPHIAL;
        hVarArr[lIIllIIIIIIll[10]] = FARMING_CAPE;
        hVarArr[lIIllIIIIIIll[11]] = CONSTRUCTION_CAPE;
        $VALUES = hVarArr;
    }

    private static boolean lIlIlllIIlllIlI(int i, int i2) {
        return i == i2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    private static boolean lIlIlllIIllllII(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlllIIllIllI(String llllllllllllllIllllIIllIIIllllll, String llllllllllllllIllllIIllIIIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIIIlllllI.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIIll[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIIIIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIIlIIIIII) {
            llllllllllllllIllllIIllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private h(String str, int i, Predicate predicate, Consumer consumer, boolean z, boolean z2, boolean z3) {
        this.test = predicate;
        this.execution = consumer;
        this.stopping = z;
        this.fairy = z2;
        this.leaveRoom = z3;
    }

    public boolean D() {
        return this.fairy;
    }

    private static boolean lIlIlllIIlllllI(int i, int i2) {
        return i < i2;
    }

    public boolean E() {
        return this.leaveRoom;
    }

    private static void lIlIlllIIlllIII() {
        lIIllIIIIIIll = new int[24];
        lIIllIIIIIIll[0] = ((1 ^ 97) ^ (17 ^ 127)) & (((20 ^ 45) ^ (176 ^ 135)) ^ (-" ".length()));
        lIIllIIIIIIll[1] = (-((-8321) & 31171)) & (-1) & 32639;
        lIIllIIIIIIll[2] = (-6529) & 16318;
        lIIllIIIIIIll[3] = " ".length();
        lIIllIIIIIIll[4] = (-6314) & 16123;
        lIIllIIIIIIll[5] = (-((-8193) & 31149)) & (-1) & 32767;
        lIIllIIIIIIll[6] = "  ".length();
        lIIllIIIIIIll[7] = (-11845) & 16095;
        lIIllIIIIIIll[8] = "   ".length();
        lIIllIIIIIIll[9] = (-((-6657) & 14899)) & (-129) & 16383;
        lIIllIIIIIIll[10] = 170 ^ 174;
        lIIllIIIIIIll[11] = (106 ^ 96) ^ (52 ^ 59);
        lIIllIIIIIIll[12] = (51 ^ 21) ^ (4 ^ 36);
        lIIllIIIIIIll[13] = (-(168 ^ 187)) & (-1153) & 12283;
        lIIllIIIIIIll[14] = (114 ^ 89) ^ (68 ^ 104);
        lIIllIIIIIIll[15] = (-((-13855) & 32415)) & (-1083) & 32763;
        lIIllIIIIIIll[16] = (-3211) & 16334;
        lIIllIIIIIIll[17] = 101 ^ 109;
        lIIllIIIIIIll[18] = 3 ^ 10;
        lIIllIIIIIIll[19] = 155 ^ 145;
        lIIllIIIIIIll[20] = 183 ^ 188;
        lIIllIIIIIIll[21] = 102 ^ 106;
        lIIllIIIIIIll[22] = 178 ^ 191;
        lIIllIIIIIIll[23] = 63 ^ 49;
    }

    private static boolean lIlIlllIIlllIIl(int i, int i2) {
        return i != i2;
    }

    public boolean C() {
        return this.stopping;
    }
}
