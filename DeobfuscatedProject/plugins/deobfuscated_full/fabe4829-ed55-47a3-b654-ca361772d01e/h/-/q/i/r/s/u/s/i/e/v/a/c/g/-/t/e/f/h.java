/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.j;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;

/* TASK: Bank Task -> BanktaskTask */
@TaskDesc(name="Bank Task", priority=10)
public class h
extends Task {
    private final /* synthetic */ f T;
    /* synthetic */ WorldArea R;
    private static /* synthetic */ String[] llIIIlllIlll;
    private final /* synthetic */ n V;
    private static /* synthetic */ int[] llIIIlllllII;
    /* synthetic */ WorldPoint S;
    private final /* synthetic */ SquireFightCavesConfig U;

    @Inject
    public h(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.R = new WorldArea(llIIIlllllII[0], llIIIlllllII[1], llIIIlllllII[2], llIIIlllllII[3], llIIIlllllII[4]);
        this.S = new WorldPoint(llIIIlllllII[5], llIIIlllllII[6], llIIIlllllII[4]);
        this.T = f2;
        this.U = squireFightCavesConfig;
        this.V = n2;
    }

    private static boolean llllIlllIllIII(Object object) {
        return object != null;
    }

    protected BankLoadout x() {
        return (BankLoadout)this.U.bankLoadout().selected(BankLoadout.class);
    }

    private static String llllIlllIIllII(String var11, String var15) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var3 = var15.toCharArray();
        int var20 = llIIIlllllII[4];
        char[] var16 = var11.toCharArray();
        int var7 = var16.length;
        int var10 = llIIIlllllII[4];
        while (h.llllIlllIlIlII(var10, var7)) {
            char var9 = var16[var10];
            var6.append((char)(var9 ^ var3[var20 % var3.length]));
            0;
            ++var20;
            ++var10;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean llllIlllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.llllIlllIlIIlI();
        h.llllIlllIIllIl();
    }

    private static boolean llllIlllIllIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        h var4;
        WorldPoint var5;
        if (!h.llllIlllIlIIll(this.R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !h.llllIlllIlIIll(this.x().needsToBank() ? 1 : 0) || h.llllIlllIlIIll(SquireFightCavesPlugin.g ? 1 : 0) && h.llllIlllIlIIll(this.U.stopAfterCape() ? 1 : 0)) {
            return llIIIlllllII[4];
        }
        if (h.llllIlllIlIIll(SquireFightCavesPlugin.f ? 1 : 0) && h.llllIlllIlIlII(j.ab, llIIIlllllII[7])) {
            j.aa = System.currentTimeMillis();
            j.ab += llIIIlllllII[7];
        }
        if (h.llllIlllIlIlIl((var5 = Players.getLocal().getWorldLocation()).distanceTo(var4.S), llIIIlllllII[8])) {
            SquireFightCavesPlugin.h = llIIIlllIlll[llIIIlllllII[4]];
            Movement.walkTo((WorldPoint)var4.S);
            0;
            return llIIIlllllII[4];
        }
        if (h.llllIlllIlIllI(var5.distanceTo(var4.S), llIIIlllllII[8])) {
            if (h.llllIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[llIIIlllllII[7]];
                nArray[h.llIIIlllllII[4]] = llIIIlllllII[9];
                NPC var13 = NPCs.getNearest((int[])nArray);
                if (h.llllIlllIllIII(var13)) {
                    SquireFightCavesPlugin.h = llIIIlllIlll[llIIIlllllII[7]];
                    var13.interact(llIIIlllIlll[llIIIlllllII[10]]);
                    return llIIIlllllII[4];
                }
            }
            if (h.llllIlllIllIIl(var4.x())) {
                Log.error((String)llIIIlllIlll[llIIIlllllII[11]]);
                return llIIIlllllII[4];
            }
            if (h.llllIlllIlIlll(var4.x().needsToBank() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIIlllIlll[llIIIlllllII[12]];
                Bank.close();
                var4.sleep(llIIIlllllII[11]);
                return llIIIlllllII[4];
            }
            if (h.llllIlllIlIlll(BankLoadouts.withdrawWithRetries((BankLoadout)var4.x(), (int)llIIIlllllII[13]).booleanValue() ? 1 : 0)) {
                Log.info((String)llIIIlllIlll[llIIIlllllII[13]]);
                return llIIIlllllII[4];
            }
        }
        return llIIIlllllII[4];
    }

    private static String llllIlllIIlIlI(String var1, String var17) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llIIIlllllII[15]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIIIlllllII[10], var21);
            return new String(var22.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllIlIlll(int n2) {
        return n2 == 0;
    }

    private static void llllIlllIIllIl() {
        llIIIlllIlll = new String[llIIIlllllII[14]];
        h.llIIIlllIlll[h.llIIIlllllII[4]] = h."Nav to tzhar bank";
        h.llIIIlllIlll[h.llIIIlllllII[7]] = h."Opening bank";
        h.llIIIlllIlll[h.llIIIlllllII[10]] = h."Bank";
        h.llIIIlllIlll[h.llIIIlllllII[11]] = h."No bank loadout selected";
        h.llIIIlllIlll[h.llIIIlllllII[12]] = h."Closing bank";
        h.llIIIlllIlll[h.llIIIlllllII[13]] = h."Banking failed 5 times in a row, stopping";
    }

    private static boolean llllIlllIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llllIlllIIlIll(String var2, String var19) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIIlllllII[10], var18);
            return new String(var12.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIlllIlIIlI() {
        llIIIlllllII = new int[16];
        h.llIIIlllllII[0] = 0xFFFFDB77 & 0x2DCE;
        h.llIIIlllllII[1] = -(0xFFFFFFDF & 0x86C) & (0xFFFFBFCF & 0x5C7F);
        h.llIIIlllllII[2] = 12 + 77 - 35 + 106;
        h.llIIIlllllII[3] = 0x24 ^ 0x1B ^ (0xEF ^ 0x9B);
        h.llIIIlllllII[4] = (5 + 148 - 65 + 104 ^ 115 + 79 - 115 + 62) & (207 + 108 - 270 + 205 ^ 14 + 6 - -69 + 94 ^ -1);
        h.llIIIlllllII[5] = -(0xFFFFB3FB & 0x5C57) & (0xFFFF9DFF & 0x7BDF);
        h.llIIIlllllII[6] = -(0xFFFFBBDB & 0x64E5) & (0xFFFFBEFB & 0x75FE);
        h.llIIIlllllII[7] = 1;
        h.llIIIlllllII[8] = 0x64 ^ 0x6B;
        h.llIIIlllllII[9] = -(0xFFFFE767 & 0x389B) & (0xFFFFFFFF & 0x3DFF);
        h.llIIIlllllII[10] = 2;
        h.llIIIlllllII[11] = 3;
        h.llIIIlllllII[12] = 0xEB ^ 0xAE ^ (0xD0 ^ 0x91);
        h.llIIIlllllII[13] = 0xE8 ^ 0xAC ^ (0x30 ^ 0x71);
        h.llIIIlllllII[14] = 0x8D ^ 0x8B;
        h.llIIIlllllII[15] = 0x2D ^ 0x25;
    }
}

