/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

/* TASK: Cast Bloom -> CastbloomTask */
@TaskDesc(name="Cast Bloom")
public class CastBloomTask
extends Task {
    private static /* synthetic */ int[] lIlIIIll;
    private /* synthetic */ int gN;
    private final /* synthetic */ SecondariesPlugin gM;
    private static /* synthetic */ String[] lIlIIIlI;

    static {
        bP.lIIlIIllll();
        bP.lIIlIIlllI();
    }

    private static String lIIlIIllIl(String lllIIIIIlIlIIll, String lllIIIIIlIlIlII) {
        try {
            SecretKeySpec lllIIIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIIIlIlIlll = Cipher.getInstance("Blowfish");
            lllIIIIIlIlIlll.init(lIlIIIll[3], lllIIIIIlIllIII);
            return new String(lllIIIIIlIlIlll.doFinal(Base64.getDecoder().decode(lllIIIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIIlIlIllI) {
            lllIIIIIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIllII(String lllIIIIIlIIIIII, String lllIIIIIIllllll) {
        lllIIIIIlIIIIII = new String(Base64.getDecoder().decode(lllIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIIIlIIIIll = new StringBuilder();
        char[] lllIIIIIlIIIIlI = lllIIIIIIllllll.toCharArray();
        int lllIIIIIlIIIIIl = lIlIIIll[0];
        char[] lllIIIIIIlllIll = lllIIIIIlIIIIII.toCharArray();
        int lllIIIIIIlllIlI = lllIIIIIIlllIll.length;
        int lllIIIIIIlllIIl = lIlIIIll[0];
        while (bP.lIIlIlIllI(lllIIIIIIlllIIl, lllIIIIIIlllIlI)) {
            char lllIIIIIlIIIllI = lllIIIIIIlllIll[lllIIIIIIlllIIl];
            lllIIIIIlIIIIll.append((char)(lllIIIIIlIIIllI ^ lllIIIIIlIIIIlI[lllIIIIIlIIIIIl % lllIIIIIlIIIIlI.length]));
            0;
            ++lllIIIIIlIIIIIl;
            ++lllIIIIIIlllIIl;
            0;
            
            return null;
        }
        return String.valueOf(lllIIIIIlIIIIll);
    }

    private static boolean lIIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIllll() {
        lIlIIIll = new int[4];
        bP.lIlIIIll[0] = (105 + 75 - 142 + 106 ^ 87 + 147 - 102 + 54) & (62 + 76 - 29 + 29 ^ 157 + 66 - 126 + 63 ^ -1);
        bP.lIlIIIll[1] = 0x90 ^ 0x8E ^ (0x29 ^ 0x33);
        bP.lIlIIIll[2] = 1;
        bP.lIlIIIll[3] = 2;
    }

    private static boolean lIIlIlIlIl(Object object) {
        return object != null;
    }

    @Inject
    public bP(SecondariesPlugin secondariesPlugin) {
        this.gN = lIlIIIll[0];
        this.gM = secondariesPlugin;
    }

    private static void lIIlIIlllI() {
        lIlIIIlI = new String[lIlIIIll[3]];
        bP.lIlIIIlI[bP.lIlIIIll[0]] = bP."Bloom";
        bP.lIlIIIlI[bP.lIlIIIll[2]] = bP."Bloom";
    }

    private static boolean lIIlIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var6_6;
        void lllIIIIIllIlIII;
        bP lllIIIIIllIlIIl;
        WorldPoint worldPoint = this.gM.cT();
        if (bP.lIIlIlIIII(worldPoint)) {
            return lIlIIIll[0];
        }
        Player lllIIIIIllIIlll = Players.getLocal();
        if (bP.lIIlIlIIII(lllIIIIIllIIlll)) {
            return lIlIIIll[0];
        }
        int lllIIIIIllIIllI = Static.getClient().getTickCount();
        if (!bP.lIIlIlIIIl(Inventory.isFull() ? 1 : 0) || !bP.lIIlIlIIlI(Prayers.getPoints()) || bP.lIIlIlIIll(lllIIIIIllIIllI - lllIIIIIllIlIIl.gN, lIlIIIll[1])) {
            return lIlIIIll[0];
        }
        if (bP.lIIlIlIIIl(lllIIIIIllIlIII.isInScene(Static.getClient()) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lllIIIIIllIlIII);
            0;
            return lIlIIIll[2];
        }
        WorldPoint lllIIIIIllIIlIl = lllIIIIIllIIlll.getWorldLocation();
        if (bP.lIIlIlIIIl(lllIIIIIllIIlIl.equals((Object)lllIIIIIllIlIII) ? 1 : 0) && bP.lIIlIlIlII(lllIIIIIllIIlIl.getRegionID(), lllIIIIIllIlIII.getRegionID())) {
            Movement.walk((WorldPoint)lllIIIIIllIlIII);
            return lIlIIIll[2];
        }
        if (bP.lIIlIlIIIl(lllIIIIIllIIlIl.equals((Object)lllIIIIIllIlIII) ? 1 : 0)) {
            return lIlIIIll[0];
        }
        Predicate<Item> lllIIIIIllIIlII = item -> {
            int n2;
            if (bP.lIIlIlIlIl(item) && bP.lIIlIlIlIl(item.getActions()) && bP.lIIlIlIIlI(Arrays.stream(item.getActions()).anyMatch(string -> {
                int n2;
                if (bP.lIIlIlIlIl(string) && bP.lIIlIlIIlI(string.contains(lIlIIIlI[lIlIIIll[2]]) ? 1 : 0)) {
                    n2 = lIlIIIll[2];
                    0;
                    if (1 >= 3) {
                        return false;
                    }
                } else {
                    n2 = lIlIIIll[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = lIlIIIll[2];
                0;
                if (-1 == ((0x4C ^ 0x77) & ~(0x22 ^ 0x19))) {
                    return false;
                }
            } else {
                n2 = lIlIIIll[0];
            }
            return n2 != 0;
        };
        Item lllIIIIIllIIIll = Inventory.getFirst(lllIIIIIllIIlII);
        if (bP.lIIlIlIIII(lllIIIIIllIIIll) && bP.lIIlIlIIIl(lllIIIIIllIIlII.test(lllIIIIIllIIIll = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) ? 1 : 0)) {
            return lIlIIIll[0];
        }
        var6_6.interact(string -> {
            int n2;
            if (bP.lIIlIlIlIl(string) && bP.lIIlIlIIlI(string.contains(lIlIIIlI[lIlIIIll[0]]) ? 1 : 0)) {
                n2 = lIlIIIll[2];
                0;
                
                }
            } else {
                n2 = lIlIIIll[0];
            }
            return n2 != 0;
        });
        this.gN = var3_3;
        return lIlIIIll[2];
    }

    private static boolean lIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIII(Object object) {
        return object == null;
    }
}

