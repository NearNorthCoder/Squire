/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Depositing Guardian Stone -> DepositingguardianstoneTask */
@TaskDesc(name="Depositing Guardian Stone", priority=3, blocking=true)
public class s
extends h {
    private static /* synthetic */ int[] llIIlllIIIII;
    private static /* synthetic */ String[] llIIllIlllll;

    @Override
    protected boolean aj() {
        return llIIlllIIIII[2];
    }

    private static void llllllIlllllII() {
        llIIlllIIIII = new int[7];
        s.llIIlllIIIII[0] = 2;
        s.llIIlllIIIII[1] = (0x34 ^ 0x7C) & ~(0x24 ^ 0x6C);
        s.llIIlllIIIII[2] = 1;
        s.llIIlllIIIII[3] = -(0xFFFFD7FE & 0x3AFF) & (0xFFFFFFFF & 0x7BFD);
        s.llIIlllIIIII[4] = -(0xFFFFFACF & 0x17F7) & (0xFFFFFFC7 & 0x7BFF);
        s.llIIlllIIIII[5] = 0xFFFFEFBB & 0x3CCF;
        s.llIIlllIIIII[6] = 5 + 74 - 6 + 74 ^ 20 + 123 - -6 + 6;
    }

    private static String llllllIllllIlI(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var9 = var11.toCharArray();
        int var4 = llIIlllIIIII[1];
        char[] var3 = var5.toCharArray();
        int var1 = var3.length;
        int var14 = llIIlllIIIII[1];
        while (s.lllllllIIIIIII(var14, var1)) {
            char var2 = var3[var14];
            var7.append((char)(var2 ^ var9[var4 % var9.length]));
            0;
            ++var4;
            ++var14;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static String llllllIllllIIl(String var10, String var12) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIIlllIIIII[6]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(llIIlllIIIII[0], var15);
            return new String(var13.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlllllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        if (s.llllllIlllllIl(this.aV.g() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (s.llllllIllllllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        int[] nArray = new int[llIIlllIIIII[0]];
        nArray[s.llIIlllIIIII[1]] = llIIlllIIIII[3];
        nArray[s.llIIlllIIIII[2]] = llIIlllIIIII[4];
        if (s.llllllIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        int[] nArray2 = new int[llIIlllIIIII[2]];
        nArray2[s.llIIlllIIIII[1]] = llIIlllIIIII[5];
        NPC var8 = NPCs.getNearest((int[])nArray2);
        if (!s.llllllIlllllll(var8) || s.llllllIlllllIl(var8.hasAction(string -> {
            int n2;
            if (s.llllllIlllllll(string) && s.llllllIllllllI(string.equals(llIIllIlllll[llIIlllIIIII[2]]) ? 1 : 0)) {
                n2 = llIIlllIIIII[2];
                0;
                if (3 < 1) {
                    return false;
                }
            } else {
                n2 = llIIlllIIIII[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (s.llllllIllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIlllIIIII[2];
        }
        var1_1.interact(llIIllIlllll[llIIlllIIIII[1]]);
        return llIIlllIIIII[2];
    }

    private static boolean llllllIlllllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public s(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIIIII[0]];
        cArray[s.llIIlllIIIII[1]] = c.ACTIVE;
        cArray[s.llIIlllIIIII[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static void llllllIllllIll() {
        llIIllIlllll = new String[llIIlllIIIII[0]];
        s.llIIllIlllll[s.llIIlllIIIII[1]] = s."Power-up";
        s.llIIllIlllll[s.llIIlllIIIII[2]] = s."Power-up";
    }

    private static boolean llllllIllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.llllllIlllllII();
        s.llllllIllllIll();
    }
}

