package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Looting Herbs")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aN  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aN.class */
public class aN extends Task {
    private final /* synthetic */ SquireLooter eF;
    private final /* synthetic */ LooterConfig eE;
    private static /* synthetic */ int[] llllIll;
    private static /* synthetic */ String[] llllIlI;

    private static String lllIlIlll(String lllIIllIllIllll, String lllIIllIllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIllIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIlllIIII) {
            lllIIllIlllIIII.printStackTrace();
            return null;
        }
    }

    private static void lllIllIIl() {
        llllIll = new int[4];
        llllIll[0] = (244 ^ 163) & ((216 ^ 143) ^ (-1));
        llllIll[1] = " ".length();
        llllIll[2] = (-((-22683) & 30939)) & (-1) & 32734;
        llllIll[3] = "  ".length();
    }

    private static void lllIllIII() {
        llllIlI = new String[llllIll[3]];
        llllIlI[llllIll[0]] = lllIlIllI("BA0RKg==", "PlzOb");
        llllIlI[llllIll[1]] = lllIlIlll("PD4EDRkySMk=", "TolJM");
    }

    @Inject
    public aN(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eE = looterConfig;
        this.eF = squireLooter;
    }

    private static boolean lllIlllIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    public boolean run() {
        if (lllIllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIll[0];
        }
        for (aH aHVar : this.eF.cg()) {
            WorldPoint cd = aHVar.cd();
            int[] iArr = new int[llllIll[1]];
            iArr[llllIll[0]] = aHVar.P();
            TileItem firstAt = TileItems.getFirstAt(cd, iArr);
            if (lllIllIll(firstAt)) {
                if (lllIlllII(firstAt.distanceTo(Players.getLocal().getWorldLocation()), this.eE.lootRange())) {
                    "".length();
                    if (!(true ^ true)) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    if (lllIlllIl(Inventory.isFull() ? 1 : 0)) {
                        firstAt.interact(llllIlI[llllIll[0]]);
                    }
                    if (lllIllIlI(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr2 = new int[llllIll[1]];
                        iArr2[llllIll[0]] = llllIll[2];
                        if (lllIllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                            firstAt.interact(llllIlI[llllIll[1]]);
                        }
                        return llllIll[1];
                    }
                }
            }
            "".length();
            if ("  ".length() == ((228 ^ 181) ^ (34 ^ 119))) {
                return ((81 ^ 113) ^ (61 ^ 125)) & (((((16 + 66) - (-93)) + 42) ^ (((15 + 16) - (-90)) + 64)) ^ (-" ".length()));
            }
        }
        return llllIll[1];
    }

    private static boolean lllIllIlI(int i2) {
        return i2 != 0;
    }

    private static boolean lllIlllII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lllIllIll(Object obj) {
        return obj != null;
    }

    private static boolean lllIllllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lllIlIllI(String lllIIlllIIIIlII, String lllIIlllIIIIIll) {
        String lllIIlllIIIIlII2 = new String(Base64.getDecoder().decode(lllIIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlllIIIIIlI = new StringBuilder();
        char[] charArray = lllIIlllIIIIIll.toCharArray();
        int lllIIlllIIIIIII = llllIll[0];
        char[] charArray2 = lllIIlllIIIIlII2.toCharArray();
        int length = charArray2.length;
        int i2 = llllIll[0];
        while (lllIllllI(i2, length)) {
            char lllIIllIlllIlll = charArray2[i2];
            lllIIlllIIIIIlI.append((char) (lllIIllIlllIlll ^ charArray[lllIIlllIIIIIII % charArray.length]));
            "".length();
            lllIIlllIIIIIII++;
            i2++;
            "".length();
            if (((98 ^ 121) ^ (12 ^ 19)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIIlllIIIIIlI);
    }

    static {
        lllIllIIl();
        lllIllIII();
    }
}
