package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Scouting for a raid", priority = 20000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.V  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/V.class */
public class V extends U {
    private /* synthetic */ int cs;
    private static /* synthetic */ String[] lIlIIlIIIlII;
    private static /* synthetic */ int[] lIlIIlIIIlIl;

    private static String llIllIIIIIlIll(String lllllllllllllllIllIlllIIllIIIIIl, String lllllllllllllllIllIlllIIllIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIIllIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlIl[6]), "DES");
            Cipher lllllllllllllllIllIlllIIllIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIlllIIllIIIIll.init(lIlIIlIIIlIl[3], lllllllllllllllIllIlllIIllIIIlII);
            return new String(lllllllllllllllIllIlllIIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIIllIIIIlI) {
            lllllllllllllllIllIlllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    private static void llIllIIIIIllII() {
        lIlIIlIIIlII = new String[lIlIIlIIIlIl[2]];
        lIlIIlIIIlII[lIlIIlIIIlIl[0]] = llIllIIIIIlIlI("23ByTFW2tIkz3AHP5N7z7ACRGuP6Iyjn", "AyFrH");
        lIlIIlIIIlII[lIlIIlIIIlIl[1]] = llIllIIIIIlIll("Ohtc5SzTkbj4qjBaKi2HxMVgv3sgx8g6", "FeCqh");
        lIlIIlIIIlII[lIlIIlIIIlIl[3]] = llIllIIIIIlIlI("fAqrmdvxPB0=", "iOQCR");
        lIlIIlIIIlII[lIlIIlIIIlIl[4]] = llIllIIIIIlIlI("5YcT+RluFro=", "kiSqQ");
        lIlIIlIIIlII[lIlIIlIIIlIl[5]] = llIllIIIIIlIll("xbyvayT0OGY=", "rzXPs");
    }

    private static boolean llIllIIIIlIIII(Object obj) {
        return obj == null;
    }

    private static String llIllIIIIIlIlI(String lllllllllllllllIllIlllIIlIllIlII, String lllllllllllllllIllIlllIIlIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIIlIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIIlIllIlIl) {
            lllllllllllllllIllIlllIIlIllIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected V(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.cs = lIlIIlIIIlIl[0];
    }

    private static boolean llIllIIIIIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllIIIIIlllI(this.cs)) {
            this.cs -= lIlIIlIIIlIl[1];
            return lIlIIlIIIlIl[1];
        } else if (llIllIIIIIllll(ck() ? 1 : 0)) {
            return lIlIIlIIIlIl[0];
        } else {
            if (llIllIIIIIllll(Dialog.isViewingOptions() ? 1 : 0) && llIllIIIIIllll(Dialog.hasOption(lIlIIlIIIlII[lIlIIlIIIlIl[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIIIlIl[1]];
                strArr[lIlIIlIIIlIl[0]] = lIlIIlIIIlII[lIlIIlIIIlIl[1]];
                Dialog.chooseOption(strArr);
                "".length();
                this.cs = lIlIIlIIIlIl[2];
                return lIlIIlIIIlIl[1];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIllIIIIIllll(tileObject.getName().equals(lIlIIlIIIlII[lIlIIlIIIlIl[4]]) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIlIIIlIl[1]];
                    strArr2[lIlIIlIIIlIl[0]] = lIlIIlIIIlII[lIlIIlIIIlIl[5]];
                    if (llIllIIIIIllll(tileObject.hasAction(strArr2) ? 1 : 0)) {
                        ?? r0 = lIlIIlIIIlIl[1];
                        "".length();
                        return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIIlIIIlIl[0];
            });
            if (llIllIIIIlIIII(nearest)) {
                return lIlIIlIIIlIl[0];
            }
            nearest.interact(lIlIIlIIIlII[lIlIIlIIIlIl[3]]);
            this.cs = lIlIIlIIIlIl[3];
            return lIlIIlIIIlIl[1];
        }
    }

    static {
        llIllIIIIIllIl();
        llIllIIIIIllII();
    }

    private static boolean llIllIIIIIlllI(int i) {
        return i > 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllIIIIlIIIl(C0046u.bf() ? 1 : 0)) {
            ?? r0 = lIlIIlIIIlIl[1];
            "".length();
            return "   ".length() <= " ".length() ? ((230 ^ 137) ^ (111 ^ 36)) & (((((28 + 2) - (-85)) + 14) ^ (((107 + 91) - 109) + 76)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIIIlIl[0];
    }

    private static void llIllIIIIIllIl() {
        lIlIIlIIIlIl = new int[7];
        lIlIIlIIIlIl[0] = (125 ^ 32) & ((246 ^ 171) ^ (-1));
        lIlIIlIIIlIl[1] = " ".length();
        lIlIIlIIIlIl[2] = (81 ^ 55) ^ (78 ^ 45);
        lIlIIlIIIlIl[3] = "  ".length();
        lIlIIlIIIlIl[4] = "   ".length();
        lIlIIlIIIlIl[5] = 199 ^ 195;
        lIlIIlIIIlIl[6] = (63 ^ 66) ^ (202 ^ 191);
    }
}
