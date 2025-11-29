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
import java.util.Iterator;
import java.util.List;
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
    private static  String[] llIIIIlIl;
    private static  int[] llIIIIllI;
    private final  List<Integer> eW;
    private final  List<Spell> eV;
    private final  StunAlchTeleport eS;

    private static boolean var1(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var2(Object object) {
        return object == null;
    }

    @Inject
    public StunningTask(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.eV = List.of(SpellBook.Standard.STUN, SpellBook.Standard.ENFEEBLE, SpellBook.Standard.VULNERABILITY, SpellBook.Standard.CURSE, SpellBook.Standard.WEAKEN, SpellBook.Standard.CONFUSE);
        this.eW = List.of(Integer.valueOf(llIIIIllI[0]), Integer.valueOf(llIIIIllI[1]), Integer.valueOf(llIIIIllI[2]), Integer.valueOf(llIIIIllI[3]), Integer.valueOf(llIIIIllI[4]), Integer.valueOf(llIIIIllI[5]));
        this.eS = stunAlchTeleport;
        this.eU = squireAlchTeleportConfig;
    }

    private static void var3() {
        llIIIIlIl = new String[llIIIIllI[9]];
        aT.llIIIIlIl[aT.llIIIIllI[6]] = "Guard";
        aT.llIIIIlIl[aT.llIIIIllI[8]] = "Guard";
    }

    private static  boolean a(Player player, NPC nPC) {
        int n2;
        if (aT.var4(nPC.getName().equals(llIIIIlIl[llIIIIllI[8]]) ? 1 : 0) && aT.var1(nPC.getInteracting(), player)) {
            n2 = llIIIIllI[8];
            0;
            if (-(0x2A ^ 0x2E) > 0) {
                return ((0x9B ^ 0x95) & ~(0x67 ^ 0x69)) != 0;
            }
        } else {
            n2 = llIIIIllI[6];
        }
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        aT var7;
        void var8;
        Player player = Players.getLocal();
        if (aT.var4(this.eU.stunAlchOnly() ? 1 : 0)) {
            return llIIIIllI[6];
        }
        if (aT.var5(var8.getAnimation(), llIIIIllI[7])) {
            return llIIIIllI[6];
        }
        if (aT.var4(var7.eS.cl() ? 1 : 0)) {
            return llIIIIllI[6];
        }
        NPC var9 = NPCs.getNearest(arg_0 -> aT.a((Player)var8, arg_0));
        if (aT.var2(var9) && aT.var2(var9 = NPCs.getNearest(nPC -> {
            int n2;
            if (aT.var4(nPC.getName().equals(llIIIIlIl[llIIIIllI[6]]) ? 1 : 0) && aT.var2(nPC.getInteracting())) {
                n2 = llIIIIllI[8];
                0;
                if (1 == 3) {
                    return ((47 + 62 - 105 + 154 ^ 167 + 46 - 204 + 164) & (55 + 6 - -37 + 51 ^ 39 + 24 - -53 + 50 ^ -1)) != 0;
                }
            } else {
                n2 = llIIIIllI[6];
            }
            return n2 != 0;
        }))) {
            return llIIIIllI[6];
        }
        Spell var10 = null;
        Iterator<Spell> var11 = var7.eV.iterator();
        while (aT.var4(var11.hasNext() ? 1 : 0)) {
            Spell var12 = var11.next();
            if (aT.var4(var12.canCast() ? 1 : 0)) {
                var10 = var12;
                0;
                if (-1 < (0x46 ^ 0x42)) break;
                return ((0x6C ^ 0x7E) & ~(0x4E ^ 0x5C)) != 0;
            }
            0;
            
            return ((0xA8 ^ 0x80) & ~(0xAB ^ 0x83)) != 0;
        }
        if (aT.var2(var10)) {
            return llIIIIllI[6];
        }
        var3_3.castOn((Interactable)var2_2);
        this.sleep(llIIIIllI[8]);
        return llIIIIllI[8];
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(StatChanged statChanged) {
        void var20;
        aT var21;
        if (aT.var6(statChanged.getSkill(), Skill.MAGIC)) {
            return;
        }
        int var22 = var21.eS.cm();
        int var23 = var20.getXp();
        var21.eS.z(var23);
        int var24 = var23 - var22;
        if (aT.var19(var24)) {
            return;
        }
        if (aT.var4(var21.eW.contains(var24) ? 1 : 0)) {
            var21.eS.d(llIIIIllI[8]);
        }
    }

    static {
        aT.var25();
        aT.var3();
        eT = llIIIIllI[7];
    }

    private static void var25() {
        llIIIIllI = new int[11];
        aT.llIIIIllI[0] = 62 + 206 - 159 + 129 ^ 106 + 37 - 138 + 175;
        aT.llIIIIllI[1] = 2 ^ 0x51;
        aT.llIIIIllI[2] = 0xA6 ^ 0xA2 ^ (0x38 ^ 0x70);
        aT.llIIIIllI[3] = 0xB8 ^ 0xA5;
        aT.llIIIIllI[4] = 0x15 ^ 0;
        aT.llIIIIllI[5] = 1 ^ 0xC;
        aT.llIIIIllI[6] = (87 + 136 - 20 + 3 ^ 18 + 90 - 44 + 76) & (103 + 75 - 68 + 89 ^ 126 + 98 - 137 + 46 ^ -1);
        aT.llIIIIllI[7] = -(0xFFFFFF25 & 0x7DDB) & (0xFFFFFFDF & 0x7FEA);
        aT.llIIIIllI[8] = 1;
        aT.llIIIIllI[9] = 2;
        aT.llIIIIllI[10] = 2 ^ (0x32 ^ 0x38);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

