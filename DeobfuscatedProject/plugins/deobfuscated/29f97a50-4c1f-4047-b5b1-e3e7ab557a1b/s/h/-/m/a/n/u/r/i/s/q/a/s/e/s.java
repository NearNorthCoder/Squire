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
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="Enabling special attack", priority=10)
public class s
extends Task {
    private static /* synthetic */ int[] lIIllIIIllIIl;
    private static /* synthetic */ String[] lIIllIIIllIII;
    private final /* synthetic */ SquireShamanConfig al;
    private final /* synthetic */ c ak;

    private static boolean lIlIllllIIlllIl(Object object) {
        return object == null;
    }

    private static void lIlIllllIIllIlI() {
        lIIllIIIllIIl = new int[6];
        s.lIIllIIIllIIl[0] = (0x10 ^ 0x73) & ~(0x3B ^ 0x58);
        s.lIIllIIIllIIl[1] = 0x54 ^ 0x66;
        s.lIIllIIIllIIl[2] = 0x35 ^ 0x3E ^ 1;
        s.lIIllIIIllIIl[3] = 1;
        s.lIIllIIIllIIl[4] = 0x59 ^ 0x4F ^ (0x57 ^ 0x76);
        s.lIIllIIIllIIl[5] = 2;
    }

    private static boolean lIlIllllIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllllIIllIIl() {
        lIIllIIIllIII = new String[lIIllIIIllIIl[5]];
        s.lIIllIIIllIII[s.lIIllIIIllIIl[0]] = s."blowpipe";
        s.lIIllIIIllIII[s.lIIllIIIllIIl[3]] = s."magic shortbow";
    }

    static {
        s.lIlIllllIIllIlI();
        s.lIlIllllIIllIIl();
    }

    public boolean run() {
        Player player = Players.getLocal();
        if (s.lIlIllllIIllIll(this.al.room().x().contains((Locatable)player) ? 1 : 0)) {
            return lIIllIIIllIIl[0];
        }
        if (s.lIlIllllIIlllII(Combat.isSpecEnabled() ? 1 : 0)) {
            return lIIllIIIllIIl[0];
        }
        Item llllllllllllllIllllIIIlllIIIIIll = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (s.lIlIllllIIlllIl(llllllllllllllIllllIIIlllIIIIIll)) {
            return lIIllIIIllIIl[0];
        }
        String llllllllllllllIllllIIIlllIIIIIlI = llllllllllllllIllllIIIlllIIIIIll.getName().toLowerCase();
        if (s.lIlIllllIIlllII(llllllllllllllIllllIIIlllIIIIIlI.contains(lIIllIIIllIII[lIIllIIIllIIl[0]]) ? 1 : 0) && s.lIlIllllIIllllI(Combat.getSpecEnergy(), lIIllIIIllIIl[1]) && s.lIlIllllIIlllll(Combat.getMissingHealth(), lIIllIIIllIIl[2])) {
            Combat.toggleSpec();
            return lIIllIIIllIIl[3];
        }
        if (s.lIlIllllIIlllII(llllllllllllllIllllIIIlllIIIIIlI.contains(lIIllIIIllIII[lIIllIIIllIIl[3]]) ? 1 : 0) && s.lIlIllllIIllllI(Combat.getSpecEnergy(), lIIllIIIllIIl[4])) {
            Combat.toggleSpec();
            return lIIllIIIllIIl[3];
        }
        return lIIllIIIllIIl[0];
    }

    private static String lIlIllllIIllIII(String llllllllllllllIllllIIIllIlllIIlI, String llllllllllllllIllllIIIllIlllIllI) {
        llllllllllllllIllllIIIllIlllIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIllIlllIlIl = new StringBuilder();
        char[] llllllllllllllIllllIIIllIlllIlII = llllllllllllllIllllIIIllIlllIllI.toCharArray();
        int llllllllllllllIllllIIIllIlllIIll = lIIllIIIllIIl[0];
        char[] llllllllllllllIllllIIIllIllIllIl = llllllllllllllIllllIIIllIlllIIlI.toCharArray();
        int llllllllllllllIllllIIIllIllIllII = llllllllllllllIllllIIIllIllIllIl.length;
        int llllllllllllllIllllIIIllIllIlIll = lIIllIIIllIIl[0];
        while (s.lIlIllllIlIIIII(llllllllllllllIllllIIIllIllIlIll, llllllllllllllIllllIIIllIllIllII)) {
            char llllllllllllllIllllIIIllIllllIII = llllllllllllllIllllIIIllIllIllIl[llllllllllllllIllllIIIllIllIlIll];
            llllllllllllllIllllIIIllIlllIlIl.append((char)(llllllllllllllIllllIIIllIllllIII ^ llllllllllllllIllllIIIllIlllIlII[llllllllllllllIllllIIIllIlllIIll % llllllllllllllIllllIIIllIlllIlII.length]));
            0;
            ++llllllllllllllIllllIIIllIlllIIll;
            ++llllllllllllllIllllIIIllIllIlIll;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIllIlllIlIl);
    }

    private static boolean lIlIllllIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllllIIlllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public s(c c2, SquireShamanConfig squireShamanConfig) {
        this.ak = c2;
        this.al = squireShamanConfig;
    }

    private static boolean lIlIllllIIllIll(int n2) {
        return n2 == 0;
    }
}

