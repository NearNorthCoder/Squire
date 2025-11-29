/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import i.i.-.h.u.s.e.r.q.r.s.f.e.f;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Banking")
public class g
extends Task {
    private final /* synthetic */ SquireFisherConfig I;
    private final /* synthetic */ SquireFisherPlugin H;
    private static /* synthetic */ String[] lIlllIlIlIII;
    private static final /* synthetic */ Logger F;
    public static final /* synthetic */ int G;
    private static /* synthetic */ int[] lIlllIlIlIIl;

    private static String lllIlIlIllllII(String lllllllllllllllIlIlllIlllIIIlIll, String lllllllllllllllIlIlllIlllIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlllIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlllIlIlIIl[7]), "DES");
            Cipher lllllllllllllllIlIlllIlllIIIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlllIIIllll.init(lIlllIlIlIIl[3], lllllllllllllllIlIlllIlllIIlIIII);
            return new String(lllllllllllllllIlIlllIlllIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlllIIIlllI) {
            lllllllllllllllIlIlllIlllIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllIIIIII(int n) {
        return n == 0;
    }

    private static boolean lllIlIllIIIlIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIlIllIIIIll(int n) {
        return n > 0;
    }

    private static String lllIlIlIllllIl(String lllllllllllllllIlIlllIllIllllIII, String lllllllllllllllIlIlllIllIlllIlll) {
        lllllllllllllllIlIlllIllIllllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIllIllllIll = new StringBuilder();
        char[] lllllllllllllllIlIlllIllIllllIlI = lllllllllllllllIlIlllIllIlllIlll.toCharArray();
        int lllllllllllllllIlIlllIllIllllIIl = lIlllIlIlIIl[0];
        char[] lllllllllllllllIlIlllIllIlllIIll = lllllllllllllllIlIlllIllIllllIII.toCharArray();
        int lllllllllllllllIlIlllIllIlllIIlI = lllllllllllllllIlIlllIllIlllIIll.length;
        int lllllllllllllllIlIlllIllIlllIIIl = lIlllIlIlIIl[0];
        while (g.lllIlIllIIIllI(lllllllllllllllIlIlllIllIlllIIIl, lllllllllllllllIlIlllIllIlllIIlI)) {
            char lllllllllllllllIlIlllIllIllllllI = lllllllllllllllIlIlllIllIlllIIll[lllllllllllllllIlIlllIllIlllIIIl];
            lllllllllllllllIlIlllIllIllllIll.append((char)(lllllllllllllllIlIlllIllIllllllI ^ lllllllllllllllIlIlllIllIllllIlI[lllllllllllllllIlIlllIllIllllIIl % lllllllllllllllIlIlllIllIllllIlI.length]));
            "".length();
            ++lllllllllllllllIlIlllIllIllllIIl;
            ++lllllllllllllllIlIlllIllIlllIIIl;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIllIllllIll);
    }

    private static boolean lllIlIllIIIIIl(int n) {
        return n != 0;
    }

    @Inject
    public g(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.H = squireFisherPlugin;
        this.I = squireFisherConfig;
    }

    private static boolean lllIlIllIIIlII(Object object) {
        return object != null;
    }

    private static boolean lllIlIllIIIllI(int n, int n2) {
        return n < n2;
    }

    public boolean run() {
        BankLocation bankLocation;
        g lllllllllllllllIlIlllIlllIIllIII;
        if (!g.lllIlIllIIIIII(this.I.fishingTrawler() ? 1 : 0) || g.lllIlIllIIIIII(this.I.banking() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIIl(lllllllllllllllIlIlllIlllIIllIII.I.butlerBanking() ? 1 : 0) && g.lllIlIllIIIIlI((Object)lllllllllllllllIlIlllIlllIIllIII.I.fish(), (Object)f.KARAMBWAN)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIII(Inventory.isFull() ? 1 : 0) && g.lllIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIIl(lllllllllllllllIlIlllIlllIIllIII.H.g().matchesInventory() ? 1 : 0)) {
            Bank.close();
            return lIlllIlIlIIl[1];
        }
        if (g.lllIlIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
            Item lllllllllllllllIlIlllIlllIIlIlll;
            if (g.lllIlIllIIIIIl(lllllllllllllllIlIlllIlllIIllIII.I.fishBarrel() ? 1 : 0) && g.lllIlIllIIIIll(Static.getClient().getVarbitValue(lIlllIlIlIIl[2])) && g.lllIlIllIIIlII(lllllllllllllllIlIlllIlllIIlIlll = Bank.Inventory.getFirst(item -> {
                String[] stringArray = new String[lIlllIlIlIIl[1]];
                stringArray[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[5]];
                return item.hasAction(stringArray);
            }))) {
                lllllllllllllllIlIlllIlllIIlIlll.interact(lIlllIlIlIII[lIlllIlIlIIl[0]]);
                return lIlllIlIlIIl[1];
            }
            lllllllllllllllIlIlllIlllIIllIII.H.g().withdraw();
            "".length();
            lllllllllllllllIlIlllIlllIIllIII.sleep(lIlllIlIlIIl[3]);
            return lIlllIlIlIIl[1];
        }
        if (g.lllIlIllIIIIlI((Object)lllllllllllllllIlIlllIlllIIllIII.I.fish(), (Object)f.KARAMBWAN)) {
            bankLocation = BankLocation.ZANARIS;
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((0x33 ^ 0x37 ^ (0x4F ^ 0x43)) & (0x34 ^ 0x53 ^ (0x10 ^ 0x7F) ^ -" ".length())) != 0;
            }
        } else {
            bankLocation = BankLocation.getNearest();
        }
        BankLocation lllllllllllllllIlIlllIlllIIlIlll = bankLocation;
        WorldArea lllllllllllllllIlIlllIlllIIlIllI = lllllllllllllllIlIlllIlllIIlIlll.getArea();
        if (g.lllIlIllIIIIlI(lllllllllllllllIlIlllIlllIIlIlll, BankLocation.ZANARIS) && g.lllIlIllIIIlIl(lllllllllllllllIlIlllIlllIIlIllI.distanceTo2D(Players.getLocal().getWorldLocation()), lIlllIlIlIIl[4])) {
            String[] stringArray = new String[lIlllIlIlIIl[1]];
            stringArray[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[1]];
            TileObject lllllllllllllllIlIlllIlllIIlIlIl = TileObjects.getNearest((String[])stringArray);
            if (g.lllIlIllIIIlII(lllllllllllllllIlIlllIlllIIlIlIl)) {
                String[] stringArray2 = new String[lIlllIlIlIIl[1]];
                stringArray2[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[3]];
                if (g.lllIlIllIIIIII(lllllllllllllllIlIlllIlllIIlIlIl.hasAction(stringArray2) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)lllllllllllllllIlIlllIlllIIlIllI.getCenter());
                    return lIlllIlIlIIl[1];
                }
            }
        }
        if (g.lllIlIllIIIIII(Bank.open() ? 1 : 0)) {
            Movement.walkTo((BankLocation)lllllllllllllllIlIlllIlllIIlIlll);
            "".length();
            return lIlllIlIlIIl[1];
        }
        return lIlllIlIlIIl[0];
    }

    private static void lllIlIlIlllllI() {
        lIlllIlIlIII = new String[lIlllIlIlIIl[6]];
        g.lIlllIlIlIII[g.lIlllIlIlIIl[0]] = g.lllIlIlIllllII("xwVXn8RGw3c=", "EOeEB");
        g.lIlllIlIlIII[g.lIlllIlIlIIl[1]] = g.lllIlIlIllllII("tRu+7NhsDDTZ61xNKp089w==", "rzwLU");
        g.lIlllIlIlIII[g.lIlllIlIlIIl[3]] = g.lllIlIlIllllIl("FRUbIh8mBw==", "OtuCm");
        g.lIlllIlIlIII[g.lIlllIlIlIIl[5]] = g.lllIlIlIllllII("pTRqWdUmto4=", "wgkDh");
    }

    private static boolean lllIlIllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void lllIlIlIllllll() {
        lIlllIlIlIIl = new int[8];
        g.lIlllIlIlIIl[0] = (0x1A ^ 0x16) & ~(0x43 ^ 0x4F);
        g.lIlllIlIlIIl[1] = " ".length();
        g.lIlllIlIlIIl[2] = 0xFFFFEFEA & 0x3EB7;
        g.lIlllIlIlIIl[3] = "  ".length();
        g.lIlllIlIlIIl[4] = 0x4F ^ 0x34 ^ (0xFE ^ 0x80);
        g.lIlllIlIlIIl[5] = "   ".length();
        g.lIlllIlIlIIl[6] = 6 ^ 0x66 ^ (0x72 ^ 0x16);
        g.lIlllIlIlIIl[7] = 0x61 ^ 0x69;
    }

    static {
        g.lllIlIlIllllll();
        g.lllIlIlIlllllI();
        G = lIlllIlIlIIl[2];
        F = LoggerFactory.getLogger(g.class);
    }
}

