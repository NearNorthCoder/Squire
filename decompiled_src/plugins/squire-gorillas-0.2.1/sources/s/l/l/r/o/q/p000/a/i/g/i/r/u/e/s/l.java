package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Banking", priority = 100, blocking = true)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.l  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/l.class */
public class l extends j {
    private static /* synthetic */ String[] llIIlIllllll;
    @Inject
    private /* synthetic */ SquireGorillaPlugin P;
    private static /* synthetic */ int[] llIIllIIIIII;

    private static boolean lllllIllllIlIl(int i) {
        return i == 0;
    }

    private static void lllllIllllIlII() {
        llIIllIIIIII = new int[6];
        llIIllIIIIII[0] = (-((-9825) & 28386)) & (-321) & 28663;
        llIIllIIIIII[1] = (213 ^ 192) & ((34 ^ 55) ^ (-1));
        llIIllIIIIII[2] = " ".length();
        llIIllIIIIII[3] = (64 ^ 56) ^ (44 ^ 77);
        llIIllIIIIII[4] = "  ".length();
        llIIllIIIIII[5] = "   ".length();
    }

    private static boolean lllllIllllIllI(Object obj) {
        return obj == null;
    }

    private static String lllllIllllIIlI(String lllllllllllllllIlIIlllIlIIIllIlI, String lllllllllllllllIlIIlllIlIIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIlIIIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIlIIIlllII.init(llIIllIIIIII[4], secretKeySpec);
            return new String(lllllllllllllllIlIIlllIlIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIlIIIllIll) {
            lllllllllllllllIlIIlllIlIIIllIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public l(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    static {
        lllllIllllIlII();
        lllllIllllIIll();
    }

    private static String lllllIllllIIIl(String lllllllllllllllIlIIlllIlIIIIIlIl, String lllllllllllllllIlIIlllIlIIIIlIIl) {
        String lllllllllllllllIlIIlllIlIIIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIlllIlIIIIIlll = lllllllllllllllIlIIlllIlIIIIlIIl.toCharArray();
        int lllllllllllllllIlIIlllIlIIIIIllI = llIIllIIIIII[1];
        char[] charArray = lllllllllllllllIlIIlllIlIIIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = llIIllIIIIII[1];
        while (lllllIllllIlll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIIlllIlIIIIIlll[lllllllllllllllIlIIlllIlIIIIIllI % lllllllllllllllIlIIlllIlIIIIIlll.length]));
            "".length();
            lllllllllllllllIlIIlllIlIIIIIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllllIllllIIll() {
        llIIlIllllll = new String[llIIllIIIIII[5]];
        llIIlIllllll[llIIllIIIIII[1]] = lllllIllllIIIl("BQcHLU8lCQYyBw==", "GfiFo");
        llIIlIllllll[llIIllIIIIII[2]] = lllllIllllIIlI("UDEHO1cgiHo=", "sNKUa");
        llIIlIllllll[llIIllIIIIII[4]] = lllllIllllIIIl("FQ44DhUuCDsMQSEOPAUGZhYnBA8hQTcKDy0IOwxBNRU6GxEvDzJLESoUMgIP", "FaUka");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public boolean run() {
        if (lllllIllllIlIl(Locations.isRegionLoaded(llIIllIIIIII[0]) ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        BankLoadout bankLoadout = (BankLoadout) this.T.bankLoadout().selected(BankLoadout.class);
        if (lllllIllllIlIl(J() ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        if (!lllllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            if (lllllIllllIlIl(BankLoadouts.withdrawWithRetries(bankLoadout, llIIllIIIIII[3]).booleanValue() ? 1 : 0)) {
                Log.info(llIIlIllllll[llIIllIIIIII[4]]);
                return llIIllIIIIII[1];
            }
            return llIIllIIIIII[2];
        }
        String[] strArr = new String[llIIllIIIIII[2]];
        strArr[llIIllIIIIII[1]] = llIIlIllllll[llIIllIIIIII[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lllllIllllIllI(nearest)) {
            Movement.walkTo(R);
            "".length();
            return llIIllIIIIII[2];
        } else if (!lllllIllllIlIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(llIIlIllllll[llIIllIIIIII[2]]);
            return llIIllIIIIII[2];
        } else {
            Movement.walkTo(nearest.getWorldLocation());
            "".length();
            return llIIllIIIIII[2];
        }
    }

    private static boolean lllllIllllIlll(int i, int i2) {
        return i < i2;
    }
}
