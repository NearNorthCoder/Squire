package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.widgets.Dialog;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.b  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/b.class */
public final class EnumC0001b {
    private static /* synthetic */ String[] lIllIlllIllll;
    public static final /* synthetic */ EnumC0001b RING_OF_DUELING;
    private static /* synthetic */ int[] lIllIllllIlII;
    private final /* synthetic */ Consumer<Item> action;
    public static final /* synthetic */ EnumC0001b CONSTRUCTION_CAPE;
    private static final /* synthetic */ EnumC0001b[] $VALUES;
    private final /* synthetic */ String name;
    public static final /* synthetic */ EnumC0001b HOUSE_TELEPORT;

    private EnumC0001b(String str, int i, String str2, Consumer consumer) {
        this.name = str2;
        this.action = consumer;
    }

    private static String llIIlIIllIllIIl(String llllllllllllllIllIIIlIIIIlIIlIIl, String llllllllllllllIllIIIlIIIIlIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIIIlIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIIIlIIlIll.init(lIllIllllIlII[2], secretKeySpec);
            return new String(llllllllllllllIllIIIlIIIIlIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIIIlIIlIlI) {
            llllllllllllllIllIIIlIIIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlllIIlll(int i) {
        return i == 0;
    }

    private static String llIIlIIllIlIlll(String llllllllllllllIllIIIlIIIIIllllII, String llllllllllllllIllIIIlIIIIIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIIIlllIll.getBytes(StandardCharsets.UTF_8)), lIllIllllIlII[8]), "DES");
            Cipher llllllllllllllIllIIIlIIIIIlllllI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIIIIIlllllI.init(lIllIllllIlII[2], secretKeySpec);
            return new String(llllllllllllllIllIIIlIIIIIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIIIIllllIl) {
            llllllllllllllIllIIIlIIIIIllllIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIlllIIlIl() {
        lIllIllllIlII = new int[11];
        lIllIllllIlII[0] = ((185 ^ 166) ^ (71 ^ 13)) & (((((112 + 9) - 35) + 59) ^ (((186 + 52) - 117) + 75)) ^ (-" ".length()));
        lIllIllllIlII[1] = " ".length();
        lIllIllllIlII[2] = "  ".length();
        lIllIllllIlII[3] = "   ".length();
        lIllIllllIlII[4] = (((125 + 32) - 18) + 6) ^ (((67 + 111) - 92) + 63);
        lIllIllllIlII[5] = 18 ^ 23;
        lIllIllllIlII[6] = (107 ^ 18) ^ (((33 + 63) - (-19)) + 12);
        lIllIllllIlII[7] = (70 ^ 52) ^ (112 ^ 5);
        lIllIllllIlII[8] = 15 ^ 7;
        lIllIllllIlII[9] = 88 ^ 81;
        lIllIllllIlII[10] = 126 ^ 116;
    }

    private static String llIIlIIllIllIII(String llllllllllllllIllIIIlIIIIlIllllI, String llllllllllllllIllIIIlIIIIlIlllIl) {
        String llllllllllllllIllIIIlIIIIlIllllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIIIIlIlllII = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIIIIlIlllIl.toCharArray();
        int llllllllllllllIllIIIlIIIIlIllIlI = lIllIllllIlII[0];
        char[] charArray2 = llllllllllllllIllIIIlIIIIlIllllI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIllllIlII[0];
        while (llIIlIIlllIlIII(i, length)) {
            char llllllllllllllIllIIIlIIIIlIlllll = charArray2[i];
            llllllllllllllIllIIIlIIIIlIlllII.append((char) (llllllllllllllIllIIIlIIIIlIlllll ^ charArray[llllllllllllllIllIIIlIIIIlIllIlI % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIIIIlIllIlI++;
            i++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIlIIIIlIlllII);
    }

    static {
        llIIlIIlllIIlIl();
        llIIlIIllIlllIl();
        RING_OF_DUELING = new EnumC0001b(lIllIlllIllll[lIllIllllIlII[4]], lIllIllllIlII[0], lIllIlllIllll[lIllIllllIlII[5]], item -> {
            if (!llIIlIIlllIIllI(Dialog.isViewingOptions() ? 1 : 0) || !llIIlIIlllIIlll(Dialog.hasOption(lIllIlllIllll[lIllIllllIlII[2]]) ? 1 : 0)) {
                item.interact(lIllIlllIllll[lIllIllllIlII[3]]);
                return;
            }
            Dialog.chooseOption(lIllIllllIlII[3]);
            "".length();
        });
        HOUSE_TELEPORT = new EnumC0001b(lIllIlllIllll[lIllIllllIlII[6]], lIllIllllIlII[1], lIllIlllIllll[lIllIllllIlII[7]], item2 -> {
            item2.interact(lIllIlllIllll[lIllIllllIlII[1]]);
        });
        CONSTRUCTION_CAPE = new EnumC0001b(lIllIlllIllll[lIllIllllIlII[8]], lIllIllllIlII[2], lIllIlllIllll[lIllIllllIlII[9]], item3 -> {
            item3.interact(lIllIlllIllll[lIllIllllIlII[0]]);
        });
        EnumC0001b[] enumC0001bArr = new EnumC0001b[lIllIllllIlII[3]];
        enumC0001bArr[lIllIllllIlII[0]] = RING_OF_DUELING;
        enumC0001bArr[lIllIllllIlII[1]] = HOUSE_TELEPORT;
        enumC0001bArr[lIllIllllIlII[2]] = CONSTRUCTION_CAPE;
        $VALUES = enumC0001bArr;
    }

    private static boolean llIIlIIlllIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIlllIIllI(int i) {
        return i != 0;
    }

    public String k() {
        return this.name;
    }

    private static void llIIlIIllIlllIl() {
        lIllIlllIllll = new String[lIllIllllIlII[10]];
        lIllIlllIllll[lIllIllllIlII[0]] = llIIlIIllIlIlll("eZZu4KWwWKrIRn6VT/jrTA==", "nWKHe");
        lIllIlllIllll[lIllIllllIlII[1]] = llIIlIIllIllIII("FDsQBCQ=", "VIueO");
        lIllIlllIllll[lIllIllllIlII[2]] = llIIlIIllIlIlll("rL8PmyPy9mY=", "miJCk");
        lIllIlllIllll[lIllIllllIlII[3]] = llIIlIIllIllIII("ABg0", "RmVqA");
        lIllIlllIllll[lIllIllllIlII[4]] = llIIlIIllIllIIl("I/HG238qe+awxOEAqRDS3Q==", "nBCEE");
        lIllIlllIllll[lIllIllllIlII[5]] = llIIlIIllIllIIl("oRsoVNJL6Eh711rRUc+vag==", "xHxAX");
        lIllIlllIllll[lIllIllllIlII[6]] = llIIlIIllIllIIl("40eXU4er0Bqi312MywjpJg==", "gIkSw");
        lIllIlllIllll[lIllIllllIlII[7]] = llIIlIIllIllIIl("sByrwbDzG07gGcy6Fh8WtY5NTwVnFeYB", "SzRTA");
        lIllIlllIllll[lIllIllllIlII[8]] = llIIlIIllIllIIl("yJbA5GjPW2oje6fSGQx2DuLMu05+oYHf", "dqMCK");
        lIllIlllIllll[lIllIllllIlII[9]] = llIIlIIllIlIlll("o2DKpzz+aRmRzJRx3TllAQ==", "TxsXw");
    }

    public Consumer<Item> l() {
        return this.action;
    }

    public static EnumC0001b[] values() {
        return (EnumC0001b[]) $VALUES.clone();
    }

    public static EnumC0001b valueOf(String str) {
        return (EnumC0001b) Enum.valueOf(EnumC0001b.class, str);
    }
}
