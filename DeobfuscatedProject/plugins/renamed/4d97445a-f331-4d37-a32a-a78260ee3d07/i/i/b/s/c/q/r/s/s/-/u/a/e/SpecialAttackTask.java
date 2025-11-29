/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.d_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

/* TASK: Special Attack -> SpecialattackTask */
@TaskDesc(name="Special Attack", priority=15)
public class SpecialAttackTask
extends Task {
    private final /* synthetic */ SquireCerberusConfig aN;
    private static /* synthetic */ String[] llIIIIIIl;
    private static final /* synthetic */ int aM;
    private final /* synthetic */ a aO;
    private static /* synthetic */ int[] llIIllIII;

    private static boolean lIllIIlIllI(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIIlII() {
        llIIIIIIl = new String[llIIllIII[7]];
        y.llIIIIIIl[y.llIIllIII[0]] = y."Eat";
        y.llIIIIIIl[y.llIIllIII[1]] = y."Eat";
        y.llIIIIIIl[y.llIIllIII[6]] = y."wild";
    }

    @Inject
    public y(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.aN = squireCerberusConfig;
        this.aO = a2;
    }

    static {
        y.lIllIIlIlIl();
        y.lIlIlIIIlII();
        aM = llIIllIII[4];
    }

    public static int j(int n2) {
        if (y.lIllIIllIll(n2, llIIllIII[2])) {
            return llIIllIII[3];
        }
        int n3 = Static.getClient().getEnum(llIIllIII[4]).getIntValue(n2);
        return n3 / llIIllIII[5];
    }

    private static boolean lIllIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIII(Object object) {
        return object == null;
    }

    private static String lIlIlIIIIlI(String lIllIIllIlIllII, String lIllIIllIlIlIll) {
        lIllIIllIlIllII = new String(Base64.getDecoder().decode(lIllIIllIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllIlIllll = new StringBuilder();
        char[] lIllIIllIlIlllI = lIllIIllIlIlIll.toCharArray();
        int lIllIIllIlIllIl = llIIllIII[0];
        char[] lIllIIllIlIIlll = lIllIIllIlIllII.toCharArray();
        int lIllIIllIlIIllI = lIllIIllIlIIlll.length;
        int lIllIIllIlIIlIl = llIIllIII[0];
        while (y.lIllIIllIlI(lIllIIllIlIIlIl, lIllIIllIlIIllI)) {
            char lIllIIllIllIIlI = lIllIIllIlIIlll[lIllIIllIlIIlIl];
            lIllIIllIlIllll.append((char)(lIllIIllIllIIlI ^ lIllIIllIlIlllI[lIllIIllIlIllIl % lIllIIllIlIlllI.length]));
            0;
            ++lIllIIllIlIllIl;
            ++lIllIIllIlIIlIl;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lIllIIllIlIllll);
    }

    private static boolean lIllIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        int lIllIIlllIIIIll;
        int n2;
        y lIllIIlllIIIlll;
        if (y.lIllIIlIllI(this.aN.cerbSpecGear().isSelected() ? 1 : 0)) {
            return llIIllIII[0];
        }
        d lIllIIlllIIIllI = lIllIIlllIIIlll.aO.k();
        if (!y.lIllIIlIlll(lIllIIlllIIIllI) || y.lIllIIllIII(lIllIIlllIIIllI.y())) {
            return llIIllIII[0];
        }
        if (y.lIllIIlIllI(Reachable.isInteractable((Locatable)lIllIIlllIIIllI.y()) ? 1 : 0)) {
            return llIIllIII[0];
        }
        EquipmentSetup lIllIIlllIIIlIl = ((BankLoadout)lIllIIlllIIIlll.aN.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        EquipmentSetup lIllIIlllIIIlII = (EquipmentSetup)lIllIIlllIIIlll.aN.cerbSpecGear().selected(EquipmentSetup.class);
        if (y.lIllIIllIIl(Combat.getSpecEnergy(), y.j(lIllIIlllIIIlII.get(EquipmentInventorySlot.WEAPON)))) {
            n2 = llIIllIII[1];
            0;
            if (((0xD5 ^ 0x86) & ~(0xE8 ^ 0xBB)) != 0) {
                return false;
            }
        } else {
            n2 = llIIllIII[0];
        }
        if (y.lIllIIlIllI(lIllIIlllIIIIll = n2)) {
            if (y.lIllIIlIllI(Gear.isEquipped((int[])lIllIIlllIIIlIl.getIds()) ? 1 : 0)) {
                Gear.swapTo((EquipmentSetup)lIllIIlllIIIlIl);
                0;
                return llIIllIII[1];
            }
            return llIIllIII[0];
        }
        if (y.lIllIIlIllI(Gear.isEquipped((int[])lIllIIlllIIIlII.getIds()) ? 1 : 0)) {
            if (y.lIllIIllIlI(Inventory.getFreeSlots(), llIIllIII[1])) {
                Item lIllIIlllIIIIlI = Inventory.getFirst(item -> {
                    int n2;
                    String[] stringArray = new String[llIIllIII[1]];
                    stringArray[y.llIIllIII[0]] = llIIIIIIl[llIIllIII[1]];
                    if (y.lIllIIlllII(item.hasAction(stringArray) ? 1 : 0) && y.lIllIIlIllI(item.getName().contains(llIIIIIIl[llIIllIII[6]]) ? 1 : 0)) {
                        n2 = llIIllIII[1];
                        0;
                        
                        }
                    } else {
                        n2 = llIIllIII[0];
                    }
                    return n2 != 0;
                });
                if (y.lIllIIlIlll(lIllIIlllIIIIlI)) {
                    lIllIIlllIIIIlI.interact(llIIIIIIl[llIIllIII[0]]);
                    return llIIllIII[1];
                }
                return llIIllIII[0];
            }
            Gear.swapTo((EquipmentSetup)lIllIIlllIIIlII);
            0;
            return llIIllIII[1];
        }
        if (y.lIllIIlIllI(Combat.isSpecEnabled() ? 1 : 0)) {
            Combat.toggleSpec();
            return llIIllIII[1];
        }
        return llIIllIII[0];
    }

    private static void lIllIIlIlIl() {
        llIIllIII = new int[8];
        y.llIIllIII[0] = (0x1F ^ 0x11) & ~(0x15 ^ 0x1B);
        y.llIIllIII[1] = 1;
        y.llIIllIII[2] = -1;
        y.llIIllIII[3] = 0xFFFFBFF9 & 0x453F;
        y.llIIllIII[4] = 0xFFFFB38E & 0x4FFB;
        y.llIIllIII[5] = 74 + 127 - 143 + 92 ^ 6 + 71 - 9 + 88;
        y.llIIllIII[6] = 2;
        y.llIIllIII[7] = 3;
    }

    private static String lIlIlIIIIll(String lIllIIllIIlllII, String lIllIIllIIllIll) {
        try {
            SecretKeySpec lIllIIllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIllIIllllI = Cipher.getInstance("Blowfish");
            lIllIIllIIllllI.init(llIIllIII[6], lIllIIllIIlllll);
            return new String(lIllIIllIIllllI.doFinal(Base64.getDecoder().decode(lIllIIllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIllIIlllIl) {
            lIllIIllIIlllIl.printStackTrace();
            return null;
        }
    }
}

