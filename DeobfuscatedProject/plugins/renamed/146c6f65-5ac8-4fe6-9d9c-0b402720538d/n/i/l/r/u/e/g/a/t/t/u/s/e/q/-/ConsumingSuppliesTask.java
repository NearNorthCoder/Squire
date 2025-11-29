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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
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

/* TASK: Consuming supplies -> ConsumingsuppliesTask */
@TaskDesc(name="Consuming supplies", priority=5, register=true)
public class ConsumingSuppliesTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIllllllIl;
    private /* synthetic */ boolean bF;
    private static /* synthetic */ String[] llIIllllllII;
    private final /* synthetic */ b bE;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (v.lIIIIIIIIllllll(e.ax.contains(npcSpawned.getNpc().getId()) ? 1 : 0)) {
            return;
        }
        this.bF = llIIllllllIl[0];
    }

    private static void lIIIIIIIIlllIII() {
        llIIllllllII = new String[llIIllllllIl[4]];
        v.llIIllllllII[v.llIIllllllIl[1]] = v."Eat";
        v.llIIllllllII[v.llIIllllllIl[0]] = v."Drink";
    }

    private boolean bv() {
        boolean bl;
        if (v.lIIIIIIIlIIIIII(NPCs.getAll(nPC -> e.ax.contains(nPC.getId())).size())) {
            bl = llIIllllllIl[0];
            0;
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

    private static String lIIIIIIIIllIllI(String var14, String var21) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIllllllIl[4], var11);
            return new String(var9.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
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
        int var13;
        int n2;
        int n3;
        v var19;
        Player player = Players.getLocal();
        if (v.lIIIIIIIIlllIlI(player)) {
            return llIIllllllIl[1];
        }
        Item var8 = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        Item var22 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
        int var10 = var19.ba.h().eatToDuringNados();
        int var4 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        if (!v.lIIIIIIIIlllIll(Movement.getRunEnergy(), llIIllllllIl[2]) || v.lIIIIIIIIllllII(Skills.getBoostedLevel((Skill)Skill.PRAYER), llIIllllllIl[3])) {
            n3 = llIIllllllIl[0];
            0;
            if (-(0x2E ^ 0x6D ^ (0xC2 ^ 0x85)) >= 0) {
                return ((168 + 47 - 64 + 57 ^ 126 + 118 - 147 + 34) & (8 ^ 0x39 ^ (0x22 ^ 0x40) ^ -1)) != 0;
            }
        } else {
            n3 = llIIllllllIl[1];
        }
        int var6 = n3;
        int var3 = llIIllllllIl[1];
        if (v.lIIIIIIIIllllIl(var19.bv() ? 1 : 0) && !v.lIIIIIIIIlllIll(var4 - llIIllllllIl[2], var19.ba.h().eatBelowNoNados()) || v.lIIIIIIIIllllII(var4, var19.ba.h().eatBelowNoNados())) {
            var19.bF = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIllllII(var4, var10) && v.lIIIIIIIIllllIl(var19.bF ? 1 : 0) && (!v.lIIIIIIIIllllIl(var19.bv() ? 1 : 0) || v.lIIIIIIIIllllIl(Players.getLocal().isMoving() ? 1 : 0))) {
            n2 = llIIllllllIl[0];
            0;
            if (1 <= 0) {
                return false;
            }
        } else {
            n2 = llIIllllllIl[1];
        }
        if (v.lIIIIIIIIllllIl(var13 = n2) && v.lIIIIIIIIlllllI(var8) && v.lIIIIIIIIllllll(var19.bE.q() ? 1 : 0)) {
            var8.interact(llIIllllllII[llIIllllllIl[1]]);
            var19.bE.u();
            var3 = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIllllIl(var6) && v.lIIIIIIIIlllllI(var22) && v.lIIIIIIIIllllll(var19.bE.s() ? 1 : 0)) {
            var22.interact(llIIllllllII[llIIllllllIl[0]]);
            var19.bE.v();
            var3 = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIlllIll(var4, var10)) {
            var19.bF = llIIllllllIl[1];
        }
        return (boolean)var7_7;
    }

    private static boolean lIIIIIIIlIIIIII(int n2) {
        return n2 > 0;
    }

    private static String lIIIIIIIIllIlll(String var17, String var15) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var16 = var15.toCharArray();
        int var20 = llIIllllllIl[1];
        char[] var7 = var17.toCharArray();
        int var1 = var7.length;
        int var2 = llIIllllllIl[1];
        while (v.lIIIIIIIIllllII(var2, var1)) {
            char var5 = var7[var2];
            var12.append((char)(var5 ^ var16[var20 % var16.length]));
            0;
            ++var20;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public v(c c2, b b2) {
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

    private static void lIIIIIIIIlllIIl() {
        llIIllllllIl = new int[5];
        v.llIIllllllIl[0] = 1;
        v.llIIllllllIl[1] = (8 ^ 0x36) & ~(0x16 ^ 0x28);
        v.llIIllllllIl[2] = 56 + 141 - 51 + 2 ^ 38 + 89 - 60 + 61;
        v.llIIllllllIl[3] = 0xF6 ^ 0x87 ^ (0x5B ^ 0x2F);
        v.llIIllllllIl[4] = 2;
    }

    private static boolean lIIIIIIIIllllll(int n2) {
        return n2 == 0;
    }
}

