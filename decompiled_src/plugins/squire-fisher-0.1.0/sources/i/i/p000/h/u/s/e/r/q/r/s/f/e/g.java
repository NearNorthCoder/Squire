package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Banking")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.g  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/g.class */
public class g extends Task {
    private final /* synthetic */ SquireFisherConfig I;
    private final /* synthetic */ SquireFisherPlugin H;
    private static /* synthetic */ String[] lIlllIlIlIII;
    private static final /* synthetic */ Logger F;
    public static final /* synthetic */ int G;
    private static /* synthetic */ int[] lIlllIlIlIIl;

    private static String lllIlIlIllllII(String lllllllllllllllIlIlllIlllIIIllIl, String lllllllllllllllIlIlllIlllIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlllIIIllII.getBytes(StandardCharsets.UTF_8)), lIlllIlIlIIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIlIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlllIIIlllI) {
            lllllllllllllllIlIlllIlllIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllIIIIII(int i2) {
        return i2 == 0;
    }

    private static boolean lllIlIllIIIlIl(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lllIlIllIIIIll(int i2) {
        return i2 > 0;
    }

    private static String lllIlIlIllllIl(String lllllllllllllllIlIlllIllIlllllIl, String lllllllllllllllIlIlllIllIlllllII) {
        String lllllllllllllllIlIlllIllIlllllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIllIlllllII.toCharArray();
        int lllllllllllllllIlIlllIllIllllIIl = lIlllIlIlIIl[0];
        char[] charArray2 = lllllllllllllllIlIlllIllIlllllIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlllIlIlIIl[0];
        while (lllIlIllIIIllI(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[lllllllllllllllIlIlllIllIllllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIllIllllIIl++;
            i2++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIlIllIIIIIl(int i2) {
        return i2 != 0;
    }

    @Inject
    public g(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.H = squireFisherPlugin;
        this.I = squireFisherConfig;
    }

    private static boolean lllIlIllIIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIllIIIllI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    public boolean run() {
        BankLocation nearest;
        if (!lllIlIllIIIIII(this.I.fishingTrawler() ? 1 : 0) || lllIlIllIIIIII(this.I.banking() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (lllIlIllIIIIIl(this.I.butlerBanking() ? 1 : 0) && lllIlIllIIIIlI(this.I.fish(), f.KARAMBWAN)) {
            return lIlllIlIlIIl[0];
        }
        if ((!lllIlIllIIIIII(Inventory.isFull() ? 1 : 0) || !lllIlIllIIIIII(Bank.isOpen() ? 1 : 0)) && !lllIlIllIIIIII(Movement.shouldWalk() ? 1 : 0)) {
            if (lllIlIllIIIIIl(this.H.g().matchesInventory() ? 1 : 0)) {
                Bank.close();
                return lIlllIlIlIIl[1];
            } else if (lllIlIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
                if (lllIlIllIIIIIl(this.I.fishBarrel() ? 1 : 0) && lllIlIllIIIIll(Static.getClient().getVarbitValue(lIlllIlIlIIl[2]))) {
                    Item first = Bank.Inventory.getFirst(item -> {
                        String[] strArr = new String[lIlllIlIlIIl[1]];
                        strArr[lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[5]];
                        return item.hasAction(strArr);
                    });
                    if (lllIlIllIIIlII(first)) {
                        first.interact(lIlllIlIlIII[lIlllIlIlIIl[0]]);
                        return lIlllIlIlIIl[1];
                    }
                }
                this.H.g().withdraw();
                "".length();
                sleep(lIlllIlIlIIl[3]);
                return lIlllIlIlIIl[1];
            } else {
                if (lllIlIllIIIIlI(this.I.fish(), f.KARAMBWAN)) {
                    nearest = BankLocation.ZANARIS;
                    "".length();
                    if ((-" ".length()) > "  ".length()) {
                        return ((51 ^ 55) ^ (79 ^ 67)) & (((52 ^ 83) ^ (16 ^ 127)) ^ (-" ".length()));
                    }
                } else {
                    nearest = BankLocation.getNearest();
                }
                BankLocation bankLocation = nearest;
                WorldArea area = bankLocation.getArea();
                if (lllIlIllIIIIlI(bankLocation, BankLocation.ZANARIS) && lllIlIllIIIlIl(area.distanceTo2D(Players.getLocal().getWorldLocation()), lIlllIlIlIIl[4])) {
                    String[] strArr = new String[lIlllIlIlIIl[1]];
                    strArr[lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[1]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (lllIlIllIIIlII(nearest2)) {
                        String[] strArr2 = new String[lIlllIlIlIIl[1]];
                        strArr2[lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[3]];
                        if (lllIlIllIIIIII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            Movement.setDestination(area.getCenter());
                            return lIlllIlIlIIl[1];
                        }
                    }
                }
                if (lllIlIllIIIIII(Bank.open() ? 1 : 0)) {
                    Movement.walkTo(bankLocation);
                    "".length();
                    return lIlllIlIlIIl[1];
                }
                return lIlllIlIlIIl[0];
            }
        }
        return lIlllIlIlIIl[0];
    }

    private static void lllIlIlIlllllI() {
        lIlllIlIlIII = new String[lIlllIlIlIIl[6]];
        lIlllIlIlIII[lIlllIlIlIIl[0]] = lllIlIlIllllII("xwVXn8RGw3c=", "EOeEB");
        lIlllIlIlIII[lIlllIlIlIIl[1]] = lllIlIlIllllII("tRu+7NhsDDTZ61xNKp089w==", "rzwLU");
        lIlllIlIlIII[lIlllIlIlIIl[3]] = lllIlIlIllllIl("FRUbIh8mBw==", "OtuCm");
        lIlllIlIlIII[lIlllIlIlIIl[5]] = lllIlIlIllllII("pTRqWdUmto4=", "wgkDh");
    }

    private static boolean lllIlIllIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lllIlIlIllllll() {
        lIlllIlIlIIl = new int[8];
        lIlllIlIlIIl[0] = (26 ^ 22) & ((67 ^ 79) ^ (-1));
        lIlllIlIlIIl[1] = " ".length();
        lIlllIlIlIIl[2] = (-4118) & 16055;
        lIlllIlIlIIl[3] = "  ".length();
        lIlllIlIlIIl[4] = (79 ^ 52) ^ (254 ^ 128);
        lIlllIlIlIIl[5] = "   ".length();
        lIlllIlIlIIl[6] = (6 ^ 102) ^ (114 ^ 22);
        lIlllIlIlIIl[7] = 97 ^ 105;
    }

    static {
        lllIlIlIllllll();
        lllIlIlIlllllI();
        G = lIlllIlIlIIl[2];
        F = LoggerFactory.getLogger(g.class);
    }
}
