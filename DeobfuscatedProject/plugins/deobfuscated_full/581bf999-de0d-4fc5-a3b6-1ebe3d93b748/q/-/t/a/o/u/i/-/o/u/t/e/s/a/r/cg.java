/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

/* TASK: Claiming Rewards (Outside) -> Claimingrewards(Outside)Task */
@TaskDesc(name="Claiming Rewards (Outside)", priority=0x7FFFFFFF, blocking=true)
public class cg
extends ck {
    private static /* synthetic */ int[] llIlIIIIIlI;
    private static final /* synthetic */ int hO;
    private static final /* synthetic */ int hP;
    private static /* synthetic */ String[] llIlIIIIIIl;

    private static boolean lIlIIlIIIlIllI(int n2) {
        return n2 != 0;
    }

    private static String lIlIIlIIIlIIII(String var10, String var4) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIlIIIIIlI[8]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llIlIIIIIlI[4], var15);
            return new String(var20.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        cg.lIlIIlIIIlIIll();
        cg.lIlIIlIIIlIIlI();
        hO = llIlIIIIIlI[2];
        hP = llIlIIIIIlI[3];
    }

    @Override
    public boolean bl() {
        TileObject tileObject;
        block5: {
            block4: {
                String[] stringArray = new String[llIlIIIIIlI[0]];
                stringArray[cg.llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (!cg.lIlIIlIIIlIlII(tileObject)) break block4;
                String[] stringArray2 = new String[llIlIIIIIlI[0]];
                stringArray2[cg.llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[0]];
                if (!cg.lIlIIlIIIlIlIl(tileObject.hasAction(stringArray2) ? 1 : 0)) break block5;
            }
            return llIlIIIIIlI[1];
        }
        Widget var8 = Widgets.get((int)llIlIIIIIlI[2], (int)llIlIIIIIlI[3]);
        if (cg.lIlIIlIIIlIllI(Widgets.isVisible((Widget)var8) ? 1 : 0)) {
            Log.info((String)llIlIIIIIIl[llIlIIIIIlI[4]]);
            var8.interact(llIlIIIIIIl[llIlIIIIIlI[5]]);
            return llIlIIIIIlI[0];
        }
        Log.info((String)llIlIIIIIIl[llIlIIIIIlI[3]]);
        tileObject.interact(llIlIIIIIIl[llIlIIIIIlI[6]]);
        return llIlIIIIIlI[0];
    }

    private static boolean lIlIIlIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIIIllll(String var9, String var11) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var14 = var11.toCharArray();
        int var1 = llIlIIIIIlI[1];
        char[] var17 = var9.toCharArray();
        int var7 = var17.length;
        int var3 = llIlIIIIIlI[1];
        while (cg.lIlIIlIIIlIlll(var3, var7)) {
            char var19 = var17[var3];
            var18.append((char)(var19 ^ var14[var1 % var14.length]));
            0;
            ++var1;
            ++var3;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIlIIlIIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlIIIlIIlI() {
        llIlIIIIIIl = new String[llIlIIIIIlI[7]];
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[1]] = cg."Rewards Niche";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[0]] = cg."Claim";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[4]] = cg."[ClaimRewardsItems] Banking reward items...";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[5]] = cg."Bank-all";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[3]] = cg."[ClaimRewardsItems] Claiming reward items...";
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[6]] = cg."Claim";
    }

    @Inject
    protected cg(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIlIIlIIIlIIll() {
        llIlIIIIIlI = new int[9];
        cg.llIlIIIIIlI[0] = 1;
        cg.llIlIIIIIlI[1] = (0x2B ^ 7) & ~(0x13 ^ 0x3F);
        cg.llIlIIIIIlI[2] = -(0xFFFFF5EF & 0x3EB5) & (0xFFFFFFB7 & 0x37EF);
        cg.llIlIIIIIlI[3] = 0x5D ^ 0x59;
        cg.llIlIIIIIlI[4] = 2;
        cg.llIlIIIIIlI[5] = 3;
        cg.llIlIIIIIlI[6] = 0xC2 ^ 0xC7;
        cg.llIlIIIIIlI[7] = 0x3B ^ 0x21 ^ (0x3A ^ 0x26);
        cg.llIlIIIIIlI[8] = 0x47 ^ 0x72 ^ (0x54 ^ 0x69);
    }

    private static String lIlIIlIIIlIIIl(String var13, String var12) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIlIIIIIlI[4], var16);
            return new String(var2.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIlII(Object object) {
        return object != null;
    }
}

