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

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x4C ^ 0x36 ^ (0x65 ^ 0x1B)) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        n var13;
        void var14;
        SpellBook.Ancient var15;
        NPC nPC = this.W.j();
        if ((this.U == 0) && (nPC.getId() == 1)) {
            SpellBook.Ancient ancient;
            if (this.T -= 2 > 0) {
                return 2;
            }
            if ((Skills.getBoostedLevel((SkiSkill.MAGIC) >= 3)) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;
                0;
                if ((0x37 ^ 0x5D ^ (0x42 ^ 0x2C)) < 0) {
                    return ((61 + 34 - 8 + 56 ^ 31 + 124 - 97 + 77) & (6 + 23 - -90 + 24 ^ 103 + 66 - 157 + 123 ^ -1)) != 0;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            if (((var15 = ancient != 0).canCast() ? 1 : 0)) {
                Log.info((String)var2[0]);
                Magic.cast((Spevar15, (NPC)var14);
                var13.U = 2;
                return 2;
            }
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 0;
        }
        var13.w.b(var13.w.c());
        0;
        int[] nArray = new int[4];
        nArray[0] = 5;
        nArray[2] = 6;
        nArray[7] = 8;
        nArray[9] = var1[10];
        if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
            SpellBook.Ancient ancient;
            if ((Skills.getBoostedLevel((SkiSkill.MAGIC) >= 3)) {
                ancient = SpellBook.Ancient.ICE_BARRAGE;
                0;
                if (1 <= 0) {
                    return ((30 + 102 - 96 + 128 ^ 155 + 56 - 140 + 105) & (0xB ^ 0x22 ^ (0x23 ^ 0x1E) ^ -1)) != 0;
                }
            } else {
                ancient = SpellBook.Ancient.ICE_BLITZ;
            }
            var15 = ancient;
            Magic.cast((Spevar15, (NPC)var14);
            return 2;
        }
        nPC.interact(var2[2]);
        return 2;
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        if ((npcChanged.getNpc().getId() == 1)) {
            this.U = 0;
            this.T = 4;
        }
    }

    @Override
    public void e() {
        this.U = 0;
        this.T = 0;
    }

}

