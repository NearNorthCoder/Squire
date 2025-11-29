/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a;

/* TASK: Chopping -> ChoppingTask */
@TaskDesc(name="Chopping", priority=25, register=true)
public class c
extends Task {
    private final /* synthetic */ int[] x;
    private static final /* synthetic */ Logger u;
    private final /* synthetic */ int[] y;
    private static /* synthetic */ int[] lIllIIIlIIIIl;
    private final /* synthetic */ SquireWoodcutterConfig v;
    private static /* synthetic */ String[] lIllIIIIlllIl;
    private final /* synthetic */ SquireWoodcutterPlugin w;

    @Inject
    public c(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        int[] nArray = new int[lIllIIIlIIIIl[0]];
        nArray[c.lIllIIIlIIIIl[1]] = lIllIIIlIIIIl[2];
        nArray[c.lIllIIIlIIIIl[3]] = lIllIIIlIIIIl[4];
        nArray[c.lIllIIIlIIIIl[5]] = lIllIIIlIIIIl[6];
        nArray[c.lIllIIIlIIIIl[7]] = lIllIIIlIIIIl[8];
        this.x = nArray;
        int[] nArray2 = new int[lIllIIIlIIIIl[0]];
        nArray2[c.lIllIIIlIIIIl[1]] = lIllIIIlIIIIl[9];
        nArray2[c.lIllIIIlIIIIl[3]] = lIllIIIlIIIIl[10];
        nArray2[c.lIllIIIlIIIIl[5]] = lIllIIIlIIIIl[11];
        nArray2[c.lIllIIIlIIIIl[7]] = lIllIIIlIIIIl[12];
        this.y = nArray2;
        this.w = squireWoodcutterPlugin;
        this.v = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIlIlIlll(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIlIllIlI(Object object) {
        return object == null;
    }

    public boolean run() {
        c var7;
        if (c.llIIIlIIlIlIlll(this.v.fastTickChop() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (!c.llIIIlIIlIllIII(Bank.isOpen() ? 1 : 0) || c.llIIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (c.llIIIlIIlIlIlll(var7.w.p() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (c.llIIIlIIlIllIIl((Object)var7.v.tree(), (Object)a.REDWOOD) && c.llIIIlIIlIllIII(Static.getClient().getPlane())) {
            TileObject var15 = TileObjects.getNearest(tileObject -> {
                String[] stringArray = new String[lIllIIIlIIIIl[3]];
                stringArray[c.lIllIIIlIIIIl[1]] = lIllIIIIlllIl[lIllIIIlIIIIl[16]];
                return tileObject.hasAction(stringArray);
            });
            if (c.llIIIlIIlIllIlI(var15)) {
                return lIllIIIlIIIIl[1];
            }
            var15.interact(lIllIIIIlllIl[lIllIIIlIIIIl[1]]);
            return lIllIIIlIIIIl[3];
        }
        if (c.llIIIlIIlIllIII(var7.v.tickChop() ? 1 : 0) && c.llIIIlIIlIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        Predicate<String> var15 = string -> {
            int n;
            if (c.llIIIlIIlIllIll(string) && (!c.llIIIlIIlIllIII(string.startsWith(lIllIIIIlllIl[lIllIIIlIIIIl[0]]) ? 1 : 0) || c.llIIIlIIlIlIlll(string.equals(lIllIIIIlllIl[lIllIIIlIIIIl[14]]) ? 1 : 0))) {
                n = lIllIIIlIIIIl[3];
                0;
                if ((0x55 ^ 0x14 ^ (0xD8 ^ 0x9C)) <= 0) {
                    return ((52 + 188 - 152 + 159 ^ 106 + 88 - 84 + 60) & (0xAD ^ 0x8E ^ (1 ^ 0x7F) ^ -1)) != 0;
                }
            } else {
                n = lIllIIIlIIIIl[1];
            }
            return n != 0;
        };
        TileObject var8 = TileObjects.getNearest(tileObject -> {
            int n;
            if (c.llIIIlIIlIlIlll(tileObject.getName().startsWith(this.v.tree().r()) ? 1 : 0) && c.llIIIlIIlIlllIl(tileObject.distanceTo((Locatable)Players.getLocal()), lIllIIIlIIIIl[15]) && c.llIIIlIIlIlIlll(tileObject.hasAction(var15) ? 1 : 0)) {
                n = lIllIIIlIIIIl[3];
                0;
                if (-1 >= 2) {
                    return false;
                }
            } else {
                n = lIllIIIlIIIIl[1];
            }
            return n != 0;
        });
        if (!c.llIIIlIIlIllIll(var8) || !c.llIIIlIIlIlllII(Players.getLocal().distanceTo(var7.w.o().getCenter()), lIllIIIlIIIIl[13]) || c.llIIIlIIlIllIII(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
            Movement.walkTo((WorldArea)var7.w.o());
            0;
            return lIllIIIlIIIIl[3];
        }
        if (c.llIIIlIIlIlIlll(var7.v.tickChop() ? 1 : 0)) {
            if (c.llIIIlIIlIllIII(Inventory.contains((int[])var7.x) ? 1 : 0) && c.llIIIlIIlIlIlll(Inventory.contains((int[])var7.y) ? 1 : 0)) {
                Log.info((String)lIllIIIIlllIl[lIllIIIlIIIIl[3]]);
                Inventory.getFirst((int[])var7.y).interact(lIllIIIIlllIl[lIllIIIlIIIIl[5]]);
                return lIllIIIlIIIIl[3];
            }
            if (c.llIIIlIIlIllIII(var7.w.d() ? 1 : 0)) {
                System.out.println(lIllIIIIlllIl[lIllIIIlIIIIl[7]]);
                return lIllIIIlIIIIl[1];
            }
            var7.w.h();
            var8.interact(var15);
            var7.sleep(lIllIIIlIIIIl[7]);
            return lIllIIIlIIIIl[3];
        }
        if (c.llIIIlIIlIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            var8.interact(var15);
            var7.sleep(lIllIIIlIIIIl[14]);
            return lIllIIIlIIIIl[3];
        }
        return lIllIIIlIIIIl[1];
    }

    static {
        c.llIIIlIIlIlIllI();
        c.llIIIlIIlIIllII();
        u = LoggerFactory.getLogger(c.class);
    }

    private static String llIIIlIIlIIIllI(String var5, String var1) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIIIlIIIIl[5], var18);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIIlIIIlIl(String var16, String var10) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var20 = var10.toCharArray();
        int var2 = lIllIIIlIIIIl[1];
        char[] var9 = var16.toCharArray();
        int var22 = var9.length;
        int var19 = lIllIIIlIIIIl[1];
        while (c.llIIIlIIlIlllII(var19, var22)) {
            char var21 = var9[var19];
            var14.append((char)(var21 ^ var20[var2 % var20.length]));
            0;
            ++var2;
            ++var19;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean llIIIlIIlIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static void llIIIlIIlIIllII() {
        lIllIIIIlllIl = new String[lIllIIIlIIIIl[17]];
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[1]] = c."Climb-up";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[3]] = c."Cleaning herb";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[5]] = c."Clean";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[7]] = c."We are missing an item to properly 3 tick.";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[0]] = c."Chop";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[14]] = c."Cut";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[16]] = c."Climb-up";
    }

    private static boolean llIIIlIIlIlllII(int n, int n2) {
        return n < n2;
    }

    private static void llIIIlIIlIlIllI() {
        lIllIIIlIIIIl = new int[19];
        c.lIllIIIlIIIIl[0] = 89 + 164 - 210 + 146 ^ 153 + 180 - 261 + 113;
        c.lIllIIIlIIIIl[1] = (0x21 ^ 0x17 ^ 1) & (0xE0 ^ 0x9D ^ (0x8B ^ 0xC1) ^ -1);
        c.lIllIIIlIIIIl[2] = (0x2A ^ 0x5A) + (0xFB ^ 0xA9) - (0xE1 ^ 0x9B) + (12 + 55 - -98 + 12);
        c.lIllIIIlIIIIl[3] = 1;
        c.lIllIIIlIIIIl[4] = (0x1A ^ 0xE) + (0x55 ^ 0x3E) - (0x48 ^ 0x21) + (76 + 157 - 53 + 49);
        c.lIllIIIlIIIIl[5] = 2;
        c.lIllIIIlIIIIl[6] = 68 + 74 - 127 + 238;
        c.lIllIIIlIIIIl[7] = 3;
        c.lIllIIIlIIIIl[8] = 5 + 44 - 39 + 134 + (76 + 195 - 94 + 22) - (0xFFFFC95A & 0x37EF) + (176 + 176 - 343 + 233);
        c.lIllIIIlIIIIl[9] = 31 + 30 - 53 + 191;
        c.lIllIIIlIIIIl[10] = 10 + 142 - -3 + 46;
        c.lIllIIIlIIIIl[11] = (0xC9 ^ 0xB8) + (1 ^ 0x2D) - (18 + 89 - -6 + 20) + (124 + 46 - 113 + 122);
        c.lIllIIIlIIIIl[12] = 76 + 165 - 179 + 143;
        c.lIllIIIlIIIIl[13] = 35 + 69 - 51 + 108 ^ 50 + 5 - -96 + 17;
        c.lIllIIIlIIIIl[14] = 0x1F ^ 0x47 ^ (0x19 ^ 0x44);
        c.lIllIIIlIIIIl[15] = 0x43 ^ 0x7A ^ (0x8B ^ 0xBD);
        c.lIllIIIlIIIIl[16] = 0x9B ^ 0x9D;
        c.lIllIIIlIIIIl[17] = 2 ^ (0xBB ^ 0xBE);
        c.lIllIIIlIIIIl[18] = 3 ^ (0x67 ^ 0x6C);
    }

    private static boolean llIIIlIIlIllIll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIlIllIII(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIlIlllIl(int n, int n2) {
        return n <= n2;
    }

    private static String llIIIlIIlIIIlII(String var4, String var17) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIllIIIlIIIIl[18]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIllIIIlIIIIl[5], var13);
            return new String(var11.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

