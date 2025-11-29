/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Summon Thrall", priority=150, register=true)
public class SummonThrallTask
extends NightmareTaskBase {
    
     boolean dC;
     boolean dD;

    private static boolean lIIlIIIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIIIllIIll(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected SummonThrallTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
        this.dC = llllIlIIIIll[0];
        this.dD = llllIlIIIIll[0];
    }

    private static boolean lIIlIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    static {
        aa.lIIlIIIIIlIllIl();
        aa.lIIlIIIIIlIllII();
    }

    private static boolean lIIlIIIIIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        void var1;
        if (aa.lIIlIIIIIllIIIl(varbitChanged.getVarbitId(), llllIlIIIIll[6]) && aa.lIIlIIIIIllIIll(varbitChanged.getValue(), llllIlIIIIll[0])) {
            this.dC = llllIlIIIIll[0];
        }
        if (aa.lIIlIIIIIllIIIl(var1.getVarbitId(), llllIlIIIIll[7]) && aa.lIIlIIIIIllIIll(var1.getValue(), llllIlIIIIll[0])) {
            var2.dD = llllIlIIIIll[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        aa var3;
        void var4;
        NPC nPC = SquireNightmarePlugin.d();
        if (aa.lIIlIIIIIlIlllI(nPC)) {
            return llllIlIIIIll[1];
        }
        String[] stringArray = new String[llllIlIIIIll[0]];
        stringArray[aa.llllIlIIIIll[1]] = llllIlIIIIlI[llllIlIIIIll[1]];
        if (aa.lIIlIIIIIlIllll(var4.hasAction(stringArray) ? 1 : 0)) {
            var3.dC = llllIlIIIIll[0];
            var3.dD = llllIlIIIIll[0];
        }
        String[] stringArray2 = new String[llllIlIIIIll[0]];
        stringArray2[aa.llllIlIIIIll[1]] = llllIlIIIIlI[llllIlIIIIll[0]];
        if (aa.lIIlIIIIIllIIII(var4.hasAction(stringArray2) ? 1 : 0)) {
            return llllIlIIIIll[1];
        }
        SpellBook.Necromancy var5 = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (aa.lIIlIIIIIlIllll(var3.cp() ? 1 : 0) && aa.lIIlIIIIIlIllll(var3.dC ? 1 : 0)) {
            Magic.cast((Spell)var5, (int)llllIlIIIIll[1], (int)llllIlIIIIll[2]);
            var3.dC = llllIlIIIIll[1];
            var3.sleep(llllIlIIIIll[3]);
            return llllIlIIIIll[0];
        }
        if (aa.lIIlIIIIIllIIII(var3.cQ ? 1 : 0) && aa.lIIlIIIIIllIIII(var3.cR ? 1 : 0)) {
            return llllIlIIIIll[1];
        }
        if (aa.lIIlIIIIIllIIIl(Combat.getSpecEnergy(), llllIlIIIIll[4])) {
            return llllIlIIIIll[1];
        }
        SpellBook.Necromancy var6 = SpellBook.Necromancy.DEATH_CHARGE;
        if (aa.lIIlIIIIIlIllll(var6.canCast() ? 1 : 0) && aa.lIIlIIIIIlIllll(var3.dD ? 1 : 0)) {
            Magic.cast((Spell)var6, (int)llllIlIIIIll[1], (int)llllIlIIIIll[2]);
            var3.dD = llllIlIIIIll[1];
            return llllIlIIIIll[0];
        }
        return llllIlIIIIll[1];
    }

    private boolean cp() {
        int n2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (aa.lIIlIIIIIlIllll(necromancy.canCast() ? 1 : 0) && aa.lIIlIIIIIllIIlI(Skills.getBoostedLevel((Skill)Skill.PRAYER), llllIlIIIIll[5])) {
            n2 = llllIlIIIIll[0];

            if (1 >= (0x3B ^ 0x3F)) {
                return false;
            }
        } else {
            n2 = llllIlIIIIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlIIIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIIlIllII() {
        llllIlIIIIlI = new String[llllIlIIIIll[3]];
        aa.llllIlIIIIlI[aa.llllIlIIIIll[1]] = "Disturb";
        aa.llllIlIIIIlI[aa.llllIlIIIIll[0]] = "Attack";
    }
}

