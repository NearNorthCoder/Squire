package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Depositing Guardian Stone", priority = 3, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.s  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/s.class */
public class s extends h {
    private static /* synthetic */ int[] llIIlllIIIII;
    private static /* synthetic */ String[] llIIllIlllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIIlllIIIII[2];
    }

    private static void llllllIlllllII() {
        llIIlllIIIII = new int[7];
        llIIlllIIIII[0] = "  ".length();
        llIIlllIIIII[1] = (52 ^ 124) & ((36 ^ 108) ^ (-1));
        llIIlllIIIII[2] = " ".length();
        llIIlllIIIII[3] = (-((-10242) & 15103)) & (-1) & 31741;
        llIIlllIIIII[4] = (-((-1329) & 6135)) & (-57) & 31743;
        llIIlllIIIII[5] = (-4165) & 15567;
        llIIlllIIIII[6] = (((5 + 74) - 6) + 74) ^ (((20 + 123) - (-6)) + 6);
    }

    private static String llllllIllllIlI(String lllllllllllllllIlIIllIIIIlllIIIl, String lllllllllllllllIlIIllIIIIlllIIII) {
        String lllllllllllllllIlIIllIIIIlllIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIIllIllll = new StringBuilder();
        char[] lllllllllllllllIlIIllIIIIllIlllI = lllllllllllllllIlIIllIIIIlllIIII.toCharArray();
        int lllllllllllllllIlIIllIIIIllIllIl = llIIlllIIIII[1];
        char[] charArray = lllllllllllllllIlIIllIIIIlllIIIl2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIIllIIIIllIIlIl = llIIlllIIIII[1];
        while (lllllllIIIIIII(lllllllllllllllIlIIllIIIIllIIlIl, length)) {
            lllllllllllllllIlIIllIIIIllIllll.append((char) (charArray[lllllllllllllllIlIIllIIIIllIIlIl] ^ lllllllllllllllIlIIllIIIIllIlllI[lllllllllllllllIlIIllIIIIllIllIl % lllllllllllllllIlIIllIIIIllIlllI.length]));
            "".length();
            lllllllllllllllIlIIllIIIIllIllIl++;
            lllllllllllllllIlIIllIIIIllIIlIl++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllIIIIllIllll);
    }

    private static String llllllIllllIIl(String lllllllllllllllIlIIllIIIlIIIIIIl, String lllllllllllllllIlIIllIIIlIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIlllIIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIIIII[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIlIIIIIlI) {
            lllllllllllllllIlIIllIIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlllllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!llllllIlllllIl(this.aV.g() ? 1 : 0) && !llllllIllllllI(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            int[] iArr = new int[llIIlllIIIII[0]];
            iArr[llIIlllIIIII[1]] = llIIlllIIIII[3];
            iArr[llIIlllIIIII[2]] = llIIlllIIIII[4];
            if (llllllIlllllIl(Inventory.contains(iArr) ? 1 : 0)) {
                return llIIlllIIIII[1];
            }
            int[] iArr2 = new int[llIIlllIIIII[2]];
            iArr2[llIIlllIIIII[1]] = llIIlllIIIII[5];
            NPC nearest = NPCs.getNearest(iArr2);
            if (!llllllIlllllll(nearest) || llllllIlllllIl(nearest.hasAction(str -> {
                if (llllllIlllllll(str) && llllllIllllllI(str.equals(llIIllIlllll[llIIlllIIIII[2]]) ? 1 : 0)) {
                    ?? r0 = llIIlllIIIII[2];
                    "".length();
                    return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlllIIIII[1];
            }) ? 1 : 0)) {
                return llIIlllIIIII[1];
            }
            if (llllllIllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIIlllIIIII[2];
            }
            nearest.interact(llIIllIlllll[llIIlllIIIII[1]]);
            return llIIlllIIIII[2];
        }
        return llIIlllIIIII[1];
    }

    private static boolean llllllIlllllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllIIIII[0]];
        enumC0002cArr[llIIlllIIIII[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIlllIIIII[2]] = EnumC0002c.FINISHING;
    }

    private static void llllllIllllIll() {
        llIIllIlllll = new String[llIIlllIIIII[0]];
        llIIllIlllll[llIIlllIIIII[1]] = llllllIllllIIl("lQWXEQQh9FuUZ6IdH+ppuQ==", "eMHQp");
        llIIllIlllll[llIIlllIIIII[2]] = llllllIllllIlI("PjgbHxRDIhw=", "nWlzf");
    }

    private static boolean llllllIllllllI(int i) {
        return i != 0;
    }

    private static boolean lllllllIIIIIII(int i, int i2) {
        return i < i2;
    }

    static {
        llllllIlllllII();
        llllllIllllIll();
    }
}
