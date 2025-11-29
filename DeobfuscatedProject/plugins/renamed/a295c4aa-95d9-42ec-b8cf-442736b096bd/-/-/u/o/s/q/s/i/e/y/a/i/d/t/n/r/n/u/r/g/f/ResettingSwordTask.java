/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Resetting Sword -> ResettingswordTask */
@TaskDesc(name="Resetting Sword", priority=2147483397, register=true, blocking=true)
public class ResettingSwordTask
extends Task {
    private final /* synthetic */ SquireGiantsFoundry ad;
    private final /* synthetic */ a ae;
    private static /* synthetic */ int[] llIlIlIlIIIl;
    private static /* synthetic */ String[] llIlIlIlIIII;

    private static void lIIIIIllIIIIIlI() {
        llIlIlIlIIIl = new int[8];
        o.llIlIlIlIIIl[0] = (0x67 ^ 0x60) & ~(0x50 ^ 0x57);
        o.llIlIlIlIIIl[1] = 1;
        o.llIlIlIlIIIl[2] = 0xFFFFEFD3 & 0x79AE;
        o.llIlIlIlIIIl[3] = 2;
        o.llIlIlIlIIIl[4] = 3;
        o.llIlIlIlIIIl[5] = 0x70 ^ 0x21 ^ (0xFF ^ 0xAA);
        o.llIlIlIlIIIl[6] = 0x67 ^ 0x29 ^ (0x5C ^ 0x17);
        o.llIlIlIlIIIl[7] = 0x95 ^ 0xB6 ^ (4 ^ 0x2F);
    }

    private static boolean lIIIIIllIIIIlIl(Object object) {
        return object == null;
    }

    @Inject
    public o(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.ad = squireGiantsFoundry;
        this.ae = a2;
    }

    private static String lIIIIIlIlllllll(String var19, String var8) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var5 = var8.toCharArray();
        int var16 = llIlIlIlIIIl[0];
        char[] var7 = var19.toCharArray();
        int var23 = var7.length;
        int var18 = llIlIlIlIIIl[0];
        while (o.lIIIIIllIIIIlll(var18, var23)) {
            char var10 = var7[var18];
            var20.append((char)(var10 ^ var5[var16 % var5.length]));
            0;
            ++var16;
            ++var18;
            0;
            if (2 <= (0x15 ^ 0x56 ^ (0x58 ^ 0x1F))) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean lIIIIIllIIIIlII(int n2) {
        return n2 != 0;
    }

    private static String lIIIIIlIllllllI(String var4, String var17) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llIlIlIlIIIl[7]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llIlIlIlIIIl[3], var14);
            return new String(var12.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIIIIllI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIIIIllIIIIIIl() {
        llIlIlIlIIII = new String[llIlIlIlIIIl[6]];
        o.llIlIlIlIIII[o.llIlIlIlIIIl[0]] = o."No preform, we have successfully reset.";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[1]] = o."Resetting the sword";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[3]] = o."Hand-in";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[4]] = o."too damaged to keep working";
        o.llIlIlIlIIII[o.llIlIlIlIIIl[5]] = o."Something went wrong with the sword, trying to reset.";
    }

    static {
        o.lIIIIIllIIIIIlI();
        o.lIIIIIllIIIIIIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var22;
        if (o.lIIIIIllIIIIIll(this.ad.c() ? 1 : 0)) {
            return llIlIlIlIIIl[0];
        }
        int[] nArray = new int[llIlIlIlIIIl[1]];
        nArray[o.llIlIlIlIIIl[0]] = llIlIlIlIIIl[2];
        if (o.lIIIIIllIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            Log.info((String)llIlIlIlIIII[llIlIlIlIIIl[0]]);
            var22.ad.a(llIlIlIlIIIl[0]);
            return llIlIlIlIIIl[1];
        }
        if (o.lIIIIIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIlIlIIIl[0];
        }
        if (o.lIIIIIllIIIIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIlIlIIIl[1];
        }
        Log.info((String)llIlIlIlIIII[llIlIlIlIIIl[1]]);
        NPC var1 = var22.ae.p();
        if (o.lIIIIIllIIIIlIl(var1)) {
            return llIlIlIlIIIl[0];
        }
        var1_1.interact(llIlIlIlIIII[llIlIlIlIIIl[3]]);
        return llIlIlIlIIIl[1];
    }

    private static boolean lIIIIIllIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var2;
        if (o.lIIIIIllIIIIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (o.lIIIIIllIIIIlII(var2.getMessage().contains(llIlIlIlIIII[llIlIlIlIIIl[4]]) ? 1 : 0)) {
            o var21;
            Log.info((String)llIlIlIlIIII[llIlIlIlIIIl[5]]);
            var21.ad.a(llIlIlIlIIIl[1]);
        }
    }

    private static boolean lIIIIIllIIIIIll(int n2) {
        return n2 == 0;
    }

    private static String lIIIIIllIIIIIII(String var13, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIlIlIlIIIl[3], var3);
            return new String(var9.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }
}

