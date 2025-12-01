package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
@TaskDesc(name = "Stop Diving", priority = 40, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.j  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/j.class */
public class j extends Task {
    private final /* synthetic */ SquireDriftNet Q;
    private final /* synthetic */ Client R;
    private /* synthetic */ Player r;
    private static /* synthetic */ String[] lIlIIIIlIlIl;
    private static /* synthetic */ int[] lIlIIIIlIllI;

    private static String llIlIlIIIIIIII(String lllllllllllllllIlllIIlllIIIIlllI, String lllllllllllllllIlllIIlllIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllIIIlIIII.init(lIlIIIIlIllI[2], secretKeySpec);
            return new String(lllllllllllllllIlllIIlllIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIIIIllll) {
            lllllllllllllllIlllIIlllIIIIllll.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIIIIIl() {
        lIlIIIIlIlIl = new String[lIlIIIIlIllI[2]];
        lIlIIIIlIlIl[lIlIIIIlIllI[0]] = llIlIIllllllll("sHVqK7wjJWE1/pLRm0ffxg==", "BoFiY");
        lIlIIIIlIlIl[lIlIIIIlIllI[1]] = llIlIlIIIIIIII("xFgajuIt7BE=", "UiNGy");
    }

    private static String llIlIIllllllll(String lllllllllllllllIlllIIlllIIIIIIIl, String lllllllllllllllIlllIIlllIIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIllI[3]), "DES");
            Cipher lllllllllllllllIlllIIlllIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIIIIIIll.init(lIlIIIIlIllI[2], secretKeySpec);
            return new String(lllllllllllllllIlllIIlllIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIIIIIIlI) {
            lllllllllllllllIlllIIlllIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIIIIIIll(int i) {
        return i != 0;
    }

    private static void llIlIlIIIIIIlI() {
        lIlIIIIlIllI = new int[4];
        lIlIIIIlIllI[0] = (94 ^ 1) & ((7 ^ 88) ^ (-1));
        lIlIIIIlIllI[1] = " ".length();
        lIlIIIIlIllI[2] = "  ".length();
        lIlIIIIlIllI[3] = 46 ^ 38;
    }

    private static boolean llIlIlIIIIIlIl(int i, int i2) {
        return i != i2;
    }

    static {
        llIlIlIIIIIIlI();
        llIlIlIIIIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (llIlIlIIIIIIll(this.R.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIlIllI[0];
        }
        this.r = Players.getLocal();
        if (!llIlIlIIIIIlII(this.r) || llIlIlIIIIIlIl(this.r.getPlane(), lIlIIIIlIllI[1])) {
            return lIlIIIIlIllI[0];
        }
        String[] strArr = new String[lIlIIIIlIllI[1]];
        strArr[lIlIIIIlIllI[0]] = lIlIIIIlIlIl[lIlIIIIlIllI[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (llIlIlIIIIIlII(nearest) && llIlIlIIIIIlII(Equipment.fromSlot(EquipmentInventorySlot.WEAPON))) {
            nearest.interact(lIlIIIIlIlIl[lIlIIIIlIllI[1]]);
            return lIlIIIIlIllI[1];
        }
        return lIlIIIIlIllI[0];
    }

    @Inject
    public j(SquireDriftNet squireDriftNet, Client client) {
        this.Q = squireDriftNet;
        this.R = client;
    }

    private static boolean llIlIlIIIIIlII(Object obj) {
        return obj != null;
    }
}
