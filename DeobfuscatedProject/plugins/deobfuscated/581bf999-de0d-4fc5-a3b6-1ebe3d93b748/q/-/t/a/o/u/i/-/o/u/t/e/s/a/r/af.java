/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.a;

@TaskDesc(name="Drinking potion", priority=200)
public class af
extends Z {
    private final /* synthetic */ C cI;
    private static /* synthetic */ String[] llIlIIIIIll;
    private static /* synthetic */ int[] llIlIIIIlII;
    private final /* synthetic */ SquireAutoTOA cJ;

    private static boolean lIlIIlIIIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIlllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIIIlllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIlIIIII(Object object) {
        return object != null;
    }

    private static void lIlIIlIIIllIIl() {
        llIlIIIIIll = new String[llIlIIIIlII[2]];
        af.llIlIIIIIll[af.llIlIIIIlII[0]] = af."Drink";
    }

    static {
        af.lIlIIlIIIllIlI();
        af.lIlIIlIIIllIIl();
    }

    private static String lIlIIlIIIllIII(String llllllllllllllllIIlllIIIlIIIllIl, String llllllllllllllllIIlllIIIlIIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIIlIIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIIlIIlIIIl.init(llIlIIIIlII[3], llllllllllllllllIIlllIIIlIIlIIlI);
            return new String(llllllllllllllllIIlllIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIIlIIlIIII) {
            llllllllllllllllIIlllIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        af llllllllllllllllIIlllIIIlIlIIIlI;
        if (af.lIlIIlIIIllIll(this.cJ.e() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllII(llllllllllllllllIIlllIIIlIlIIIlI.bc() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllIl(Vars.getBit((int)llIlIIIIlII[1]))) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllII(llllllllllllllllIIlllIIIlIlIIIlI.cI.am() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        Item llllllllllllllllIIlllIIIlIlIIIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        a[] llllllllllllllllIIlllIIIlIlIIIII = a.a(llllllllllllllllIIlllIIIlIlIIIIl);
        int llllllllllllllllIIlllIIIlIIlllll = llllllllllllllllIIlllIIIlIlIIIII.length;
        int llllllllllllllllIIlllIIIlIIllllI = llIlIIIIlII[0];
        while (af.lIlIIlIIIllllI(llllllllllllllllIIlllIIIlIIllllI, llllllllllllllllIIlllIIIlIIlllll)) {
            a llllllllllllllllIIlllIIIlIIlllIl = llllllllllllllllIIlllIIIlIlIIIII[llllllllllllllllIIlllIIIlIIllllI];
            Skill[] llllllllllllllllIIlllIIIlIIlllII = llllllllllllllllIIlllIIIlIIlllIl.m();
            int llllllllllllllllIIlllIIIlIIllIll = llllllllllllllllIIlllIIIlIIlllII.length;
            int llllllllllllllllIIlllIIIlIIllIlI = llIlIIIIlII[0];
            while (af.lIlIIlIIIllllI(llllllllllllllllIIlllIIIlIIllIlI, llllllllllllllllIIlllIIIlIIllIll)) {
                Item llllllllllllllllIIlllIIIlIIlIlll;
                Skill llllllllllllllllIIlllIIIlIIllIIl = llllllllllllllllIIlllIIIlIIlllII[llllllllllllllllIIlllIIIlIIllIlI];
                int llllllllllllllllIIlllIIIlIIllIII = (int)(0.5 * (double)llllllllllllllllIIlllIIIlIIlllIl.a(llllllllllllllllIIlllIIIlIIllIIl));
                if (af.lIlIIlIIIlllll(Skills.getLevel((Skill)llllllllllllllllIIlllIIIlIIllIIl) + llllllllllllllllIIlllIIIlIIllIII, Skills.getBoostedLevel((Skill)llllllllllllllllIIlllIIIlIIllIIl)) && af.lIlIIlIIlIIIII(llllllllllllllllIIlllIIIlIIlIlll = Inventory.getFirst(item -> item.getName().startsWith(llllllllllllllllIIlllIIIlIIlllIl.l())))) {
                    llllllllllllllllIIlllIIIlIIlIlll.interact(llIlIIIIIll[llIlIIIIlII[0]]);
                    llllllllllllllllIIlllIIIlIlIIIlI.cI.ao();
                    return llIlIIIIlII[2];
                }
                ++llllllllllllllllIIlllIIIlIIllIlI;
                0;
                if ((86 + 52 - 39 + 70 ^ 22 + 94 - -37 + 20) > 0) continue;
                return ((124 + 113 - 98 + 22 ^ 50 + 107 - 78 + 69) & (0xA7 ^ 0x85 ^ (0x21 ^ 0x36) ^ -1)) != 0;
            }
            ++llllllllllllllllIIlllIIIlIIllllI;
            0;
            if (((0xA1 ^ 0x8B) & ~(0x28 ^ 2)) >= 0) continue;
            return ((0x24 ^ 0x7D) & ~(0xDB ^ 0x82)) != 0;
        }
        return llIlIIIIlII[0];
    }

    @Inject
    protected af(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cI = c2;
        this.cJ = squireAutoTOA;
    }

    private static void lIlIIlIIIllIlI() {
        llIlIIIIlII = new int[4];
        af.llIlIIIIlII[0] = (3 ^ 0x46) & ~(0x60 ^ 0x25);
        af.llIlIIIIlII[1] = -(0xFFFFCFD7 & 0x743B) & (0xFFFFFEBA & 0x7D5F);
        af.llIlIIIIlII[2] = 1;
        af.llIlIIIIlII[3] = 2;
    }

    private static boolean lIlIIlIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIllIll(int n2) {
        return n2 != 0;
    }
}

