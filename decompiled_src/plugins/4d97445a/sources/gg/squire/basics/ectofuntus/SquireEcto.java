package gg.squire.basics.ectofuntus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.ectofuntus.overlay.EctoOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0016ap;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0017aq;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0018ar;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0020at;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0021au;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
@SquireUtil
@PluginDescriptor(name = "Squire Ectofuntus", description = "Gets you those HCIM prayer levels", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/ectofuntus/SquireEcto.class */
public class SquireEcto extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager bq;
    private static /* synthetic */ String[] llllIII;
    private static /* synthetic */ int[] llllIIl;
    @Inject
    private /* synthetic */ EctoOverlay cS;
    private /* synthetic */ boolean M = llllIIl[0];
    private /* synthetic */ int cT = llllIIl[0];
    private /* synthetic */ int cU = llllIIl[0];
    private /* synthetic */ int cV = llllIIl[0];

    public void s(int i2) {
        this.cV = i2;
    }

    public void q(int i2) {
        this.cT = i2;
    }

    public void r(int i2) {
        this.cU = i2;
    }

    private static String lllIlIIII(String lllIIlllIlIIlII, String lllIIlllIlIIIll) {
        try {
            SecretKeySpec lllIIlllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIl[3], lllIIlllIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIlllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlllIlIIlIl) {
            lllIIlllIlIIlIl.printStackTrace();
            return null;
        }
    }

    public int bm() {
        return this.cU;
    }

    private static String lllIIllll(String lllIIlllIlllIIl, String lllIIlllIlllIII) {
        String lllIIlllIlllIIl2 = new String(Base64.getDecoder().decode(lllIIlllIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlllIllIlll = new StringBuilder();
        char[] charArray = lllIIlllIlllIII.toCharArray();
        int lllIIlllIllIlIl = llllIIl[0];
        char[] charArray2 = lllIIlllIlllIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = llllIIl[0];
        while (lllIlIlIl(i2, length)) {
            char lllIIlllIlIllII = charArray2[i2];
            lllIIlllIllIlll.append((char) (lllIIlllIlIllII ^ charArray[lllIIlllIllIlIl % charArray.length]));
            "".length();
            lllIIlllIllIlIl++;
            i2++;
            "".length();
            if ("  ".length() >= ((88 ^ 105) ^ (244 ^ 193))) {
                return null;
            }
        }
        return String.valueOf(lllIIlllIllIlll);
    }

    private static boolean lllIlIIll(Object obj) {
        return obj == null;
    }

    private static void lllIlIIIl() {
        llllIII = new String[llllIIl[5]];
        llllIII[llllIIl[0]] = lllIIllll("GRcJCjcPQw==", "jchxC");
        llllIII[llllIIl[2]] = lllIIllll("MCxDDDECLUMDOkcsABY7FyEKAzhHPQxCJhInQxY8AmkTDiEAIA1M", "gIcbT");
        llllIII[llllIIl[3]] = lllIIllll("FhkXBDE=", "StgpH");
        llllIII[llllIIl[4]] = lllIlIIII("gQVpSaGTqks=", "BcODs");
    }

    @Provides
    SquireEctoConfig j(ConfigManager configManager) {
        return (SquireEctoConfig) configManager.getConfig(SquireEctoConfig.class);
    }

    protected void onStop() {
        this.bq.remove(this.cS);
        "".length();
    }

    public int bn() {
        return this.cV;
    }

    private static void lllIlIIlI() {
        llllIIl = new int[8];
        llllIIl[0] = (167 ^ 171) & ((133 ^ 137) ^ (-1));
        llllIIl[1] = (11 ^ 83) ^ (116 ^ 41);
        llllIIl[2] = " ".length();
        llllIIl[3] = "  ".length();
        llllIIl[4] = "   ".length();
        llllIIl[5] = (136 ^ 166) ^ (9 ^ 35);
        llllIIl[6] = (-((-12819) & 29559)) & (-10241) & 31231;
        llllIIl[7] = (-((-20491) & 32107)) & (-16898) & 32765;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llllIIl[1]];
        clsArr[llllIIl[0]] = C0017aq.class;
        clsArr[llllIIl[2]] = C0016ap.class;
        clsArr[llllIIl[3]] = C0020at.class;
        clsArr[llllIIl[4]] = C0021au.class;
        clsArr[llllIIl[5]] = C0018ar.class;
        return clsArr;
    }

    protected void onStart() {
        Log.info(llllIII[llllIIl[0]]);
        this.bq.add(this.cS);
        "".length();
    }

    public boolean r() {
        return this.M;
    }

    public void b(boolean z) {
        this.M = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean bk() {
        int[] iArr = new int[llllIIl[3]];
        iArr[llllIIl[0]] = llllIIl[6];
        iArr[llllIIl[2]] = llllIIl[7];
        Item first = Inventory.getFirst(iArr);
        if (lllIlIIll(first)) {
            Log.info(llllIII[llllIIl[2]]);
            return llllIIl[0];
        }
        String[] strArr = new String[llllIIl[2]];
        strArr[llllIIl[0]] = llllIII[llllIIl[3]];
        if (lllIlIlII(first.hasAction(strArr) ? 1 : 0)) {
            first.interact(llllIII[llllIIl[4]]);
            return llllIIl[2];
        }
        return llllIIl[0];
    }

    private static boolean lllIlIlII(int i2) {
        return i2 != 0;
    }

    private static boolean lllIlIlIl(int i2, int i3) {
        return i2 < i3;
    }

    public int bl() {
        return this.cT;
    }

    static {
        lllIlIIlI();
        lllIlIIIl();
    }
}
