/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining (Superheat)", priority=100, blocking=true)
public class L
extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ int[] lllllIIlIIIl;
    private /* synthetic */ SquireMiner l;
    private static /* synthetic */ String[] lllllIIlIIII;
    private final /* synthetic */ int[] ao;
    private static final /* synthetic */ int an;

    private static boolean lIIlIIlIlIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    private void r() {
        if (L.lIIlIIlIlIlIIlI(Inventory.contains((int[])this.ao) ? 1 : 0)) {
            int[] nArray = new int[lllllIIlIIIl[3]];
            nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[14];
            Inventory.getFirst((int[])this.ao).useOn(Inventory.getFirst((int[])nArray));
            "".length();
            if ((116 + 42 - 87 + 101 ^ 7 + 162 - 58 + 57) < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lllllIIlIIIl[3]];
            nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[15];
            int[] nArray2 = new int[lllllIIlIIIl[5]];
            nArray2[L.lllllIIlIIIl[1]] = lllllIIlIIIl[16];
            nArray2[L.lllllIIlIIIl[3]] = lllllIIlIIIl[17];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static boolean lIIlIIlIlIlIIll(Object object) {
        return object != null;
    }

    static {
        L.lIIlIIlIlIlIIII();
        L.lIIlIIlIlIIllll();
        an = lllllIIlIIIl[11];
    }

    private static String lIIlIIlIlIIlllI(String lllllllllllllllIIlIIllIIIlIllIIl, String lllllllllllllllIIlIIllIIIlIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIlIllIII.getBytes(StandardCharsets.UTF_8)), lllllIIlIIIl[20]), "DES");
            Cipher lllllllllllllllIIlIIllIIIlIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIIIlIlllIl.init(lllllIIlIIIl[5], lllllllllllllllIIlIIllIIIlIllllI);
            return new String(lllllllllllllllIIlIIllIIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIIlIlllII) {
            lllllllllllllllIIlIIllIIIlIlllII.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])this.ao) ? 1 : 0)) break block2;
                    int[] nArray = new int[lllllIIlIIIl[3]];
                    nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[14];
                    if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[lllllIIlIIIl[3]];
                    nArray2[L.lllllIIlIIIl[1]] = lllllIIlIIIl[18];
                    if (!L.lIIlIIlIlIlIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllllIIlIIIl[3]];
                nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[15];
                if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[lllllIIlIIIl[3]];
                nArray3[L.lllllIIlIIIl[1]] = lllllIIlIIIl[17];
                if (!L.lIIlIIlIlIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllllIIlIIIl[3]];
                nArray4[L.lllllIIlIIIl[1]] = lllllIIlIIIl[16];
                if (!L.lIIlIIlIlIlIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = lllllIIlIIIl[3];
            "".length();
            if ((0xBB ^ 0xBE) != 0) return n2 != 0;
            return ((0x54 ^ 0x18) & ~(0x69 ^ 0x25)) != 0;
        }
        n2 = lllllIIlIIIl[1];
        return n2 != 0;
    }

    private static boolean lIIlIIlIlIlIllI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIlIlIIII() {
        lllllIIlIIIl = new int[25];
        L.lllllIIlIIIl[0] = 0x8B ^ 0x8F;
        L.lllllIIlIIIl[1] = "   ".length() & ("   ".length() ^ -" ".length());
        L.lllllIIlIIIl[2] = 189 + 134 - 290 + 216;
        L.lllllIIlIIIl[3] = " ".length();
        L.lllllIIlIIIl[4] = 142 + 244 - 208 + 73;
        L.lllllIIlIIIl[5] = "  ".length();
        L.lllllIIlIIIl[6] = (0xB ^ 0x2E) + (0x2A ^ 0x5C) - (111 + 123 - 220 + 139) + (239 + 73 - 311 + 250);
        L.lllllIIlIIIl[7] = "   ".length();
        L.lllllIIlIIIl[8] = 207 + 100 - 224 + 172;
        L.lllllIIlIIIl[9] = 0xBE ^ 0xAF ^ (0x6F ^ 0x67);
        L.lllllIIlIIIl[10] = 0xFFFFA1F8 & 0x5FBF;
        L.lllllIIlIIIl[11] = 0xFFFFB2D5 & 0x4FFF;
        L.lllllIIlIIIl[12] = 0x59 ^ 2 ^ (0xF0 ^ 0xAE);
        L.lllllIIlIIIl[13] = 0xA ^ 0x46 ^ (0x4C ^ 6);
        L.lllllIIlIIIl[14] = -(0xFFFFDDB5 & 0x3A6B) & (0xFFFFBFFF & 0x5FB3);
        L.lllllIIlIIIl[15] = 0xFFFFB3F3 & 0x4FBE;
        L.lllllIIlIIIl[16] = -(0xFFFFFDCB & 0x6237) & (0xFFFFF9BF & 0x7EFE);
        L.lllllIIlIIIl[17] = -(0xFFFFD621 & 0x6FDF) & (0xFFFFDFFD & 0x7EBF);
        L.lllllIIlIIIl[18] = 167 + 172 - 235 + 129;
        L.lllllIIlIIIl[19] = 0xD3 ^ 0xC0 ^ (0xE ^ 0x1A);
        L.lllllIIlIIIl[20] = 0x50 ^ 0x58;
        L.lllllIIlIIIl[21] = -(0xFFFFFB3F & 0x47D3) & (0xFFFFEFF7 & 0x7F7E);
        L.lllllIIlIIIl[22] = 0xFFFFAE67 & 0x7DFD;
        L.lllllIIlIIIl[23] = 0xFFFF9CFE & 0x6FA5;
        L.lllllIIlIIIl[24] = 0x17 ^ 0x1E;
    }

    private static boolean lIIlIIlIlIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIlIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIIlIlIIllIl(String lllllllllllllllIIlIIllIIIlIIlIll, String lllllllllllllllIIlIIllIIIlIIIlIl) {
        lllllllllllllllIIlIIllIIIlIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIIlIIlIIl = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIIlIIlIII = lllllllllllllllIIlIIllIIIlIIIlIl.toCharArray();
        int lllllllllllllllIIlIIllIIIlIIIlll = lllllIIlIIIl[1];
        char[] lllllllllllllllIIlIIllIIIlIIIIIl = lllllllllllllllIIlIIllIIIlIIlIll.toCharArray();
        int lllllllllllllllIIlIIllIIIlIIIIII = lllllllllllllllIIlIIllIIIlIIIIIl.length;
        int lllllllllllllllIIlIIllIIIIllllll = lllllIIlIIIl[1];
        while (L.lIIlIIlIlIllIIl(lllllllllllllllIIlIIllIIIIllllll, lllllllllllllllIIlIIllIIIlIIIIII)) {
            char lllllllllllllllIIlIIllIIIlIIllII = lllllllllllllllIIlIIllIIIlIIIIIl[lllllllllllllllIIlIIllIIIIllllll];
            lllllllllllllllIIlIIllIIIlIIlIIl.append((char)(lllllllllllllllIIlIIllIIIlIIllII ^ lllllllllllllllIIlIIllIIIlIIlIII[lllllllllllllllIIlIIllIIIlIIIlll % lllllllllllllllIIlIIllIIIlIIlIII.length]));
            "".length();
            ++lllllllllllllllIIlIIllIIIlIIIlll;
            ++lllllllllllllllIIlIIllIIIIllllll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIIIlIIlIIl);
    }

    private static String lIIlIIlIlIIllII(String lllllllllllllllIIlIIllIIIllIlIII, String lllllllllllllllIIlIIllIIIllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIllIlIlI.init(lllllIIlIIIl[5], lllllllllllllllIIlIIllIIIllIlIll);
            return new String(lllllllllllllllIIlIIllIIIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIIllIlIIl) {
            lllllllllllllllIIlIIllIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIlIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        L lllllllllllllllIIlIIllIIIlllllII;
        if (L.lIIlIIlIlIlIIIl((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return lllllIIlIIIl[1];
        }
        if (L.lIIlIIlIlIlIIlI(Inventory.isFull() ? 1 : 0)) {
            return lllllIIlIIIl[1];
        }
        if (L.lIIlIIlIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
            return lllllIIlIIIl[1];
        }
        Player lllllllllllllllIIlIIllIIIllllIll = Players.getLocal();
        TileObject lllllllllllllllIIlIIllIIIllllIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (L.lIIlIIlIlIlIIlI(List.of(Integer.valueOf(lllllIIlIIIl[21]), Integer.valueOf(lllllIIlIIIl[22])).contains(tileObject.getId()) ? 1 : 0) && L.lIIlIIlIlIllIIl(tileObject.getWorldY(), lllllIIlIIIl[23])) {
                n2 = lllllIIlIIIl[3];
                "".length();
                if (-(62 + 31 - 40 + 88 ^ 99 + 24 - 116 + 130) >= 0) {
                    return ((0xAE ^ 0xA9 ^ (0xA3 ^ 0xBB)) & (0x7C ^ 0x44 ^ (0x42 ^ 0x65) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllllIIlIIIl[1];
            }
            return n2 != 0;
        });
        if (!L.lIIlIIlIlIlIIll(lllllllllllllllIIlIIllIIIllllIlI) || L.lIIlIIlIlIlIlII(lllllllllllllllIIlIIllIIIllllIlI.distanceTo(lllllllllllllllIIlIIllIIIllllIll.getWorldLocation()), lllllIIlIIIl[9])) {
            Item lllllllllllllllIIlIIllIIIllllIIl = Equipment.getFirst(item -> item.getName().contains(lllllIIlIIII[lllllIIlIIIl[20]]));
            if (L.lIIlIIlIlIlIlIl(lllllllllllllllIIlIIllIIIllllIIl)) {
                lllllllllllllllIIlIIllIIIllllIIl = Inventory.getFirst(item -> item.getName().contains(lllllIIlIIII[lllllIIlIIIl[19]]));
            }
            if (L.lIIlIIlIlIlIlIl(lllllllllllllllIIlIIllIIIllllIIl)) {
                Log.info((String)lllllIIlIIII[lllllIIlIIIl[1]]);
                return lllllIIlIIIl[1];
            }
            String[] stringArray = new String[lllllIIlIIIl[5]];
            stringArray[L.lllllIIlIIIl[1]] = lllllIIlIIII[lllllIIlIIIl[3]];
            stringArray[L.lllllIIlIIIl[3]] = lllllIIlIIII[lllllIIlIIIl[5]];
            lllllllllllllllIIlIIllIIIllllIIl.interact(stringArray);
            lllllllllllllllIIlIIllIIIlllllII.sleep(lllllIIlIIIl[7]);
            return lllllIIlIIIl[3];
        }
        if (L.lIIlIIlIlIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Log.info((String)lllllIIlIIII[lllllIIlIIIl[7]]);
            Movement.toggleRun();
        }
        int[] nArray = new int[lllllIIlIIIl[3]];
        nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[10];
        Item lllllllllllllllIIlIIllIIIllllIIl = Inventory.getFirst((int[])nArray);
        SpellBook.Standard lllllllllllllllIIlIIllIIIllllIII = SpellBook.Standard.SUPERHEAT_ITEM;
        if (L.lIIlIIlIlIlIIll(lllllllllllllllIIlIIllIIIllllIIl) && L.lIIlIIlIlIlIlll(lllllllllllllllIIlIIllIIIllllIll.getAnimation(), lllllIIlIIIl[11])) {
            if (L.lIIlIIlIlIlIllI(lllllllllllllllIIlIIllIIIllllIII.canCast() ? 1 : 0)) {
                Log.info((String)lllllIIlIIII[lllllIIlIIIl[0]]);
                lllllllllllllllIIlIIllIIIlllllII.l.forceStop();
            }
            int[] nArray2 = new int[lllllIIlIIIl[3]];
            nArray2[L.lllllIIlIIIl[1]] = lllllIIlIIIl[10];
            lllllllllllllllIIlIIllIIIllllIII.castOn((Interactable)Inventory.getFirst((int[])nArray2));
        }
        WorldPoint lllllllllllllllIIlIIllIIIlllIlll = lllllllllllllllIIlIIllIIIllllIlI.getWorldLocation();
        WorldPoint lllllllllllllllIIlIIllIIIlllIllI = Players.getLocal().getWorldLocation();
        if (L.lIIlIIlIlIlIIlI(lllllllllllllllIIlIIllIIIlllIllI.toWorldArea().isInMeleeDistance(lllllllllllllllIIlIIllIIIlllIlll) ? 1 : 0)) {
            lllllllllllllllIIlIIllIIIllllIlI.interact(lllllIIlIIII[lllllIIlIIIl[12]]);
            lllllllllllllllIIlIIllIIIlllllII.sleep(lllllIIlIIIl[3]);
            return lllllIIlIIIl[3];
        }
        if (L.lIIlIIlIlIlIIlI(lllllllllllllllIIlIIllIIIlllllII.n() ? 1 : 0) && L.lIIlIIlIlIllIII(lllllllllllllllIIlIIllIIIllllIll.distanceTo((Locatable)lllllllllllllllIIlIIllIIIllllIlI), lllllIIlIIIl[7])) {
            lllllllllllllllIIlIIllIIIlllllII.r();
        }
        var2_2.interact(lllllIIlIIII[lllllIIlIIIl[13]]);
        this.sleep(lllllIIlIIIl[3]);
        return lllllIIlIIIl[3];
    }

    private static boolean lIIlIIlIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlIlIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    public L() {
        int[] nArray = new int[lllllIIlIIIl[0]];
        nArray[L.lllllIIlIIIl[1]] = lllllIIlIIIl[2];
        nArray[L.lllllIIlIIIl[3]] = lllllIIlIIIl[4];
        nArray[L.lllllIIlIIIl[5]] = lllllIIlIIIl[6];
        nArray[L.lllllIIlIIIl[7]] = lllllIIlIIIl[8];
        this.ao = nArray;
    }

    private static boolean lIIlIIlIlIlIlIl(Object object) {
        return object == null;
    }

    private static void lIIlIIlIlIIllll() {
        lllllIIlIIII = new String[lllllIIlIIIl[24]];
        L.lllllIIlIIII[L.lllllIIlIIIl[1]] = L.lIIlIIlIlIIllII("jtK4+HzLrKbWUrh545fKBRN3UcTdBOXl", "UeKDM");
        L.lllllIIlIIII[L.lllllIIlIIIl[3]] = L.lIIlIIlIlIIllIl("Bgs8AB8/ASAYTB8BPgQcJBYm", "KdRal");
        L.lllllIIlIIII[L.lllllIIlIIIl[5]] = L.lIIlIIlIlIIlllI("rYCE+wUd0xbf7NqpPcTG1JAhDWd+uWdr", "fTXtc");
        L.lllllIIlIIII[L.lllllIIlIIIl[7]] = L.lIIlIIlIlIIlllI("QmYOuPvCcC3FukqOiviyZwGNmzev4kNKNnY/g7Pig94=", "necgi");
        L.lllllIIlIIII[L.lllllIIlIIIl[0]] = L.lIIlIIlIlIIllIl("Ei9zLScrbSduJSQ5J241MDo2PC4gKydiZjY+PD42LCQ0YA==", "EJSNF");
        L.lllllIIlIIII[L.lllllIIlIIIl[12]] = L.lIIlIIlIlIIllIl("HBM8Kg==", "QzROE");
        L.lllllIIlIIII[L.lllllIIlIIIl[13]] = L.lIIlIIlIlIIllIl("DBkrDg==", "ApEkC");
        L.lllllIIlIIII[L.lllllIIlIIIl[19]] = L.lIIlIIlIlIIlllI("kxjCFqcDPT1zsytke0yBOQ==", "crFiY");
        L.lllllIIlIIII[L.lllllIIlIIIl[20]] = L.lIIlIIlIlIIlllI("962ZyIEg7E0DaG5cQdzLfg==", "IcpPR");
    }
}

