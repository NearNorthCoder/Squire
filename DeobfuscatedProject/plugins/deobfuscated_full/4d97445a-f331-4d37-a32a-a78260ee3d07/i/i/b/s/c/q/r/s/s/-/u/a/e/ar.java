/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.am;
import i.i.b.s.c.q.r.s.s.-.u.a.e.as;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Collecting slime -> CollectingslimeTask */
@TaskDesc(name="Collecting slime", priority=10, blocking=true, register=true)
public class ar
extends as {
    private static /* synthetic */ String[] lIIIIIIll;
    private static /* synthetic */ int[] lIIIIIlII;

    private static String lllIIIlllI(String llIIlllIIlIllll, String llIIlllIIllIIII) {
        try {
            SecretKeySpec llIIlllIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlllIIllIIll = Cipher.getInstance("Blowfish");
            llIIlllIIllIIll.init(lIIIIIlII[4], llIIlllIIllIlII);
            return new String(llIIlllIIllIIll.doFinal(Base64.getDecoder().decode(llIIlllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllIIllIIlI) {
            llIIlllIIllIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        void llIIlllIIlllIIl;
        if (ar.lllIIlIlIl(am.SLIME_COLLECTION.bo() ? 1 : 0)) {
            return;
        }
        if (ar.lllIIlIlll(llIIlllIIlllIIl.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && ar.lllIIllIII(llIIlllIIlllIIl.getItemId(), lIIIIIlII[12])) {
            ar llIIlllIIlllIlI;
            llIIlllIIlllIlI.dd.s(llIIlllIIlllIlI.dd.bn() + lIIIIIlII[1]);
        }
    }

    static {
        ar.lllIIlIIlI();
        ar.lllIIlIIIl();
    }

    private static boolean lllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIIlIIII(String llIIlllIIlIIlII, String llIIlllIIlIIIIl) {
        try {
            SecretKeySpec llIIlllIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIlII[10]), "DES");
            Cipher llIIlllIIlIIllI = Cipher.getInstance("DES");
            llIIlllIIlIIllI.init(lIIIIIlII[4], llIIlllIIlIIlll);
            return new String(llIIlllIIlIIllI.doFinal(Base64.getDecoder().decode(llIIlllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllIIlIIlIl) {
            llIIlllIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIIllll(String llIIlllIIIlIlII, String llIIlllIIIIlllI) {
        llIIlllIIIlIlII = new String(Base64.getDecoder().decode(llIIlllIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlllIIIlIIlI = new StringBuilder();
        char[] llIIlllIIIlIIIl = llIIlllIIIIlllI.toCharArray();
        int llIIlllIIIlIIII = lIIIIIlII[0];
        char[] llIIlllIIIIlIlI = llIIlllIIIlIlII.toCharArray();
        int llIIlllIIIIlIIl = llIIlllIIIIlIlI.length;
        int llIIlllIIIIlIII = lIIIIIlII[0];
        while (ar.lllIIllIIl(llIIlllIIIIlIII, llIIlllIIIIlIIl)) {
            char llIIlllIIIlIlIl = llIIlllIIIIlIlI[llIIlllIIIIlIII];
            llIIlllIIIlIIlI.append((char)(llIIlllIIIlIlIl ^ llIIlllIIIlIIIl[llIIlllIIIlIIII % llIIlllIIIlIIIl.length]));
            0;
            ++llIIlllIIIlIIII;
            ++llIIlllIIIIlIII;
            0;
            if (((231 + 242 - 458 + 234 ^ 78 + 20 - 79 + 133) & (0xF3 ^ 0x88 ^ (0x20 ^ 0x3A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llIIlllIIIlIIlI);
    }

    private static boolean lllIIlIlII(Object object) {
        return object != null;
    }

    private static boolean lllIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIlIIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bB() {
        void var2_2;
        void var3_3;
        block12: {
            block11: {
                if (ar.lllIIlIIll(this.dd.r() ? 1 : 0)) {
                    return lIIIIIlII[0];
                }
                int[] nArray = new int[lIIIIIlII[1]];
                nArray[ar.lIIIIIlII[0]] = lIIIIIlII[2];
                if (!ar.lllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                int[] nArray2 = new int[lIIIIIlII[1]];
                nArray2[ar.lIIIIIlII[0]] = lIIIIIlII[3];
                if (!ar.lllIIlIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block12;
            }
            return lIIIIIlII[0];
        }
        TileObject llIIlllIIllllll = TileObjects.getNearest(tileObject -> tileObject.getName().equals(lIIIIIIll[lIIIIIlII[13]]));
        if (ar.lllIIlIIll(am.ECTOFUNTUS.bo() ? 1 : 0) && ar.lllIIlIlII(llIIlllIIllllll)) {
            String[] stringArray = new String[lIIIIIlII[1]];
            stringArray[ar.lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[0]];
            if (ar.lllIIlIIll(llIIlllIIllllll.hasAction(stringArray) ? 1 : 0)) {
                Log.info((String)lIIIIIIll[lIIIIIlII[1]]);
                llIIlllIIllllll.interact(lIIIIIIll[lIIIIIlII[4]]);
                return lIIIIIlII[1];
            }
            String[] stringArray2 = new String[lIIIIIlII[1]];
            stringArray2[ar.lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[5]];
            if (ar.lllIIlIIll(llIIlllIIllllll.hasAction(stringArray2) ? 1 : 0)) {
                Log.info((String)lIIIIIIll[lIIIIIlII[6]]);
                llIIlllIIllllll.interact(lIIIIIIll[lIIIIIlII[7]]);
                return lIIIIIlII[1];
            }
            Log.info((String)lIIIIIIll[lIIIIIlII[8]]);
            return lIIIIIlII[0];
        }
        if (ar.lllIIlIlIl(am.SLIME_COLLECTION.bo() ? 1 : 0)) {
            if (ar.lllIIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
                return lIIIIIlII[0];
            }
            Log.info((String)lIIIIIIll[lIIIIIlII[9]]);
            return Movement.walkTo((WorldArea)am.SLIME_COLLECTION.bp());
        }
        String[] stringArray = new String[lIIIIIlII[1]];
        stringArray[ar.lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[10]];
        TileObject llIIlllIIlllllI = TileObjects.getNearest((String[])stringArray);
        if (ar.lllIIlIllI(llIIlllIIlllllI)) {
            Log.info((String)lIIIIIIll[lIIIIIlII[11]]);
            return lIIIIIlII[0];
        }
        int[] nArray = new int[lIIIIIlII[1]];
        nArray[ar.lIIIIIlII[0]] = lIIIIIlII[2];
        Item llIIlllIIllllIl = Inventory.getFirst((int[])nArray);
        if (ar.lllIIlIllI(llIIlllIIllllIl)) {
            return lIIIIIlII[0];
        }
        var3_3.useOn((TileObject)var2_2);
        return lIIIIIlII[1];
    }

    private static boolean lllIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlIllI(Object object) {
        return object == null;
    }

    private static void lllIIlIIlI() {
        lIIIIIlII = new int[15];
        ar.lIIIIIlII[0] = (0xBB ^ 0xB0) & ~(4 ^ 0xF);
        ar.lIIIIIlII[1] = 1;
        ar.lIIIIIlII[2] = -(0x52 ^ 0x49) & (0xFFFFAF9F & 0x57FF);
        ar.lIIIIIlII[3] = -(0xFFFFAB77 & 0x7CB9) & (0xFFFFAFBB & Short.MAX_VALUE);
        ar.lIIIIIlII[4] = 2;
        ar.lIIIIIlII[5] = 3;
        ar.lIIIIIlII[6] = 0x82 ^ 0x86;
        ar.lIIIIIlII[7] = 127 + 181 - 132 + 12 ^ 180 + 81 - 223 + 147;
        ar.lIIIIIlII[8] = 69 + 0 - 55 + 131 ^ 119 + 123 - 103 + 12;
        ar.lIIIIIlII[9] = 0x5A ^ 0x5D;
        ar.lIIIIIlII[10] = 0x64 ^ 0x6C;
        ar.lIIIIIlII[11] = 104 + 99 - 186 + 125 ^ 124 + 95 - 102 + 18;
        ar.lIIIIIlII[12] = 0xFFFF9CFF & 0x73BE;
        ar.lIIIIIlII[13] = 0x46 ^ 0x4C;
        ar.lIIIIIlII[14] = 0x83 ^ 0xBD ^ (0x32 ^ 7);
    }

    private static boolean lllIIlIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void lllIIlIIIl() {
        lIIIIIIll = new String[lIIIIIlII[14]];
        ar.lIIIIIIll[ar.lIIIIIlII[0]] = ar."Open";
        ar.lIIIIIIll[ar.lIIIIIlII[1]] = ar."Opening trapdoor";
        ar.lIIIIIIll[ar.lIIIIIlII[4]] = ar."Open";
        ar.lIIIIIIll[ar.lIIIIIlII[5]] = ar."Climb-down";
        ar.lIIIIIIll[ar.lIIIIIlII[6]] = ar."Climbing down trapdoor";
        ar.lIIIIIIll[ar.lIIIIIlII[7]] = ar."Climb-down";
        ar.lIIIIIIll[ar.lIIIIIlII[8]] = ar."Reached end of trapdoor handler";
        ar.lIIIIIIll[ar.lIIIIIlII[9]] = ar."Walking to the slime collection area.";
        ar.lIIIIIIll[ar.lIIIIIlII[10]] = ar."Pool of Slime";
        ar.lIIIIIIll[ar.lIIIIIlII[11]] = ar."pool nulled";
        ar.lIIIIIIll[ar.lIIIIIlII[13]] = ar."Trapdoor";
    }

    @Inject
    public ar(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }
}

