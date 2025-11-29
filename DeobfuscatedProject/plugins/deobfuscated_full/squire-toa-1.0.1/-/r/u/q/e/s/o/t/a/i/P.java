/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

/* TASK: Handling Kephri Prayers -> HandlingkephriprayersTask */
@TaskDesc(name="Handling Kephri Prayers")
public class P
extends z {
    private static /* synthetic */ String[] lIlIIIIIlllIl;
    private static /* synthetic */ int[] lIlIIIIIllllI;

    @Override
    public n J() {
        return this.aT.prayerModeKephri();
    }

    private static String lIllIllIlIIIIlI(String var8, String var2) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllllI[8]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlIIIIIllllI[3], var7);
            return new String(var13.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean I() {
        return lIlIIIIIllllI[0];
    }

    private static boolean lIllIllIlIIIllI(Object object) {
        return object != null;
    }

    @Override
    public int F() {
        return lIlIIIIIllllI[4];
    }

    private static boolean lIllIllIlIIlIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIlIIIIIllllI[2]];
        nArray[P.lIlIIIIIllllI[1]] = lIlIIIIIllllI[5];
        nArray[P.lIlIIIIIllllI[0]] = lIlIIIIIllllI[6];
        nArray[P.lIlIIIIIllllI[3]] = lIlIIIIIllllI[7];
        return this.aS.a(nArray);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[lIlIIIIIllllI[0]];
        stringArray[P.lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (P.lIllIllIlIIIllI(nPC) && P.lIllIllIlIIIlll(nPC.distanceTo((Locatable)Players.getLocal()), lIlIIIIIllllI[2]) && P.lIllIllIlIIlIII(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return List.of(this.H(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[lIlIIIIIllllI[3]];
        stringArray2[P.lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[0]];
        stringArray2[P.lIlIIIIIllllI[0]] = lIlIIIIIlllIl[lIlIIIIIllllI[3]];
        NPC var20 = NPCs.getNearest((String[])stringArray2);
        if (P.lIllIllIlIIIllI(var20)) {
            P var19;
            return List.of(var19.H(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.H());
    }

    private static String lIllIllIlIIIIll(String var16, String var14) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIlIIIIIllllI[3], var21);
            return new String(var18.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIllIllIlIIIIIl(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var5 = var6.toCharArray();
        int var17 = lIlIIIIIllllI[1];
        char[] var4 = var10.toCharArray();
        int var3 = var4.length;
        int var1 = lIlIIIIIllllI[1];
        while (P.lIllIllIlIIlIIl(var1, var3)) {
            char var9 = var4[var1];
            var15.append((char)(var9 ^ var5[var17 % var5.length]));
            0;
            ++var17;
            ++var1;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIllIllIlIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIllIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIIIlIl() {
        lIlIIIIIllllI = new int[9];
        P.lIlIIIIIllllI[0] = 1;
        P.lIlIIIIIllllI[1] = (0xD9 ^ 0x85) & ~(0x53 ^ 0xF);
        P.lIlIIIIIllllI[2] = 3;
        P.lIlIIIIIllllI[3] = 2;
        P.lIlIIIIIllllI[4] = -(0xFFFFDBEB & 0x64B7) & (0xFFFFFFF7 & 0x77FE);
        P.lIlIIIIIllllI[5] = -(0x35 ^ 4) & (0xFFFFBDF7 & 0x6FFF);
        P.lIlIIIIIllllI[6] = 0xFFFFAFDB & 0x7DEC;
        P.lIlIIIIIllllI[7] = -(0xFFFFD63F & 0x69F7) & (0xFFFFFFFF & 0x6DFF);
        P.lIlIIIIIllllI[8] = 0x18 ^ 0x10;
    }

    @Inject
    public P(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static void lIllIllIlIIIlII() {
        lIlIIIIIlllIl = new String[lIlIIIIIllllI[2]];
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[1]] = P."Soldier Scarab";
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[0]] = P."Spitting Scarab";
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[3]] = P."Agile Scarab";
    }

    static {
        P.lIllIllIlIIIlIl();
        P.lIllIllIlIIIlII();
    }
}

