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

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking")
public class g
extends Task {
    private final /* synthetic */ SquireFisherConfig I;
    private final /* synthetic */ SquireFisherPlugin H;
    private static /* synthetic */ String[] lIlllIlIlIII;
    private static final /* synthetic */ Logger F;
    public static final /* synthetic */ int G;
    private static /* synthetic */ int[] lIlllIlIlIIl;

    private static String lllIlIlIllllII(String var1, String var3) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlllIlIlIIl[7]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIlllIlIlIIl[3], var2);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
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

    private static String lllIlIlIllllIl(String var4, String var15) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var15.toCharArray();
        int var10 = lIlllIlIlIIl[0];
        char[] var11 = var4.toCharArray();
        int var17 = var11.length;
        int var7 = lIlllIlIlIIl[0];
        while (g.lllIlIllIIIllI(var7, var17)) {
            char var8 = var11[var7];
            var12.append((char)(var8 ^ var13[var10 % var13.length]));
            0;
            ++var10;
            ++var7;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
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
        g var18;
        if (!g.lllIlIllIIIIII(this.I.fishingTrawler() ? 1 : 0) || g.lllIlIllIIIIII(this.I.banking() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIIl(var18.I.butlerBanking() ? 1 : 0) && g.lllIlIllIIIIlI((Object)var18.I.fish(), (Object)f.KARAMBWAN)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIII(Inventory.isFull() ? 1 : 0) && g.lllIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlllIlIlIIl[0];
        }
        if (g.lllIlIllIIIIIl(var18.H.g().matchesInventory() ? 1 : 0)) {
            Bank.close();
            return lIlllIlIlIIl[1];
        }
        if (g.lllIlIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
            Item var9;
            if (g.lllIlIllIIIIIl(var18.I.fishBarrel() ? 1 : 0) && g.lllIlIllIIIIll(Static.getClient().getVarbitValue(lIlllIlIlIIl[2])) && g.lllIlIllIIIlII(var9 = Bank.Inventory.getFirst(item -> {
                String[] stringArray = new String[lIlllIlIlIIl[1]];
                stringArray[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[5]];
                return item.hasAction(stringArray);
            }))) {
                var9.interact(lIlllIlIlIII[lIlllIlIlIIl[0]]);
                return lIlllIlIlIIl[1];
            }
            var18.H.g().withdraw();
            0;
            var18.sleep(lIlllIlIlIIl[3]);
            return lIlllIlIlIIl[1];
        }
        if (g.lllIlIllIIIIlI((Object)var18.I.fish(), (Object)f.KARAMBWAN)) {
            bankLocation = BankLocation.ZANARIS;
            0;
            if (-1 > 2) {
                return ((0x33 ^ 0x37 ^ (0x4F ^ 0x43)) & (0x34 ^ 0x53 ^ (0x10 ^ 0x7F) ^ -1)) != 0;
            }
        } else {
            bankLocation = BankLocation.getNearest();
        }
        BankLocation var9 = bankLocation;
        WorldArea var6 = var9.getArea();
        if (g.lllIlIllIIIIlI(var9, BankLocation.ZANARIS) && g.lllIlIllIIIlIl(var6.distanceTo2D(Players.getLocal().getWorldLocation()), lIlllIlIlIIl[4])) {
            String[] stringArray = new String[lIlllIlIlIIl[1]];
            stringArray[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[1]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray);
            if (g.lllIlIllIIIlII(var5)) {
                String[] stringArray2 = new String[lIlllIlIlIIl[1]];
                stringArray2[g.lIlllIlIlIIl[0]] = lIlllIlIlIII[lIlllIlIlIIl[3]];
                if (g.lllIlIllIIIIII(var5.hasAction(stringArray2) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var6.getCenter());
                    return lIlllIlIlIIl[1];
                }
            }
        }
        if (g.lllIlIllIIIIII(Bank.open() ? 1 : 0)) {
            Movement.walkTo((BankLocation)var9);
            0;
            return lIlllIlIlIIl[1];
        }
        return lIlllIlIlIIl[0];
    }

    private static void lllIlIlIlllllI() {
        lIlllIlIlIII = new String[lIlllIlIlIIl[6]];
        g.lIlllIlIlIII[g.lIlllIlIlIIl[0]] = g."Empty";
        g.lIlllIlIlIII[g.lIlllIlIlIIl[1]] = g."Fairy ring";
        g.lIlllIlIlIII[g.lIlllIlIlIIl[3]] = g."Zanaris";
        g.lIlllIlIlIII[g.lIlllIlIlIIl[5]] = g."Empty";
    }

    private static boolean lllIlIllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void lllIlIlIllllll() {
        lIlllIlIlIIl = new int[8];
        g.lIlllIlIlIIl[0] = (0x1A ^ 0x16) & ~(0x43 ^ 0x4F);
        g.lIlllIlIlIIl[1] = 1;
        g.lIlllIlIlIIl[2] = 0xFFFFEFEA & 0x3EB7;
        g.lIlllIlIlIIl[3] = 2;
        g.lIlllIlIlIIl[4] = 0x4F ^ 0x34 ^ (0xFE ^ 0x80);
        g.lIlllIlIlIIl[5] = 3;
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

