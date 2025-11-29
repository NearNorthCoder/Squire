package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.secondaries.SecondariesPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Cast Bloom")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bP  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bP.class */
public class bP extends Task {
    private static /* synthetic */ int[] lIlIIIll;
    private /* synthetic */ int gN = lIlIIIll[0];
    private final /* synthetic */ SecondariesPlugin gM;
    private static /* synthetic */ String[] lIlIIIlI;

    static {
        lIIlIIllll();
        lIIlIIlllI();
    }

    private static String lIIlIIllIl(String lllIIIIIlIlIlIl, String lllIIIIIlIlIlII) {
        try {
            SecretKeySpec lllIIIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIll[3], lllIIIIIlIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIIlIlIllI) {
            lllIIIIIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIl(int i2) {
        return i2 == 0;
    }

    private static String lIIlIIllII(String lllIIIIIlIIIlIl, String lllIIIIIlIIIlII) {
        String lllIIIIIlIIIlIl2 = new String(Base64.getDecoder().decode(lllIIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIIIlIIIIll = new StringBuilder();
        char[] charArray = lllIIIIIlIIIlII.toCharArray();
        int lllIIIIIlIIIIIl = lIlIIIll[0];
        char[] charArray2 = lllIIIIIlIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIIIll[0];
        while (lIIlIlIllI(i2, length)) {
            char lllIIIIIlIIIllI = charArray2[i2];
            lllIIIIIlIIIIll.append((char) (lllIIIIIlIIIllI ^ charArray[lllIIIIIlIIIIIl % charArray.length]));
            "".length();
            lllIIIIIlIIIIIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllIIIIIlIIIIll);
    }

    private static boolean lIIlIlIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIIlIIllll() {
        lIlIIIll = new int[4];
        lIlIIIll[0] = ((((105 + 75) - 142) + 106) ^ (((87 + 147) - 102) + 54)) & (((((62 + 76) - 29) + 29) ^ (((157 + 66) - 126) + 63)) ^ (-" ".length()));
        lIlIIIll[1] = (144 ^ 142) ^ (41 ^ 51);
        lIlIIIll[2] = " ".length();
        lIlIIIll[3] = "  ".length();
    }

    private static boolean lIIlIlIlIl(Object obj) {
        return obj != null;
    }

    @Inject
    public bP(SecondariesPlugin secondariesPlugin) {
        this.gM = secondariesPlugin;
    }

    private static void lIIlIIlllI() {
        lIlIIIlI = new String[lIlIIIll[3]];
        lIlIIIlI[lIlIIIll[0]] = lIIlIIllII("MxwBGho=", "qpnuw");
        lIlIIIlI[lIlIIIll[2]] = lIIlIIllIl("TO0NzzXNOvg=", "jphSA");
    }

    private static boolean lIIlIlIIll(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIIlIlIIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    public boolean run() {
        WorldPoint cT = this.gM.cT();
        if (lIIlIlIIII(cT)) {
            return lIlIIIll[0];
        }
        Player local = Players.getLocal();
        if (lIIlIlIIII(local)) {
            return lIlIIIll[0];
        }
        int tickCount = Static.getClient().getTickCount();
        if (lIIlIlIIIl(Inventory.isFull() ? 1 : 0) && lIIlIlIIlI(Prayers.getPoints()) && !lIIlIlIIll(tickCount - this.gN, lIlIIIll[1])) {
            if (lIIlIlIIIl(cT.isInScene(Static.getClient()) ? 1 : 0)) {
                Movement.walkTo(cT);
                "".length();
                return lIlIIIll[2];
            }
            WorldPoint worldLocation = local.getWorldLocation();
            if (lIIlIlIIIl(worldLocation.equals(cT) ? 1 : 0) && lIIlIlIlII(worldLocation.getRegionID(), cT.getRegionID())) {
                Movement.walk(cT);
                return lIlIIIll[2];
            } else if (lIIlIlIIIl(worldLocation.equals(cT) ? 1 : 0)) {
                return lIlIIIll[0];
            } else {
                Predicate predicate = item -> {
                    if (lIIlIlIlIl(item) && lIIlIlIlIl(item.getActions()) && lIIlIlIIlI(Arrays.stream(item.getActions()).anyMatch(str -> {
                        if (lIIlIlIlIl(str) && lIIlIlIIlI(str.contains(lIlIIIlI[lIlIIIll[2]]) ? 1 : 0)) {
                            ?? r0 = lIlIIIll[2];
                            "".length();
                            return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIIll[0];
                    }) ? 1 : 0)) {
                        ?? r0 = lIlIIIll[2];
                        "".length();
                        return (-" ".length()) == ((76 ^ 119) & ((34 ^ 25) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIIll[0];
                };
                Item first = Inventory.getFirst(predicate);
                if (lIIlIlIIII(first)) {
                    first = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
                    if (lIIlIlIIIl(predicate.test(first) ? 1 : 0)) {
                        return lIlIIIll[0];
                    }
                }
                first.interact(str -> {
                    if (lIIlIlIlIl(str) && lIIlIlIIlI(str.contains(lIlIIIlI[lIlIIIll[0]]) ? 1 : 0)) {
                        ?? r0 = lIlIIIll[2];
                        "".length();
                        return 0 != 0 ? ((99 ^ 0) ^ (54 ^ 123)) & (((33 ^ 3) ^ (108 ^ 96)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIll[0];
                });
                this.gN = tickCount;
                return lIlIIIll[2];
            }
        }
        return lIlIIIll[0];
    }

    private static boolean lIIlIlIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIlIlIIII(Object obj) {
        return obj == null;
    }
}
