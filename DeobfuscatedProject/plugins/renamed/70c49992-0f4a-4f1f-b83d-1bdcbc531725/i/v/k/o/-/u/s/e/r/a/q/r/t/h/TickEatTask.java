/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;

/* TASK: Tick eat -> TickEatTask */
@TaskDesc(name="Tick eat", priority=200)
public class TickEatTask
extends w_Unknown {
    private static /* synthetic */ String[] lIlIlIlIllIll;
    private static /* synthetic */ int[] lIlIlIlIlllII;
    private static final /* synthetic */ String cn;

    @Inject
    protected I(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIllllllIlIlIlI(String var15, String var13) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlllII[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIlIlIlllII[2], var12);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIlIlIII(String var4, String var16) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var11 = var16.toCharArray();
        int var3 = lIlIlIlIlllII[1];
        char[] var21 = var4.toCharArray();
        int var2 = var21.length;
        int var5 = lIlIlIlIlllII[1];
        while (I.lIllllllIllIIIl(var5, var2)) {
            char var9 = var21[var5];
            var8.append((char)(var9 ^ var11[var3 % var11.length]));
            0;
            ++var3;
            ++var5;
            0;
            
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIllllllIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIllllllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllllllIlIllIl(Object object) {
        return object != null;
    }

    private static void lIllllllIlIlIll() {
        lIlIlIlIllIll = new String[lIlIlIlIlllII[4]];
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[1]] = I."Zombified Spawn";
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[0]] = I."Eat";
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[2]] = I."Eat";
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[3]] = I."Zombified Spawn";
    }

    private static boolean lIllllllIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIllllllIlIllII() {
        lIlIlIlIlllII = new int[6];
        I.lIlIlIlIlllII[0] = 1;
        I.lIlIlIlIlllII[1] = (0x84 ^ 0xBC ^ (0xA3 ^ 0xBB)) & (3 ^ 0x3E ^ (0xB3 ^ 0xAE) ^ -1);
        I.lIlIlIlIlllII[2] = 2;
        I.lIlIlIlIlllII[3] = 3;
        I.lIlIlIlIlllII[4] = 2 ^ (0x93 ^ 0x95);
        I.lIlIlIlIlllII[5] = 0x64 ^ 0x6C;
    }

    static {
        I.lIllllllIlIllII();
        I.lIllllllIlIlIll();
        cn = lIlIlIlIllIll[lIlIlIlIlllII[3]];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        String[] stringArray = new String[lIlIlIlIlllII[0]];
        stringArray[I.lIlIlIlIlllII[1]] = lIlIlIlIllIll[lIlIlIlIlllII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (I.lIllllllIlIllIl(nPC) && I.lIllllllIlIlllI(nPC.isDead() ? 1 : 0) && I.lIllllllIlIllll(nPC.distanceTo((Locatable)this.cf.getLocalPlayer()), lIlIlIlIlllII[0])) {
            I var17;
            void var7;
            Item item2 = Inventory.getFirst(item -> item.hasAction(lIlIlIlIllIll[lIlIlIlIlllII[2]]::equals));
            if (I.lIllllllIllIIII(item2)) {
                return lIlIlIlIlllII[1];
            }
            var7.interact(lIlIlIlIllIll[lIlIlIlIlllII[0]]);
            var17.cg.a(var17.cf.getTickCount());
            return lIlIlIlIlllII[1];
        }
        return lIlIlIlIlllII[1];
    }

    private static String lIllllllIlIlIIl(String var20, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIlIlIlllII[2], var1);
            return new String(var14.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIllIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

