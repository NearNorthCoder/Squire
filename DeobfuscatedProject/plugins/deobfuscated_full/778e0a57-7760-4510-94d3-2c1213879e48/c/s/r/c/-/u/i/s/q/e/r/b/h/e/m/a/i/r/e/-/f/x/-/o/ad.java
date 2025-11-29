/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

/* TASK: Dropping spare items -> DroppingspareitemsTask */
@TaskDesc(name="Dropping spare items", priority=30000)
public class ad
extends Task {
    private static /* synthetic */ String[] lIlIlIIIllll;
    private final /* synthetic */ SquireChambersPlugin cF;
    /* synthetic */ boolean cE;
    /* synthetic */ int cD;
    private static /* synthetic */ int[] lIlIlIIlIIII;

    private static String llIlllIIlIIIlI(String var17, String var12) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var9 = var12.toCharArray();
        int var4 = lIlIlIIlIIII[0];
        char[] var18 = var17.toCharArray();
        int var8 = var18.length;
        int var2 = lIlIlIIlIIII[0];
        while (ad.llIlllIIlIllIl(var2, var8)) {
            char var14 = var18[var2];
            var13.append((char)(var14 ^ var9[var4 % var9.length]));
            0;
            ++var4;
            ++var2;
            0;
            if ((0x72 ^ 0x76) >= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ad.llIlllIIlIIllI(item.getName().startsWith(lIlIlIIIllll[lIlIlIIlIIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIIII[1]];
                stringArray[ad.lIlIlIIlIIII[0]] = lIlIlIIIllll[lIlIlIIlIIII[13]];
                if (ad.llIlllIIlIIllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIIII[1];
                    0;
                    if (1 >= 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIlIIII[0];
            return n2 != 0;
        });
        if (ad.llIlllIIlIlIII(item2)) {
            return lIlIlIIlIIII[0];
        }
        item2.interact(lIlIlIIIllll[lIlIlIIlIIII[0]]);
        this.sleep(lIlIlIIlIIII[13]);
        return lIlIlIIlIIII[1];
    }

    private static boolean llIlllIIlIlIIl(Object object) {
        return object != null;
    }

    private static void llIlllIIlIIlII() {
        lIlIlIIIllll = new String[lIlIlIIlIIII[10]];
        ad.lIlIlIIIllll[ad.lIlIlIIlIIII[0]] = ad."Drink";
        ad.lIlIlIIIllll[ad.lIlIlIIlIIII[1]] = ad."Stamina potion";
        ad.lIlIlIIIllll[ad.lIlIlIIlIIII[13]] = ad."Drink";
    }

    private static boolean llIlllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIlIlIll(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlllIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlllIIlIIIll(String var11, String var15) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIlIIlIIII[13], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    public ad(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIlIIlIIII[0];
        this.cE = lIlIlIIlIIII[0];
        this.cF = squireChambersPlugin;
    }

    private static boolean llIlllIIlIlIII(Object object) {
        return object == null;
    }

    private static void llIlllIIlIIlIl() {
        lIlIlIIlIIII = new int[18];
        ad.lIlIlIIlIIII[0] = (0x37 ^ 0x7A) & ~(0x5E ^ 0x13);
        ad.lIlIlIIlIIII[1] = 1;
        ad.lIlIlIIlIIII[2] = (0x27 ^ 3) + (35 + 162 - 94 + 73) - (0x3B ^ 0x70) + (0x9A ^ 0xC6);
        ad.lIlIlIIlIIII[3] = 0xFFFFEF5E & 0x12EF;
        ad.lIlIlIIlIIII[4] = 0xBA ^ 0x8C;
        ad.lIlIlIIlIIII[5] = 0x29 ^ 0x5B ^ (0x9F ^ 0x89);
        ad.lIlIlIIlIIII[6] = 0x7C ^ 0x22 ^ (0x40 ^ 0x1B);
        ad.lIlIlIIlIIII[7] = -(0xFFFFEFC9 & 0x16F7) & (0xFFFFF7FF & 0x5FFF);
        ad.lIlIlIIlIIII[8] = 0xFFFF85EF & 0x7F57;
        ad.lIlIlIIlIIII[9] = -(0xFFFFAE2F & 0x7DF9) & (0xFFFFFDBF & 0x7FFD);
        ad.lIlIlIIlIIII[10] = 3;
        ad.lIlIlIIlIIII[11] = 0xFFFFF237 & 0x5FCB;
        ad.lIlIlIIlIIII[12] = 0xFFFFDB56 & 0x76AB;
        ad.lIlIlIIlIIII[13] = 2;
        ad.lIlIlIIlIIII[14] = -(0xFFFFA57D & 0x7FBB) & (0xFFFFF7FB & 0x7F3D);
        ad.lIlIlIIlIIII[15] = 0xFFFFD9BF & 0x77EA;
        ad.lIlIlIIlIIII[16] = -(0xFFFFCE95 & 0x3D7B) & (0xFFFFFDB7 & 0x5FFF);
        ad.lIlIlIIlIIII[17] = 0xFFFF9BEF & 0x6D3B;
    }

    private static boolean llIlllIIlIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlllIIlIIllI(int n2) {
        return n2 != 0;
    }

    static {
        ad.llIlllIIlIIlIl();
        ad.llIlllIIlIIlII();
    }

    public boolean run() {
        int var1;
        ad var10;
        if (!ad.llIlllIIlIIllI(u.be() ? 1 : 0) || ad.llIlllIIlIIlll(u.bf() ? 1 : 0)) {
            return lIlIlIIlIIII[0];
        }
        Player var16 = Players.getLocal();
        if (ad.llIlllIIlIlIII(var16)) {
            return lIlIlIIlIIII[0];
        }
        n var7 = var10.cF.L();
        if (!ad.llIlllIIlIlIIl(var10.cF.L()) || ad.llIlllIIlIIlll(var10.cF.L().a((Locatable)var16) ? 1 : 0)) {
            return lIlIlIIlIIII[0];
        }
        int[] nArray = new int[lIlIlIIlIIII[1]];
        nArray[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[2];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIIlIIII[1]];
            nArray2[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[2];
            Inventory.dropAll((int[])nArray2);
            0;
            return lIlIlIIlIIII[1];
        }
        int[] nArray3 = new int[lIlIlIIlIIII[1]];
        nArray3[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.ICE_DEMON)) {
                int[] nArray4 = new int[lIlIlIIlIIII[1]];
                nArray4[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
                Inventory.dropAll((int[])nArray4);
                0;
                return lIlIlIIlIIII[1];
            }
            var1 = lIlIlIIlIIII[4] - var10.cF.K() + (lIlIlIIlIIII[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIlIIlIIII[6];
            if (ad.llIlllIIlIlIll(var1)) {
                int[] nArray5 = new int[lIlIlIIlIIII[1]];
                nArray5[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
                Inventory.dropAll((int[])nArray5);
                0;
                return lIlIlIIlIIII[1];
            }
        }
        int[] nArray6 = new int[lIlIlIIlIIII[1]];
        nArray6[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[7];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray6) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.ICE_DEMON)) {
            int[] nArray7 = new int[lIlIlIIlIIII[1]];
            nArray7[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[7];
            Inventory.dropAll((int[])nArray7);
            0;
            return lIlIlIIlIIII[1];
        }
        int[] nArray8 = new int[lIlIlIIlIIII[1]];
        nArray8[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            if (ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.ICE_DEMON) && ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.MUTTADILES)) {
                int[] nArray9 = new int[lIlIlIIlIIII[1]];
                nArray9[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
                Inventory.dropAll((int[])nArray9);
                0;
                return lIlIlIIlIIII[1];
            }
            if (ad.llIlllIIlIllII((Object)var7.aM(), (Object)N.ICE_DEMON) && ad.llIlllIIlIlIll(var1 = lIlIlIIlIIII[4] - var10.cF.K() + (lIlIlIIlIIII[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIlIIlIIII[6])) {
                int[] nArray10 = new int[lIlIlIIlIIII[1]];
                nArray10[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
                Inventory.dropAll((int[])nArray10);
                0;
                return lIlIlIIlIIII[1];
            }
        }
        int[] nArray11 = new int[lIlIlIIlIIII[1]];
        nArray11[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[9];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray11) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.THIEVING)) {
            int[] nArray12 = new int[lIlIlIIlIIII[1]];
            nArray12[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[9];
            Inventory.dropAll((int[])nArray12);
            0;
            return lIlIlIIlIIII[1];
        }
        int[] nArray13 = new int[lIlIlIIlIIII[10]];
        nArray13[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[11];
        nArray13[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[12];
        nArray13[ad.lIlIlIIlIIII[13]] = lIlIlIIlIIII[14];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIlIlIIlIIII[10]];
            nArray14[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[11];
            nArray14[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[12];
            nArray14[ad.lIlIlIIlIIII[13]] = lIlIlIIlIIII[14];
            Inventory.dropAll((int[])nArray14);
            0;
            return lIlIlIIlIIII[1];
        }
        int[] nArray15 = new int[lIlIlIIlIIII[13]];
        nArray15[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[15];
        nArray15[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[16];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray15) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.END)) {
            int[] nArray16 = new int[lIlIlIIlIIII[13]];
            nArray16[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[15];
            nArray16[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[16];
            Inventory.dropAll((int[])nArray16);
            0;
            return lIlIlIIlIIII[1];
        }
        int[] nArray17 = new int[lIlIlIIlIIII[1]];
        nArray17[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[17];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray17) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var7.aM(), (Object)N.CRABS)) {
            int[] nArray18 = new int[lIlIlIIlIIII[1]];
            nArray18[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[17];
            Inventory.dropAll((int[])nArray18);
            0;
            return lIlIlIIlIIII[1];
        }
        return lIlIlIIlIIII[0];
    }

    private static boolean llIlllIIlIllII(Object object, Object object2) {
        return object == object2;
    }
}

