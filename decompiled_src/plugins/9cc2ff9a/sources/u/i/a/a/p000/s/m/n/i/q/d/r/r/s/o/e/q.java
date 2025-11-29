package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Withdrawing items")
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.q  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/q.class */
public class q extends o {
    private /* synthetic */ int W;
    private static /* synthetic */ String[] lIIlIlIIllIIl;
    private /* synthetic */ CompletableFuture<Boolean> X;
    private /* synthetic */ BankLocation V;
    private final /* synthetic */ C0006g U;
    private static /* synthetic */ int[] lIIlIlIlIIIII;
    private static final /* synthetic */ int T;

    private static boolean lIlIlIllllIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    public boolean run() {
        if (!lIlIlIllllIIIll(S() ? 1 : 0) && !lIlIlIllllIIlII(this.U.s() ? 1 : 0)) {
            if (lIlIlIllllIIIll(this.O.a() ? 1 : 0)) {
                if (lIlIlIllllIIlII(T() ? 1 : 0)) {
                    String[] strArr = new String[lIIlIlIlIIIII[1]];
                    strArr[lIIlIlIlIIIII[0]] = lIIlIlIIllIIl[lIIlIlIlIIIII[0]];
                    strArr[lIIlIlIlIIIII[2]] = lIIlIlIIllIIl[lIIlIlIlIIIII[2]];
                    TileObject nearest = TileObjects.getNearest(strArr);
                    if (lIlIlIllllIIlIl(nearest) && lIlIlIllllIIlII(Reachable.isInteractable(nearest) ? 1 : 0)) {
                        this.O.a((boolean) lIIlIlIlIIIII[2]);
                    }
                }
                return lIIlIlIlIIIII[0];
            } else if (lIlIlIllllIIIll(T() ? 1 : 0)) {
                this.O.a((boolean) lIIlIlIlIIIII[0]);
                return lIIlIlIlIIIII[0];
            } else {
                BankLoadout bankLoadout = (BankLoadout) this.N.bankLoadout().selected(BankLoadout.class);
                if (!lIlIlIllllIIllI(bankLoadout) && !lIlIlIllllIIIll(Movement.shouldWalk() ? 1 : 0)) {
                    if (lIlIlIllllIIIll(Bank.open() ? 1 : 0)) {
                        if (lIlIlIllllIIllI(this.V)) {
                            this.V = BankLocation.getNearestCommon();
                        }
                        Movement.walkTo(this.V);
                        "".length();
                        return lIIlIlIlIIIII[2];
                    } else if (lIlIlIllllIIIll(Bank.isOpen() ? 1 : 0)) {
                        Bank.open();
                        "".length();
                        return lIIlIlIlIIIII[2];
                    } else if (lIlIlIllllIIIll(BankLoadouts.withdrawWithRetries(bankLoadout, lIIlIlIlIIIII[3]).booleanValue() ? 1 : 0)) {
                        Log.info(lIIlIlIIllIIl[lIIlIlIlIIIII[1]]);
                        return lIIlIlIlIIIII[0];
                    } else {
                        return lIIlIlIlIIIII[2];
                    }
                }
                return lIIlIlIlIIIII[0];
            }
        }
        return lIIlIlIlIIIII[0];
    }

    static {
        lIlIlIllllIIIlI();
        lIlIlIllllIIIIl();
        T = lIIlIlIlIIIII[4];
    }

    private static boolean lIlIlIllllIIlIl(Object obj) {
        return obj != null;
    }

    private static void lIlIlIllllIIIlI() {
        lIIlIlIlIIIII = new int[6];
        lIIlIlIlIIIII[0] = ((73 ^ 23) ^ (197 ^ 158)) & (((83 ^ 94) ^ (158 ^ 150)) ^ (-" ".length()));
        lIIlIlIlIIIII[1] = "  ".length();
        lIIlIlIlIIIII[2] = " ".length();
        lIIlIlIlIIIII[3] = (((45 + 87) - 12) + 34) ^ (((142 + 20) - 146) + 133);
        lIIlIlIlIIIII[4] = (-((-9489) & 13653)) & (-2185) & 32767;
        lIIlIlIlIIIII[5] = "   ".length();
    }

    private static void lIlIlIllllIIIIl() {
        lIIlIlIIllIIl = new String[lIIlIlIlIIIII[5]];
        lIIlIlIIllIIl[lIIlIlIlIIIII[0]] = lIlIlIlllIIIlIl("EhQIJXQyGgk6PA==", "PufNT");
        lIIlIlIIllIIl[lIIlIlIlIIIII[2]] = lIlIlIlllIIIlIl("JzgrBlAGMSAeBA==", "eYEmp");
        lIIlIlIIllIIl[lIIlIlIlIIIII[1]] = lIlIlIlllIIIllI("Xx7VkvqyTuT2TDSnLhvR9qV7JdasSZaHcC+WrVs/OOH+sJi5B4wDurNSc8lSiYU2Nkigh2u6D03qRFBDp+yKdRPyJRwchcbI", "NRrSn");
    }

    private static boolean lIlIlIllllIIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIllllIIIll(int i) {
        return i == 0;
    }

    private static boolean lIlIlIllllIIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIlllIIIlIl(String llllllllllllllIllllIllllIIlIIllI, String llllllllllllllIllllIllllIIlIIlIl) {
        String llllllllllllllIllllIllllIIlIIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIllllIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllllIIlIIlII = new StringBuilder();
        char[] charArray = llllllllllllllIllllIllllIIlIIlIl.toCharArray();
        int llllllllllllllIllllIllllIIlIIIlI = lIIlIlIlIIIII[0];
        char[] charArray2 = llllllllllllllIllllIllllIIlIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIlIIIII[0];
        while (lIlIlIllllIIlll(i, length)) {
            char llllllllllllllIllllIllllIIlIIlll = charArray2[i];
            llllllllllllllIllllIllllIIlIIlII.append((char) (llllllllllllllIllllIllllIIlIIlll ^ charArray[llllllllllllllIllllIllllIIlIIIlI % charArray.length]));
            "".length();
            llllllllllllllIllllIllllIIlIIIlI++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIllllIIlIIlII);
    }

    @Inject
    public q(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client, C0006g c0006g) {
        super(squireSaraConfig, squireSaradomin, client);
        this.U = c0006g;
    }

    private static String lIlIlIlllIIIllI(String llllllllllllllIllllIllllIIIlIIIl, String llllllllllllllIllllIllllIIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllllIIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllllIIIlIIll.init(lIIlIlIlIIIII[1], secretKeySpec);
            return new String(llllllllllllllIllllIllllIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllllIIIlIIlI) {
            llllllllllllllIllllIllllIIIlIIlI.printStackTrace();
            return null;
        }
    }
}
