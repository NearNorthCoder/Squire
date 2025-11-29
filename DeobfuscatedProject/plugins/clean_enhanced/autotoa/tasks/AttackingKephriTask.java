/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum16;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Attacking kephri", priority=10, register=true)
public class AttackingKephriTask
extends AutotoaManager {
    
    private  boolean eB;
    private  int ec;

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if (aZ.var4(chatMessage.getMessage().contains(var1[var2[0]]) ? 1 : 0) && aZ.var5(this.cu.getTickCount() - this.ec, var2[1])) {
            this.eB = var2[2];
        }
        if (aZ.var4(var3.getMessage().contains(var1[var2[2]]) ? 1 : 0)) {
            var6.eB = var2[0];
        }
    }

    static {
        aZ.var7();
        aZ.var8();
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[0];
        while (aZ.var5(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((0x86 ^ 0x9E ^ (0x9F ^ 0x83)) != 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    protected AttackingKephriTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
    }

    private static void var7() {
        var2 = new int[7];
        aZ.var2[0] = (0x55 ^ 0x5E) & ~(0x87 ^ 0x8C);
        aZ.var2[1] = 0x6B ^ 0x6E;
        aZ.var2[2] = 1;
        aZ.var2[3] = 2;
        aZ.var2[4] = 3;
        aZ.var2[5] = 0xFA ^ 0xA7 ^ (0x56 ^ 0xF);
        aZ.var2[6] = 9 ^ 0x2F ^ (0x57 ^ 0x79);
    }

    private static boolean var25(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.ec = var2[0];
        this.eB = var2[0];
        aZ.f(var2[0]);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        if (aZ.var4(this.eB)) {
            aZ var26;
            if (aZ.var4(this.cW.butterfly() ? 1 : 0)) {
                return this.cW.mageGearAkkha();
            }
            return var26.cW.rangeGearAkkha();
        }
        return super.br();
    }

    @Override
    public boolean bq() {
        return this.eB;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var33(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.kephriSpecialGear();
    }

    private static void var8() {
        var1 = new String[var2[5]];
        aZ.var1[aZ.var2[0]] = " reach";
        aZ.var1[aZ.var2[2]] = "failed to complete";
        aZ.var1[aZ.var2[3]] = "Swarm";
        aZ.var1[aZ.var2[4]] = "Attack";
    }

    private static boolean var34(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var3_3;
        void var35;
        aZ var36;
        Player player = Players.getLocal();
        Actor actor = player.getInteracting();
        if (aZ.var25(actor) && aZ.var34(actor.getName().contains(var1[var2[3]]) ? 1 : 0)) {
            return var2[0];
        }
        NPC var37 = var36.bO();
        if (aZ.var33(var37)) {
            var36.eB = var2[0];
            return var2[0];
        }
        if (!aZ.var34(var36.bR() ? 1 : 0) || aZ.var4(aZ.bV() ? 1 : 0)) {
            return var2[0];
        }
        if (aZ.var4(var37.getWorldArea().isInMeleeDistance(var35.getWorldLocation()) ? 1 : 0)) {
            var36.eB = var2[0];
        }
        this.a((NPC)var3_3, var2[2]);
        0;
        var3_3.interact(var1[var2[4]]);
        this.aY.c();
        this.ec = this.cu.getTickCount();
        return var2[2];
    }
}

