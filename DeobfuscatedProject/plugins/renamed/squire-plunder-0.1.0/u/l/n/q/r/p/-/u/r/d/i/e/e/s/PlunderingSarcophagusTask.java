/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a_Unknown;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.CEnum;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.k_Unknown;

/* TASK: Plundering Sarcophagus -> PlunderingsarcophagusTask */
@TaskDesc(name="Plundering Sarcophagus", priority=1)
public class PlunderingSarcophagusTask
extends k_Unknown {
    private static /* synthetic */ String[] llllllIIllIl;
    private static /* synthetic */ int[] llllllIIlllI;

    private static void lIIlIlIIIlIIIII() {
        llllllIIlllI = new int[5];
        j.llllllIIlllI[0] = (0xE5 ^ 0xA8) & ~(0xC2 ^ 0x8F);
        j.llllllIIlllI[1] = 0xFFFFDFFF & 0x30F8;
        j.llllllIIlllI[2] = 1;
        j.llllllIIlllI[3] = 0xFFFFDFC7 & 0x733F;
        j.llllllIIlllI[4] = 2;
    }

    private static boolean lIIlIlIIIlIIIIl(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIIlllIl(String var12, String var9) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var7 = var9.toCharArray();
        int var4 = llllllIIlllI[0];
        char[] var11 = var12.toCharArray();
        int var16 = var11.length;
        int var13 = llllllIIlllI[0];
        while (j.lIIlIlIIIlIIlIl(var13, var16)) {
            char var3 = var11[var13];
            var8.append((char)(var3 ^ var7[var4 % var7.length]));
            0;
            ++var4;
            ++var13;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIIlIlIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIIlIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        block7: {
            block6: {
                void var1;
                j var15;
                c c2 = c.f();
                if (j.lIIlIlIIIlIIIIl((Object)c2)) {
                    return llllllIIlllI[0];
                }
                if (j.lIIlIlIIIlIIIlI(var15.D.c((c)var1) ? 1 : 0)) {
                    return llllllIIlllI[0];
                }
                if (j.lIIlIlIIIlIIIll(Players.getLocal().getAnimation(), llllllIIlllI[1])) {
                    return llllllIIlllI[0];
                }
                int[] nArray = new int[llllllIIlllI[2]];
                nArray[j.llllllIIlllI[0]] = llllllIIlllI[3];
                TileObject var10 = TileObjects.getNearest((int[])nArray);
                if (!j.lIIlIlIIIlIIlII(var10)) break block6;
                String[] stringArray = new String[llllllIIlllI[2]];
                stringArray[j.llllllIIlllI[0]] = llllllIIllIl[llllllIIlllI[0]];
                if (!j.lIIlIlIIIlIIIlI(var10.hasAction(stringArray) ? 1 : 0)) break block7;
            }
            return llllllIIlllI[0];
        }
        var2_2.interact(llllllIIllIl[llllllIIlllI[2]]);
        return llllllIIlllI[2];
    }

    @Inject
    protected j(a a2, Client client) {
        super(a2, client);
    }

    private static String lIIlIlIIIIllllI(String var2, String var14) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllllIIlllI[4], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIlllll() {
        llllllIIllIl = new String[llllllIIlllI[4]];
        j.llllllIIllIl[j.llllllIIlllI[0]] = j."Open";
        j.llllllIIllIl[j.llllllIIlllI[2]] = j."Open";
    }

    private static boolean lIIlIlIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.lIIlIlIIIlIIIII();
        j.lIIlIlIIIIlllll();
    }
}

