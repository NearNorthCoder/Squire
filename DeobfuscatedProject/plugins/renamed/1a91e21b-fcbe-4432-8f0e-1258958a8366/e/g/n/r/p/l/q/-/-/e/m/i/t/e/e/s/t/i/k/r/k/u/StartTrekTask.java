/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Start trek task -> StarttrektaskTask */
@TaskDesc(name="Start trek task")
public class StartTrekTask
extends Task {
    /* synthetic */ Pattern X;
    /* synthetic */ WorldArea Y;
    private final /* synthetic */ TempleTrekkingConfig W;
    private static /* synthetic */ int[] lIIllIlIIIIll;
    private static /* synthetic */ String[] lIIllIlIIIIIl;
    private final /* synthetic */ TempleTrekkingPlugin V;

    @Inject
    public r(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.X = Pattern.compile(lIIllIlIIIIIl[lIIllIlIIIIll[0]]);
        this.Y = new WorldArea(new WorldPoint(lIIllIlIIIIll[1], lIIllIlIIIIll[2], lIIllIlIIIIll[0]), new WorldPoint(lIIllIlIIIIll[3], lIIllIlIIIIll[4], lIIllIlIIIIll[0]));
        this.W = templeTrekkingConfig;
        this.V = templeTrekkingPlugin;
    }

    private static void lIllIIIIIlIlIII() {
        lIIllIlIIIIIl = new String[lIIllIlIIIIll[21]];
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[0]] = r."^Stamina potion.*$";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[5]] = r."Knife";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[6]] = r."Plank";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[7]] = r."Logs";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[10]] = r."Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[11]] = r."Rotten food";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[8]] = r."Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[12]] = r."easy";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[13]] = r."Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[14]] = r."Mage";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[9]] = r."Adventurer";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[15]] = r."easy";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[16]] = r."Escort";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[17]] = r."Dalcian";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[18]] = r."Fyion";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[19]] = r."Stamina";
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[20]] = r."Drink";
    }

    private static boolean lIllIIIIIllIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIIIlIIlII(String var6, String var22) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIIll[13]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIllIlIIIIll[6], var14);
            return new String(var18.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIlIllIl() {
        lIIllIlIIIIll = new int[22];
        r.lIIllIlIIIIll[0] = (0x14 ^ 0x1F) & ~(0x90 ^ 0x9B);
        r.lIIllIlIIIIll[1] = -(0xFFFFBF2F & 0x52D3) & (0xFFFFBFFE & 0x5F5F);
        r.lIIllIlIIIIll[2] = 0xFFFF9DE7 & 0x6F98;
        r.lIIllIlIIIIll[3] = 0xFFFFDF7B & 0x2DF7;
        r.lIIllIlIIIIll[4] = 0xFFFFCDFB & 0x3FA7;
        r.lIIllIlIIIIll[5] = 1;
        r.lIIllIlIIIIll[6] = 2;
        r.lIIllIlIIIIll[7] = 3;
        r.lIIllIlIIIIll[8] = 1 ^ (0x9B ^ 0x9C);
        r.lIIllIlIIIIll[9] = 0x8A ^ 0xC4 ^ (0xEC ^ 0xA8);
        r.lIIllIlIIIIll[10] = 0xA2 ^ 0xA6;
        r.lIIllIlIIIIll[11] = 0xF ^ 0xA;
        r.lIIllIlIIIIll[12] = 0x44 ^ 1 ^ (0xE1 ^ 0xA3);
        r.lIIllIlIIIIll[13] = 0x9C ^ 0xA7 ^ (0x56 ^ 0x65);
        r.lIIllIlIIIIll[14] = 5 ^ 0xC;
        r.lIIllIlIIIIll[15] = 0x31 ^ 0x3A;
        r.lIIllIlIIIIll[16] = 0 ^ 0xC;
        r.lIIllIlIIIIll[17] = 0x6A ^ 0x6F ^ (0x62 ^ 0x6A);
        r.lIIllIlIIIIll[18] = 10 + 133 - 111 + 103 ^ 107 + 119 - 194 + 105;
        r.lIIllIlIIIIll[19] = 0x5B ^ 0x49 ^ (0x4C ^ 0x51);
        r.lIIllIlIIIIll[20] = 0x31 ^ 1 ^ (0x22 ^ 2);
        r.lIIllIlIIIIll[21] = 31 + 94 - 75 + 99 ^ 63 + 90 - 79 + 58;
    }

    private static boolean lIllIIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        r.lIllIIIIIlIllIl();
        r.lIllIIIIIlIlIII();
    }

    private static boolean lIllIIIIIllIlII(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        Player var12;
        r var21;
        block18: {
            block20: {
                block19: {
                    if (r.lIllIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount((int)lIIllIlIIIIll[0]);
                        return lIIllIlIIIIll[5];
                    }
                    if (r.lIllIIIIIlIllll(var21.V.e() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    var12 = Players.getLocal();
                    if (r.lIllIIIIIllIIII(var12)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (!r.lIllIIIIIllIIIl(var12.isMoving() ? 1 : 0) || r.lIllIIIIIlIllll(var12.isAnimating() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (r.lIllIIIIIllIIlI(var21.V.c(), lIIllIlIIIIll[6])) {
                        return lIIllIlIIIIll[0];
                    }
                    if (r.lIllIIIIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (!r.lIllIIIIIlIllll(var21.V.f().contains((Locatable)var12) ? 1 : 0)) break block18;
                    if (r.lIllIIIIIlIllll(var21.W.healInBank() ? 1 : 0) && r.lIllIIIIIllIIll(var21.W.hpToBank(), Skills.getBoostedLevel((Skill)Skill.HITPOINTS))) {
                        var21.V.b(lIIllIlIIIIll[5]);
                        return lIIllIlIIIIll[0];
                    }
                    String[] stringArray = new String[lIIllIlIIIIll[5]];
                    stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[5]];
                    if (!r.lIllIIIIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block19;
                    String[] stringArray2 = new String[lIIllIlIIIIll[6]];
                    stringArray2[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[6]];
                    stringArray2[r.lIIllIlIIIIll[5]] = lIIllIlIIIIIl[lIIllIlIIIIll[7]];
                    if (r.lIllIIIIIllIIll(Inventory.getFreeSlots() - Math.min(lIIllIlIIIIll[7], Inventory.getAll((String[])stringArray2).size()), lIIllIlIIIIll[8]) && (!r.lIllIIIIIlIllll(var21.W.stamina()) || !r.lIllIIIIIllIIIl(Inventory.contains(item -> {
                        int n2;
                        if (r.lIllIIIIIlIllll(item.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[19]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIIIll[5]];
                            stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[20]];
                            if (r.lIllIIIIIlIllll(item.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIllIlIIIIll[5];
                                0;
                                if (3 != 1) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIllIlIIIIll[0];
                        return n2 != 0;
                    }) ? 1 : 0))) break block20;
                }
                var21.V.b(lIIllIlIIIIll[5]);
                return lIIllIlIIIIll[0];
            }
            NPC var16 = NPCs.getNearest(nPC -> {
                int n2;
                if (r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[15]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlIIIIll[5]];
                    stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[16]];
                    if (r.lIllIIIIIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && (!r.lIllIIIIIllIIIl(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[17]]) ? 1 : 0) || r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[18]]) ? 1 : 0))) {
                        n2 = lIIllIlIIIIll[5];
                        0;
                        if (2 != -1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIllIlIIIIll[0];
                return n2 != 0;
            });
            if (r.lIllIIIIIllIlII(var16) && r.lIllIIIIIllIlIl(var12.distanceTo((Locatable)var16), lIIllIlIIIIll[9])) {
                var16.interact(lIIllIlIIIIIl[lIIllIlIIIIll[10]]);
                var21.sleep(lIIllIlIIIIll[11]);
                return lIIllIlIIIIll[5];
            }
            Movement.walkTo((WorldArea)var21.V.f());
            0;
            return lIIllIlIIIIll[5];
        }
        if (r.lIllIIIIIlIllll(var21.Y.contains((Locatable)var12) ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlIIIIll[5]];
            stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[11]];
            if (r.lIllIIIIIlIllll(Inventory.dropAll((String[])stringArray) ? 1 : 0)) {
                return lIIllIlIIIIll[5];
            }
            if (r.lIllIIIIIlIllll(var21.V.g().contains((Locatable)var12) ? 1 : 0)) {
                NPC var16 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIlIIIIll[5]];
                        stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[13]];
                        if (r.lIllIIIIIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && (!r.lIllIIIIIllIIIl(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[14]]) ? 1 : 0) || r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[9]]) ? 1 : 0))) {
                            n2 = lIIllIlIIIIll[5];
                            0;
                            if (3 >= 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIllIlIIIIll[0];
                    return n2 != 0;
                });
                if (r.lIllIIIIIllIlII(var16)) {
                    var16.interact(lIIllIlIIIIIl[lIIllIlIIIIll[8]]);
                    var21.sleep(lIIllIlIIIIll[11]);
                    return lIIllIlIIIIll[5];
                }
                0;
                if (1 == 0) {
                    return ((0xE ^ 0x64 ^ (0x47 ^ 0x1F)) & (166 + 157 - 307 + 228 ^ 194 + 142 - 295 + 157 ^ -1)) != 0;
                }
            } else {
                Movement.walkTo((WorldArea)var21.V.g());
                0;
                return lIIllIlIIIIll[5];
            }
        }
        return lIIllIlIIIIll[0];
    }

    private static boolean lIllIIIIIllIIII(Object object) {
        return object == null;
    }

    private static String lIllIIIIIlIIIlI(String var11, String var15) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIllIlIIIIll[6], var19);
            return new String(var7.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIIIlIIlIl(String var5, String var9) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var13 = var9.toCharArray();
        int var8 = lIIllIlIIIIll[0];
        char[] var20 = var5.toCharArray();
        int var2 = var20.length;
        int var10 = lIIllIlIIIIll[0];
        while (r.lIllIIIIIllIlIl(var10, var2)) {
            char var3 = var20[var10];
            var4.append((char)(var3 ^ var13[var8 % var13.length]));
            0;
            ++var8;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var4);
    }
}

