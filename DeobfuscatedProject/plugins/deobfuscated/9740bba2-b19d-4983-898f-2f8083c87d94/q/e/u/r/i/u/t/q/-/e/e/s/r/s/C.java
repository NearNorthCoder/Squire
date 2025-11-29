/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Witchs Potion")
public class C
extends Task {
    private static /* synthetic */ int[] lIIIllIlIIIII;
    private static /* synthetic */ String[] lIIIllIIlllll;
    private final /* synthetic */ SquireQuesterConfig bA;

    private static boolean lIlIIIlIIllIIll(Object object) {
        return object == null;
    }

    private static void lIlIIIlIIlIlllI() {
        lIIIllIlIIIII = new int[43];
        C.lIIIllIlIIIII[0] = 2 & ~2;
        C.lIIIllIlIIIII[1] = 3;
        C.lIIIllIlIIIII[2] = 1;
        C.lIIIllIlIIIII[3] = 0xFFFFCFFD & 0x3B9A;
        C.lIIIllIlIIIII[4] = 0xFFFF8EAF & 0x7DD6;
        C.lIIIllIlIIIII[5] = -(0xFFFFBC8F & 0x7BF2) & (0xFFFFFDBF & 0x3BED);
        C.lIIIllIlIIIII[6] = 0xFFFFB7EF & 0x5A1B;
        C.lIIIllIlIIIII[7] = 0xFFFFEBDF & 0x1FB6;
        C.lIIIllIlIIIII[8] = 0xFFFF8DFF & 0x7E85;
        C.lIIIllIlIIIII[9] = 0x53 ^ 0x55;
        C.lIIIllIlIIIII[10] = 2;
        C.lIIIllIlIIIII[11] = 0x71 ^ 0x75;
        C.lIIIllIlIIIII[12] = 0x48 ^ 0x4D;
        C.lIIIllIlIIIII[13] = -(0xFFFFBE89 & 0x5177) & (0xFFFF9F9F & 0x7BEE);
        C.lIIIllIlIIIII[14] = -(0xFFFFD6D5 & 0x7B3B) & (0xFFFFFFDF & 0x5EB3);
        C.lIIIllIlIIIII[15] = 140 + 31 - 164 + 156 + (0x33 ^ 0x7D) - (0xB0 ^ 0x87) + (0x8C ^ 0xAF);
        C.lIIIllIlIIIII[16] = 0xFFFFCFF5 & 0x37AF;
        C.lIIIllIlIIIII[17] = 0xFFFF9E7A & 0x69E7;
        C.lIIIllIlIIIII[18] = -(0xFFFFBBFB & 0x6CCD) & (0xFFFFFFF9 & 0x3FDF);
        C.lIIIllIlIIIII[19] = 124 + 73 - 183 + 140 ^ 32 + 62 - 18 + 81;
        C.lIIIllIlIIIII[20] = 0xFFFFBBCF & 0x4FF6;
        C.lIIIllIlIIIII[21] = 0xFFFFDEFB & 0x2DBE;
        C.lIIIllIlIIIII[22] = 0xFFFFFFE7 & 0x3FB;
        C.lIIIllIlIIIII[23] = -(0xFFFFA27F & 0x5FED) & (0xFFFF8FFF & 0x7E7F);
        C.lIIIllIlIIIII[24] = 0xFFFFEEED & 0x1DBF;
        C.lIIIllIlIIIII[25] = 0xD6 ^ 0xBB ^ (0x4D ^ 0x28);
        C.lIIIllIlIIIII[26] = 0x71 ^ 0x78;
        C.lIIIllIlIIIII[27] = 0xFFFFA9FF & 0x5E56;
        C.lIIIllIlIIIII[28] = 0xFFFFEBFF & 0x1C5E;
        C.lIIIllIlIIIII[29] = 0x17 ^ 0x22 ^ (0xD ^ 0x4A);
        C.lIIIllIlIIIII[30] = 0xFFFFBDAB & 0x4EDF;
        C.lIIIllIlIIIII[31] = -(0xFFFFB9BD & 0x7773) & (0xFFFFBDBF & Short.MAX_VALUE);
        C.lIIIllIlIIIII[32] = 0x1D ^ 0x17;
        C.lIIIllIlIIIII[33] = 0x22 ^ 0x5E ^ (0x24 ^ 0x53);
        C.lIIIllIlIIIII[34] = 0x67 ^ 0x46 ^ (0x4B ^ 0x66);
        C.lIIIllIlIIIII[35] = -(0xFFFFB6CD & 0x5BB3) & (0xFFFFFEFA & 0x1FFF);
        C.lIIIllIlIIIII[36] = 0xFFFFAD2E & 0x5FF7;
        C.lIIIllIlIIIII[37] = 131 + 97 - 123 + 97 ^ 119 + 86 - 131 + 125;
        C.lIIIllIlIIIII[38] = 0xFFFFBF7F & 0x4CF5;
        C.lIIIllIlIIIII[39] = 0xFFFFDFD3 & 0x2CEF;
        C.lIIIllIlIIIII[40] = 0xE ^ 0;
        C.lIIIllIlIIIII[41] = 0xA4 ^ 0x9E ^ (0x3E ^ 0xB);
        C.lIIIllIlIIIII[42] = 146 + 94 - 106 + 54 ^ 122 + 14 - 132 + 168;
    }

    static {
        C.lIlIIIlIIlIlllI();
        C.lIlIIIlIIlIllIl();
    }

    private void cJ() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIlIIIII[2]];
            nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return;
            }
        }
        int[] nArray4 = new int[lIIIllIlIIIII[2]];
        nArray4[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return;
        }
        int[] nArray5 = new int[lIIIllIlIIIII[2]];
        nArray5[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[29];
        TileObject lllllllllllllllIIIIlIIllIlllllII = TileObjects.getNearest((int[])nArray5);
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIllIlllllII) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIllIlllllII) ? 1 : 0)) {
            int[] nArray6 = new int[lIIIllIlIIIII[2]];
            nArray6[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
            if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIllIlIIIII[2]];
                nArray7[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
                Inventory.getFirst((int[])nArray7).useOn(lllllllllllllllIIIIlIIllIlllllII);
                return;
            }
            int[] nArray8 = new int[lIIIllIlIIIII[2]];
            nArray8[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                int[] nArray9 = new int[lIIIllIlIIIII[2]];
                nArray9[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
                Inventory.getFirst((int[])nArray9).useOn(lllllllllllllllIIIIlIIllIlllllII);
                0;
                if (null != null) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[30], lIIIllIlIIIII[31], lIIIllIlIIIII[0]));
            0;
        }
    }

    private static boolean lIlIIIlIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public C(SquireQuesterConfig squireQuesterConfig) {
        this.bA = squireQuesterConfig;
    }

    private static boolean lIlIIIlIIlIllll(int n2) {
        return n2 == 0;
    }

    private void cI() {
        block12: {
            block11: {
                int[] nArray = new int[lIIIllIlIIIII[2]];
                nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[15];
                if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return;
                }
                int[] nArray2 = new int[lIIIllIlIIIII[2]];
                nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
                if (!C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block11;
                int[] nArray3 = new int[lIIIllIlIIIII[2]];
                nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
                if (!C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block12;
            }
            System.out.println(lIIIllIIlllll[lIIIllIlIIIII[12]]);
            return;
        }
        System.out.println(lIIIllIIlllll[lIIIllIlIIIII[9]]);
        if (C.lIlIIIlIIllIIIl(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIllIlIIIII[15]);
            0;
            if (null != null) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIlIIIII[2]];
            nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[18];
            NPC lllllllllllllllIIIIlIIlllIIIIIII = NPCs.getNearest((int[])nArray);
            if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIlllIIIIIII) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIlllIIIIIII) ? 1 : 0)) {
                lllllllllllllllIIIIlIIlllIIIIIII.interact(lIIIllIIlllll[lIIIllIlIIIII[19]]);
                0;
                if (((113 + 95 - -3 + 15 ^ 97 + 42 - 84 + 114) & (0x50 ^ 0x2C ^ (0x97 ^ 0xA0) ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[20], lIIIllIlIIIII[21], lIIIllIlIIIII[0]));
                0;
            }
        }
    }

    private void cF() {
        if (C.lIlIIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlIIIII[2]];
        stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[0]];
        TileObject lllllllllllllllIIIIlIIlllIIIlIII = TileObjects.getNearest((String[])stringArray);
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIlllIIIlIII) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIlllIIIlIII) ? 1 : 0)) {
            lllllllllllllllIIIIlIIlllIIIlIII.interact(lIIIllIIlllll[lIIIllIlIIIII[2]]);
            0;
            if (3 == -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[3], lIIIllIlIIIII[4], lIIIllIlIIIII[0]));
            0;
        }
    }

    private static boolean lIlIIIlIIllIIlI(Object object) {
        return object != null;
    }

    private static String lIlIIIlIIlIlIlI(String lllllllllllllllIIIIlIIllIlIllIIl, String lllllllllllllllIIIIlIIllIlIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIllIlIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIllIlIIIII[25]), "DES");
            Cipher lllllllllllllllIIIIlIIllIlIllIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIllIlIllIll.init(lIIIllIlIIIII[10], lllllllllllllllIIIIlIIllIlIlllII);
            return new String(lllllllllllllllIIIIlIIllIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIllIlIllIlI) {
            lllllllllllllllIIIIlIIllIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIlIIlIlIll(String lllllllllllllllIIIIlIIllIllIIllI, String lllllllllllllllIIIIlIIllIllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIllIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIllIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIllIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIllIllIlIII.init(lIIIllIlIIIII[10], lllllllllllllllIIIIlIIllIllIlIIl);
            return new String(lllllllllllllllIIIIlIIllIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIllIllIIlll) {
            lllllllllllllllIIIIlIIllIllIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIlIIlIllII(String lllllllllllllllIIIIlIIllIlIIIlII, String lllllllllllllllIIIIlIIllIlIIIIll) {
        lllllllllllllllIIIIlIIllIlIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIllIlIIIlll = new StringBuilder();
        char[] lllllllllllllllIIIIlIIllIlIIIllI = lllllllllllllllIIIIlIIllIlIIIIll.toCharArray();
        int lllllllllllllllIIIIlIIllIlIIIlIl = lIIIllIlIIIII[0];
        char[] lllllllllllllllIIIIlIIllIIllllll = lllllllllllllllIIIIlIIllIlIIIlII.toCharArray();
        int lllllllllllllllIIIIlIIllIIlllllI = lllllllllllllllIIIIlIIllIIllllll.length;
        int lllllllllllllllIIIIlIIllIIllllIl = lIIIllIlIIIII[0];
        while (C.lIlIIIlIIllIlIl(lllllllllllllllIIIIlIIllIIllllIl, lllllllllllllllIIIIlIIllIIlllllI)) {
            char lllllllllllllllIIIIlIIllIlIIlIlI = lllllllllllllllIIIIlIIllIIllllll[lllllllllllllllIIIIlIIllIIllllIl];
            lllllllllllllllIIIIlIIllIlIIIlll.append((char)(lllllllllllllllIIIIlIIllIlIIlIlI ^ lllllllllllllllIIIIlIIllIlIIIllI[lllllllllllllllIIIIlIIllIlIIIlIl % lllllllllllllllIIIIlIIllIlIIIllI.length]));
            0;
            ++lllllllllllllllIIIIlIIllIlIIIlIl;
            ++lllllllllllllllIIIIlIIllIIllllIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIIllIlIIIlll);
    }

    private void cL() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[36];
        TileObject lllllllllllllllIIIIlIIllIlllIllI = TileObjects.getNearest((int[])nArray2);
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIllIlllIllI) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIllIlllIllI) ? 1 : 0)) {
            lllllllllllllllIIIIlIIllIlllIllI.interact(lIIIllIIlllll[lIIIllIlIIIII[37]]);
            0;
            if (3 < ((0x8A ^ 0xC0) & ~(0x4E ^ 4))) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[38], lIIIllIlIIIII[39], lIIIllIlIIIII[0]));
            0;
            return;
        }
    }

    private static boolean lIlIIIlIIllIIIl(int n2) {
        return n2 != 0;
    }

    private void cK() {
        block8: {
            block7: {
                int[] nArray = new int[lIIIllIlIIIII[2]];
                nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
                if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return;
                }
                int[] nArray2 = new int[lIIIllIlIIIII[2]];
                nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
                if (!C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
                int[] nArray3 = new int[lIIIllIlIIIII[2]];
                nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
                if (!C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block7;
                int[] nArray4 = new int[lIIIllIlIIIII[2]];
                nArray4[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
                if (!C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
            }
            return;
        }
        String[] stringArray = new String[lIIIllIlIIIII[2]];
        stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[32]];
        NPC lllllllllllllllIIIIlIIllIllllIIl = NPCs.getNearest((String[])stringArray);
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        TileItem lllllllllllllllIIIIlIIllIllllIII = TileItems.getNearest((int[])nArray);
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIllIllllIII) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIllIllllIII) ? 1 : 0)) {
            lllllllllllllllIIIIlIIllIllllIII.interact(lIIIllIIlllll[lIIIllIlIIIII[33]]);
            return;
        }
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIllIllllIIl) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIllIllllIIl) ? 1 : 0) && C.lIlIIIlIIllIIll(Players.getLocal().getInteracting())) {
            lllllllllllllllIIIIlIIllIllllIIl.interact(lIIIllIIlllll[lIIIllIlIIIII[34]]);
            return;
        }
        if (C.lIlIIIlIIllIIll(lllllllllllllllIIIIlIIllIllllIIl)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[35], lIIIllIlIIIII[4], lIIIllIlIIIII[0]));
            0;
        }
    }

    public boolean run() {
        C lllllllllllllllIIIIlIIlllIIIlIll;
        if (C.lIlIIIlIIlIllll(this.bA.quest().equals((Object)h.WITCHS_POTION) ? 1 : 0)) {
            return lIIIllIlIIIII[0];
        }
        int lllllllllllllllIIIIlIIlllIIIlIlI = lllllllllllllllIIIIlIIlllIIIlIll.Q();
        if (C.lIlIIIlIIllIIII(lllllllllllllllIIIIlIIlllIIIlIlI, lIIIllIlIIIII[1])) {
            return lIIIllIlIIIII[0];
        }
        System.out.println("[WITCHS_POTION] - Current Progress: " + lllllllllllllllIIIIlIIlllIIIlIlI);
        switch (lllllllllllllllIIIIlIIlllIIIlIlI) {
            case 0: {
                lllllllllllllllIIIIlIIlllIIIlIll.N();
                lllllllllllllllIIIIlIIlllIIIlIll.M();
                0;
                if (3 >= 3) break;
                return ((0xD7 ^ 0x93 ^ (0xC8 ^ 0xA5)) & (0x76 ^ 0x79 ^ (0x77 ^ 0x51) ^ -1)) != 0;
            }
            case 1: {
                lllllllllllllllIIIIlIIlllIIIlIll.cH();
                lllllllllllllllIIIIlIIlllIIIlIll.cG();
                0;
                if (-1 >= -1) break;
                return ((0xCC ^ 0x88) & ~(0x17 ^ 0x53)) != 0;
            }
            case 2: {
                lllllllllllllllIIIIlIIlllIIIlIll.cF();
                lllllllllllllllIIIIlIIlllIIIlIll.P();
                0;
                if (((122 + 79 - 117 + 122 ^ 17 + 71 - 81 + 123) & (175 + 74 - 212 + 162 ^ 122 + 96 - 144 + 65 ^ -1)) > -1) break;
                return ((8 + 21 - -125 + 8 ^ 11 + 104 - 63 + 87) & (0xE6 ^ 0x95 ^ (0x9B ^ 0xC1) ^ -1)) != 0;
            }
            default: {
                return lIIIllIlIIIII[0];
            }
        }
        return lIIIllIlIIIII[2];
    }

    private void cH() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lIIIllIlIIIII[2]];
        stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[10]];
        NPC lllllllllllllllIIIIlIIlllIIIIIll = NPCs.getNearest((String[])stringArray);
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        TileItem lllllllllllllllIIIIlIIlllIIIIIlI = TileItems.getNearest((int[])nArray2);
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIlllIIIIIlI) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIlllIIIIIlI) ? 1 : 0)) {
            lllllllllllllllIIIIlIIlllIIIIIlI.interact(lIIIllIIlllll[lIIIllIlIIIII[1]]);
            return;
        }
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIlllIIIIIll) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIlllIIIIIll) ? 1 : 0) && C.lIlIIIlIIllIIll(Players.getLocal().getInteracting())) {
            lllllllllllllllIIIIlIIlllIIIIIll.interact(lIIIllIIlllll[lIIIllIlIIIII[11]]);
            return;
        }
        if (C.lIlIIIlIIllIIll(lllllllllllllllIIIIlIIlllIIIIIll)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[13], lIIIllIlIIIII[14], lIIIllIlIIIII[0]));
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void lllllllllllllllIIIIlIIllIlllIIIl;
        if (C.lIlIIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lllllllllllllllIIIIlIIllIlllIIIl;
        NPC lllllllllllllllIIIIlIIllIllIlllI = NPCs.getNearest((int[])nArray);
        if (C.lIlIIIlIIllIIlI(lllllllllllllllIIIIlIIllIllIlllI) && C.lIlIIIlIIllIIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIllIllIlllI) ? 1 : 0)) {
            lllllllllllllllIIIIlIIllIllIlllI.interact(lIIIllIIlllll[lIIIllIlIIIII[40]]);
            0;
            if (null != null) {
                return;
            }
        } else {
            void lllllllllllllllIIIIlIIllIlllIIII;
            System.out.println(lIIIllIIlllll[lIIIllIlIIIII[41]]);
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIIllIlllIIII);
            0;
        }
    }

    private void cG() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIIIII[9]];
        dialogOptionArray[C.lIIIllIlIIIII[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[11]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[12]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIIIII[6], new WorldPoint(lIIIllIlIIIII[7], lIIIllIlIIIII[8], lIIIllIlIIIII[0]), dialogOptionArray);
    }

    private void N() {
        this.cL();
        this.cK();
        this.cJ();
        this.Z();
        this.cI();
    }

    private static boolean lIlIIIlIIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_WITCHS_POTION.c());
    }

    private static void lIlIIIlIIlIllIl() {
        lIIIllIIlllll = new String[lIIIllIlIIIII[42]];
        C.lIIIllIIlllll[C.lIIIllIlIIIII[0]] = C."Cauldron";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[2]] = C."Drink From";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[10]] = C."Rat";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[1]] = C."Take";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[11]] = C."Attack";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[12]] = C."Returning false";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[9]] = C."Getting eye of newt";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[19]] = C."Trade";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[25]] = C."Bank booth";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[26]] = C."Bank";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[32]] = C."Giant rat";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[33]] = C."Take";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[34]] = C."Attack";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[37]] = C."Pick";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[40]] = C."Talk-to";
        C.lIIIllIIlllll[C.lIIIllIlIIIII[41]] = C."Walking to NPC";
    }

    private void P() {
        if (C.lIlIIIlIIllIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void Z() {
        int[] nArray = new int[lIIIllIlIIIII[2]];
        nArray[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[15];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIlIIIII[2]];
        nArray2[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIlIIIII[2]];
            nArray3[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
            if (C.lIlIIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return;
            }
        }
        int[] nArray4 = new int[lIIIllIlIIIII[2]];
        nArray4[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
        if (C.lIlIIIlIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIlIIIII[2]];
            nArray5[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
            if (C.lIlIIIlIIllIIII(Inventory.getCount((boolean)lIIIllIlIIIII[2], (int[])nArray5), lIIIllIlIIIII[1])) {
                return;
            }
        }
        if (C.lIlIIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIIIII[2]];
            stringArray[C.lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[25]];
            List lllllllllllllllIIIIlIIllIllllllI = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]), (String[])stringArray);
            if (C.lIlIIIlIIllIIIl(lllllllllllllllIIIIlIIllIllllllI.isEmpty() ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]));
                0;
                return;
            }
            if (C.lIlIIIlIIllIlII(lllllllllllllllIIIIlIIllIllllllI.size(), lIIIllIlIIIII[2])) {
                if (C.lIlIIIlIIlIllll(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIlIIllIllllllI.get(lIIIllIlIIIII[0]))) ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]));
                    0;
                    return;
                }
                ((TileObject)lllllllllllllllIIIIlIIllIllllllI.get(lIIIllIlIIIII[0])).interact(lIIIllIIlllll[lIIIllIlIIIII[26]]);
            }
            return;
        }
        int[] nArray6 = new int[lIIIllIlIIIII[2]];
        nArray6[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
        if (C.lIlIIIlIIllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            int[] nArray7 = new int[lIIIllIlIIIII[2]];
            nArray7[C.lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
            if (C.lIlIIIlIIllIIII(Bank.getCount((boolean)lIIIllIlIIIII[2], (int[])nArray7), lIIIllIlIIIII[1])) {
                Bank.withdraw((int)lIIIllIlIIIII[22], (int)lIIIllIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    private void M() {
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIIIII[9]];
        dialogOptionArray[C.lIIIllIlIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[C.lIIIllIlIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[C.lIIIllIlIIIII[12]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIlIIIII[6], new WorldPoint(lIIIllIlIIIII[7], lIIIllIlIIIII[8], lIIIllIlIIIII[0]), dialogOptionArray);
    }
}

