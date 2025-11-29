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
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class r
extends a {
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
        r llllllllllllllIllllIlIlIlIlllllI;
        String string = this.b.specGear().getSelected();
        if (!r.lIlIllIlIIIIllI(string) || r.lIlIllIlIIIIlll(string.equals(lIIlIllIIllIl[lIIlIllIIllll[0]]) ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        int llllllllllllllIllllIlIlIlIllllII = CombatOptions.getSpecialAttackEnergy();
        if (!r.lIlIllIlIIIlIII(llllllllllllllIllllIlIlIlIllllII, llllllllllllllIllllIlIlIlIlllllI.v()) || r.lIlIllIlIIIlIIl(llllllllllllllIllllIlIlIlIlllllI.c.p(), lIIlIllIIllll[1])) {
            llllllllllllllIllllIlIlIlIlllllI.w();
            return lIIlIllIIllll[0];
        }
        int llllllllllllllIllllIlIlIlIlllIll = llllllllllllllIllllIlIlIlIlllllI.u().get(EquipmentInventorySlot.WEAPON);
        int llllllllllllllIllllIlIlIlIlllIlI = Arrays.stream(Static.getClient().getEnum(lIIlIllIIllll[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (r.lIlIllIlIIIlIll(n3, llllllllllllllIllllIlIlIlIlllIll)) {
                bl = lIIlIllIIllll[3];
                "".length();
                if ("   ".length() == 0) {
                    return ((0x83 ^ 0x88) & ~(0x7F ^ 0x74)) != 0;
                }
            } else {
                bl = lIIlIllIIllll[0];
            }
            return bl;
        }) ? 1 : 0;
        if (r.lIlIllIlIIIlIlI(llllllllllllllIllllIlIlIlIlllIlI)) {
            Log.warn((String)lIIlIllIIllIl[lIIlIllIIllll[3]]);
            return lIIlIllIIllll[0];
        }
        if (r.lIlIllIlIIIlIlI(llllllllllllllIllllIlIlIlIlllllI.u().isEquipped() ? 1 : 0)) {
            llllllllllllllIllllIlIlIlIlllllI.u().swap();
        }
        if (r.lIlIllIlIIIIlll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        Combat.toggleSpec();
        return lIIlIllIIllll[3];
    }

    private static String lIlIllIIllllllI(String llllllllllllllIllllIlIlIlIlIIlIl, String llllllllllllllIllllIlIlIlIIlllll) {
        llllllllllllllIllllIlIlIlIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIlIlIlIIIll = new StringBuilder();
        char[] llllllllllllllIllllIlIlIlIlIIIlI = llllllllllllllIllllIlIlIlIIlllll.toCharArray();
        int llllllllllllllIllllIlIlIlIlIIIIl = lIIlIllIIllll[0];
        char[] llllllllllllllIllllIlIlIlIIllIll = llllllllllllllIllllIlIlIlIlIIlIl.toCharArray();
        int llllllllllllllIllllIlIlIlIIllIlI = llllllllllllllIllllIlIlIlIIllIll.length;
        int llllllllllllllIllllIlIlIlIIllIIl = lIIlIllIIllll[0];
        while (r.lIlIllIlIIIlIIl(llllllllllllllIllllIlIlIlIIllIIl, llllllllllllllIllllIlIlIlIIllIlI)) {
            char llllllllllllllIllllIlIlIlIlIIllI = llllllllllllllIllllIlIlIlIIllIll[llllllllllllllIllllIlIlIlIIllIIl];
            llllllllllllllIllllIlIlIlIlIIIll.append((char)(llllllllllllllIllllIlIlIlIlIIllI ^ llllllllllllllIllllIlIlIlIlIIIlI[llllllllllllllIllllIlIlIlIlIIIIl % llllllllllllllIllllIlIlIlIlIIIlI.length]));
            "".length();
            ++llllllllllllllIllllIlIlIlIlIIIIl;
            ++llllllllllllllIllllIlIlIlIIllIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIlIlIlIIIll);
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

    private static String lIlIllIIlllllIl(String llllllllllllllIllllIlIlIlIIIlllI, String llllllllllllllIllllIlIlIlIIIllIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIlIlIIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIlIlIIlIIlI.init(lIIlIllIIllll[5], llllllllllllllIllllIlIlIlIIlIIll);
            return new String(llllllllllllllIllllIlIlIlIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIlIlIIlIIIl) {
            llllllllllllllIllllIlIlIlIIlIIIl.printStackTrace();
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
        r.lIIlIllIIllll[3] = " ".length();
        r.lIIlIllIIllll[4] = 0x17 ^ 0x1D;
        r.lIIlIllIIllll[5] = "  ".length();
    }

    private static void lIlIllIIlllllll() {
        lIIlIllIIllIl = new String[lIIlIllIIllll[5]];
        r.lIIlIllIIllIl[r.lIIlIllIIllll[0]] = r.lIlIllIIlllllIl("ol9buKuMIRY=", "XqUeJ");
        r.lIIlIllIIllIl[r.lIIlIllIIllll[3]] = r.lIlIllIIllllllI("Dx0RWRIzBhEJQS8dEQtBJQIBGkEhFwUJDjhSFxwVIwJEDggiGkQYQSEXBQkOOFIQEQAiUgwYEnYcC1kSJhcHWEB3", "Vrdya");
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

