/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Drinking boost", priority=11)
public class DrinkingBoostTask
extends NightmareTaskBase {

    @Inject
    protected DrinkingBoostTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static boolean lIIlIIIIllIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIIllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIllIIlll(int n2) {
        return n2 != 0;
    }

    public int a(Skill skill) {
        return llllIlIlIIII[4] + Skills.getLevel((Skill)skill) * llllIlIlIIII[5] / llllIlIlIIII[6];
    }

    private static boolean lIIlIIIIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIIlIlIlIl() {
        llllIlIIllII = new String[llllIlIlIIII[9]];
        ap.llllIlIIllII[ap.llllIlIlIIII[0]] = "Attack";
        ap.llllIlIIllII[ap.llllIlIlIIII[1]] = "Drink";
        ap.llllIlIIllII[ap.llllIlIlIIII[3]] = "Drink";
        ap.llllIlIIllII[ap.llllIlIlIIII[2]] = "super attack";
        ap.llllIlIIllII[ap.llllIlIlIIII[7]] = "super attack";
        ap.llllIlIIllII[ap.llllIlIlIIII[4]] = "combat pot";
        ap.llllIlIIllII[ap.llllIlIlIIII[8]] = "super strength";
    }

    @Override
    public boolean bY() {
        ap var2;
        if (ap.lIIlIIIIllIIllI(this.cL.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        if (ap.lIIlIIIIllIIlll(var2.cM.aq() ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        if (ap.lIIlIIIIllIIllI(var2.bZ() ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        NPC var3 = SquireNightmarePlugin.d();
        if (ap.lIIlIIIIllIlIII(var3)) {
            return llllIlIlIIII[0];
        }
        String[] stringArray = new String[llllIlIlIIII[1]];
        stringArray[ap.llllIlIlIIII[0]] = llllIlIIllII[llllIlIlIIII[0]];
        if (ap.lIIlIIIIllIIllI(var3.hasAction(stringArray) ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            boolean bl;
            if (!ap.lIIlIIIIllIIllI(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[4]]) ? 1 : 0) || ap.lIIlIIIIllIIlll(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[8]]) ? 1 : 0)) {
                bl = llllIlIlIIII[1];

                if ((49 + 4 - 34 + 132 ^ 94 + 50 - 99 + 101) <= 0) {
                    return ((0xD3 ^ 0x9A ^ (0x6A ^ 0x73)) & (0xE4 ^ 0x83 ^ (0xB0 ^ 0x87) ^ -1)) != 0;
                }
            } else {
                bl = llllIlIlIIII[0];
            }
            return bl;
        });
        if (ap.lIIlIIIIllIlIII(var4)) {
            return llllIlIlIIII[0];
        }
        int var5 = (int)(0.5 * (double)var2.a(Skill.STRENGTH));
        if (ap.lIIlIIIIllIlIIl(Skills.getLevel((Skill)Skill.STRENGTH) + var5, Skills.getBoostedLevel((Skill)Skill.STRENGTH))) {
            var4.interact(llllIlIIllII[llllIlIlIIII[1]]);
            var2.sleep(llllIlIlIIII[2]);
            return llllIlIlIIII[1];
        }
        int var6 = (int)(0.5 * (double)var2.a(Skill.ATTACK));
        if (ap.lIIlIIIIllIIlll(Inventory.contains(item -> {
            int n3;
            if (ap.lIIlIIIIllIIlll(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[7]]) ? 1 : 0) && ap.lIIlIIIIllIlIIl(Skills.getLevel((Skill)Skill.ATTACK) + var6, Skills.getBoostedLevel((Skill)Skill.ATTACK))) {
                n3 = llllIlIlIIII[1];

            } else {
                n3 = llllIlIlIIII[0];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            Item var7 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[2]]));
            var7.interact(llllIlIIllII[llllIlIlIIII[3]]);
            var2.sleep(llllIlIlIIII[2]);
            return llllIlIlIIII[1];
        }
        return llllIlIlIIII[0];
    }

    static {
        ap.lIIlIIIIllIIlIl();
        ap.lIIlIIIIlIlIlIl();
    }

    private static boolean lIIlIIIIllIlIII(Object object) {
        return object == null;
    }
}

