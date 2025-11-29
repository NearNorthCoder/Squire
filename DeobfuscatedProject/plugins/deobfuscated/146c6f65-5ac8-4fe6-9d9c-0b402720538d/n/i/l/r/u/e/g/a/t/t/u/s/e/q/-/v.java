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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
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
public class v
extends n {
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

    private static String lIIIIIIIIllIllI(String lllllllllllllllIlIIIllllIIIlIllI, String lllllllllllllllIlIIIllllIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllllIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllllIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllllIIIllIlI.init(llIIllllllIl[4], lllllllllllllllIlIIIllllIIIllIll);
            return new String(lllllllllllllllIlIIIllllIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllllIIIllIIl) {
            lllllllllllllllIlIIIllllIIIllIIl.printStackTrace();
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
        int lllllllllllllllIlIIIllllIIlIIlII;
        int n2;
        int n3;
        v lllllllllllllllIlIIIllllIIlIllII;
        Player player = Players.getLocal();
        if (v.lIIIIIIIIlllIlI(player)) {
            return llIIllllllIl[1];
        }
        Item lllllllllllllllIlIIIllllIIlIlIlI = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        Item lllllllllllllllIlIIIllllIIlIlIIl = Inventory.getFirst(item -> e.aI.contains(item.getId()));
        int lllllllllllllllIlIIIllllIIlIlIII = lllllllllllllllIlIIIllllIIlIllII.ba.h().eatToDuringNados();
        int lllllllllllllllIlIIIllllIIlIIlll = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        if (!v.lIIIIIIIIlllIll(Movement.getRunEnergy(), llIIllllllIl[2]) || v.lIIIIIIIIllllII(Skills.getBoostedLevel((Skill)Skill.PRAYER), llIIllllllIl[3])) {
            n3 = llIIllllllIl[0];
            0;
            if (-(0x2E ^ 0x6D ^ (0xC2 ^ 0x85)) >= 0) {
                return ((168 + 47 - 64 + 57 ^ 126 + 118 - 147 + 34) & (8 ^ 0x39 ^ (0x22 ^ 0x40) ^ -1)) != 0;
            }
        } else {
            n3 = llIIllllllIl[1];
        }
        int lllllllllllllllIlIIIllllIIlIIllI = n3;
        int lllllllllllllllIlIIIllllIIlIIlIl = llIIllllllIl[1];
        if (v.lIIIIIIIIllllIl(lllllllllllllllIlIIIllllIIlIllII.bv() ? 1 : 0) && !v.lIIIIIIIIlllIll(lllllllllllllllIlIIIllllIIlIIlll - llIIllllllIl[2], lllllllllllllllIlIIIllllIIlIllII.ba.h().eatBelowNoNados()) || v.lIIIIIIIIllllII(lllllllllllllllIlIIIllllIIlIIlll, lllllllllllllllIlIIIllllIIlIllII.ba.h().eatBelowNoNados())) {
            lllllllllllllllIlIIIllllIIlIllII.bF = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIllllII(lllllllllllllllIlIIIllllIIlIIlll, lllllllllllllllIlIIIllllIIlIlIII) && v.lIIIIIIIIllllIl(lllllllllllllllIlIIIllllIIlIllII.bF ? 1 : 0) && (!v.lIIIIIIIIllllIl(lllllllllllllllIlIIIllllIIlIllII.bv() ? 1 : 0) || v.lIIIIIIIIllllIl(Players.getLocal().isMoving() ? 1 : 0))) {
            n2 = llIIllllllIl[0];
            0;
            if (1 <= 0) {
                return ((0x75 ^ 0x16) & ~(0x4C ^ 0x2F)) != 0;
            }
        } else {
            n2 = llIIllllllIl[1];
        }
        if (v.lIIIIIIIIllllIl(lllllllllllllllIlIIIllllIIlIIlII = n2) && v.lIIIIIIIIlllllI(lllllllllllllllIlIIIllllIIlIlIlI) && v.lIIIIIIIIllllll(lllllllllllllllIlIIIllllIIlIllII.bE.q() ? 1 : 0)) {
            lllllllllllllllIlIIIllllIIlIlIlI.interact(llIIllllllII[llIIllllllIl[1]]);
            lllllllllllllllIlIIIllllIIlIllII.bE.u();
            lllllllllllllllIlIIIllllIIlIIlIl = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIllllIl(lllllllllllllllIlIIIllllIIlIIllI) && v.lIIIIIIIIlllllI(lllllllllllllllIlIIIllllIIlIlIIl) && v.lIIIIIIIIllllll(lllllllllllllllIlIIIllllIIlIllII.bE.s() ? 1 : 0)) {
            lllllllllllllllIlIIIllllIIlIlIIl.interact(llIIllllllII[llIIllllllIl[0]]);
            lllllllllllllllIlIIIllllIIlIllII.bE.v();
            lllllllllllllllIlIIIllllIIlIIlIl = llIIllllllIl[0];
        }
        if (v.lIIIIIIIIlllIll(lllllllllllllllIlIIIllllIIlIIlll, lllllllllllllllIlIIIllllIIlIlIII)) {
            lllllllllllllllIlIIIllllIIlIllII.bF = llIIllllllIl[1];
        }
        return (boolean)var7_7;
    }

    private static boolean lIIIIIIIlIIIIII(int n2) {
        return n2 > 0;
    }

    private static String lIIIIIIIIllIlll(String lllllllllllllllIlIIIllllIIIIlIII, String lllllllllllllllIlIIIllllIIIIIIlI) {
        lllllllllllllllIlIIIllllIIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllllIIIIIllI = new StringBuilder();
        char[] lllllllllllllllIlIIIllllIIIIIlIl = lllllllllllllllIlIIIllllIIIIIIlI.toCharArray();
        int lllllllllllllllIlIIIllllIIIIIlII = llIIllllllIl[1];
        char[] lllllllllllllllIlIIIlllIlllllllI = lllllllllllllllIlIIIllllIIIIlIII.toCharArray();
        int lllllllllllllllIlIIIlllIllllllIl = lllllllllllllllIlIIIlllIlllllllI.length;
        int lllllllllllllllIlIIIlllIllllllII = llIIllllllIl[1];
        while (v.lIIIIIIIIllllII(lllllllllllllllIlIIIlllIllllllII, lllllllllllllllIlIIIlllIllllllIl)) {
            char lllllllllllllllIlIIIllllIIIIlIIl = lllllllllllllllIlIIIlllIlllllllI[lllllllllllllllIlIIIlllIllllllII];
            lllllllllllllllIlIIIllllIIIIIllI.append((char)(lllllllllllllllIlIIIllllIIIIlIIl ^ lllllllllllllllIlIIIllllIIIIIlIl[lllllllllllllllIlIIIllllIIIIIlII % lllllllllllllllIlIIIllllIIIIIlIl.length]));
            0;
            ++lllllllllllllllIlIIIllllIIIIIlII;
            ++lllllllllllllllIlIIIlllIllllllII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllllIIIIIllI);
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

