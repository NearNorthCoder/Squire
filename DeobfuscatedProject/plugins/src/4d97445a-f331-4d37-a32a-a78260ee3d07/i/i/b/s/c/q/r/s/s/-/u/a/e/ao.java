/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class ao
extends Enum<ao> {
    private static /* synthetic */ String[] lIlIIIII;
    public static final /* synthetic */ /* enum */ ao DRAGON_BONES;
    public final /* synthetic */ int groundItemId;
    public final /* synthetic */ int itemId;
    private static /* synthetic */ int[] lIlIIIIl;
    private static final /* synthetic */ ao[] $VALUES;

    private static void lIIlIIlIlI() {
        lIlIIIII = new String[lIlIIIIl[3]];
        ao.lIlIIIII[ao.lIlIIIIl[0]] = ao.lIIlIIlIIl("Wx0FlxwkfFhwQxk+wMY8Ng==", "tKrJs");
    }

    static {
        ao.lIIlIIlIll();
        ao.lIIlIIlIlI();
        DRAGON_BONES = new ao(lIlIIIIl[1], lIlIIIIl[2]);
        ao[] aoArray = new ao[lIlIIIIl[3]];
        aoArray[ao.lIlIIIIl[0]] = DRAGON_BONES;
        $VALUES = aoArray;
    }

    public static ao[] values() {
        return (ao[])$VALUES.clone();
    }

    private static void lIIlIIlIll() {
        lIlIIIIl = new int[6];
        ao.lIlIIIIl[0] = (0x2F ^ 0xF) & ~(0x2D ^ 0xD);
        ao.lIlIIIIl[1] = -(0xFFFFB8E5 & 0x5F7F) & (0xFFFFBEFF & 0x5B7C);
        ao.lIlIIIIl[2] = 0xFFFFB1E5 & 0x5EBF;
        ao.lIlIIIIl[3] = " ".length();
        ao.lIlIIIIl[4] = 27 + 108 - -2 + 14 ^ 83 + 57 - 27 + 46;
        ao.lIlIIIIl[5] = "  ".length();
    }

    public static ao valueOf(String string) {
        return Enum.valueOf(ao.class, string);
    }

    private ao(int n3, int n4) {
        this.itemId = n3;
        this.groundItemId = n4;
    }

    private static String lIIlIIlIIl(String lllIIIIIlllIllI, String lllIIIIIlllIIll) {
        try {
            SecretKeySpec lllIIIIIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIIIlllIIll.getBytes(StandardCharsets.UTF_8)), lIlIIIIl[4]), "DES");
            Cipher lllIIIIIllllIII = Cipher.getInstance("DES");
            lllIIIIIllllIII.init(lIlIIIIl[5], lllIIIIIllllIIl);
            return new String(lllIIIIIllllIII.doFinal(Base64.getDecoder().decode(lllIIIIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIIlllIlll) {
            lllIIIIIlllIlll.printStackTrace();
            return null;
        }
    }
}

