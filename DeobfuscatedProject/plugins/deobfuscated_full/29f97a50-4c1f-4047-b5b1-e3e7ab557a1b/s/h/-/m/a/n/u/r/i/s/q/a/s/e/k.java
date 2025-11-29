/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking")
public class k
extends Task {
    private final /* synthetic */ c U;
    private final /* synthetic */ SquireShamansPlugin T;
    public static final /* synthetic */ int S;
    private final /* synthetic */ SquireShamanConfig V;
    private static final /* synthetic */ Logger R;
    private static /* synthetic */ int[] lIIllIIIlIlll;
    private static /* synthetic */ String[] lIIllIIIlIllI;

    private static String lIlIllllIIIllIl(String var6, String var5) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var3 = var5.toCharArray();
        int var12 = lIIllIIIlIlll[1];
        char[] var4 = var6.toCharArray();
        int var20 = var4.length;
        int var15 = lIIllIIIlIlll[1];
        while (k.lIlIllllIIlIlll(var15, var20)) {
            char var21 = var4[var15];
            var1.append((char)(var21 ^ var3[var12 % var3.length]));
            0;
            ++var12;
            ++var15;
            0;
            if ((0xBA ^ 0xBF) > 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    @Inject
    public k(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig) {
        this.T = squireShamansPlugin;
        this.U = c2;
        this.V = squireShamanConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        k var14;
        String[] stringArray = new String[lIIllIIIlIlll[0]];
        stringArray[k.lIIllIIIlIlll[1]] = lIIllIIIlIllI[lIIllIIIlIlll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!k.lIlIllllIIlIIII(nPC) || k.lIlIllllIIlIIIl(this.U.s() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        InventorySetup var9 = var14.U.r();
        if (k.lIlIllllIIlIIIl(var9.matchesInventory() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        int[] nArray = new int[lIIllIIIlIlll[0]];
        nArray[k.lIIllIIIlIlll[1]] = lIIllIIIlIlll[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (!k.lIlIllllIIlIIlI(var2) || k.lIlIllllIIlIIll(var2.distanceTo((Locatable)Players.getLocal()), lIIllIIIlIlll[3])) {
            return lIIllIIIlIlll[1];
        }
        if (k.lIlIllllIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        Item var10 = Inventory.getFirst(item -> {
            int n2;
            if (!k.lIlIllllIIlIlIl(item.getId(), this.V.weapon()) || k.lIlIllllIIlIllI(item.getId(), this.T.d())) {
                n2 = lIIllIIIlIlll[0];
                0;
                
                }
            } else {
                n2 = lIIllIIIlIlll[1];
            }
            return n2 != 0;
        });
        if (k.lIlIllllIIlIIlI(var10)) {
            int[] nArray2 = new int[lIIllIIIlIlll[0]];
            nArray2[k.lIIllIIIlIlll[1]] = var10.getId();
            if (k.lIlIllllIIlIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                var10.interact(lIIllIIIlIllI[lIIllIIIlIlll[0]]);
                return lIIllIIIlIlll[0];
            }
        }
        if (k.lIlIllllIIlIlII(Bank.isOpen() ? 1 : 0)) {
            var2.interact(lIIllIIIlIllI[lIIllIIIlIlll[4]]);
            return lIIllIIIlIlll[0];
        }
        var2_2.withdraw();
        0;
        this.sleep(lIIllIIIlIlll[4]);
        return lIIllIIIlIlll[0];
    }

    private static String lIlIllllIIIllII(String var13, String var8) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlll[6]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIIllIIIlIlll[4], var19);
            return new String(var17.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllllIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lIlIllllIIlIIII(Object object) {
        return object == null;
    }

    static {
        k.lIlIllllIIIllll();
        k.lIlIllllIIIlllI();
        S = lIIllIIIlIlll[2];
        R = LoggerFactory.getLogger(k.class);
    }

    private static boolean lIlIllllIIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllllIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllllIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIllllIIIlIll(String var23, String var16) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIllIIIlIlll[4], var18);
            return new String(var7.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void lIlIllllIIIllll() {
        lIIllIIIlIlll = new int[7];
        k.lIIllIIIlIlll[0] = 1;
        k.lIIllIIIlIlll[1] = (0xC5 ^ 0x8E ^ (0x26 ^ 0x68)) & (82 + 108 - 168 + 126 ^ 138 + 70 - 183 + 120 ^ -1);
        k.lIIllIIIlIlll[2] = -(0xFFFFD9A9 & 0x377F) & (0xFFFFFD7F & 0x7BFF);
        k.lIIllIIIlIlll[3] = 0x16 ^ 0x1C;
        k.lIIllIIIlIlll[4] = 2;
        k.lIIllIIIlIlll[5] = 3;
        k.lIIllIIIlIlll[6] = 0x5F ^ 0x57;
    }

    private static boolean lIlIllllIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIllllIIIlllI() {
        lIIllIIIlIllI = new String[lIIllIIIlIlll[5]];
        k.lIIllIIIlIllI[k.lIIllIIIlIlll[1]] = k."Lizardman Shaman";
        k.lIIllIIIlIllI[k.lIIllIIIlIlll[0]] = k."Wield";
        k.lIIllIIIlIllI[k.lIIllIIIlIlll[4]] = k."Use";
    }
}

