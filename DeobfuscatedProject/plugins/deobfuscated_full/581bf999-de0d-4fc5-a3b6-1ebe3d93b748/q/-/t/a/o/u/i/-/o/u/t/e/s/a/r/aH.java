/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

/* TASK: Handling baba prayers -> HandlingbabaprayersTask */
@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF, register=true)
public class aH
extends W {
    private /* synthetic */ int dF;
    private static /* synthetic */ String[] lIllllllIll;
    private static /* synthetic */ int[] lIlllllllII;

    private static boolean lIIllIllllIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return lIlllllllII[1];
    }

    private static boolean lIIllIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public List<Prayer> aN() {
        aH var11;
        String[] stringArray = new String[lIlllllllII[1]];
        stringArray[aH.lIlllllllII[0]] = lIllllllIll[lIlllllllII[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aH.lIIllIllllIlIl(nPC) && aH.lIIllIllllIllI(nPC.getId(), lIlllllllII[2])) {
            return List.of(this.aQ());
        }
        String[] stringArray2 = new String[lIlllllllII[1]];
        stringArray2[aH.lIlllllllII[0]] = lIllllllIll[lIlllllllII[1]];
        NPC var14 = NPCs.getNearest((String[])stringArray2);
        if (aH.lIIllIllllIlll(var11.dF, Static.getClient().getTickCount()) && aH.lIIllIllllIlIl(var14)) {
            return List.of(Prayer.PROTECT_FROM_MISSILES, var11.aQ());
        }
        return List.of(Prayer.PROTECT_FROM_MELEE, this.aQ());
    }

    private static void lIIllIllllIlII() {
        lIlllllllII = new int[11];
        aH.lIlllllllII[0] = (116 + 48 - 22 + 40 ^ 121 + 79 - 100 + 37) & (0x39 ^ 0x73 ^ (0xDD ^ 0xA8) ^ -1);
        aH.lIlllllllII[1] = 1;
        aH.lIlllllllII[2] = 0xFFFFAFF7 & 0x7E0C;
        aH.lIlllllllII[3] = 0xFFFFFB77 & 0x3FDC;
        aH.lIlllllllII[4] = 3;
        aH.lIlllllllII[5] = -(0xFFFFB5F9 & 0x5A57) & (0xFFFFBF73 & 0x7EDE);
        aH.lIlllllllII[6] = -(0xFFFF9CED & 0x735B) & (0xFFFFFF6B & 0x3EDF);
        aH.lIlllllllII[7] = 2;
        aH.lIlllllllII[8] = -(0xFFFFEE07 & 0x35F9) & (0xFFFFEDBF & 0x3E7F);
        aH.lIlllllllII[9] = 0x55 ^ 0x50;
        aH.lIlllllllII[10] = 0x14 ^ 0x1C;
    }

    @Inject
    public aH(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dF = lIlllllllII[0];
    }

    static {
        aH.lIIllIllllIlII();
        aH.lIIllIllllIIll();
    }

    private static boolean lIIllIllllIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static String lIIllIllllIIII(String var8, String var10) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlllllllII[10]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIlllllllII[7], var23);
            return new String(var20.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlllllIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[lIlllllllII[4]];
        nArray[aH.lIlllllllII[0]] = lIlllllllII[5];
        nArray[aH.lIlllllllII[1]] = lIlllllllII[6];
        nArray[aH.lIlllllllII[7]] = lIlllllllII[2];
        return this.cm.a(nArray);
    }

    private static boolean lIIllIlllllIIl(Object object) {
        return object == null;
    }

    private static String lIIllIllllIIIl(String var6, String var3) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var15 = var3.toCharArray();
        int var12 = lIlllllllII[0];
        char[] var22 = var6.toCharArray();
        int var24 = var22.length;
        int var16 = lIlllllllII[0];
        while (aH.lIIllIlllllIll(var16, var24)) {
            char var9 = var22[var16];
            var1.append((char)(var9 ^ var15[var12 % var15.length]));
            0;
            ++var12;
            ++var16;
            0;
            if (3 != ((0xA8 ^ 0xBF ^ (0x63 ^ 0x7A)) & (0xA9 ^ 0x97 ^ (0x98 ^ 0xA8) ^ -1) & ((0xA ^ 0x2C ^ (0xA1 ^ 0xAD)) & (0x8E ^ 0xA7 ^ 3 ^ -1) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    @Override
    public int aO() {
        return lIlllllllII[3];
    }

    /*
     * WARNING - void declaration
     */
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        void var13;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (aH.lIIllIlllllIII(graphicsObjectCreated.getGraphicsObject().getId(), lIlllllllII[8])) {
            return;
        }
        LocalPoint var25 = var13.getLocation();
        WorldPoint var19 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var25);
        String[] stringArray = new String[lIlllllllII[1]];
        stringArray[aH.lIlllllllII[0]] = lIllllllIll[lIlllllllII[7]];
        NPC var7 = NPCs.getNearest((String[])stringArray);
        if (aH.lIIllIlllllIIl(var7)) {
            return;
        }
        if (aH.lIIllIlllllIlI(var7.getWorldArea().contains(var19) ? 1 : 0)) {
            llllllllllllllllIlIIlIIIlllllIIl.dF = Static.getClient().getTickCount() + lIlllllllII[9];
        }
    }

    private static String lIIllIllllIIlI(String var18, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlllllllII[7], var4);
            return new String(var2.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllllIIll() {
        lIllllllIll = new String[lIlllllllII[4]];
        aH.lIllllllIll[aH.lIlllllllII[0]] = aH."Ba-Ba";
        aH.lIllllllIll[aH.lIlllllllII[1]] = aH."Baboon";
        aH.lIllllllIll[aH.lIlllllllII[7]] = aH."Ba-Ba";
    }
}

