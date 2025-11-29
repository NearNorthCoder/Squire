/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Dialog
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.az_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Configure Party -> ConfigurepartyTask */
@TaskDesc(name="Configure Party", priority=0x7FFFFF99, blocking=true)
public class ConfigurePartyTask
extends az_Unknown {
    private final /* synthetic */ SquireChambersConfig du;
    private static /* synthetic */ String[] lIIlllllllII;
    private final /* synthetic */ SquireChambersPlugin dt;
    private static /* synthetic */ int[] lIIlllllllIl;

    private static boolean llIlIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIlIllllll(int n2) {
        return n2 == 0;
    }

    private static String llIlIIlIllllII(String var12, String var13) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIIlllllllIl[6]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIlllllllIl[2], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    static {
        av.llIlIIlIlllllI();
        av.llIlIIlIllllIl();
    }

    private static void llIlIIlIllllIl() {
        lIIlllllllII = new String[lIIlllllllIl[5]];
        av.lIIlllllllII[av.lIIlllllllIl[0]] = av."Waiting for pin input";
        av.lIIlllllllII[av.lIIlllllllIl[1]] = av."No, I'll go raiding another time.";
        av.lIIlllllllII[av.lIIlllllllIl[2]] = av."Enter";
        av.lIIlllllllII[av.lIIlllllllIl[3]] = av."Chambers of Xeric";
        av.lIIlllllllII[av.lIIlllllllIl[4]] = av."Enter";
    }

    private static String llIlIIlIlllIlI(String var2, String var4) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIlllllllIl[2], var16);
            return new String(var17.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIlllllI() {
        lIIlllllllIl = new int[7];
        av.lIIlllllllIl[0] = (0xB3 ^ 0x83 ^ (0x71 ^ 0x1D)) & (0x60 ^ 0x7E ^ (0xE8 ^ 0xAA) ^ -1);
        av.lIIlllllllIl[1] = 1;
        av.lIIlllllllIl[2] = 2;
        av.lIIlllllllIl[3] = 3;
        av.lIIlllllllIl[4] = 7 ^ 3;
        av.lIIlllllllIl[5] = 114 + 85 - 178 + 118 ^ 108 + 97 - 125 + 62;
        av.lIIlllllllIl[6] = 0x3D ^ 0x31 ^ (0x69 ^ 0x6D);
    }

    private static boolean llIlIIllIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if (av.llIlIIlIllllll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown.bn() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        if (av.llIlIIllIIIIII(Bank.isPinWindowOpen() ? 1 : 0)) {
            System.out.println(lIIlllllllII[lIIlllllllIl[0]]);
            return lIIlllllllIl[1];
        }
        if (av.llIlIIllIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIIlllllllIl[1];
        }
        if (av.llIlIIllIIIIII(Dialog.isViewingOptions() ? 1 : 0) && av.llIlIIllIIIIII(Dialog.hasOption((String)lIIlllllllII[lIIlllllllIl[1]]) ? 1 : 0)) {
            Game.logout();
            return lIIlllllllIl[1];
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (av.llIlIIllIIIIII(tileObject.getName().equals(lIIlllllllII[lIIlllllllIl[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllllllIl[1]];
                stringArray[av.lIIlllllllIl[0]] = lIIlllllllII[lIIlllllllIl[4]];
                if (av.llIlIIllIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllllllIl[1];
                    0;
                    if ((0xFB ^ 0x93 ^ (0xCA ^ 0xA6)) != 3) return n2 != 0;
                    return ((105 + 39 - 70 + 60 ^ 68 + 123 - 183 + 128) & (9 ^ 0x1F ^ (0x73 ^ 0x6B) ^ -1)) != 0;
                }
            }
            n2 = lIIlllllllIl[0];
            return n2 != 0;
        });
        if (av.llIlIIllIIIIIl(var9)) {
            return lIIlllllllIl[0];
        }
        if (av.llIlIIllIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        var1_1.interact(lIIlllllllII[lIIlllllllIl[2]]);
        return lIIlllllllIl[1];
    }

    private static boolean llIlIIllIIIIII(int n2) {
        return n2 != 0;
    }

    private static String llIlIIlIlllIll(String var8, String var18) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var15 = lIIlllllllIl[0];
        char[] var19 = var8.toCharArray();
        int var14 = var19.length;
        int var6 = lIIlllllllIl[0];
        while (av.llIlIIllIIIIlI(var6, var14)) {
            char var5 = var19[var6];
            var1.append((char)(var5 ^ var20[var15 % var20.length]));
            0;
            ++var15;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var1);
    }

    @Inject
    public av(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dt = squireChambersPlugin;
        this.du = squireChambersConfig;
    }
}

