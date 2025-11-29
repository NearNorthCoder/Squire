package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

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
@TaskDesc(name = "Handling Spec and Gear", priority = 100000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.r  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/r.class */
public class r extends a {
    private static /* synthetic */ String[] lIIlIllIIllIl;
    private static /* synthetic */ int[] lIIlIllIIllll;

    private static boolean lIlIllIlIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIlIIIlIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIllIlIIIlIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.a
    public boolean a() {
        String selected = this.b.specGear().getSelected();
        if (!lIlIllIlIIIIllI(selected) || lIlIllIlIIIIlll(selected.equals(lIIlIllIIllIl[lIIlIllIIllll[0]]) ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        if (!lIlIllIlIIIlIII(CombatOptions.getSpecialAttackEnergy(), v()) || lIlIllIlIIIlIIl(this.c.p(), lIIlIllIIllll[1])) {
            w();
            return lIIlIllIIllll[0];
        }
        int i = u().get(EquipmentInventorySlot.WEAPON);
        if (lIlIllIlIIIlIlI(Arrays.stream(Static.getClient().getEnum(lIIlIllIIllll[2]).getKeys()).anyMatch(i2 -> {
            if (lIlIllIlIIIlIll(i2, i)) {
                ?? r0 = lIIlIllIIllll[3];
                "".length();
                return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIllIIllll[0];
        }) ? 1 : 0)) {
            Log.warn(lIIlIllIIllIl[lIIlIllIIllll[3]]);
            return lIIlIllIIllll[0];
        }
        if (lIlIllIlIIIlIlI(u().isEquipped() ? 1 : 0)) {
            u().swap();
        }
        if (lIlIllIlIIIIlll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        Combat.toggleSpec();
        return lIIlIllIIllll[3];
    }

    private static String lIlIllIIllllllI(String llllllllllllllIllllIlIlIlIlIIlIl, String llllllllllllllIllllIlIlIlIlIIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlIlIlIlIIlII.toCharArray();
        int llllllllllllllIllllIlIlIlIlIIIIl = lIIlIllIIllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllIIllll[0];
        while (lIlIllIlIIIlIIl(i, length)) {
            char llllllllllllllIllllIlIlIlIlIIllI = charArray2[i];
            sb.append((char) (llllllllllllllIllllIlIlIlIlIIllI ^ charArray[llllllllllllllIllllIlIlIlIlIIIIl % charArray.length]));
            "".length();
            llllllllllllllIllllIlIlIlIlIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private int v() {
        return Static.getClient().getEnum(lIIlIllIIllll[2]).getIntValue(u().get(EquipmentInventorySlot.WEAPON)) / lIIlIllIIllll[4];
    }

    private EquipmentSetup u() {
        return (EquipmentSetup) this.b.specGear().selected(EquipmentSetup.class);
    }

    private void w() {
        EquipmentSetup equipmentSetup = ((BankLoadout) this.b.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        if (lIlIllIlIIIlIlI(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private static String lIlIllIIlllllIl(String llllllllllllllIllllIlIlIlIIlIIII, String llllllllllllllIllllIlIlIlIIIllll) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllIIllll[5], llllllllllllllIllllIlIlIlIIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlIlIIlIIIl) {
            llllllllllllllIllllIlIlIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected r(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        super(squireScurrius, squireScurriusConfig, bVar, client);
    }

    private static boolean lIlIllIlIIIIlll(int i) {
        return i != 0;
    }

    private static void lIlIllIlIIIIlIl() {
        lIIlIllIIllll = new int[6];
        lIIlIllIIllll[0] = (199 ^ 193) & ((38 ^ 32) ^ (-1));
        lIIlIllIIllll[1] = (241 ^ 136) ^ (24 ^ 73);
        lIIlIllIIllll[2] = (-5174) & 6079;
        lIIlIllIIllll[3] = " ".length();
        lIIlIllIIllll[4] = 23 ^ 29;
        lIIlIllIIllll[5] = "  ".length();
    }

    private static void lIlIllIIlllllll() {
        lIIlIllIIllIl = new String[lIIlIllIIllll[5]];
        lIIlIllIIllIl[lIIlIllIIllll[0]] = lIlIllIIlllllIl("ol9buKuMIRY=", "XqUeJ");
        lIIlIllIIllIl[lIIlIllIIllll[3]] = lIlIllIIllllllI("Dx0RWRIzBhEJQS8dEQtBJQIBGkEhFwUJDjhSFxwVIwJEDggiGkQYQSEXBQkOOFIQEQAiUgwYEnYcC1kSJhcHWEB3", "Vrdya");
    }

    static {
        lIlIllIlIIIIlIl();
        lIlIllIIlllllll();
    }

    private static boolean lIlIllIlIIIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIlIIIlIlI(int i) {
        return i == 0;
    }
}
