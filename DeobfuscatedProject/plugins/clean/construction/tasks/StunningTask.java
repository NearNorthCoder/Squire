/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.construction.tasks;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Stunning", priority=3, register=true)
public class StunningTask
extends Task {
    private final  SquireAlchTeleportConfig eU;
    private static final  int eT;

    private final  List<Integer> eW;
    private final  List<Spell> eV;
    private final  StunAlchTeleport eS;

    private static boolean lIlIlIlIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlIlIlII(Object object) {
        return object == null;
    }

    @Inject
    public StunningTask(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.eV = List.of(SpellBook.Standard.STUN, SpellBook.Standard.ENFEEBLE, SpellBook.Standard.VULNERABILITY, SpellBook.Standard.CURSE, SpellBook.Standard.WEAKEN, SpellBook.Standard.CONFUSE);
        this.eW = List.of(Integer.valueOf(llIIIIllI[0]), Integer.valueOf(llIIIIllI[1]), Integer.valueOf(llIIIIllI[2]), Integer.valueOf(llIIIIllI[3]), Integer.valueOf(llIIIIllI[4]), Integer.valueOf(llIIIIllI[5]));
        this.eS = stunAlchTeleport;
        this.eU = squireAlchTeleportConfig;
    }

    private static void lIlIlIlIIII() {
        llIIIIlIl = new String[llIIIIllI[9]];
        aT.llIIIIlIl[aT.llIIIIllI[6]] = "Guard";
        aT.llIIIIlIl[aT.llIIIIllI[8]] = "Guard";
    }

    private static  boolean a(Player player, NPC nPC) {
        int n2;
        if (aT.lIlIlIlIIlI(nPC.getName().equals(llIIIIlIl[llIIIIllI[8]]) ? 1 : 0) && aT.lIlIlIlIlll(nPC.getInteracting(), player)) {
            n2 = llIIIIllI[8];

            if (-(0x2A ^ 0x2E) > 0) {
                return false;
            }
        } else {
            n2 = llIIIIllI[6];
        }
        return n2 != 0;
    }

    private static boolean lIlIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        aT lIllIllllIlllII;
        void lIllIllllIllIll;
        Player player = Players.getLocal();
        if (aT.lIlIlIlIIlI(this.eU.stunAlchOnly() ? 1 : 0)) {
            return llIIIIllI[6];
        }
        if (aT.lIlIlIlIIll(lIllIllllIllIll.getAnimation(), llIIIIllI[7])) {
            return llIIIIllI[6];
        }
        if (aT.lIlIlIlIIlI(lIllIllllIlllII.eS.cl() ? 1 : 0)) {
            return llIIIIllI[6];
        }
        NPC lIllIllllIllIlI = NPCs.getNearest(arg_0 -> aT.a((Player)lIllIllllIllIll, arg_0));
        if (aT.lIlIlIlIlII(lIllIllllIllIlI) && aT.lIlIlIlIlII(lIllIllllIllIlI = NPCs.getNearest(nPC -> {
            int n2;
            if (aT.lIlIlIlIIlI(nPC.getName().equals(llIIIIlIl[llIIIIllI[6]]) ? 1 : 0) && aT.lIlIlIlIlII(nPC.getInteracting())) {
                n2 = llIIIIllI[8];

                if (1 == 3) {
                    return false;
                }
            } else {
                n2 = llIIIIllI[6];
            }
            return n2 != 0;
        }))) {
            return llIIIIllI[6];
        }
        Spell lIllIllllIllIIl = null;
        Iterator<Spell> lIllIllllIllIII = lIllIllllIlllII.eV.iterator();
        while (aT.lIlIlIlIIlI(lIllIllllIllIII.hasNext() ? 1 : 0)) {
            Spell lIllIllllIlIlll = lIllIllllIllIII.next();
            if (aT.lIlIlIlIIlI(lIllIllllIlIlll.canCast() ? 1 : 0)) {
                lIllIllllIllIIl = lIllIllllIlIlll;

                if (-1 < (0x46 ^ 0x42)) break;
                return false;
            }

            if (2 >= 0) continue;
            return false;
        }
        if (aT.lIlIlIlIlII(lIllIllllIllIIl)) {
            return llIIIIllI[6];
        }
        var3_3.castOn((Interactable)var2_2);
        this.sleep(llIIIIllI[8]);
        return llIIIIllI[8];
    }

    private static boolean lIlIlIlIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(StatChanged statChanged) {
        void lIllIllllIlIIII;
        aT lIllIllllIlIIIl;
        if (aT.lIlIlIlIlIl(statChanged.getSkill(), Skill.MAGIC)) {
            return;
        }
        int lIllIllllIIllll = lIllIllllIlIIIl.eS.cm();
        int lIllIllllIIlllI = lIllIllllIlIIII.getXp();
        lIllIllllIlIIIl.eS.z(lIllIllllIIlllI);
        int lIllIllllIIllIl = lIllIllllIIlllI - lIllIllllIIllll;
        if (aT.lIlIlIlIllI(lIllIllllIIllIl)) {
            return;
        }
        if (aT.lIlIlIlIIlI(lIllIllllIlIIIl.eW.contains(lIllIllllIIllIl) ? 1 : 0)) {
            lIllIllllIlIIIl.eS.d(llIIIIllI[8]);
        }
    }

    static {
        aT.lIlIlIlIIIl();
        aT.lIlIlIlIIII();
        eT = llIIIIllI[7];
    }

}

