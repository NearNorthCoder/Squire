/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;

/* TASK: Building work area -> BuildingworkareaTask */
@TaskDesc(name="Building work area", priority=0x7FFFFFFF, blocking=true)
public class BuildingWorkAreaTask
extends Task {
    private static /* synthetic */ String[] lIIlllIIIIlll;
    private static /* synthetic */ int[] lIIlllIIIlIII;
    private final /* synthetic */ a ae;
    private final /* synthetic */ Client af;

    private static String lIllIIlIIIlllll(String var2, String var5) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIlllIIIlIII[2], var9);
            return new String(var12.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public d(a a2, Client client) {
        this.ae = a2;
        this.af = client;
    }

    static {
        d.lIllIIlIIlIIlII();
        d.lIllIIlIIlIIIll();
    }

    private static void lIllIIlIIlIIlII() {
        lIIlllIIIlIII = new int[5];
        d.lIIlllIIIlIII[0] = (0x30 ^ 0x65) & ~(0x46 ^ 0x13);
        d.lIIlllIIIlIII[1] = 1;
        d.lIIlllIIIlIII[2] = 2;
        d.lIIlllIIIlIII[3] = 3;
        d.lIIlllIIIlIII[4] = 53 + 188 - 102 + 63 ^ 151 + 190 - 339 + 192;
    }

    private static boolean lIllIIlIIlIlIII(Object object) {
        return object == null;
    }

    private static String lIllIIlIIlIIIlI(String var1, String var4) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIII[4]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIlllIIIlIII[2], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_2;
        void var2_1;
        boolean bl;
        d var10;
        if (d.lIllIIlIIlIIlIl(this.af.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIIlIII[0];
        }
        if (d.lIllIIlIIlIIllI(var10.ae.M() ? 1 : 0)) {
            return lIIlllIIIlIII[0];
        }
        if (d.lIllIIlIIlIIlll(var10.ae.N())) {
            return lIIlllIIIlIII[0];
        }
        NPC var11 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIIlllIIIlIII[1]];
            stringArray[d.lIIlllIIIlIII[0]] = lIIlllIIIIlll[lIIlllIIIlIII[2]];
            return nPC.hasAction(stringArray);
        });
        String[] stringArray = new String[lIIlllIIIlIII[1]];
        stringArray[d.lIIlllIIIlIII[0]] = lIIlllIIIIlll[lIIlllIIIlIII[0]];
        TileObject var6 = TileObjects.getNearest((String[])stringArray);
        if (!d.lIllIIlIIlIIlll(var11) || d.lIllIIlIIlIlIII(var6)) {
            return lIIlllIIIlIII[0];
        }
        if (d.lIllIIlIIlIlIIl(var11.getWorldLocation().getX(), var6.getWorldLocation().getX())) {
            bl = lIIlllIIIlIII[1];
            0;
            if (1 >= 3) {
                return false;
            }
        } else {
            bl = lIIlllIIIlIII[0];
        }
        boolean bl2 = bl;
        c c2 = new c(var2_1.getWorldLocation(), var3_2.getWorldLocation(), bl2);
        this.ae.a(c2);
        System.out.println(lIIlllIIIIlll[lIIlllIIIlIII[1]]);
        return lIIlllIIIlIII[1];
    }

    private static void lIllIIlIIlIIIll() {
        lIIlllIIIIlll = new String[lIIlllIIIlIII[3]];
        d.lIIlllIIIIlll[d.lIIlllIIIlIII[0]] = d."Harpoonfish cannon";
        d.lIIlllIIIIlll[d.lIIlllIIIlIII[1]] = d."Successfully set work area";
        d.lIIlllIIIIlll[d.lIIlllIIIlIII[2]] = d."Forfeit";
    }
}

