package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking (Superheat)", priority = 150, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.K  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/K.class */
public class K extends Task {
    private final /* synthetic */ int[] al;
    private static /* synthetic */ int[] llllllIllIII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private final /* synthetic */ int[] am;
    private static /* synthetic */ String[] llllllIlIlll;

    private static String lIIlIlIIlIllIIl(String lllllllllllllllIIlIIIllIIIlIlIll, String lllllllllllllllIIlIIIllIIIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIllIII[5], lllllllllllllllIIlIIIllIIIlIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllIIIlIllII) {
            lllllllllllllllIIlIIIllIIIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIIlIlllII();
        lIIlIlIIlIllIll();
    }

    private static boolean lIIlIlIIllIIIII(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIlIllllI(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIlIlllll(Object obj) {
        return obj != null;
    }

    public K() {
        int[] iArr = new int[llllllIllIII[0]];
        iArr[llllllIllIII[1]] = llllllIllIII[2];
        iArr[llllllIllIII[3]] = llllllIllIII[4];
        iArr[llllllIllIII[5]] = llllllIllIII[6];
        iArr[llllllIllIII[7]] = llllllIllIII[8];
        this.al = iArr;
        int[] iArr2 = new int[llllllIllIII[5]];
        iArr2[llllllIllIII[1]] = llllllIllIII[9];
        iArr2[llllllIllIII[3]] = llllllIllIII[10];
        this.am = iArr2;
    }

    private static boolean lIIlIlIIllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIlIIlIllIlI(String lllllllllllllllIIlIIIllIIIIllllI, String lllllllllllllllIIlIIIllIIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), llllllIllIII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIllIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllIIIIlllll) {
            lllllllllllllllIIlIIIllIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIlIlllIl(this.f.activity(), EnumC0000a.SUPERHEAT_MINE) && !lIIlIlIIlIllllI(Inventory.isFull() ? 1 : 0)) {
            String selected = this.f.bankLoadout().getSelected();
            if (!lIIlIlIIlIlllll(selected) || lIIlIlIIllIIIII(selected.equals(llllllIlIlll[llllllIllIII[1]]) ? 1 : 0)) {
                return llllllIllIII[1];
            }
            BankLoadout bankLoadout = (BankLoadout) this.f.bankLoadout().selected(BankLoadout.class);
            if (lIIlIlIIllIIIII(Bank.isOpen() ? 1 : 0) && lIIlIlIIlIllllI(BankLoadouts.withdrawWithRetries(bankLoadout, llllllIllIII[11]).booleanValue() ? 1 : 0)) {
                Log.info(llllllIlIlll[llllllIllIII[3]]);
                return llllllIllIII[3];
            }
            Player local = Players.getLocal();
            WorldPoint center = BankLocation.ARDOUGNE_SOUTH_BANK.getArea().getCenter();
            if (lIIlIlIIllIIIIl(local.distanceTo(center), llllllIllIII[12])) {
                Movement.walkTo(center, (boolean) llllllIllIII[1]);
                "".length();
                return llllllIllIII[3];
            }
            Bank.open();
            "".length();
            return llllllIllIII[3];
        }
        return llllllIllIII[1];
    }

    private static void lIIlIlIIlIllIll() {
        llllllIlIlll = new String[llllllIllIII[5]];
        llllllIlIlll[llllllIllIII[1]] = lIIlIlIIlIllIIl("NHBMWvWpnT8=", "hrwIa");
        llllllIlIlll[llllllIllIII[3]] = lIIlIlIIlIllIlI("gtGjzVTFRrIy5mY/r+pVgeiv/JrFy6m0nsClnPBYiF90cylvOoWYNw==", "mnxkE");
    }

    private static void lIIlIlIIlIlllII() {
        llllllIllIII = new int[13];
        llllllIllIII[0] = (200 ^ 182) ^ (249 ^ 131);
        llllllIllIII[1] = (110 ^ 81) & ((117 ^ 74) ^ (-1));
        llllllIllIII[2] = ((174 + 79) - 188) + 184;
        llllllIllIII[3] = " ".length();
        llllllIllIII[4] = ((130 + 146) - 74) + 49;
        llllllIllIII[5] = "  ".length();
        llllllIllIII[6] = ((220 + 129) - 213) + 117;
        llllllIllIII[7] = "   ".length();
        llllllIllIII[8] = ((209 + 28) - 60) + 78;
        llllllIllIII[9] = (-((-4406) & 21879)) & (-8705) & 32509;
        llllllIllIII[10] = (-((-12753) & 29137)) & (-9987) & 32703;
        llllllIllIII[11] = (((88 + 46) - 125) + 127) ^ (((116 + 96) - 163) + 92);
        llllllIllIII[12] = (5 ^ 76) ^ (73 ^ 8);
    }
}
