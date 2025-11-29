/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.client.Static
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.client.Static;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a_Unknown;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b_Unknown;

/* TASK: Handling Spec and Gear -> HandlingspecandgearTask */
@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class HandlingSpecAndGearTask
extends a_Unknown {
    private static /* synthetic */ String[] lIIlIllIIllIl;
    private static /* synthetic */ int[] lIIlIllIIllll;

    private static boolean lIlIllIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIlIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIlIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean a() {
        r var1;
        String string = this.b.specGear().getSelected();
        if (!r.lIlIllIlIIIIllI(string) || r.lIlIllIlIIIIlll(string.equals(lIIlIllIIllIl[lIIlIllIIllll[0]]) ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        int var17 = CombatOptions.getSpecialAttackEnergy();
        if (!r.lIlIllIlIIIlIII(var17, var1.v()) || r.lIlIllIlIIIlIIl(var1.c.p(), lIIlIllIIllll[1])) {
            var1.w();
            return lIIlIllIIllll[0];
        }
        int var18 = var1.u().get(EquipmentInventorySlot.WEAPON);
        int var9 = Arrays.stream(Static.getClient().getEnum(lIIlIllIIllll[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (r.lIlIllIlIIIlIll(n3, var18)) {
                bl = lIIlIllIIllll[3];
                0;
                if (3 == 0) {
                    return false;
                }
            } else {
                bl = lIIlIllIIllll[0];
            }
            return bl;
        }) ? 1 : 0;
        if (r.lIlIllIlIIIlIlI(var9)) {
            Log.warn((String)lIIlIllIIllIl[lIIlIllIIllll[3]]);
            return lIIlIllIIllll[0];
        }
        if (r.lIlIllIlIIIlIlI(var1.u().isEquipped() ? 1 : 0)) {
            var1.u().swap();
        }
        if (r.lIlIllIlIIIIlll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        Combat.toggleSpec();
        return lIIlIllIIllll[3];
    }

    private static String lIlIllIIllllllI(String var13, String var8) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var14 = lIIlIllIIllll[0];
        char[] var12 = var13.toCharArray();
        int var16 = var12.length;
        int var5 = lIIlIllIIllll[0];
        while (r.lIlIllIlIIIlIIl(var5, var16)) {
            char var4 = var12[var5];
            var7.append((char)(var4 ^ var10[var14 % var10.length]));
            0;
            ++var14;
            ++var5;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    private int v() {
        int n2 = this.u().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lIIlIllIIllll[2]).getIntValue(n2);
        return n3 / lIIlIllIIllll[4];
    }

    private EquipmentSetup u() {
        return (EquipmentSetup)this.b.specGear().selected(EquipmentSetup.class);
    }

    private void w() {
        BankLoadout bankLoadout = (BankLoadout)this.b.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (r.lIlIllIlIIIlIlI(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private static String lIlIllIIlllllIl(String var11, String var2) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIIlIllIIllll[5], var15);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    protected r(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static boolean lIlIllIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlIIIIlIl() {
        lIIlIllIIllll = new int[6];
        r.lIIlIllIIllll[0] = (0xC7 ^ 0xC1) & ~(0x26 ^ 0x20);
        r.lIIlIllIIllll[1] = 0xF1 ^ 0x88 ^ (0x18 ^ 0x49);
        r.lIIlIllIIllll[2] = 0xFFFFEBCA & 0x17BF;
        r.lIIlIllIIllll[3] = 1;
        r.lIIlIllIIllll[4] = 0x17 ^ 0x1D;
        r.lIIlIllIIllll[5] = 2;
    }

    private static void lIlIllIIlllllll() {
        lIIlIllIIllIl = new String[lIIlIllIIllll[5]];
        r.lIIlIllIIllIl[r.lIIlIllIIllll[0]] = r."None";
        r.lIIlIllIIllIl[r.lIIlIllIIllll[3]] = r."You setup your spec weapon setup with a weapon that has no spec!!!";
    }

    static {
        r.lIlIllIlIIIIlIl();
        r.lIlIllIIlllllll();
    }

    private static boolean lIlIllIlIIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIIlIlI(int n2) {
        return n2 == 0;
    }
}

