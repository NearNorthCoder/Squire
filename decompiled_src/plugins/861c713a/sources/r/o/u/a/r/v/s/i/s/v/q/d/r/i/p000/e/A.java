package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

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
@TaskDesc(name = "Handling Spec and Gear", priority = 100000)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.A  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/A.class */
public class A extends AbstractC0000a {
    private static /* synthetic */ String[] lIlIlIIIIIIIl;
    private static /* synthetic */ int[] lIlIlIIIIIIlI;

    private static void lIllllIIllIllII() {
        lIlIlIIIIIIlI = new int[7];
        lIlIlIIIIIIlI[0] = ((181 ^ 142) ^ (123 ^ 22)) & (((23 ^ 69) ^ (149 ^ 145)) ^ (-" ".length()));
        lIlIlIIIIIIlI[1] = (231 ^ 131) ^ (228 ^ 168);
        lIlIlIIIIIIlI[2] = (-11330) & 12235;
        lIlIlIIIIIIlI[3] = " ".length();
        lIlIlIIIIIIlI[4] = 28 ^ 22;
        lIlIlIIIIIIlI[5] = "  ".length();
        lIlIlIIIIIIlI[6] = 46 ^ 38;
    }

    static {
        lIllllIIllIllII();
        lIllllIIllIlIll();
    }

    private static void lIllllIIllIlIll() {
        lIlIlIIIIIIIl = new String[lIlIlIIIIIIlI[5]];
        lIlIlIIIIIIIl[lIlIlIIIIIIlI[0]] = lIllllIIllIlIIl("/2DTB0dvFi0=", "fsAhr");
        lIlIlIIIIIIIl[lIlIlIIIIIIlI[3]] = lIllllIIllIlIlI("PLRBsCjb767yWiCwmetTrdZZ1vJD/l+dT8fTdjRTF8Y2Mn/DON7Js0jLP4tWwBoHp7Rly5WdRv2mfgW2WdfE60EQFmN8LRRv", "VUtYw");
    }

    private static boolean lIllllIIllIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllllIIllIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        String selected = this.t.specGear().getSelected();
        if (!lIllllIIllIllIl(selected) || lIllllIIllIlllI(selected.equals(lIlIlIIIIIIIl[lIlIlIIIIIIlI[0]]) ? 1 : 0)) {
            return lIlIlIIIIIIlI[0];
        }
        if (!lIllllIIllIllll(CombatOptions.getSpecialAttackEnergy(), U()) || !lIllllIIlllIIII(this.u.y(), this.t.specHp()) || lIllllIIlllIIIl(this.u.y(), lIlIlIIIIIIlI[1])) {
            V();
            return lIlIlIIIIIIlI[0];
        }
        int i = T().get(EquipmentInventorySlot.WEAPON);
        if (lIllllIIlllIIlI(Arrays.stream(Static.getClient().getEnum(lIlIlIIIIIIlI[2]).getKeys()).anyMatch(i2 -> {
            if (lIllllIIlllIIll(i2, i)) {
                ?? r0 = lIlIlIIIIIIlI[3];
                "".length();
                return ((((19 + 56) - (-59)) + 11) ^ (((85 + 94) - 155) + 124)) == 0 ? ((79 ^ 6) ^ (47 ^ 109)) & (((((31 + 174) - 58) + 58) ^ (((159 + 105) - 108) + 42)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIIIIlI[0];
        }) ? 1 : 0)) {
            Log.warn(lIlIlIIIIIIIl[lIlIlIIIIIIlI[3]]);
            return lIlIlIIIIIIlI[0];
        }
        if (lIllllIIlllIIlI(T().isEquipped() ? 1 : 0)) {
            T().swap();
        }
        if (lIllllIIllIlllI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIlIlIIIIIIlI[0];
        }
        Combat.toggleSpec();
        return lIlIlIIIIIIlI[3];
    }

    private static boolean lIllllIIllIllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllllIIlllIIlI(int i) {
        return i == 0;
    }

    private EquipmentSetup T() {
        return (EquipmentSetup) this.t.specGear().selected(EquipmentSetup.class);
    }

    private static boolean lIllllIIlllIIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIllllIIllIlIIl(String llllllllllllllIllIllIIllIIIIIIII, String llllllllllllllIllIllIIlIllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIllllllll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIIlI[6]), "DES");
            Cipher llllllllllllllIllIllIIllIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIllIIllIIIIIIlI.init(lIlIlIIIIIIlI[5], secretKeySpec);
            return new String(llllllllllllllIllIllIIllIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIllIIIIIIIl) {
            llllllllllllllIllIllIIllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected A(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
    }

    private static boolean lIllllIIlllIIll(int i, int i2) {
        return i == i2;
    }

    private static String lIllllIIllIlIlI(String llllllllllllllIllIllIIlIllllIIll, String llllllllllllllIllIllIIlIllllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIlIllllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIlIllllIlIl.init(lIlIlIIIIIIlI[5], secretKeySpec);
            return new String(llllllllllllllIllIllIIlIllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIllllIlII) {
            llllllllllllllIllIllIIlIllllIlII.printStackTrace();
            return null;
        }
    }

    private void V() {
        EquipmentSetup equipmentSetup = ((BankLoadout) this.t.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        if (lIllllIIlllIIlI(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private int U() {
        return Static.getClient().getEnum(lIlIlIIIIIIlI[2]).getIntValue(T().get(EquipmentInventorySlot.WEAPON)) / lIlIlIIIIIIlI[4];
    }

    private static boolean lIllllIIlllIIIl(int i, int i2) {
        return i < i2;
    }
}
