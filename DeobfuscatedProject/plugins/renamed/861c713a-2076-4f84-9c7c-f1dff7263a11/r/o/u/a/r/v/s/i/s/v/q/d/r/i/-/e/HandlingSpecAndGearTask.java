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
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e_Unknown;

/* TASK: Handling Spec and Gear -> HandlingspecandgearTask */
@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class HandlingSpecAndGearTask
extends a_Unknown {
    private static /* synthetic */ String[] lIlIlIIIIIIIl;
    private static /* synthetic */ int[] lIlIlIIIIIIlI;

    private static void lIllllIIllIllII() {
        lIlIlIIIIIIlI = new int[7];
        A.lIlIlIIIIIIlI[0] = (0xB5 ^ 0x8E ^ (0x7B ^ 0x16)) & (0x17 ^ 0x45 ^ (0x95 ^ 0x91) ^ -1);
        A.lIlIlIIIIIIlI[1] = 0xE7 ^ 0x83 ^ (0xE4 ^ 0xA8);
        A.lIlIlIIIIIIlI[2] = 0xFFFFD3BE & 0x2FCB;
        A.lIlIlIIIIIIlI[3] = 1;
        A.lIlIlIIIIIIlI[4] = 0x1C ^ 0x16;
        A.lIlIlIIIIIIlI[5] = 2;
        A.lIlIlIIIIIIlI[6] = 0x2E ^ 0x26;
    }

    static {
        A.lIllllIIllIllII();
        A.lIllllIIllIlIll();
    }

    private static void lIllllIIllIlIll() {
        lIlIlIIIIIIIl = new String[lIlIlIIIIIIlI[5]];
        A.lIlIlIIIIIIIl[A.lIlIlIIIIIIlI[0]] = A."None";
        A.lIlIlIIIIIIIl[A.lIlIlIIIIIIlI[3]] = A."You setup your spec weapon setup with a weapon that has no spec!!!";
    }

    private static boolean lIllllIIllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIllllIIllIlllI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean l() {
        A var13;
        String string = this.t.specGear().getSelected();
        if (!A.lIllllIIllIllIl(string) || A.lIllllIIllIlllI(string.equals(lIlIlIIIIIIIl[lIlIlIIIIIIlI[0]]) ? 1 : 0)) {
            return lIlIlIIIIIIlI[0];
        }
        int var14 = CombatOptions.getSpecialAttackEnergy();
        if (!A.lIllllIIllIllll(var14, var13.U()) || !A.lIllllIIlllIIII(var13.u.y(), var13.t.specHp()) || A.lIllllIIlllIIIl(var13.u.y(), lIlIlIIIIIIlI[1])) {
            var13.V();
            return lIlIlIIIIIIlI[0];
        }
        int var1 = var13.T().get(EquipmentInventorySlot.WEAPON);
        int var10 = Arrays.stream(Static.getClient().getEnum(lIlIlIIIIIIlI[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (A.lIllllIIlllIIll(n3, var1)) {
                bl = lIlIlIIIIIIlI[3];
                0;
                if ((19 + 56 - -59 + 11 ^ 85 + 94 - 155 + 124) == 0) {
                    return ((0x4F ^ 6 ^ (0x2F ^ 0x6D)) & (31 + 174 - 58 + 58 ^ 159 + 105 - 108 + 42 ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIIIIIIlI[0];
            }
            return bl;
        }) ? 1 : 0;
        if (A.lIllllIIlllIIlI(var10)) {
            Log.warn((String)lIlIlIIIIIIIl[lIlIlIIIIIIlI[3]]);
            return lIlIlIIIIIIlI[0];
        }
        if (A.lIllllIIlllIIlI(var13.T().isEquipped() ? 1 : 0)) {
            var13.T().swap();
        }
        if (A.lIllllIIllIlllI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIlIlIIIIIIlI[0];
        }
        Combat.toggleSpec();
        return lIlIlIIIIIIlI[3];
    }

    private static boolean lIllllIIllIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private EquipmentSetup T() {
        return (EquipmentSetup)this.t.specGear().selected(EquipmentSetup.class);
    }

    private static boolean lIllllIIlllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllllIIllIlIIl(String var2, String var8) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIIlI[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIlIIIIIIlI[5], var11);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    protected A(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static boolean lIllllIIlllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllllIIllIlIlI(String var4, String var6) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIlIIIIIIlI[5], var12);
            return new String(var7.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private void V() {
        BankLoadout bankLoadout = (BankLoadout)this.t.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (A.lIllllIIlllIIlI(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private int U() {
        int n2 = this.T().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lIlIlIIIIIIlI[2]).getIntValue(n2);
        return n3 / lIlIlIIIIIIlI[4];
    }

    private static boolean lIllllIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

