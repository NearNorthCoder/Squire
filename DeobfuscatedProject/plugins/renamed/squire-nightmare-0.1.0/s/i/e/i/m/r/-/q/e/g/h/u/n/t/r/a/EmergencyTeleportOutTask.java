/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;

/* TASK: Emergency Teleport out -> EmergencyteleportoutTask */
@TaskDesc(name="Emergency Teleport out", priority=0x7FFFFFFF)
public class EmergencyTeleportOutTask
extends Task {
    private static final /* synthetic */ Logger da;
    private static /* synthetic */ int[] llllIllIllII;
    private final /* synthetic */ h de;
    private static final /* synthetic */ int db;
    private static /* synthetic */ String[] llllIllIlIll;
    private final /* synthetic */ SquireNightmareConfig dd;
    private final /* synthetic */ SquireNightmarePlugin dc;

    private static void lIIlIIIllIlIIlI() {
        llllIllIlIll = new String[llllIllIllII[13]];
        G.llllIllIlIll[G.llllIllIllII[0]] = G."Disturb";
        G.llllIllIlIll[G.llllIllIllII[2]] = G."[EmergencyTeleport]: Teleporting out because we're below {} hp and there's a DANGEROUS SLEEPWALKER ascending.";
        G.llllIllIlIll[G.llllIllIllII[6]] = G."[EmergencyTeleport]: We're out of food and we're not even in the final phase, teleporting out.";
        G.llllIllIlIll[G.llllIllIllII[1]] = G."NO PRAYER; emergency teleporting out to bank";
        G.llllIllIlIll[G.llllIllIllII[7]] = G."prayer";
        G.llllIllIlIll[G.llllIllIllII[8]] = G."restore";
        G.llllIllIlIll[G.llllIllIllII[9]] = G."sanfew";
        G.llllIllIlIll[G.llllIllIllII[10]] = G."Sleepwalker";
        G.llllIllIlIll[G.llllIllIllII[12]] = G."Eat";
    }

    private static void lIIlIIIllIlIIll() {
        llllIllIllII = new int[14];
        G.llllIllIllII[0] = (0x4D ^ 0x47 ^ (0x64 ^ 0x38)) & (0xD3 ^ 0xA0 ^ (0x23 ^ 6) ^ -1);
        G.llllIllIllII[1] = 3;
        G.llllIllIllII[2] = 1;
        G.llllIllIllII[3] = 0xFFFFB7BD & 0x69E6;
        G.llllIllIllII[4] = -(0xFFFFCC37 & 0x7FEB) & (0xFFFFEDBF & 0x7FFE);
        G.llllIllIllII[5] = 0xFFFFBB92 & 0x6FFF;
        G.llllIllIllII[6] = 2;
        G.llllIllIllII[7] = 0x9A ^ 0x89 ^ (0x5C ^ 0x4B);
        G.llllIllIllII[8] = 112 + 77 - 149 + 157 ^ 80 + 127 - 98 + 83;
        G.llllIllIllII[9] = 0x5B ^ 0x12 ^ (0x46 ^ 9);
        G.llllIllIllII[10] = 0xA2 ^ 0xB9 ^ (0x6B ^ 0x77);
        G.llllIllIllII[11] = -(0xFFFFFFA9 & 0x48D7) & (0xFFFFEFFB & 0x79FF);
        G.llllIllIllII[12] = 0x5E ^ 0x56;
        G.llllIllIllII[13] = 82 + 40 - 28 + 48 ^ 77 + 126 - 125 + 57;
    }

    private static boolean lIIlIIIllIllIlI(int n2) {
        return n2 <= 0;
    }

    private static String lIIlIIIllIlIIIl(String var2, String var21) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llllIllIllII[6], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIIIllIlIIII(String var3, String var19) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var4 = var19.toCharArray();
        int var16 = llllIllIllII[0];
        char[] var10 = var3.toCharArray();
        int var15 = var10.length;
        int var20 = llllIllIllII[0];
        while (G.lIIlIIIllIlllII(var20, var15)) {
            char var18 = var10[var20];
            var14.append((char)(var18 ^ var4[var16 % var4.length]));
            0;
            ++var16;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIIlIIIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIllIlIlIl(int n2) {
        return n2 == 0;
    }

    static {
        G.lIIlIIIllIlIIll();
        G.lIIlIIIllIlIIlI();
        db = llllIllIllII[3];
        da = LoggerFactory.getLogger(G.class);
    }

    public boolean run() {
        G var9;
        if (G.lIIlIIIllIlIlII(this.dd.assistantMode() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIllI(Players.getLocal().getWorldLocation().getPlane(), llllIllIllII[1])) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIlII(var9.dc.s() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        NPC var1 = SquireNightmarePlugin.d();
        if (G.lIIlIIIllIlIlll(var1)) {
            return llllIllIllII[0];
        }
        String[] stringArray = new String[llllIllIllII[2]];
        stringArray[G.llllIllIllII[0]] = llllIllIlIll[llllIllIllII[0]];
        if (G.lIIlIIIllIlIlII(var1.hasAction(stringArray) ? 1 : 0)) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIllIII(var1.getAnimation(), llllIllIllII[3])) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIllIII(var1.getAnimation(), llllIllIllII[4])) {
            return llllIllIllII[0];
        }
        if (G.lIIlIIIllIlIlII(var1.isDead() ? 1 : 0)) {
            return llllIllIllII[0];
        }
        int var17 = Inventory.getCount((boolean)llllIllIllII[2], item -> {
            String[] stringArray = new String[llllIllIllII[2]];
            stringArray[G.llllIllIllII[0]] = llllIllIlIll[llllIllIllII[12]];
            return item.hasAction(stringArray);
        });
        if (G.lIIlIIIllIllIIl(Combat.getCurrentHealth(), var9.dd.hpToTeleportOut()) && G.lIIlIIIllIllIlI(var17)) {
            if (G.lIIlIIIllIllIII(var1.getId(), llllIllIllII[5])) {
                NPC var12 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (G.lIIlIIIllIlIlII(nPC.getName().equals(llllIllIlIll[llllIllIllII[10]]) ? 1 : 0) && G.lIIlIIIllIllIII(nPC.getAnimation(), llllIllIllII[11])) {
                        n2 = llllIllIllII[2];
                        0;
                        if (((0xAD ^ 0xA4 ^ (0x8D ^ 0x9B)) & (0x24 ^ 0x1F ^ (3 ^ 0x27) ^ -1)) == -1) {
                            return false;
                        }
                    } else {
                        n2 = llllIllIllII[0];
                    }
                    return n2 != 0;
                });
                if (G.lIIlIIIllIllIll(var12)) {
                    Log.warn((String)llllIllIlIll[llllIllIllII[2]]);
                    return var9.dc.m();
                }
                return llllIllIllII[0];
            }
            Log.warn((String)llllIllIlIll[llllIllIllII[6]]);
            return var9.dc.m();
        }
        Item var12 = Inventory.getFirst(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!G.lIIlIIIllIlIlIl(string.contains(llllIllIlIll[llllIllIllII[7]]) ? 1 : 0) || !G.lIIlIIIllIlIlIl(string.contains(llllIllIlIll[llllIllIllII[8]]) ? 1 : 0) || G.lIIlIIIllIlIlII(string.contains(llllIllIlIll[llllIllIllII[9]]) ? 1 : 0)) {
                n2 = llllIllIllII[2];
                0;
                if ((2 & ~2) != 0) {
                    return false;
                }
            } else {
                n2 = llllIllIllII[0];
            }
            return n2 != 0;
        });
        if (G.lIIlIIIllIlIlll(var12) && G.lIIlIIIllIllIlI(Skills.getBoostedLevel((Skill)Skill.PRAYER)) && G.lIIlIIIllIlIllI(var1.getId(), llllIllIllII[5])) {
            Log.warn((String)llllIllIlIll[llllIllIllII[1]]);
            return var9.dc.m();
        }
        return llllIllIllII[0];
    }

    private static boolean lIIlIIIllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIllIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public G(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dc = squireNightmarePlugin;
        this.dd = squireNightmareConfig;
        this.de = h2;
    }

    private static String lIIlIIIllIIllll(String var22, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIllIllII[12]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(llllIllIllII[6], var8);
            return new String(var23.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIllIllIll(Object object) {
        return object != null;
    }
}

