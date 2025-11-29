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
package gg.squire.whisperer.tasks;

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
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Attacking Whisperer", register=true)
public class AttackingWhispererTask
extends WhispererTaskBase {
    private  int T;

    private  boolean U;

    private static void llIIIIlIIIlIlll() {
        lIlIlllIIlIll = new String[lIlIlllIIllII[7]];
        n.lIlIlllIIlIll[n.lIlIlllIIllII[0]] = "Casting freeze on whisperer";
        n.lIlIlllIIlIll[n.lIlIlllIIllII[2]] = "Attack";
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        n var2;
        void var3;
        SpellBook.Ancient var4;
        NPC nPC = this.W.j();
        if (n.llIIIIlIIIllIIl(this.U ? 1 : 0) && n.llIIIIlIIIllIlI(nPC.getId(), lIlIlllIIllII[1])) {
            SpellBook.Ancient ancient;
            if (n.llIIIIlIIIllIll(this.T -= lIlIlllIIllII[2])) {
                return lIlIlllIIllII[2];
            }
            if (n.llIIIIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIlllIIllII[3])) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;

                if ((0x37 ^ 0x5D ^ (0x42 ^ 0x2C)) < 0) {
                    return false;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            if (n.llIIIIlIIIlllIl((var4 = ancient).canCast() ? 1 : 0)) {
                Log.info((String)lIlIlllIIlIll[lIlIlllIIllII[0]]);
                Magic.cast((Spell)var4, (NPC)var3);
                var2.U = lIlIlllIIllII[2];
                return lIlIlllIIllII[2];
            }
        }
        if (n.llIIIIlIIIllllI(Players.getLocal().getInteracting())) {
            return lIlIlllIIllII[0];
        }
        var2.w.b(var2.w.c());

        int[] nArray = new int[lIlIlllIIllII[4]];
        nArray[n.lIlIlllIIllII[0]] = lIlIlllIIllII[5];
        nArray[n.lIlIlllIIllII[2]] = lIlIlllIIllII[6];
        nArray[n.lIlIlllIIllII[7]] = lIlIlllIIllII[8];
        nArray[n.lIlIlllIIllII[9]] = lIlIlllIIllII[10];
        if (n.llIIIIlIIIlllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            SpellBook.Ancient ancient;
            if (n.llIIIIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIlllIIllII[3])) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;

                if (1 <= 0) {
                    return ((30 + 102 - 96 + 128 ^ 155 + 56 - 140 + 105) & (0xB ^ 0x22 ^ (0x23 ^ 0x1E) ^ -1)) != 0;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            var4 = ancient;
            Magic.cast((Spell)var4, (NPC)var3);
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

