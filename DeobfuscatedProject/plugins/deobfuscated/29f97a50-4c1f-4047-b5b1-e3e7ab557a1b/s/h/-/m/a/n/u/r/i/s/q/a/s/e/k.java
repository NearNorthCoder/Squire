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

    private static String lIlIllllIIIllIl(String llllllllllllllIllllIIIlllIllllII, String llllllllllllllIllllIIIlllIllIllI) {
        llllllllllllllIllllIIIlllIllllII = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIlllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIlllIlllIlI = new StringBuilder();
        char[] llllllllllllllIllllIIIlllIlllIIl = llllllllllllllIllllIIIlllIllIllI.toCharArray();
        int llllllllllllllIllllIIIlllIlllIII = lIIllIIIlIlll[1];
        char[] llllllllllllllIllllIIIlllIllIIlI = llllllllllllllIllllIIIlllIllllII.toCharArray();
        int llllllllllllllIllllIIIlllIllIIIl = llllllllllllllIllllIIIlllIllIIlI.length;
        int llllllllllllllIllllIIIlllIllIIII = lIIllIIIlIlll[1];
        while (k.lIlIllllIIlIlll(llllllllllllllIllllIIIlllIllIIII, llllllllllllllIllllIIIlllIllIIIl)) {
            char llllllllllllllIllllIIIlllIllllIl = llllllllllllllIllllIIIlllIllIIlI[llllllllllllllIllllIIIlllIllIIII];
            llllllllllllllIllllIIIlllIlllIlI.append((char)(llllllllllllllIllllIIIlllIllllIl ^ llllllllllllllIllllIIIlllIlllIIl[llllllllllllllIllllIIIlllIlllIII % llllllllllllllIllllIIIlllIlllIIl.length]));
            0;
            ++llllllllllllllIllllIIIlllIlllIII;
            ++llllllllllllllIllllIIIlllIllIIII;
            0;
            if ((0xBA ^ 0xBF) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIlllIlllIlI);
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
        k llllllllllllllIllllIIIllllIlllII;
        String[] stringArray = new String[lIIllIIIlIlll[0]];
        stringArray[k.lIIllIIIlIlll[1]] = lIIllIIIlIllI[lIIllIIIlIlll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!k.lIlIllllIIlIIII(nPC) || k.lIlIllllIIlIIIl(this.U.s() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        InventorySetup llllllllllllllIllllIIIllllIllIlI = llllllllllllllIllllIIIllllIlllII.U.r();
        if (k.lIlIllllIIlIIIl(llllllllllllllIllllIIIllllIllIlI.matchesInventory() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        int[] nArray = new int[lIIllIIIlIlll[0]];
        nArray[k.lIIllIIIlIlll[1]] = lIIllIIIlIlll[2];
        TileObject llllllllllllllIllllIIIllllIllIIl = TileObjects.getNearest((int[])nArray);
        if (!k.lIlIllllIIlIIlI(llllllllllllllIllllIIIllllIllIIl) || k.lIlIllllIIlIIll(llllllllllllllIllllIIIllllIllIIl.distanceTo((Locatable)Players.getLocal()), lIIllIIIlIlll[3])) {
            return lIIllIIIlIlll[1];
        }
        if (k.lIlIllllIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        Item llllllllllllllIllllIIIllllIllIII = Inventory.getFirst(item -> {
            int n2;
            if (!k.lIlIllllIIlIlIl(item.getId(), this.V.weapon()) || k.lIlIllllIIlIllI(item.getId(), this.T.d())) {
                n2 = lIIllIIIlIlll[0];
                0;
                if (null != null) {
                    return ((0x39 ^ 0x1B) & ~(0x2C ^ 0xE)) != 0;
                }
            } else {
                n2 = lIIllIIIlIlll[1];
            }
            return n2 != 0;
        });
        if (k.lIlIllllIIlIIlI(llllllllllllllIllllIIIllllIllIII)) {
            int[] nArray2 = new int[lIIllIIIlIlll[0]];
            nArray2[k.lIIllIIIlIlll[1]] = llllllllllllllIllllIIIllllIllIII.getId();
            if (k.lIlIllllIIlIlII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                llllllllllllllIllllIIIllllIllIII.interact(lIIllIIIlIllI[lIIllIIIlIlll[0]]);
                return lIIllIIIlIlll[0];
            }
        }
        if (k.lIlIllllIIlIlII(Bank.isOpen() ? 1 : 0)) {
            llllllllllllllIllllIIIllllIllIIl.interact(lIIllIIIlIllI[lIIllIIIlIlll[4]]);
            return lIIllIIIlIlll[0];
        }
        var2_2.withdraw();
        0;
        this.sleep(lIIllIIIlIlll[4]);
        return lIIllIIIlIlll[0];
    }

    private static String lIlIllllIIIllII(String llllllllllllllIllllIIIllllIIlIlI, String llllllllllllllIllllIIIllllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlll[6]), "DES");
            Cipher llllllllllllllIllllIIIllllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIllllIIlllI.init(lIIllIIIlIlll[4], llllllllllllllIllllIIIllllIIllll);
            return new String(llllllllllllllIllllIIIllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIllllIIllIl) {
            llllllllllllllIllllIIIllllIIllIl.printStackTrace();
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

    private static String lIlIllllIIIlIll(String llllllllllllllIllllIIIlllIlIIlll, String llllllllllllllIllllIIIlllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIlllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIlllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIlllIlIlIIl.init(lIIllIIIlIlll[4], llllllllllllllIllllIIIlllIlIlIlI);
            return new String(llllllllllllllIllllIIIlllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIlllIlIlIII) {
            llllllllllllllIllllIIIlllIlIlIII.printStackTrace();
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

