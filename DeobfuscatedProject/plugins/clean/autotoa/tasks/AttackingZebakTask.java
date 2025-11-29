/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Gear
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum51;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Zebak", priority=10)
public class AttackingZebakTask
extends AutotoaTaskBase {
    private static final  Point gR;

    @Inject
    protected AttackingZebakTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIllIlIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var1;
        bN var2;
        NPC nPC = this.cB();
        if (bN.lIIllIlIIIlIIl(nPC)) {
            return lIllllIIIII[0];
        }
        Player var3 = Players.getLocal();
        int n2 = Gear.isEquipped((int[])Gear.matching(var2.cW.gearSwapZebak()));
        if (bN.lIIllIlIIIlIll(var3.getInteracting()) && bN.lIIllIlIIIllIl(n2)) {
            return lIllllIIIII[0];
        }
        int var4 = var3.distanceTo(var2.a(gR));
        int var5 = var2.a((NPC)var1, lIllllIIIII[1]) ? 1 : 0;
        if (bN.lIIllIlIIIllll(var5) && bN.lIIllIlIIlIIIl(var4, var2.bg()) && bN.lIIllIlIIlIIlI((Object)var2.cF(), (Object)bY.ATTACK)) {
            return lIllllIIIII[0];
        }
        nPC.interact(lIlllIllllI[lIllllIIIII[0]]);
        return lIllllIIIII[1];
    }

    private static void lIIllIlIIIIllI() {
        lIlllIllllI = new String[lIllllIIIII[1]];
        bN.lIlllIllllI[bN.lIllllIIIII[0]] = "Attack";
    }

    private static boolean lIIllIlIIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIllIlIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIlIIIlIIl(Object object) {
        return object == null;
    }

    static {
        bN.lIIllIlIIIIlll();
        bN.lIIllIlIIIIllI();
        gR = new Point(lIllllIIIII[2], lIllllIIIII[3]);
    }

}

