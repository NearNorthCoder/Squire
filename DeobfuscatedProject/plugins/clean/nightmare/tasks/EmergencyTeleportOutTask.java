/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Emergency Teleport out", priority=0x7FFFFFFF)
public class EmergencyTeleportOutTask
extends Task {
    private static final  Logger da;
    
    private final  h de;
    private static final  int db;
    
    private final  SquireNightmareConfig dd;
    private final  SquireNightmarePlugin dc;

    private static void lIIlIIIllIlIIlI() {
        llllIllIlIll = new String[llllIllIllII[13]];
        G.llllIllIlIll[G.llllIllIllII[0]] = "Disturb";
        G.llllIllIlIll[G.llllIllIllII[2]] = "[EmergencyTeleport]: Teleporting out because we're below {} hp and there's a DANGEROUS SLEEPWALKER ascending.";
        G.llllIllIlIll[G.llllIllIllII[6]] = "[EmergencyTeleport]: We're out of food and we're not even in the final phase, teleporting out.";
        G.llllIllIlIll[G.llllIllIllII[1]] = "NO PRAYER; emergency teleporting out to bank";
        G.llllIllIlIll[G.llllIllIllII[7]] = "prayer";
        G.llllIllIlIll[G.llllIllIllII[8]] = "restore";
        G.llllIllIlIll[G.llllIllIllII[9]] = "sanfew";
        G.llllIllIlIll[G.llllIllIllII[10]] = "Sleepwalker";
        G.llllIllIlIll[G.llllIllIllII[12]] = "Eat";
    }

    private static boolean lIIlIIIllIllIlI(int n2) {
        return n2 <= 0;
    }

    private static boolean lIIlIIIllIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIllIlIlIl(int n2) {
        return n2 == 0;
    }

    static {
        G.lIIlIIIllIlIIll();
        G.lIIlIIIllIlIIlI();
        db = llllIllIllII[3];
        da = LoggerFactory.getLogger(EmergencyTeleportOutTask.class);
    }

    public boolean run() {
        G var2;
        if (G.lIIlIIIllIlIlII(this.dd.assistantMode() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIllI(Players.getLocal().getWorldLocation().getPlane(), llllIllIllII[1])) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIlII(var2.dc.s() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        NPC var3 = SquireNightmarePlugin.d();
        if (G.lIIlIIIllIlIlll(var3)) {
            return llllIllIllII[0];
        }
        String[] stringArray = new String[llllIllIllII[2]];
        stringArray[G.llllIllIllII[0]] = llllIllIlIll[llllIllIllII[0]];
        if (G.lIIlIIIllIlIlII(var3.hasAction(stringArray) ? 1 : 0)) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIllIII(var3.getAnimation(), llllIllIllII[3])) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIllIII(var3.getAnimation(), llllIllIllII[4])) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIlII(var3.isDead() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        int var4 = Inventory.getCount((boolean)llllIllIllII[2], item -> {
            String[] stringArray = new String[llllIllIllII[2]];
            stringArray[G.llllIllIllII[0]] = llllIllIlIll[llllIllIllII[12]];
            return item.hasAction(stringArray);
        });
        if (G.lIIlIIIllIllIIl(Combat.getCurrentHealth(), var2.dd.hpToTeleportOut()) && G.lIIlIIIllIllIlI(var4)) {
            if (G.lIIlIIIllIllIII(var3.getId(), llllIllIllII[5])) {
                NPC var5 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (G.lIIlIIIllIlIlII(nPC.getName().equals(llllIllIlIll[llllIllIllII[10]]) ? 1 : 0) && G.lIIlIIIllIllIII(nPC.getAnimation(), llllIllIllII[11])) {
                        n2 = llllIllIllII[2];

                        if (((0xAD ^ 0xA4 ^ (0x8D ^ 0x9B)) & (0x24 ^ 0x1F ^ (3 ^ 0x27) ^ -1)) == -1) {
                            return false;
                        }
                    } else {
                        n2 = llllIllIllII[0];
                    }
                    return n2 != 0;
                });
                if (G.lIIlIIIllIllIll(var5)) {
                    Log.warn((String)llllIllIlIll[llllIllIllII[2]]);
                    return var2.dc.m();
                }
                return llllIllIllII[0];
            }
            Log.warn((String)llllIllIlIll[llllIllIllII[6]]);
            return var2.dc.m();
        }
        Item var5 = Inventory.getFirst(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!G.lIIlIIIllIlIlIl(string.contains(llllIllIlIll[llllIllIllII[7]]) ? 1 : 0) || !G.lIIlIIIllIlIlIl(string.contains(llllIllIlIll[llllIllIllII[8]]) ? 1 : 0) || G.lIIlIIIllIlIlII(string.contains(llllIllIlIll[llllIllIllII[9]]) ? 1 : 0)) {
                n2 = llllIllIllII[2];

                if ((2 & ~2) != 0) {
                    return false;
                }
            } else {
                n2 = llllIllIllII[0];
            }
            return n2 != 0;
        });
        if (G.lIIlIIIllIlIlll(var5) && G.lIIlIIIllIllIlI(Skills.getBoostedLevel((Skill)Skill.PRAYER)) && G.lIIlIIIllIlIllI(var3.getId(), llllIllIllII[5])) {
            Log.warn((String)llllIllIlIll[llllIllIllII[1]]);
            return var2.dc.m();
        }
        return llllIllIllII[0];
    }

    private static boolean lIIlIIIllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIllIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public EmergencyTeleportOutTask(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dc = squireNightmarePlugin;
        this.dd = squireNightmareConfig;
        this.de = h2;
    }

    private static boolean lIIlIIIllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIllIllIll(Object object) {
        return object != null;
    }
}

