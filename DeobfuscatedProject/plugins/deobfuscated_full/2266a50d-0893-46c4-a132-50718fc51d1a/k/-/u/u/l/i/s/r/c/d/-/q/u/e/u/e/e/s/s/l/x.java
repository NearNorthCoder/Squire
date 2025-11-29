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

/* TASK: Handling Spec and Gear -> HandlingspecandgearTask */
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

    private static String lllIlIIIlIlIlI(String var15, String var9) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIllIllIIIII[12]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIllIllIIIII[5], var19);
            return new String(var6.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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

    private static String lllIlIIIlIllII(String var4, String var21) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIllIllIIIII[5], var5);
            return new String(var22.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlIlllI() {
        lIllIllIIIII = new int[13];
        x.lIllIllIIIII[0] = (0x2C ^ 0x1E ^ (0xF5 ^ 0x8E)) & (251 + 117 - 301 + 185 ^ 179 + 87 - 90 + 5 ^ -1);
        x.lIllIllIIIII[1] = 1;
        x.lIllIllIIIII[2] = -(0xFFFFD9DD & 0x36A3) & (0xFFFFF7F7 & 0x7DFF);
        x.lIllIllIIIII[3] = 0xE8 ^ 0xBC ^ (0x88 ^ 0xB2);
        x.lIllIllIIIII[4] = -(0xFFFFACFE & 0x7F27) & (0xFFFFBFBF & 0x6FEF);
        x.lIllIllIIIII[5] = 2;
        x.lIllIllIIIII[6] = 7 ^ 0x4F ^ (0xE8 ^ 0xAA);
        x.lIllIllIIIII[7] = 3;
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
        x.lIllIlIlllll[x.lIllIllIIIII[0]] = x."Wear";
        x.lIllIlIlllll[x.lIllIllIIIII[1]] = x."None";
        x.lIllIlIlllll[x.lIllIllIIIII[5]] = x."You setup your spec weapon setup with a weapon that has no spec!!!";
        x.lIllIlIlllll[x.lIllIllIIIII[7]] = x."Gate";
        x.lIllIlIlllll[x.lIllIllIIIII[8]] = x."Quick-escape";
        x.lIllIlIlllll[x.lIllIllIIIII[9]] = x."Duke Sucellus";
        x.lIllIlIlllll[x.lIllIllIIIII[10]] = x."Attack";
    }

    private static boolean lllIlIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        x var12;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (x.lllIlIIIllIIlI(nPC.getName().equals(lIllIlIlllll[lIllIllIIIII[9]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIII[1]];
                stringArray[x.lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[10]];
                if (x.lllIlIIIllIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIII[1];
                    0;
                    if (3 >= -1) return n2 != 0;
                    return ((63 + 25 - 61 + 106 ^ 63 + 117 - 47 + 62) & (0x26 ^ 0x50 ^ (0x90 ^ 0xA0) ^ -1)) != 0;
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
            Item var7 = Inventory.getFirst((int[])nArray);
            if (x.lllIlIIIlIllll(var7)) {
                return lIllIllIIIII[0];
            }
            var7.interact(lIllIlIlllll[lIllIllIIIII[0]]);
            return lIllIllIIIII[0];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lllIlIIIllIIlI(tileObject.getName().equals(lIllIlIlllll[lIllIllIIIII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIII[1]];
                stringArray[x.lIllIllIIIII[0]] = lIllIlIlllll[lIllIllIIIII[8]];
                if (x.lllIlIIIllIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIllIIIII[0];
            return n2 != 0;
        });
        if (x.lllIlIIIlIllll(var7)) {
            return lIllIllIIIII[0];
        }
        Player var25 = Players.getLocal();
        if (x.lllIlIIIlIllll(var25)) {
            return lIllIllIIIII[0];
        }
        String var11 = var12.aU.specGear().getSelected();
        if (!x.lllIlIIIllIIIl(var11) || x.lllIlIIIllIIlI(var11.equals(lIllIlIlllll[lIllIllIIIII[1]]) ? 1 : 0)) {
            return lIllIllIIIII[0];
        }
        int var23 = CombatOptions.getSpecialAttackEnergy();
        if (!x.lllIlIIIllIIll(var23, var12.T()) || x.lllIlIIIllIIlI(var12.aU.lowHpSpec() ? 1 : 0) && x.lllIlIIIllIlII(var12.aT.u(), lIllIllIIIII[3])) {
            var12.U();
            return lIllIllIIIII[0];
        }
        int var13 = var12.S().get(EquipmentInventorySlot.WEAPON);
        int var10 = Arrays.stream(Static.getClient().getEnum(lIllIllIIIII[4]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (x.lllIlIIIllIlIl(n3, var13)) {
                bl = lIllIllIIIII[1];
                0;
                if (((0xC4 ^ 0x96) & ~(0x67 ^ 0x35)) > 0) {
                    return false;
                }
            } else {
                bl = lIllIllIIIII[0];
            }
            return bl;
        }) ? 1 : 0;
        if (x.lllIlIIIllIIII(var10)) {
            Log.warn((String)lIllIlIlllll[lIllIllIIIII[5]]);
            return lIllIllIIIII[0];
        }
        if (x.lllIlIIIllIIII(var12.S().isEquipped() ? 1 : 0)) {
            var12.S().swap();
        }
        if (x.lllIlIIIllIIlI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIllIllIIIII[0];
        }
        Combat.toggleSpec();
        return lIllIllIIIII[1];
    }

    private static String lllIlIIIlIlIll(String var8, String var3) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var24 = var3.toCharArray();
        int var26 = lIllIllIIIII[0];
        char[] var1 = var8.toCharArray();
        int var14 = var1.length;
        int var17 = lIllIllIIIII[0];
        while (x.lllIlIIIllIllI(var17, var14)) {
            char var18 = var1[var17];
            var20.append((char)(var18 ^ var24[var26 % var24.length]));
            0;
            ++var26;
            ++var17;
            0;
            if (((183 + 122 - 211 + 104 ^ 127 + 145 - 259 + 141) & (0xA6 ^ 0x95 ^ (0xEF ^ 0x80) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private EquipmentSetup S() {
        return (EquipmentSetup)this.aU.specGear().selected(EquipmentSetup.class);
    }
}

