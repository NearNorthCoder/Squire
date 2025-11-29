package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Grabbing swamp toads")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bT  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bT.class */
public class bT extends Task {
    private static /* synthetic */ int[] lIllllll;
    private static /* synthetic */ String[] lIlllllI;
    @Inject
    private /* synthetic */ SecondariesConfig gZ;
    private static final /* synthetic */ WorldArea gY;

    private static boolean lIlIlIlIIl(Object obj) {
        return obj == null;
    }

    private static void lIlIlIIIll() {
        lIlllllI = new String[lIllllll[8]];
        lIlllllI[lIllllll[0]] = lIlIlIIIIl("FS0CFh4iZQMcDzQ=", "GHoyh");
        lIlllllI[lIllllll[1]] = lIlIlIIIlI("5K3br5GjODk=", "Gyxtx");
    }

    private static boolean lIlIlIlIII(int i2) {
        return i2 <= 0;
    }

    private static boolean lIlIlIIlll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIlIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIlIlIIlII();
        lIlIlIIIll();
        gY = new WorldArea(lIllllll[4], lIllllll[5], lIllllll[6], lIllllll[7], lIllllll[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    public boolean run() {
        if (!lIlIlIIlIl(this.gZ.secondary(), bO.SWAMP_TOAD) && !lIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
            if (lIlIlIIlll(gY.contains(Players.getLocal()) ? 1 : 0)) {
                if (lIlIlIIllI(Movement.shouldWalk() ? 1 : 0)) {
                    Movement.walkTo(gY.getCenter());
                    "".length();
                }
                return lIllllll[1];
            }
            if (lIlIlIIllI(Movement.isWalking() ? 1 : 0)) {
                int[] iArr = new int[lIllllll[1]];
                iArr[lIllllll[0]] = lIllllll[2];
                List all = Inventory.getAll(iArr);
                int i2 = lIllllll[3];
                Iterator it = all.iterator();
                do {
                    if (lIlIlIIllI(it.hasNext() ? 1 : 0)) {
                        Item item = (Item) it.next();
                        int i3 = i2;
                        i2--;
                        if (lIlIlIlIII(i3)) {
                            "".length();
                            if (((165 ^ 134) & ((73 ^ 106) ^ (-1))) > 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            item.interact(lIlllllI[lIllllll[0]]);
                            "".length();
                        }
                    }
                } while ((77 ^ 73) > "  ".length());
                return (true ^ true) & ((true ^ true) ^ true);
            }
            int[] iArr2 = new int[lIllllll[1]];
            iArr2[lIllllll[0]] = lIllllll[2];
            TileItem nearest = TileItems.getNearest(iArr2);
            if (lIlIlIlIIl(nearest)) {
                return lIllllll[0];
            }
            nearest.interact(lIlllllI[lIllllll[1]]);
            return lIllllll[1];
        }
        return lIllllll[0];
    }

    private static boolean lIlIlIIllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIlIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIlIlIIIlI(String llIllIllllIIIll, String llIllIllllIIIlI) {
        try {
            SecretKeySpec llIllIllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllllIIIlI.getBytes(StandardCharsets.UTF_8)), lIllllll[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllll[8], llIllIllllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIllllIIlII) {
            llIllIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIIIIl(String llIllIllllllIII, String llIllIlllllIlll) {
        String llIllIllllllIII2 = new String(Base64.getDecoder().decode(llIllIllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlllllIllI = new StringBuilder();
        char[] llIllIlllllIlIl = llIllIlllllIlll.toCharArray();
        int llIllIlllllIlII = lIllllll[0];
        char[] charArray = llIllIllllllIII2.toCharArray();
        int length = charArray.length;
        int i2 = lIllllll[0];
        while (lIlIlIlIlI(i2, length)) {
            char llIllIllllllIIl = charArray[i2];
            llIllIlllllIllI.append((char) (llIllIllllllIIl ^ llIllIlllllIlIl[llIllIlllllIlII % llIllIlllllIlIl.length]));
            "".length();
            llIllIlllllIlII++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llIllIlllllIllI);
    }

    private static void lIlIlIIlII() {
        lIllllll = new int[9];
        lIllllll[0] = ((((144 + 180) - 284) + 166) ^ (((103 + 96) - 70) + 14)) & (((86 ^ 125) ^ (90 ^ 48)) ^ (-" ".length()));
        lIllllll[1] = " ".length();
        lIllllll[2] = (-((-9283) & 26459)) & (-12289) & 31614;
        lIllllll[3] = (((139 + 6) - 115) + 127) ^ (((100 + 84) - 155) + 120);
        lIllllll[4] = (-((-822) & 30527)) & (-641) & 32751;
        lIllllll[5] = (-((-10241) & 30799)) & (-513) & 24575;
        lIllllll[6] = 64 ^ 89;
        lIllllll[7] = 37 ^ 42;
        lIllllll[8] = "  ".length();
    }
}
