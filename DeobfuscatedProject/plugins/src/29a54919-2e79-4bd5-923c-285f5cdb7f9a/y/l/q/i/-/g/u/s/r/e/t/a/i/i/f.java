/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.query.entities.TileItemQuery
 *  net.unethicalite.api.query.results.SceneEntityQueryResults
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.entities.TileItemQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;

@TaskDesc(name="Looting marks", priority=1000, blocking=true)
public class f
extends Task {
    private final /* synthetic */ AgilityConfig u;
    private static /* synthetic */ int[] lIlIlllllll;
    private static /* synthetic */ String[] lIlIllllllI;

    private static boolean lIIlIlIIlIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIIlIIIlI(int n) {
        return n != 0;
    }

    static {
        f.lIIlIlIIlIIIII();
        f.lIIlIlIIIlllll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llllllllllllllllIlIlIllIIlIllIII;
        f llllllllllllllllIlIlIllIIlIllIIl;
        int n;
        Player player = Players.getLocal();
        if (!f.lIIlIlIIlIIIIl(player) || f.lIIlIlIIlIIIlI(player.isAnimating() ? 1 : 0)) {
            return lIlIlllllll[0];
        }
        int[] nArray = new int[lIlIlllllll[1]];
        nArray[f.lIlIlllllll[0]] = lIlIlllllll[2];
        if (f.lIIlIlIIlIIIIl(Inventory.getFirst((int[])nArray))) {
            n = lIlIlllllll[1];
            "".length();
            if ("  ".length() >= (0x57 ^ 0x53)) {
                return ((0x90 ^ 0xBA) & ~(0x8C ^ 0xA6)) != 0;
            }
        } else {
            n = lIlIlllllll[0];
        }
        int llllllllllllllllIlIlIllIIlIlIlll = n;
        Item llllllllllllllllIlIlIllIIlIlIllI = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlllllll[1]];
            stringArray[f.lIlIlllllll[0]] = lIlIllllllI[lIlIlllllll[5]];
            return item.hasAction(stringArray);
        });
        if (f.lIIlIlIIlIIIlI(Inventory.isFull() ? 1 : 0) && f.lIIlIlIIlIIIll(llllllllllllllllIlIlIllIIlIlIlll) && f.lIIlIlIIlIIlII(llllllllllllllllIlIlIllIIlIlIllI)) {
            return lIlIlllllll[0];
        }
        TileItem llllllllllllllllIlIlIllIIlIlIlIl = llllllllllllllllIlIlIllIIlIllIIl.c(llllllllllllllllIlIlIllIIlIllIII.getPlane());
        if (f.lIIlIlIIlIIlII(llllllllllllllllIlIlIllIIlIlIlIl)) {
            return lIlIlllllll[0];
        }
        if (f.lIIlIlIIlIIIlI(llllllllllllllllIlIlIllIIlIllIII.isMoving() ? 1 : 0)) {
            return lIlIlllllll[1];
        }
        TileItem llllllllllllllllIlIlIllIIlIlIlII = TileItems.getNearest(tileItem2 -> {
            int n;
            if (f.lIIlIlIIlIIIlI(tileItem2.getWorldLocation().equals((Object)llllllllllllllllIlIlIllIIlIlIlIl.getWorldLocation()) ? 1 : 0) && f.lIIlIlIIlIIIlI(tileItem2.getName().equals(lIlIllllllI[lIlIlllllll[4]]) ? 1 : 0)) {
                n = lIlIlllllll[1];
                "".length();
                if ("  ".length() <= ((0x9E ^ 0x94) & ~(0x69 ^ 0x63))) {
                    return ((0x6B ^ 0x37) & ~(0x5E ^ 2)) != 0;
                }
            } else {
                n = lIlIlllllll[0];
            }
            return n != 0;
        });
        if (f.lIIlIlIIlIIIIl(llllllllllllllllIlIlIllIIlIlIlII)) {
            llllllllllllllllIlIlIllIIlIlIlII.interact(lIlIllllllI[lIlIlllllll[0]]);
            return lIlIlllllll[1];
        }
        if (f.lIIlIlIIlIIIll(llllllllllllllllIlIlIllIIlIllIIl.v() ? 1 : 0)) {
            llllllllllllllllIlIlIllIIlIlIlIl.interact(lIlIllllllI[lIlIlllllll[1]]);
            return lIlIlllllll[1];
        }
        if (f.lIIlIlIIlIIlIl(llllllllllllllllIlIlIllIIlIlIlIl.getQuantity(), llllllllllllllllIlIlIllIIlIllIIl.u.markLootAmount())) {
            llllllllllllllllIlIlIllIIlIlIlIl.interact(lIlIllllllI[lIlIlllllll[3]]);
            return lIlIlllllll[1];
        }
        return lIlIlllllll[0];
    }

    private TileItem c(int n) {
        return (TileItem)((SceneEntityQueryResults)((TileItemQuery)((TileItemQuery)((TileItemQuery)TileItems.query().filter(tileItem -> {
            boolean bl;
            if (f.lIIlIlIIlIlIII(tileItem.getPlane(), n)) {
                bl = lIlIlllllll[1];
                "".length();
                if ((0x66 ^ 0x41 ^ (0x85 ^ 0xA6)) == " ".length()) {
                    return ((99 + 91 - 67 + 84 ^ 126 + 103 - 178 + 102) & (0x11 ^ 7 ^ (0x75 ^ 0x35) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlllllll[0];
            }
            return bl;
        })).filter(tileItem -> {
            boolean bl;
            if (f.lIIlIlIIlIlIII(tileItem.getId(), lIlIlllllll[2])) {
                bl = lIlIlllllll[1];
                "".length();
                if (((0x7F ^ 0x38 ^ (0xA6 ^ 0xBC)) & (0x87 ^ 0xB7 ^ (0xC5 ^ 0xA8) ^ -" ".length())) != 0) {
                    return ((148 + 47 - 141 + 192 ^ 181 + 128 - 173 + 56) & (130 + 130 - 119 + 0 ^ 25 + 85 - 55 + 132 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlllllll[0];
            }
            return bl;
        })).filter(Reachable::isInteractable)).results()).nearest();
    }

    private static boolean lIIlIlIIlIIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIlIIlIlIIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    public f(AgilityConfig agilityConfig) {
        this.u = agilityConfig;
    }

    private static void lIIlIlIIIlllll() {
        lIlIllllllI = new String[lIlIlllllll[6]];
        f.lIlIllllllI[f.lIlIlllllll[0]] = f.lIIlIlIIIlllIl("HwkyKw==", "KhYNC");
        f.lIlIllllllI[f.lIlIlllllll[1]] = f.lIIlIlIIIlllIl("PDsBDQ==", "hZjhh");
        f.lIlIllllllI[f.lIlIlllllll[3]] = f.lIIlIlIIIllllI("6CWyBUkxhIo=", "DHEHc");
        f.lIlIllllllI[f.lIlIlllllll[4]] = f.lIIlIlIIIllllI("VjIKArqZplE=", "YKXmR");
        f.lIlIllllllI[f.lIlIlllllll[5]] = f.lIIlIlIIIlllIl("BAsT", "AjgEq");
    }

    private static boolean lIIlIlIIlIIIll(int n) {
        return n == 0;
    }

    private static String lIIlIlIIIlllIl(String llllllllllllllllIlIlIllIIIlllIll, String llllllllllllllllIlIlIllIIIlllIlI) {
        llllllllllllllllIlIlIllIIIlllIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIllIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIllIIIlllIIl = new StringBuilder();
        char[] llllllllllllllllIlIlIllIIIlllIII = llllllllllllllllIlIlIllIIIlllIlI.toCharArray();
        int llllllllllllllllIlIlIllIIIllIlll = lIlIlllllll[0];
        char[] llllllllllllllllIlIlIllIIIllIIIl = llllllllllllllllIlIlIllIIIlllIll.toCharArray();
        int llllllllllllllllIlIlIllIIIllIIII = llllllllllllllllIlIlIllIIIllIIIl.length;
        int llllllllllllllllIlIlIllIIIlIllll = lIlIlllllll[0];
        while (f.lIIlIlIIlIlIIl(llllllllllllllllIlIlIllIIIlIllll, llllllllllllllllIlIlIllIIIllIIII)) {
            char llllllllllllllllIlIlIllIIIllllII = llllllllllllllllIlIlIllIIIllIIIl[llllllllllllllllIlIlIllIIIlIllll];
            llllllllllllllllIlIlIllIIIlllIIl.append((char)(llllllllllllllllIlIlIllIIIllllII ^ llllllllllllllllIlIlIllIIIlllIII[llllllllllllllllIlIlIllIIIllIlll % llllllllllllllllIlIlIllIIIlllIII.length]));
            "".length();
            ++llllllllllllllllIlIlIllIIIllIlll;
            ++llllllllllllllllIlIlIllIIIlIllll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIllIIIlllIIl);
    }

    private static void lIIlIlIIlIIIII() {
        lIlIlllllll = new int[8];
        f.lIlIlllllll[0] = (0x2E ^ 0x19) & ~(0x72 ^ 0x45);
        f.lIlIlllllll[1] = " ".length();
        f.lIlIlllllll[2] = -(0xFFFFF6D7 & 0x492F) & (0xFFFFFF5F & 0x6EEF);
        f.lIlIlllllll[3] = "  ".length();
        f.lIlIlllllll[4] = "   ".length();
        f.lIlIlllllll[5] = 35 + 74 - -26 + 9 ^ 123 + 38 - 58 + 45;
        f.lIlIlllllll[6] = 0xBE ^ 0xBB;
        f.lIlIlllllll[7] = 0xB7 ^ 0xBF;
    }

    private static boolean lIIlIlIIlIlIII(int n, int n2) {
        return n == n2;
    }

    private boolean v() {
        boolean bl;
        b llllllllllllllllIlIlIllIIlIlIIII;
        b b2;
        if (f.lIIlIlIIlIIIlI(this.u.progressive() ? 1 : 0)) {
            b2 = b.j();
            "".length();
            if ((0xA2 ^ 0xA6) <= 0) {
                return ((0x2E ^ 0x3F) & ~(0x25 ^ 0x34)) != 0;
            }
        } else {
            f llllllllllllllllIlIlIllIIlIlIIIl;
            b2 = llllllllllllllllIlIlIllIIlIlIIIl.u.course();
        }
        if (!f.lIIlIlIIlIIllI((Object)(llllllllllllllllIlIlIllIIlIlIIII = b2), (Object)b.ARDOUGNE) || f.lIIlIlIIlIIlll((Object)llllllllllllllllIlIlIllIIlIlIIII, (Object)b.POLLNIVNEACH)) {
            bl = lIlIlllllll[1];
            "".length();
            if (-"  ".length() > 0) {
                return ((0xA2 ^ 0x94) & ~(0xF4 ^ 0xC2)) != 0;
            }
        } else {
            bl = lIlIlllllll[0];
        }
        return bl;
    }

    private static boolean lIIlIlIIlIIlII(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIllllI(String llllllllllllllllIlIlIllIIIlIIlII, String llllllllllllllllIlIlIllIIIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIllIIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlllllll[7]), "DES");
            Cipher llllllllllllllllIlIlIllIIIlIlIII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIllIIIlIlIII.init(lIlIlllllll[3], llllllllllllllllIlIlIllIIIlIlIIl);
            return new String(llllllllllllllllIlIlIllIIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIllIIIlIIlll) {
            llllllllllllllllIlIlIllIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIIIIl(Object object) {
        return object != null;
    }
}

