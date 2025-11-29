/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling Spec and Gear", priority=305)
public class x
extends Task {
    private static /* synthetic */ int[] lIllIllIIIII;
    final /* synthetic */ SquireDukeSucellusConfig aU;
    final /* synthetic */ SquireDukeSucellus aS;
    private static /* synthetic */ String[] lIllIlIlllll;
    final /* synthetic */ a aT;

    @Inject
    public x(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aS = squireDukeSucellus;
        this.aT = squireDukeSucellus.s();
        this.aU = squireDukeSucellusConfig;
    }

    private static String lllIlIIIlIlIlI(String lllllllllllllllIlIllllIIIIIIIlll, String lllllllllllllllIlIllllIIIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIllIllIIIII[12]), "DES");
            Cipher lllllllllllllllIlIllllIIIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIIIIIlIIl.init(lIllIllIIIII[5], lllllllllllllllIlIllllIIIIIIlIlI);
            return new String(lllllllllllllllIlIllllIIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIIIIIlIII) {
            lllllllllllllllIlIllllIIIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private int T() {
        int n2 = this.S().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lIllIllIIIII[4]).getIntValue(n2);
        return n3 / lIllIllIIIII[6];
    }

    private static boolean lllIlIIIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIIIlIllII(String lllllllllllllllIlIlllIlllllllIlI, String lllllllllllllllIlIlllIllllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIllllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIllllllllII.init(lIllIllIIIII[5], lllllllllllllllIlIlllIllllllllIl);
            return new String(lllllllllllllllIlIlllIllllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlllllllIll) {
            lllllllllllllllIlIlllIlllllllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlIlllI() {
        lIllIllIIIII = new int[13];
        x.lIllIllIIIII[0] = (0x2C ^ 0x1E ^ (0xF5 ^ 0x8E)) & (251 + 117 - 301 + 185 ^ 179 + 87 - 90 + 5 ^ -" ".length());
        x.lIllIllIIIII[1] = " ".length();
        x.lIllIllIIIII[2] = -(0xFFFFD9DD & 0x36A3) & (0xFFFFF7F7 & 0x7DFF);
        x.lIllIllIIIII[3] = 0xE8 ^ 0xBC ^ (0x88 ^ 0xB2);
        x.lIllIllIIIII[4] = -(0xFFFFACFE & 0x7F27) & (0xFFFFBFBF & 0x6FEF);
        x.lIllIllIIIII[5] = "  ".length();
        x.lIllIllIIIII[6] = 7 ^ 0x4F ^ (0xE8 ^ 0xAA);
        x.lIllIllIIIII[7] = "   ".length();
        x.lIllIllIIIII[8] = 0xAB ^ 0x94 ^ (6 ^ 0x3D);
        x.lIllIllIIIII[9] = 0x21 ^ 0x24;
        x.lIllIllIIIII[10] = 0xC2 ^ 0xC4;
        x.lIllIllIIIII[11] = 0x4B ^ 0x4C;
        x.lIllIllIIIII[12] = 92 + 158 - 190 + 103 ^ 146 + 126 - 216 + 115;
    }

    private void U() {
        BankLoadout bankLoadout = (BankLoadout)this.aU.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (x.lllIlIIIllIIII(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private static boolean lllIlIIIlIllll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIllIIIl(Object object) {
        return object != null;
    }

    static {
        x.lllIlIIIlIlllI();
        x.lllIlIIIlIllIl();
    }

    private static void lllIlIIIlIllIl() {
        lIllIlIlllll = new String[lIllIllIIIII[11]];
        x.lIllIlIlllll[x.lIllIllIIIII[0]] = x.lllIlIIIlIlIlI("xpq9AJokVXY=", "YcgVW");
        x.lIllIlIlllll[x.lIllIllIIIII[1]] = x.lllIlIIIlIlIll("BSAiNQ==", "KOLPl");
        x.lIllIlIlllll[x.lIllIllIIIII[5]] = x.lllIlIIIlIllII("QRSQKQu89+8oxcMO76trDPnLZ451YcAaUp93T2exC3fKPNqXR5w8uVF2rVUjKA3Vg0Q497GjoIqVDilveGc+aHuCX5UTulee", "dBVxF");
        x.lIllIlIlllll[x.lIllIllIIIII[7]] = x.lllIlIIIlIlIll("IjIODg==", "eSzkV");
        x.lIllIlIlllll[x.lIllIllIIIII[8]] = x.lllIlIIIlIllII("FZOjeNYO5jZTDkly7GZ2NA==", "GRwIJ");
        x.lIllIlIlllll[x.lIllIllIIIII[9]] = x.lllIlIIIlIlIlI("i7tyQzXItyUWWTFOoqP6gw==", "bmBVX");
        x.lIllIlIlllll[x.lIllIllIIIII[10]] = x.lllIlIIIlIlIll("MBgBNDsa", "qluUX");
    }

    private static boolean lllIlIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        x lllllllllllllllIlIllllIIIIlIIlII;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (x.lllIlIIIllIIlI(nPC.getName().equals(lIllIlIlllll[lIllIllIIIII[9]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIII[1]];
                stringArray[x.lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[10]];
                if (x.lllIlIIIllIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIII[1];
                    "".length();
                    if ("   ".length() >= -" ".length()) return n2 != 0;
                    return ((63 + 25 - 61 + 106 ^ 63 + 117 - 47 + 62) & (0x26 ^ 0x50 ^ (0x90 ^ 0xA0) ^ -" ".length())) != 0;
                }
            }
            n2 = lIllIllIIIII[0];
            return n2 != 0;
        });
        if (x.lllIlIIIlIllll(nPC2)) {
            if (x.lllIlIIIllIIII(this.aU.lightbearer() ? 1 : 0)) {
                return lIllIllIIIII[0];
            }
            int[] nArray = new int[lIllIllIIIII[1]];
            nArray[x.lIllIllIIIII[0]] = lIllIllIIIII[2];
            Item lllllllllllllllIlIllllIIIIlIIIlI = Inventory.getFirst((int[])nArray);
            if (x.lllIlIIIlIllll(lllllllllllllllIlIllllIIIIlIIIlI)) {
                return lIllIllIIIII[0];
            }
            lllllllllllllllIlIllllIIIIlIIIlI.interact(lIllIlIlllll[lIllIllIIIII[0]]);
            return lIllIllIIIII[0];
        }
        TileObject lllllllllllllllIlIllllIIIIlIIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lllIlIIIllIIlI(tileObject.getName().equals(lIllIlIlllll[lIllIllIIIII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIII[1]];
                stringArray[x.lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[8]];
                if (x.lllIlIIIllIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIII[1];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x8D ^ 0xC5) & ~(0xE6 ^ 0xAE)) != 0;
                }
            }
            n2 = lIllIllIIIII[0];
            return n2 != 0;
        });
        if (x.lllIlIIIlIllll(lllllllllllllllIlIllllIIIIlIIIlI)) {
            return lIllIllIIIII[0];
        }
        Player lllllllllllllllIlIllllIIIIlIIIIl = Players.getLocal();
        if (x.lllIlIIIlIllll(lllllllllllllllIlIllllIIIIlIIIIl)) {
            return lIllIllIIIII[0];
        }
        String lllllllllllllllIlIllllIIIIlIIIII = lllllllllllllllIlIllllIIIIlIIlII.aU.specGear().getSelected();
        if (!x.lllIlIIIllIIIl(lllllllllllllllIlIllllIIIIlIIIII) || x.lllIlIIIllIIlI(lllllllllllllllIlIllllIIIIlIIIII.equals(lIllIlIlllll[lIllIllIIIII[1]]) ? 1 : 0)) {
            return lIllIllIIIII[0];
        }
        int lllllllllllllllIlIllllIIIIIlllll = CombatOptions.getSpecialAttackEnergy();
        if (!x.lllIlIIIllIIll(lllllllllllllllIlIllllIIIIIlllll, lllllllllllllllIlIllllIIIIlIIlII.T()) || x.lllIlIIIllIIlI(lllllllllllllllIlIllllIIIIlIIlII.aU.lowHpSpec() ? 1 : 0) && x.lllIlIIIllIlII(lllllllllllllllIlIllllIIIIlIIlII.aT.u(), lIllIllIIIII[3])) {
            lllllllllllllllIlIllllIIIIlIIlII.U();
            return lIllIllIIIII[0];
        }
        int lllllllllllllllIlIllllIIIIIllllI = lllllllllllllllIlIllllIIIIlIIlII.S().get(EquipmentInventorySlot.WEAPON);
        int lllllllllllllllIlIllllIIIIIlllIl = Arrays.stream(Static.getClient().getEnum(lIllIllIIIII[4]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (x.lllIlIIIllIlIl(n3, lllllllllllllllIlIllllIIIIIllllI)) {
                bl = lIllIllIIIII[1];
                "".length();
                if (((0xC4 ^ 0x96) & ~(0x67 ^ 0x35)) > 0) {
                    return ((0xB2 ^ 0xB6) & ~(0x46 ^ 0x42)) != 0;
                }
            } else {
                bl = lIllIllIIIII[0];
            }
            return bl;
        }) ? 1 : 0;
        if (x.lllIlIIIllIIII(lllllllllllllllIlIllllIIIIIlllIl)) {
            Log.warn((String)lIllIlIlllll[lIllIllIIIII[5]]);
            return lIllIllIIIII[0];
        }
        if (x.lllIlIIIllIIII(lllllllllllllllIlIllllIIIIlIIlII.S().isEquipped() ? 1 : 0)) {
            lllllllllllllllIlIllllIIIIlIIlII.S().swap();
        }
        if (x.lllIlIIIllIIlI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIllIllIIIII[0];
        }
        Combat.toggleSpec();
        return lIllIllIIIII[1];
    }

    private static String lllIlIIIlIlIll(String lllllllllllllllIlIlllIlllllIIlIl, String lllllllllllllllIlIlllIlllllIIlII) {
        lllllllllllllllIlIlllIlllllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlllllIlIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIlllllIIlll = lllllllllllllllIlIlllIlllllIIlII.toCharArray();
        int lllllllllllllllIlIlllIlllllIIllI = lIllIllIIIII[0];
        char[] lllllllllllllllIlIlllIlllllIIIII = lllllllllllllllIlIlllIlllllIIlIl.toCharArray();
        int lllllllllllllllIlIlllIllllIlllll = lllllllllllllllIlIlllIlllllIIIII.length;
        int lllllllllllllllIlIlllIllllIllllI = lIllIllIIIII[0];
        while (x.lllIlIIIllIllI(lllllllllllllllIlIlllIllllIllllI, lllllllllllllllIlIlllIllllIlllll)) {
            char lllllllllllllllIlIlllIlllllIlIll = lllllllllllllllIlIlllIlllllIIIII[lllllllllllllllIlIlllIllllIllllI];
            lllllllllllllllIlIlllIlllllIlIII.append((char)(lllllllllllllllIlIlllIlllllIlIll ^ lllllllllllllllIlIlllIlllllIIlll[lllllllllllllllIlIlllIlllllIIllI % lllllllllllllllIlIlllIlllllIIlll.length]));
            "".length();
            ++lllllllllllllllIlIlllIlllllIIllI;
            ++lllllllllllllllIlIlllIllllIllllI;
            "".length();
            if (((183 + 122 - 211 + 104 ^ 127 + 145 - 259 + 141) & (0xA6 ^ 0x95 ^ (0xEF ^ 0x80) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIlllllIlIII);
    }

    private EquipmentSetup S() {
        return (EquipmentSetup)this.aU.specGear().selected(EquipmentSetup.class);
    }
}

