package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Grabbing death items [DEATH]", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.F  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/F.class */
public class F extends E {
    @Inject
    private /* synthetic */ SquireVardorvisConfig t;
    private static /* synthetic */ int[] lIlIlIIIIIlll;
    private static final /* synthetic */ int ax;
    private static /* synthetic */ String[] lIlIIlllllIlI;

    private static boolean lIllllIlIIIIlll(int i) {
        return i != 0;
    }

    private static boolean lIllllIlIIIIlIl(int i) {
        return i == 0;
    }

    static {
        lIllllIlIIIIlII();
        lIllllIIlIllIIl();
        ax = lIlIlIIIIIlll[2];
    }

    private static void lIllllIlIIIIlII() {
        lIlIlIIIIIlll = new int[4];
        lIlIlIIIIIlll[0] = ((2 ^ 43) ^ (19 ^ 123)) & (((5 ^ 119) ^ (18 ^ 33)) ^ (-" ".length()));
        lIlIlIIIIIlll[1] = " ".length();
        lIlIlIIIIIlll[2] = (-18797) & 28652;
        lIlIlIIIIIlll[3] = "  ".length();
    }

    private static void lIllllIIlIllIIl() {
        lIlIIlllllIlI = new String[lIlIlIIIIIlll[1]];
        lIlIIlllllIlI[lIlIlIIIIIlll[0]] = lIllllIIlIllIII("GdQrW8K5kqM=", "wccyD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.E
    public boolean l() {
        if (lIllllIlIIIIlIl(av.contains(Players.getLocal()) ? 1 : 0)) {
            return lIlIlIIIIIlll[0];
        }
        int[] iArr = new int[lIlIlIIIIIlll[1]];
        iArr[lIlIlIIIIIlll[0]] = lIlIlIIIIIlll[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIllllIlIIIIllI(nearest)) {
            this.aw.d((boolean) lIlIlIIIIIlll[0]);
            this.aw.c((boolean) lIlIlIIIIIlll[1]);
            return lIlIlIIIIIlll[0];
        } else if (!lIllllIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
            nearest.interact(lIlIIlllllIlI[lIlIlIIIIIlll[0]]);
            return lIlIlIIIIIlll[1];
        } else {
            Gear.swapTo(((BankLoadout) this.t.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup());
            "".length();
            return lIlIlIIIIIlll[1];
        }
    }

    private static String lIllllIIlIllIII(String llllllllllllllIllIllIIlIIlIIllll, String llllllllllllllIllIllIIlIIlIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIlIIlIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIlIIlIlIIIl.init(lIlIlIIIIIlll[3], secretKeySpec);
            return new String(llllllllllllllIllIllIIlIIlIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIIlIlIIII) {
            llllllllllllllIllIllIIlIIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIIllI(Object obj) {
        return obj == null;
    }
}
