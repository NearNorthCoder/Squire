/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Attacking Baboons -> AttackingbaboonsTask */
@TaskDesc(name="Attacking Baboons", priority=10, blocking=true, register=true)
public class aM
extends aI {
    private static /* synthetic */ String[] llIIlIllIlI;
    private static /* synthetic */ int[] llIIlIllIll;

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (aM.lIlIIIIllIIIll(chatMessage.getMessage().contains(llIIlIllIlI[llIIlIllIll[2]]) ? 1 : 0)) {
            this.sleep(llIIlIllIll[3]);
        }
    }

    private static String lIlIIIIlIllllI(String var16, String var17) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIlIllIll[4], var18);
            return new String(var10.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        aM.lIlIIIIllIIIlI();
        aM.lIlIIIIllIIIIl();
    }

    private static boolean lIlIIIIllIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBaboonAttackStyle();
    }

    private static boolean lIlIIIIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIIIllIIIII(String var15, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIIlIllIll[1]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(llIIlIllIll[4], var9);
            return new String(var13.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIlIlllll(String var2, String var19) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var1 = var19.toCharArray();
        int var5 = llIIlIllIll[0];
        char[] var7 = var2.toCharArray();
        int var6 = var7.length;
        int var20 = llIIlIllIll[0];
        while (aM.lIlIIIIllIlIII(var20, var6)) {
            char var12 = var7[var20];
            var21.append((char)(var12 ^ var1[var5 % var1.length]));
            0;
            ++var5;
            ++var20;
            0;
            if (2 >= ((0x79 ^ 0x43) & ~(0x6B ^ 0x51))) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        if (aM.lIlIIIIllIIIll(this.cW.redX() ? 1 : 0)) {
            return llIIlIllIll[0];
        }
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (aM.lIlIIIIllIIIll(nPC.getName().equals(llIIlIllIlI[llIIlIllIll[5]]) ? 1 : 0) && aM.lIlIIIIllIIlll(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIllIll[2];
                0;
                if (((139 + 157 - 69 + 28 ^ 77 + 30 - 10 + 78) & (98 + 80 - -35 + 10 ^ 6 + 139 - 61 + 59 ^ -1)) == 1) {
                    return ((0xEC ^ 0xA9 ^ (0xD4 ^ 0x88)) & (0xE5 ^ 0x9B ^ (0x71 ^ 0x16) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIllIll[0];
            }
            return n2 != 0;
        });
        if (aM.lIlIIIIllIIlII(var4)) {
            return llIIlIllIll[0];
        }
        NPC var14 = NPCs.getNearest(nPC -> nPC.getName().contains(llIIlIllIlI[llIIlIllIll[4]]));
        if (aM.lIlIIIIllIIlIl(var14) && aM.lIlIIIIllIIllI(var4.distanceTo((Locatable)var14), llIIlIllIll[1])) {
            return llIIlIllIll[0];
        }
        this.bp();
        var1_1.interact(llIIlIllIlI[llIIlIllIll[0]]);
        return llIIlIllIll[2];
    }

    @Inject
    protected aM(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIIIIllIIIlI() {
        llIIlIllIll = new int[7];
        aM.llIIlIllIll[0] = (0x12 ^ 0x28) & ~(0x3C ^ 6);
        aM.llIIlIllIll[1] = 0xBF ^ 0xB7;
        aM.llIIlIllIll[2] = 1;
        aM.llIIlIllIll[3] = 0x60 ^ 0x65;
        aM.llIIlIllIll[4] = 2;
        aM.llIIlIllIll[5] = 3;
        aM.llIIlIllIll[6] = 124 + 98 - 144 + 70 ^ 31 + 3 - 27 + 137;
    }

    private static void lIlIIIIllIIIIl() {
        llIIlIllIlI = new String[llIIlIllIll[6]];
        aM.llIIlIllIlI[aM.llIIlIllIll[0]] = aM."Attack";
        aM.llIIlIllIlI[aM.llIIlIllIll[2]] = aM."Ba-Ba throws a large boulder at you";
        aM.llIIlIllIlI[aM.llIIlIllIll[4]] = aM."Rubble";
        aM.llIIlIllIlI[aM.llIIlIllIll[5]] = aM."Baboon";
    }
}

