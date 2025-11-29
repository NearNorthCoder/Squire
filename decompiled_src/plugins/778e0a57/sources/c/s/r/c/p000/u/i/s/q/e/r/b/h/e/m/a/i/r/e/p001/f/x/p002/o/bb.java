package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Prep Getting Tools", priority = 21003, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bb  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bb.class */
public class bb extends bg {
    private static /* synthetic */ String[] lIlIlIllllII;
    private final /* synthetic */ int eh = 7603;
    private static /* synthetic */ int[] lIlIlIllllIl;
    private final /* synthetic */ int eg = 29742;

    private static boolean llIlllllIlllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlllllIlllll(int i) {
        return i == 0;
    }

    private static void llIlllllIllIlI() {
        lIlIlIllllII = new String[lIlIlIllllIl[14]];
        lIlIlIllllII[lIlIlIllllIl[2]] = llIlllllIlIlll("NAkNGm0xAQ0KbSMHDAIeVmli", "wHCNM");
        lIlIlIllllII[lIlIlIllllIl[3]] = llIlllllIllIII("GJMKV4X4VVjYrSHhjjOfoUpcq+irW+S7", "eOLTB");
        lIlIlIllllII[lIlIlIllllIl[8]] = llIlllllIllIIl("PGsxYNx/XaDUbq4KSxMyBnSj5gotUnH9", "joCsn");
        lIlIlIllllII[lIlIlIllllIl[10]] = llIlllllIllIIl("M7qxiliUc+aazdQJspcRtOAoECPyFbRs", "XcxiE");
        lIlIlIllllII[lIlIlIllllIl[11]] = llIlllllIllIIl("46QMM3jElNx78c01LXLKlQ==", "WqKJQ");
        lIlIlIllllII[lIlIlIllllIl[12]] = llIlllllIllIIl("YEOgesYMTqCfVi3NjRzhmA==", "NLXUC");
        lIlIlIllllII[lIlIlIllllIl[13]] = llIlllllIllIII("0JeWSLvea7sYIs++Uj8iDg==", "nwBSQ");
    }

    @Inject
    protected bb(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.eg = lIlIlIllllIl[0];
        this.eh = lIlIlIllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        if (llIlllllIlllII(cq(), this.el)) {
            return lIlIlIllllIl[2];
        }
        int[] iArr = new int[lIlIlIllllIl[3]];
        iArr[lIlIlIllllIl[2]] = lIlIlIllllIl[4];
        if (llIlllllIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIllllIl[3]];
            iArr2[lIlIlIllllIl[2]] = lIlIlIllllIl[5];
            if (llIlllllIlllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIlIllllIl[2];
            }
        }
        int[] iArr3 = new int[lIlIlIllllIl[3]];
        iArr3[lIlIlIllllIl[2]] = lIlIlIllllIl[6];
        TileObject nearest = TileObjects.getNearest(iArr3);
        if (llIlllllIllllI(nearest)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[2]]);
            Movement.setDestination(this.ak.bq.dx(lIlIlIllllIl[7]).dy(lIlIlIllllIl[7]));
            return lIlIlIllllIl[3];
        }
        int[] iArr4 = new int[lIlIlIllllIl[3]];
        iArr4[lIlIlIllllIl[2]] = lIlIlIllllIl[4];
        if (llIlllllIlllll(Inventory.contains(iArr4) ? 1 : 0)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[3]]);
            nearest.interact(lIlIlIllllII[lIlIlIllllIl[8]]);
            return lIlIlIllllIl[3];
        }
        int[] iArr5 = new int[lIlIlIllllIl[3]];
        iArr5[lIlIlIllllIl[2]] = lIlIlIllllIl[9];
        if (llIlllllIlllll(Inventory.contains(iArr5) ? 1 : 0)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[10]]);
            nearest.interact(lIlIlIllllII[lIlIlIllllIl[11]]);
            return lIlIlIllllIl[3];
        }
        System.out.println(lIlIlIllllII[lIlIlIllllIl[12]]);
        nearest.interact(lIlIlIllllII[lIlIlIllllIl[13]]);
        return lIlIlIllllIl[3];
    }

    private static void llIlllllIllIll() {
        lIlIlIllllIl = new int[16];
        lIlIlIllllIl[0] = (-2898) & 32639;
        lIlIlIllllIl[1] = (-((-15731) & 16247)) & (-24649) & 32767;
        lIlIlIllllIl[2] = (120 ^ 59) & ((3 ^ 64) ^ (-1));
        lIlIlIllllIl[3] = " ".length();
        lIlIlIllllIl[4] = (-((-5297) & 16049)) & (-16673) & 32767;
        lIlIlIllllIl[5] = (-((-6041) & 32667)) & (-4166) & 31743;
        lIlIlIllllIl[6] = (-((-8781) & 11085)) & (-181) & 32255;
        lIlIlIllllIl[7] = (108 ^ 105) ^ (88 ^ 82);
        lIlIlIllllIl[8] = "  ".length();
        lIlIlIllllIl[9] = (-((-39) & 2615)) & (-1) & 23485;
        lIlIlIllllIl[10] = "   ".length();
        lIlIlIllllIl[11] = (((134 + 14) - 115) + 140) ^ (((98 + 127) - 123) + 67);
        lIlIlIllllIl[12] = (((57 + 132) - 101) + 78) ^ (((74 + 92) - 39) + 36);
        lIlIlIllllIl[13] = 162 ^ 164;
        lIlIlIllllIl[14] = 59 ^ 60;
        lIlIlIllllIl[15] = 123 ^ 115;
    }

    private static String llIlllllIllIII(String lllllllllllllllIllIIllIlIIIlllll, String lllllllllllllllIllIIllIlIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIlIlIllllIl[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllllIl[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIlIIlIIIII) {
            lllllllllllllllIllIIllIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIlllllIlIlll(String lllllllllllllllIllIIllIlIIIIllll, String lllllllllllllllIllIIllIlIIIIlllI) {
        String lllllllllllllllIllIIllIlIIIIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIllIlIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIllIlIIIIlllI.toCharArray();
        int lllllllllllllllIllIIllIlIIIIlIll = lIlIlIllllIl[2];
        char[] charArray2 = lllllllllllllllIllIIllIlIIIIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIllllIl[2];
        while (llIllllllIIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIllIlIIIIlIll % charArray.length]));
            "".length();
            lllllllllllllllIllIIllIlIIIIlIll++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlllllIllllI(Object obj) {
        return obj == null;
    }

    private static String llIlllllIllIIl(String lllllllllllllllIllIIllIIlllllIlI, String lllllllllllllllIllIIllIIlllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIllIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIllIIllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIllIIllllllII.init(lIlIlIllllIl[8], lllllllllllllllIllIIllIIllllllIl);
            return new String(lllllllllllllllIllIIllIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIIlllllIll) {
            lllllllllllllllIllIIllIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllllIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllllIlllIl(int i) {
        return i != 0;
    }

    static {
        llIlllllIllIll();
        llIlllllIllIlI();
    }
}
