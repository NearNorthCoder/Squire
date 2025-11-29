/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Consuming supplies", priority=5, register=true)
public class ConsumingSuppliesTask
extends GauntletTaskBase {
    
    private  boolean bF;
    
    private final  b bE;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (v.lIIIIIIIIllllll(e.ax.contains(npcSpawned.getNpc().getId()) ? 1 : 0)) {
            return;
        }
        this.bF = llIIllllllIl[0];
    }

    private static void lIIIIIIIIlllIII() {
        llIIllllllII = new String[llIIllllllIl[4]];
        v.llIIllllllII[v.llIIllllllIl[1]] = "Eat";
        v.llIIllllllII[v.llIIllllllIl[0]] = "Drink";
    }

    private boolean bv() {
        boolean bl;
        if (v.lIIIIIIIlIIIIII(NPCs.getAll(nPC -> e.ax.contains(nPC.getId())).size())) {
            bl = llIIllllllIl[0];

            if (3 < 3) {
                return ((0x1F ^ 0x20 ^ (0xAC ^ 0x86)) & (0x15 ^ 0x46 ^ (7 ^ 0x41) ^ -1)) != 0;
            }
        } else {
            bl = llIIllllllIl[1];
        }
        return bl;
    }

    private static boolean lIIIIIIIIlllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var7_7;
        int var1;
        int n2;
        int n3;
        v var2;
        Player player = Players.getLocal();
        if (v.lIIIIIIIIlllIlI(player)) {
            return llIIllllllIl[1];
        }
        Item var3 = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        Item var4 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
        int var5 = var2.ba.h().eatToDuringNados();
        int var6 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        if (!v.lIIIIIIIIlllIll(Movement.getRunEnergy(), llIIllllllIl[2]) || v.lIIIIIIIIllllII(Skills.getBoostedLevel((Skill)Skill.PRAYER), llIIllllllIl[3])) {
            n3 = llIIllllllIl[0];

            if (-(0x2E ^ 0x6D ^ (0xC2 ^ 0x85)) >= 0) {
                return ((168 + 47 - 64 + 57 ^ 126 + 118 - 147 + 34) & (8 ^ 0x39 ^ (0x22 ^ 0x40) ^ -1)) != 0;
            }
        } else {
            n3 = llIIllllllIl[1];
        }
        int var7 = n3;
        int var8 = llIIllllllIl[1];
        if (v.lIIIIIIIIllllIl(var2.bv() ? 1 : 0) && !v.lIIIIIIIIlllIll(var6 - llIIllllllIl[2], var2.ba.h().eatBelowNoNados()) || v.lIIIIIIIIllllII(var6, var2.ba.h().eatBelowNoNados())) {
            var2.bF = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIllllII(var6, var5) && v.lIIIIIIIIllllIl(var2.bF ? 1 : 0) && (!v.lIIIIIIIIllllIl(var2.bv() ? 1 : 0) || v.lIIIIIIIIllllIl(Players.getLocal().isMoving() ? 1 : 0))) {
            n2 = llIIllllllIl[0];

            if (1 <= 0) {
                return false;
            }
        } else {
            n2 = llIIllllllIl[1];
        }
        if (v.lIIIIIIIIllllIl(var1 = n2) && v.lIIIIIIIIlllllI(var3) && v.lIIIIIIIIllllll(var2.bE.q() ? 1 : 0)) {
            var3.interact(llIIllllllII[llIIllllllIl[1]]);
            var2.bE.u();
            var8 = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIllllIl(var7) && v.lIIIIIIIIlllllI(var4) && v.lIIIIIIIIllllll(var2.bE.s() ? 1 : 0)) {
            var4.interact(llIIllllllII[llIIllllllIl[0]]);
            var2.bE.ConsumingSuppliesTask();
            var8 = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIlllIll(var6, var5)) {
            var2.bF = llIIllllllIl[1];
        }
        return (boolean)var7_7;
    }

    private static boolean lIIIIIIIlIIIIII(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var9);
    }

    @Inject
    public ConsumingSuppliesTask(c c2, b b2) {
        d[] dArray = new d[llIIllllllIl[0]];
        dArray[v.llIIllllllIl[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bE = b2;
    }

    static {
        v.lIIIIIIIIlllIIl();
        v.lIIIIIIIIlllIII();
    }

    private static boolean lIIIIIIIIlllllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIlllIlI(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIllllll(int n2) {
        return n2 == 0;
    }
}

