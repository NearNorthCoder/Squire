package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Looting", blocking = true, priority = 50000)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.B  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/B.class */
public class B extends Task {
    private final /* synthetic */ SquireVardorvis at;
    private static /* synthetic */ String[] lIlIlIIlIlllI;
    private /* synthetic */ C0004e l;
    private final /* synthetic */ SquireVardorvisConfig au;
    private static /* synthetic */ int[] lIlIlIIlIllll;

    private static void lIlllllIIIIlIII() {
        lIlIlIIlIllll = new int[6];
        lIlIlIIlIllll[0] = (247 ^ 196) & ((91 ^ 104) ^ (-1));
        lIlIlIIlIllll[1] = " ".length();
        lIlIlIIlIllll[2] = "  ".length();
        lIlIlIIlIllll[3] = "   ".length();
        lIlIlIIlIllll[4] = (0 ^ 95) ^ (219 ^ 128);
        lIlIlIIlIllll[5] = (98 ^ 87) ^ (59 ^ 6);
    }

    @Inject
    public B(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.au = squireVardorvisConfig;
        this.at = squireVardorvis;
        this.l = squireVardorvis.j();
    }

    private static boolean lIlllllIIIIlIIl(int i) {
        return i == 0;
    }

    private static String lIlllllIIIIIlIl(String llllllllllllllIllIlIlllIllIIIIII, String llllllllllllllIllIlIlllIlIllllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlIllll[2], llllllllllllllIllIlIlllIllIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIllIIIIIl) {
            llllllllllllllIllIlIlllIllIIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public boolean run() {
        if (lIlllllIIIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIlIllll[0];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            return C0006g.Q.contains(tileItem.getName());
        });
        if (lIlllllIIIIlIlI(nearest)) {
            if (lIlllllIIIIlIIl(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && lIlllllIIIIlIIl(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                return lIlIlIIlIllll[0];
            }
            nearest = TileItems.getNearest(tileItem2 -> {
                return tileItem2.getName().startsWith(lIlIlIIlIlllI[lIlIlIIlIllll[3]]);
            });
            if (lIlllllIIIIlIlI(nearest)) {
                return lIlIlIIlIllll[0];
            }
        }
        if (!lIlllllIIIIlIll(Inventory.isFull() ? 1 : 0)) {
            nearest.interact(lIlIlIIlIlllI[lIlIlIIlIllll[1]]);
            return lIlIlIIlIllll[1];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlIIlIllll[1]];
            strArr[lIlIlIIlIllll[0]] = lIlIlIIlIlllI[lIlIlIIlIllll[2]];
            return item.hasAction(strArr);
        });
        if (lIlllllIIIIlIlI(first)) {
            this.at.c((boolean) lIlIlIIlIllll[1]);
            return lIlIlIIlIllll[0];
        }
        first.interact(lIlIlIIlIlllI[lIlIlIIlIllll[0]]);
        return lIlIlIIlIllll[1];
    }

    private static boolean lIlllllIIIIlIll(int i) {
        return i != 0;
    }

    private static void lIlllllIIIIIlll() {
        lIlIlIIlIlllI = new String[lIlIlIIlIllll[4]];
        lIlIlIIlIlllI[lIlIlIIlIllll[0]] = lIlllllIIIIIlIl("bsc+iwMoKb0=", "dmXmW");
        lIlIlIIlIlllI[lIlIlIIlIllll[1]] = lIlllllIIIIIllI("Xc2d6hR7TK0=", "jnKJP");
        lIlIlIIlIlllI[lIlIlIIlIllll[2]] = lIlllllIIIIIllI("OVgrrWluylY=", "yNHSA");
        lIlIlIIlIlllI[lIlIlIIlIllll[3]] = lIlllllIIIIIlIl("e3NCNSZUWErfsQXz3J76urcOVHUZOzta", "KCiFm");
    }

    private static boolean lIlllllIIIIlIlI(Object obj) {
        return obj == null;
    }

    static {
        lIlllllIIIIlIII();
        lIlllllIIIIIlll();
    }

    private static String lIlllllIIIIIllI(String llllllllllllllIllIlIlllIllIIllIl, String llllllllllllllIllIlIlllIllIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIllIIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIllll[5]), "DES");
            Cipher llllllllllllllIllIlIlllIllIIllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIlllIllIIllll.init(lIlIlIIlIllll[2], secretKeySpec);
            return new String(llllllllllllllIllIlIlllIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIllIIlIIl) {
            llllllllllllllIllIlIlllIllIIlIIl.printStackTrace();
            return null;
        }
    }
}
