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
@TaskDesc(name = "Looting Head")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aM  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aM.class */
public class aM extends Task {
    private final /* synthetic */ LooterConfig eC;
    private static /* synthetic */ String[] llIIIll;
    private final /* synthetic */ SquireLooter eD;
    private static /* synthetic */ int[] llIIlII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    public boolean run() {
        if (llIIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIlII[0];
        }
        for (aH aHVar : this.eD.ch()) {
            WorldPoint cd = aHVar.cd();
            int[] iArr = new int[llIIlII[1]];
            iArr[llIIlII[0]] = aHVar.P();
            TileItem firstAt = TileItems.getFirstAt(cd, iArr);
            if (llIIlIIlI(firstAt)) {
                if (llIIlIIll(firstAt.distanceTo(Players.getLocal().getWorldLocation()), this.eC.lootRange())) {
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    if (llIIlIlII(Inventory.isFull() ? 1 : 0)) {
                        firstAt.interact(llIIIll[llIIlII[0]]);
                    }
                    if (llIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                        return llIIlII[0];
                    }
                }
            }
            "".length();
            if ((-" ".length()) == " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIlII[1];
    }

    @Inject
    public aM(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eC = looterConfig;
        this.eD = squireLooter;
    }

    private static boolean llIIlIIIl(int i2) {
        return i2 != 0;
    }

    private static void llIIIllll() {
        llIIIll = new String[llIIlII[1]];
        llIIIll[llIIlII[0]] = llIIIlllI("J6UKXuc11gU=", "jPKNT");
    }

    static {
        llIIlIIII();
        llIIIllll();
    }

    private static void llIIlIIII() {
        llIIlII = new int[3];
        llIIlII[0] = (177 ^ 139) & ((168 ^ 146) ^ (-1));
        llIIlII[1] = " ".length();
        llIIlII[2] = "  ".length();
    }

    private static String llIIIlllI(String lllIlIlIIIlIIll, String lllIlIlIIIlIIlI) {
        try {
            SecretKeySpec lllIlIlIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIlIIIlIlIl = Cipher.getInstance("Blowfish");
            lllIlIlIIIlIlIl.init(llIIlII[2], lllIlIlIIIlIllI);
            return new String(lllIlIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllIlIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIlIIIlIlII) {
            lllIlIlIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlII(int i2) {
        return i2 == 0;
    }

    private static boolean llIIlIIll(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean llIIlIIlI(Object obj) {
        return obj != null;
    }
}
