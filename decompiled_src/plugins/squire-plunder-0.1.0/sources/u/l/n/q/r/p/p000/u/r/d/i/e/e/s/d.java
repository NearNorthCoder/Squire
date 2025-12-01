package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunder;
import gg.squire.thieving.SquirePlunderConfig;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Banking", priority = 25)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.d  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/d.class */
public class d extends Task {
    private static /* synthetic */ String[] llllllIIlIIl;
    private final /* synthetic */ SquirePlunder r;

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ Client f0u;
    private static /* synthetic */ int[] llllllIIlIlI;
    private final /* synthetic */ a s;
    private final /* synthetic */ SquirePlunderConfig t;

    static {
        lIIlIlIIIIlIIII();
        lIIlIlIIIIIllll();
    }

    private static boolean lIIlIlIIIIlIIll(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIlIIIIlIIII() {
        llllllIIlIlI = new int[8];
        llllllIIlIlI[0] = " ".length();
        llllllIIlIlI[1] = ((143 ^ 198) ^ "  ".length()) & (((((119 + 99) - 201) + 214) ^ (((66 + 44) - 42) + 104)) ^ (-" ".length()));
        llllllIIlIlI[2] = (-((-21891) & 30083)) & (-16385) & 26951;
        llllllIIlIlI[3] = (-((-6289) & 31161)) & (-129) & 32749;
        llllllIIlIlI[4] = (-21521) & 24319;
        llllllIIlIlI[5] = (-26763) & 31931;
        llllllIIlIlI[6] = "  ".length();
        llllllIIlIlI[7] = (((54 + 61) - 15) + 52) ^ (((132 + 54) - 109) + 67);
    }

    private static String lIIlIlIIIIIllIl(String lllllllllllllllIIlIIlllIllIlIIII, String lllllllllllllllIIlIIlllIllIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIllIIllll.getBytes(StandardCharsets.UTF_8)), llllllIIlIlI[7]), "DES");
            Cipher lllllllllllllllIIlIIlllIllIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlllIllIlIIlI.init(llllllIIlIlI[6], secretKeySpec);
            return new String(lllllllllllllllIIlIIlllIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllIllIlIIIl) {
            lllllllllllllllIIlIIlllIllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIlIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIlIIIIIllll() {
        llllllIIlIIl = new String[llllllIIlIlI[6]];
        llllllIIlIIl[llllllIIlIlI[1]] = lIIlIlIIIIIllIl("wFa2qk0c0h17lPXu3kKWDSYceQNW7dtFciDzf/XvXtw1p9U+q8IbCoBEqVRIFjh9d12MVhzwp1w=", "BMSDu");
        llllllIIlIIl[llllllIIlIlI[0]] = lIIlIlIIIIIlllI("lFzCQ4ECWf2cffdR+qV/zUGqm3K/VwKd3sx4qlKhuK8i4W7EDkMUgfYbI08NW6j7uSLfLtdo+yJO8Al26md4pw==", "qCATi");
    }

    private static boolean lIIlIlIIIIlIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llllllIIlIlI[0]];
        iArr[llllllIIlIlI[1]] = this.t.foodID();
        if ((!lIIlIlIIIIlIIIl(Inventory.getCount(iArr), this.t.minFoodAmount()) || !lIIlIlIIIIlIIIl(Inventory.getCount(item -> {
            return item.getName().startsWith(this.t.antiPoison());
        }), this.t.minAntiAmount())) && !lIIlIlIIIIlIIlI(this.f0u.getVarbitValue(llllllIIlIlI[2])) && !lIIlIlIIIIlIIll(Players.getLocal().getWorldLocation().getRegionID(), llllllIIlIlI[3]) && !lIIlIlIIIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            if (lIIlIlIIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                if (lIIlIlIIIIlIIlI(this.t.foodAmount())) {
                    ?? r0 = llllllIIlIlI[0];
                    int[] iArr2 = new int[llllllIIlIlI[0]];
                    iArr2[llllllIIlIlI[1]] = this.t.foodID();
                    if (lIIlIlIIIIlIlIl(Bank.getCount((boolean) r0, iArr2), this.t.foodAmount())) {
                        Log.info(llllllIIlIIl[llllllIIlIlI[1]]);
                        this.r.forceStop();
                        return llllllIIlIlI[0];
                    }
                }
                if (lIIlIlIIIIlIIlI(this.t.antiAmount()) && lIIlIlIIIIlIlIl(Bank.getCount((boolean) llllllIIlIlI[0], item2 -> {
                    return item2.getName().startsWith(this.t.antiPoison());
                }), this.t.antiAmount())) {
                    Log.info(llllllIIlIIl[llllllIIlIlI[0]]);
                    this.r.forceStop();
                    return llllllIIlIlI[0];
                }
                this.r.b().withdraw();
                "".length();
            }
            if (lIIlIlIIIIlIlII(Bank.open() ? 1 : 0)) {
                PrintStream printStream = System.out;
                int[] iArr3 = new int[llllllIIlIlI[0]];
                iArr3[llllllIIlIlI[1]] = this.t.foodID();
                printStream.println("Walking to bank; Food in inventory: " + Inventory.getCount(iArr3) + " amount wanted " + this.t.minFoodAmount());
                Movement.walkTo(new WorldPoint(llllllIIlIlI[4], llllllIIlIlI[5], llllllIIlIlI[1]));
                "".length();
                return llllllIIlIlI[0];
            }
            return llllllIIlIlI[1];
        }
        return llllllIIlIlI[1];
    }

    private static boolean lIIlIlIIIIlIlII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIIIlIlIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public d(SquirePlunder squirePlunder, a aVar, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.r = squirePlunder;
        this.s = aVar;
        this.t = squirePlunderConfig;
        this.f0u = client;
    }

    private static String lIIlIlIIIIIlllI(String lllllllllllllllIIlIIlllIllIIIIll, String lllllllllllllllIIlIIlllIllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIlIlI[6], lllllllllllllllIIlIIlllIllIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllIllIIIlII) {
            lllllllllllllllIIlIIlllIllIIIlII.printStackTrace();
            return null;
        }
    }
}
