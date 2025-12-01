package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Digging next brother", priority = 100, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.q  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/q.class */
public class q extends Task {
    private final /* synthetic */ SquireBarrows X;
    private static /* synthetic */ int[] llllIlIIllI;
    private final /* synthetic */ a Y;
    private static /* synthetic */ String[] llllIlIIlIl;
    private final /* synthetic */ Client Z;

    private static String lIllIlIlIlIlIl(String llllllllllllllllIIIllIlIIIIllIIl, String llllllllllllllllIIIllIlIIIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIlIIIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIlIIIIllIll.init(llllIlIIllI[4], secretKeySpec);
            return new String(llllllllllllllllIIIllIlIIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIlIIIIllIlI) {
            llllllllllllllllIIIllIlIIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIlllIl(Object obj) {
        return obj != null;
    }

    private static String lIllIlIlIlIllI(String llllllllllllllllIIIllIlIIIIIllII, String llllllllllllllllIIIllIlIIIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), llllIlIIllI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIlIIIIIlIII) {
            llllllllllllllllIIIllIlIIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlIlII(String llllllllllllllllIIIllIIlllllllII, String llllllllllllllllIIIllIIllllllIll) {
        String llllllllllllllllIIIllIIlllllllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIlllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllIIllllllIll.toCharArray();
        int llllllllllllllllIIIllIIllllllIII = llllIlIIllI[0];
        char[] charArray2 = llllllllllllllllIIIllIIlllllllII2.toCharArray();
        int length = charArray2.length;
        int i = llllIlIIllI[0];
        while (lIllIlIlIllllI(i, length)) {
            char llllllllllllllllIIIllIIlllllllIl = charArray2[i];
            sb.append((char) (llllllllllllllllIIIllIIlllllllIl ^ charArray[llllllllllllllllIIIllIIllllllIII % charArray.length]));
            "".length();
            llllllllllllllllIIIllIIllllllIII++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    public boolean run() {
        if (!lIllIlIlIllIIl(this.X.u() ? 1 : 0) && !lIllIlIlIllIIl(this.X.h() ? 1 : 0) && !lIllIlIlIllIIl(this.Z.isInInstancedRegion() ? 1 : 0) && !lIllIlIlIllIlI(this.X.m() ? 1 : 0)) {
            d n = this.X.n();
            if (lIllIlIlIllIlI(Movement.isRunEnabled() ? 1 : 0) && lIllIlIlIllIll(Movement.getRunEnergy(), llllIlIIllI[1])) {
                Movement.toggleRun();
            }
            WorldPoint D = n.D();
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (lIllIlIlIllIlI(Gear.isEquipped(this.Y.c(n)) ? 1 : 0)) {
                Gear.swapTo(this.Y.c(n));
                "".length();
            }
            int[] iArr = new int[llllIlIIllI[2]];
            iArr[llllIlIIllI[0]] = llllIlIIllI[3];
            if (lIllIlIlIlllII(Inventory.getFirst(iArr))) {
                int[] iArr2 = new int[llllIlIIllI[2]];
                iArr2[llllIlIIllI[0]] = llllIlIIllI[3];
                TileItem nearest = TileItems.getNearest(iArr2);
                if (!lIllIlIlIlllIl(nearest)) {
                    Log.info(llllIlIIlIl[llllIlIIllI[2]]);
                    return llllIlIIllI[0];
                }
                nearest.interact(llllIlIIlIl[llllIlIIllI[0]]);
                sleep(llllIlIIllI[4]);
                return llllIlIIllI[2];
            }
            if (lIllIlIlIllllI(D.distanceTo2D(worldLocation), llllIlIIllI[4])) {
                String str = llllIlIIlIl[llllIlIIllI[4]];
                int[] iArr3 = new int[llllIlIIllI[2]];
                iArr3[llllIlIIllI[0]] = llllIlIIllI[3];
                Inventory.interact(str, iArr3);
                "".length();
                sleep(llllIlIIllI[5]);
                this.X.j();
                this.X.b(n);
                "".length();
                if ("  ".length() < " ".length()) {
                    return ((((201 + 109) - 134) + 62) ^ (((10 + 155) - (-18)) + 8)) & (((114 ^ 6) ^ (35 ^ 6)) ^ (-" ".length()));
                }
            } else if (lIllIlIlIlllll(worldLocation.getRegionID(), D.getRegionID())) {
                Movement.setDestination(D);
            }
            return llllIlIIllI[2];
        }
        return llllIlIIllI[0];
    }

    static {
        lIllIlIlIllIII();
        lIllIlIlIlIlll();
    }

    private static boolean lIllIlIlIlllll(int i, int i2) {
        return i == i2;
    }

    private static void lIllIlIlIllIII() {
        llllIlIIllI = new int[8];
        llllIlIIllI[0] = ((((147 + 72) - 21) + 42) ^ (((120 + 89) - 191) + 146)) & (((167 ^ 195) ^ (4 ^ 52)) ^ (-" ".length()));
        llllIlIIllI[1] = 125 ^ 105;
        llllIlIIllI[2] = " ".length();
        llllIlIIllI[3] = (-11267) & 12218;
        llllIlIIllI[4] = "  ".length();
        llllIlIIllI[5] = (((113 + 84) - 181) + 183) ^ (((156 + 140) - 294) + 193);
        llllIlIIllI[6] = "   ".length();
        llllIlIIllI[7] = 59 ^ 51;
    }

    private static boolean lIllIlIlIllIll(int i, int i2) {
        return i > i2;
    }

    private static void lIllIlIlIlIlll() {
        llllIlIIlIl = new String[llllIlIIllI[6]];
        llllIlIIlIl[llllIlIIllI[0]] = lIllIlIlIlIlII("BTYuFg==", "QWEsk");
        llllIlIIlIl[llllIlIIllI[2]] = lIllIlIlIlIlIl("qKM6PsOQFLZaE7MrUqY7gE+ew8O7gyz8if8qfgW1ASNKPb5FDJxLThWlj3SREmCj", "IAEsq");
        llllIlIIlIl[llllIlIIllI[4]] = lIllIlIlIlIllI("II6p4QjMuDw=", "cBjOQ");
    }

    private static boolean lIllIlIlIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIlIlIlllII(Object obj) {
        return obj == null;
    }

    @Inject
    public q(SquireBarrows squireBarrows, a aVar, Client client) {
        this.X = squireBarrows;
        this.Y = aVar;
        this.Z = client;
    }

    private static boolean lIllIlIlIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIlIlIllllI(int i, int i2) {
        return i < i2;
    }
}
