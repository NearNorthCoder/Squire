package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Looting custom items")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aL  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aL.class */
public class aL extends Task {
    private static /* synthetic */ String[] lllllIll;
    private final /* synthetic */ SquireLooter eA;
    private final /* synthetic */ LooterConfig eB;
    private static /* synthetic */ int[] llllllII;

    private static String llIlllIIlI(String llIIllllllIIlIl, String llIIllllllIIlII) {
        try {
            SecretKeySpec llIIllllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllllllIIlII.getBytes(StandardCharsets.UTF_8)), llllllII[6]), "DES");
            Cipher llIIllllllIIlll = Cipher.getInstance("DES");
            llIIllllllIIlll.init(llllllII[2], llIIllllllIlIII);
            return new String(llIIllllllIIlll.doFinal(Base64.getDecoder().decode(llIIllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllllllIIllI) {
            llIIllllllIIllI.printStackTrace();
            return null;
        }
    }

    static {
        llIlllIlIl();
        llIlllIlII();
    }

    private static boolean llIllllIII(Object obj) {
        return obj == null;
    }

    private static String llIlllIIIl(String llIIlllllIIlIII, String llIIlllllIIIlll) {
        String llIIlllllIIlIII2 = new String(Base64.getDecoder().decode(llIIlllllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIlllllIIIlIl = llIIlllllIIIlll.toCharArray();
        int llIIlllllIIIlII = llllllII[0];
        char[] charArray = llIIlllllIIlIII2.toCharArray();
        int length = charArray.length;
        int i2 = llllllII[0];
        while (llIllllIlI(i2, length)) {
            char llIIlllllIIlIIl = charArray[i2];
            sb.append((char) (llIIlllllIIlIIl ^ llIIlllllIIIlIl[llIIlllllIIIlII % llIIlllllIIIlIl.length]));
            "".length();
            llIIlllllIIIlII++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlllIlll(int i2) {
        return i2 == 0;
    }

    @Inject
    public aL(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eA = squireLooter;
        this.eB = looterConfig;
    }

    private static boolean llIllllIll(int i2, int i3) {
        return i2 == i3;
    }

    private static void llIlllIlII() {
        lllllIll = new String[llllllII[5]];
        lllllIll[llllllII[0]] = llIlllIIIl("Ai0MLQ==", "VLgHY");
        lllllIll[llllllII[1]] = llIlllIIlI("ME1XkXUgiVo=", "qIqdv");
        lllllIll[llllllII[2]] = llIlllIIlI("FDo7/GTF07k=", "ZfAXK");
        lllllIll[llllllII[3]] = llIlllIIll("+1MLLT0o8uY=", "lNbQI");
        lllllIll[llllllII[4]] = llIlllIIll("BuF6dS0LLYA=", "uwYuS");
    }

    private static String llIlllIIll(String llIIlllllIllIII, String llIIlllllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlllllIllIIl) {
            llIIlllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static void llIlllIlIl() {
        llllllII = new int[7];
        llllllII[0] = " ".length() & (" ".length() ^ (-1));
        llllllII[1] = " ".length();
        llllllII[2] = "  ".length();
        llllllII[3] = "   ".length();
        llllllII[4] = (((64 + 19) - (-52)) + 26) ^ (((81 + 149) - 192) + 127);
        llllllII[5] = 187 ^ 190;
        llllllII[6] = (((25 + 15) - 27) + 114) ^ (116 ^ 3);
    }

    private static boolean llIlllIllI(int i2) {
        return i2 != 0;
    }

    private static boolean llIllllIIl(int i2, int i3) {
        return i2 > i3;
    }

    private int[] ce() {
        if (llIlllIllI(this.eB.custom().isEmpty() ? 1 : 0)) {
            return new int[llllllII[0]];
        }
        String[] split = this.eB.custom().split(lllllIll[llllllII[3]]);
        int[] iArr = new int[split.length];
        int i2 = llllllII[0];
        while (llIllllIlI(i2, split.length)) {
            iArr[i2] = Integer.parseInt(split[i2].trim());
            i2++;
            "".length();
            if ((25 ^ 29) == " ".length()) {
                return null;
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean y(int i2) {
        int[] ce = ce();
        int llIIllllllllIll = ce.length;
        int i3 = llllllII[0];
        while (llIllllIlI(i3, llIIllllllllIll)) {
            if (llIllllIll(ce[i3], i2)) {
                return llllllII[1];
            }
            i3++;
            "".length();
            if (" ".length() <= 0) {
                return ("   ".length() ^ (141 ^ 173)) & (((((127 + 4) - 109) + 127) ^ (((121 + 46) - 10) + 25)) ^ (-" ".length()));
            }
        }
        return llllllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        for (aH aHVar : this.eA.p()) {
            if (!llIlllIlll(y(aHVar.P()) ? 1 : 0)) {
                TileItem nearest = TileItems.getNearest(tileItem -> {
                    if (llIllllIll(tileItem.getId(), aHVar.P()) && llIlllIllI(tileItem.getWorldLocation().equals(aHVar.cd()) ? 1 : 0)) {
                        ?? r0 = llllllII[1];
                        "".length();
                        return (-" ".length()) >= "   ".length() ? ((125 ^ 3) ^ (235 ^ 128)) & (((179 ^ 172) ^ (175 ^ 165)) ^ (-" ".length())) : r0;
                    }
                    return llllllII[0];
                });
                if (!llIllllIII(nearest) && !llIllllIIl(nearest.distanceTo(Players.getLocal().getWorldLocation()), this.eB.lootRange())) {
                    if (!llIlllIllI(Inventory.isFull() ? 1 : 0)) {
                        nearest.interact(lllllIll[llllllII[2]]);
                        System.out.println("[SQUIRE] - Item Price: " + (Prices.getItemPrice(nearest.getId()) * nearest.getQuantity()) + " : Item Name " + nearest.getName());
                        return llllllII[1];
                    }
                    if (llIlllIllI(nearest.isStackable() ? 1 : 0)) {
                        int[] iArr = new int[llllllII[1]];
                        iArr[llllllII[0]] = nearest.getId();
                        if (llIlllIllI(Inventory.contains(iArr) ? 1 : 0)) {
                            nearest.interact(lllllIll[llllllII[0]]);
                        }
                    }
                    Item first = Inventory.getFirst(item -> {
                        String[] strArr = new String[llllllII[1]];
                        strArr[llllllII[0]] = lllllIll[llllllII[4]];
                        return item.hasAction(strArr);
                    });
                    if (llIllllIII(first)) {
                        return llllllII[0];
                    }
                    first.interact(lllllIll[llllllII[1]]);
                    return llllllII[1];
                }
                return llllllII[0];
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllllII[0];
    }
}
