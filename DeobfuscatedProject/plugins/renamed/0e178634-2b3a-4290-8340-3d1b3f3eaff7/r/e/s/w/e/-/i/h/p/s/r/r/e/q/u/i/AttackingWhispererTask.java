/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Ancient
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Attacking Whisperer -> AttackingwhispererTask */
@TaskDesc(name="Attacking Whisperer", register=true)
public class AttackingWhispererTask
extends u_Unknown {
    private /* synthetic */ int T;
    private static /* synthetic */ int[] lIlIlllIIllII;
    private static /* synthetic */ String[] lIlIlllIIlIll;
    private /* synthetic */ boolean U;

    private static void llIIIIlIIIlIlll() {
        lIlIlllIIlIll = new String[lIlIlllIIllII[7]];
        n.lIlIlllIIlIll[n.lIlIlllIIllII[0]] = n."Casting freeze on whisperer";
        n.lIlIlllIIlIll[n.lIlIlllIIllII[2]] = n."Attack";
    }

    private static void llIIIIlIIIllIII() {
        lIlIlllIIllII = new int[11];
        n.lIlIlllIIllII[0] = (50 + 133 - 32 + 2 ^ 14 + 140 - 7 + 21) & (0xBF ^ 0x89 ^ (0x9F ^ 0x98) ^ -1);
        n.lIlIlllIIllII[1] = -(0xFFFFE043 & 0x5FFD) & (0xFFFFEFFF & 0x7FED);
        n.lIlIlllIIllII[2] = 1;
        n.lIlIlllIIllII[3] = 0xE3 ^ 0xBD;
        n.lIlIlllIIllII[4] = 0x90 ^ 0x94;
        n.lIlIlllIIllII[5] = 0xFFFFFBB3 & 0x1F4E;
        n.lIlIlllIIllII[6] = 0xFFFFDD56 & 0x72F9;
        n.lIlIlllIIllII[7] = 2;
        n.lIlIlllIIllII[8] = -(0xFFFFC5B7 & 0x3EFA) & (0xFFFFD6BF & Short.MAX_VALUE);
        n.lIlIlllIIllII[9] = 3;
        n.lIlIlllIIllII[10] = -(0xFFFFC17D & 0x3FB7) & (0xFFFFDFFE & 0x7D7F);
    }

    private static String llIIIIlIIIlIllI(String var10, String var4) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var8 = var4.toCharArray();
        int var9 = lIlIlllIIllII[0];
        char[] var5 = var10.toCharArray();
        int var1 = var5.length;
        int var6 = lIlIlllIIllII[0];
        while (n.llIIIIlIIIlllll(var6, var1)) {
            char var7 = var5[var6];
            var3.append((char)(var7 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var6;
            0;
            if ((0x4C ^ 0x36 ^ (0x65 ^ 0x1B)) > 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        n var11;
        void var12;
        SpellBook.Ancient var2;
        NPC nPC = this.W.j();
        if (n.llIIIIlIIIllIIl(this.U ? 1 : 0) && n.llIIIIlIIIllIlI(nPC.getId(), lIlIlllIIllII[1])) {
            SpellBook.Ancient ancient;
            if (n.llIIIIlIIIllIll(this.T -= lIlIlllIIllII[2])) {
                return lIlIlllIIllII[2];
            }
            if (n.llIIIIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIlllIIllII[3])) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;
                0;
                if ((0x37 ^ 0x5D ^ (0x42 ^ 0x2C)) < 0) {
                    return false;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            if (n.llIIIIlIIIlllIl((var2 = ancient).canCast() ? 1 : 0)) {
                Log.info((String)lIlIlllIIlIll[lIlIlllIIllII[0]]);
                Magic.cast((Spell)var2, (NPC)var12);
                var11.U = lIlIlllIIllII[2];
                return lIlIlllIIllII[2];
            }
        }
        if (n.llIIIIlIIIllllI(Players.getLocal().getInteracting())) {
            return lIlIlllIIllII[0];
        }
        var11.w.b(var11.w.c());
        0;
        int[] nArray = new int[lIlIlllIIllII[4]];
        nArray[n.lIlIlllIIllII[0]] = lIlIlllIIllII[5];
        nArray[n.lIlIlllIIllII[2]] = lIlIlllIIllII[6];
        nArray[n.lIlIlllIIllII[7]] = lIlIlllIIllII[8];
        nArray[n.lIlIlllIIllII[9]] = lIlIlllIIllII[10];
        if (n.llIIIIlIIIlllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            SpellBook.Ancient ancient;
            if (n.llIIIIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIlllIIllII[3])) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;
                0;
                if (1 <= 0) {
                    return ((30 + 102 - 96 + 128 ^ 155 + 56 - 140 + 105) & (0xB ^ 0x22 ^ (0x23 ^ 0x1E) ^ -1)) != 0;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            var2 = ancient;
            Magic.cast((Spell)var2, (NPC)var12);
            return lIlIlllIIllII[2];
        }
        nPC.interact(lIlIlllIIlIll[lIlIlllIIllII[2]]);
        return lIlIlllIIllII[2];
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        if (n.llIIIIlIIIllIlI(npcChanged.getNpc().getId(), lIlIlllIIllII[1])) {
            this.U = lIlIlllIIllII[0];
            this.T = lIlIlllIIllII[4];
        }
    }

    private static boolean llIIIIlIIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlIIIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlIIIllIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIlIIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlIIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIIllllI(Object object) {
        return object != null;
    }

    @Override
    public void e() {
        this.U = lIlIlllIIllII[0];
        this.T = lIlIlllIIllII[0];
    }

    static {
        n.llIIIIlIIIllIII();
        n.llIIIIlIIIlIlll();
    }
}

