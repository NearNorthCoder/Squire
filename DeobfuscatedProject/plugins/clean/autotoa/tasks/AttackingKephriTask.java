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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum118;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Attacking kephri", priority=10, register=true)
public class AttackingKephriTask
extends AutotoaTaskBase {
    
    private  boolean eB;
    private  int ec;

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (aZ.lIIlIlllIIlIII(chatMessage.getMessage().contains(lIllIlIIlll[lIllIlIlIIl[0]]) ? 1 : 0) && aZ.lIIlIlllIIlIIl(this.cu.getTickCount() - this.ec, lIllIlIlIIl[1])) {
            this.eB = lIllIlIlIIl[2];
        }
        if (aZ.lIIlIlllIIlIII(var1.getMessage().contains(lIllIlIIlll[lIllIlIlIIl[2]]) ? 1 : 0)) {
            var2.eB = lIllIlIlIIl[0];
        }
    }

    static {
        aZ.lIIlIlllIIIlll();
        aZ.lIIlIlllIIIIlI();
    }

        return String.valueOf(var3);
    }

    @Inject
    protected AttackingKephriTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
    }

    private static boolean lIIlIlllIIlIlI(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.ec = lIllIlIlIIl[0];
        this.eB = lIllIlIlIIl[0];
        aZ.f(lIllIlIlIIl[0]);
    }

    private static boolean lIIlIlllIIlIII(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        if (aZ.lIIlIlllIIlIII(this.eB ? 1 : 0)) {
            aZ var4;
            if (aZ.lIIlIlllIIlIII(this.cW.butterfly() ? 1 : 0)) {
                return this.cW.mageGearAkkha();
            }
            return var4.cW.rangeGearAkkha();
        }
        return super.br();
    }

    @Override
    public boolean bq() {
        return this.eB;
    }

    private static boolean lIIlIlllIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlllIIllII(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.kephriSpecialGear();
    }

    private static void lIIlIlllIIIIlI() {
        lIllIlIIlll = new String[lIllIlIlIIl[5]];
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[0]] = " reach";
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[2]] = "failed to complete";
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[3]] = "Swarm";
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[4]] = "Attack";
    }

    private static boolean lIIlIlllIIlIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var3_3;
        void var5;
        aZ var6;
        Player player = Players.getLocal();
        Actor actor = player.getInteracting();
        if (aZ.lIIlIlllIIlIlI(actor) && aZ.lIIlIlllIIlIll(actor.getName().contains(lIllIlIIlll[lIllIlIlIIl[3]]) ? 1 : 0)) {
            return lIllIlIlIIl[0];
        }
        NPC var7 = var6.bO();
        if (aZ.lIIlIlllIIllII(var7)) {
            var6.eB = lIllIlIlIIl[0];
            return lIllIlIlIIl[0];
        }
        if (!aZ.lIIlIlllIIlIll(var6.bR() ? 1 : 0) || aZ.lIIlIlllIIlIII(aZ.bV() ? 1 : 0)) {
            return lIllIlIlIIl[0];
        }
        if (aZ.lIIlIlllIIlIII(var7.getWorldArea().isInMeleeDistance(var5.getWorldLocation()) ? 1 : 0)) {
            var6.eB = lIllIlIlIIl[0];
        }
        this.a((NPC)var3_3, lIllIlIlIIl[2]);

        var3_3.interact(lIllIlIIlll[lIllIlIlIIl[4]]);
        this.aY.c();
        this.ec = this.cu.getTickCount();
        return lIllIlIlIIl[2];
    }
}

