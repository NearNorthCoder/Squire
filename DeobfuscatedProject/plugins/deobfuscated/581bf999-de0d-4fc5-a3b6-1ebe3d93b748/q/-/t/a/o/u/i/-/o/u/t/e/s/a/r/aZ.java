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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@Singleton
@TaskDesc(name="Attacking kephri", priority=10, register=true)
public class aZ
extends bh {
    private static /* synthetic */ String[] lIllIlIIlll;
    private /* synthetic */ boolean eB;
    private /* synthetic */ int ec;
    private static /* synthetic */ int[] lIllIlIlIIl;

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllllIlIlIIIlllIlIIll;
        if (aZ.lIIlIlllIIlIII(chatMessage.getMessage().contains(lIllIlIIlll[lIllIlIlIIl[0]]) ? 1 : 0) && aZ.lIIlIlllIIlIIl(this.cu.getTickCount() - this.ec, lIllIlIlIIl[1])) {
            this.eB = lIllIlIlIIl[2];
        }
        if (aZ.lIIlIlllIIlIII(llllllllllllllllIlIlIIIlllIlIIll.getMessage().contains(lIllIlIIlll[lIllIlIlIIl[2]]) ? 1 : 0)) {
            llllllllllllllllIlIlIIIlllIlIlII.eB = lIllIlIlIIl[0];
        }
    }

    static {
        aZ.lIIlIlllIIIlll();
        aZ.lIIlIlllIIIIlI();
    }

    private static String lIIlIlllIIIIII(String llllllllllllllllIlIlIIIllIlllllI, String llllllllllllllllIlIlIIIllIllllIl) {
        llllllllllllllllIlIlIIIllIlllllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIIllIllllII = new StringBuilder();
        char[] llllllllllllllllIlIlIIIllIlllIll = llllllllllllllllIlIlIIIllIllllIl.toCharArray();
        int llllllllllllllllIlIlIIIllIlllIlI = lIllIlIlIIl[0];
        char[] llllllllllllllllIlIlIIIllIllIlII = llllllllllllllllIlIlIIIllIlllllI.toCharArray();
        int llllllllllllllllIlIlIIIllIllIIll = llllllllllllllllIlIlIIIllIllIlII.length;
        int llllllllllllllllIlIlIIIllIllIIlI = lIllIlIlIIl[0];
        while (aZ.lIIlIlllIIlIIl(llllllllllllllllIlIlIIIllIllIIlI, llllllllllllllllIlIlIIIllIllIIll)) {
            char llllllllllllllllIlIlIIIllIllllll = llllllllllllllllIlIlIIIllIllIlII[llllllllllllllllIlIlIIIllIllIIlI];
            llllllllllllllllIlIlIIIllIllllII.append((char)(llllllllllllllllIlIlIIIllIllllll ^ llllllllllllllllIlIlIIIllIlllIll[llllllllllllllllIlIlIIIllIlllIlI % llllllllllllllllIlIlIIIllIlllIll.length]));
            0;
            ++llllllllllllllllIlIlIIIllIlllIlI;
            ++llllllllllllllllIlIlIIIllIllIIlI;
            0;
            if ((0x86 ^ 0x9E ^ (0x9F ^ 0x83)) != 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIIIllIllllII);
    }

    private static String lIIlIlllIIIIIl(String llllllllllllllllIlIlIIIllIlIlIIl, String llllllllllllllllIlIlIIIllIlIIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIllIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIllIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIllIlIlIll.init(lIllIlIlIIl[3], llllllllllllllllIlIlIIIllIlIllII);
            return new String(llllllllllllllllIlIlIIIllIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIllIlIlIlI) {
            llllllllllllllllIlIlIIIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aZ(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
    }

    private static void lIIlIlllIIIlll() {
        lIllIlIlIIl = new int[7];
        aZ.lIllIlIlIIl[0] = (0x55 ^ 0x5E) & ~(0x87 ^ 0x8C);
        aZ.lIllIlIlIIl[1] = 0x6B ^ 0x6E;
        aZ.lIllIlIlIIl[2] = 1;
        aZ.lIllIlIlIIl[3] = 2;
        aZ.lIllIlIlIIl[4] = 3;
        aZ.lIllIlIlIIl[5] = 0xFA ^ 0xA7 ^ (0x56 ^ 0xF);
        aZ.lIllIlIlIIl[6] = 9 ^ 0x2F ^ (0x57 ^ 0x79);
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
            aZ llllllllllllllllIlIlIIIlllIlIIIl;
            if (aZ.lIIlIlllIIlIII(this.cW.butterfly() ? 1 : 0)) {
                return this.cW.mageGearAkkha();
            }
            return llllllllllllllllIlIlIIIlllIlIIIl.cW.rangeGearAkkha();
        }
        return super.br();
    }

    @Override
    public boolean bq() {
        return this.eB;
    }

    private static String lIIlIllIllllll(String llllllllllllllllIlIlIIIllIIlllII, String llllllllllllllllIlIlIIIllIIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIllIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIl[6]), "DES");
            Cipher llllllllllllllllIlIlIIIllIIllllI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIllIIllllI.init(lIllIlIlIIl[3], llllllllllllllllIlIlIIIllIIlllll);
            return new String(llllllllllllllllIlIlIIIllIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIllIIlllIl) {
            llllllllllllllllIlIlIIIllIIlllIl.printStackTrace();
            return null;
        }
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
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[0]] = aZ." reach";
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[2]] = aZ."failed to complete";
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[3]] = aZ."Swarm";
        aZ.lIllIlIIlll[aZ.lIllIlIlIIl[4]] = aZ."Attack";
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
        void llllllllllllllllIlIlIIIlllIIlIll;
        aZ llllllllllllllllIlIlIIIlllIIllII;
        Player player = Players.getLocal();
        Actor actor = player.getInteracting();
        if (aZ.lIIlIlllIIlIlI(actor) && aZ.lIIlIlllIIlIll(actor.getName().contains(lIllIlIIlll[lIllIlIlIIl[3]]) ? 1 : 0)) {
            return lIllIlIlIIl[0];
        }
        NPC llllllllllllllllIlIlIIIlllIIlIIl = llllllllllllllllIlIlIIIlllIIllII.bO();
        if (aZ.lIIlIlllIIllII(llllllllllllllllIlIlIIIlllIIlIIl)) {
            llllllllllllllllIlIlIIIlllIIllII.eB = lIllIlIlIIl[0];
            return lIllIlIlIIl[0];
        }
        if (!aZ.lIIlIlllIIlIll(llllllllllllllllIlIlIIIlllIIllII.bR() ? 1 : 0) || aZ.lIIlIlllIIlIII(aZ.bV() ? 1 : 0)) {
            return lIllIlIlIIl[0];
        }
        if (aZ.lIIlIlllIIlIII(llllllllllllllllIlIlIIIlllIIlIIl.getWorldArea().isInMeleeDistance(llllllllllllllllIlIlIIIlllIIlIll.getWorldLocation()) ? 1 : 0)) {
            llllllllllllllllIlIlIIIlllIIllII.eB = lIllIlIlIIl[0];
        }
        this.a((NPC)var3_3, lIllIlIlIIl[2]);
        0;
        var3_3.interact(lIllIlIIlll[lIllIlIlIIl[4]]);
        this.aY.c();
        this.ec = this.cu.getTickCount();
        return lIllIlIlIIl[2];
    }
}

