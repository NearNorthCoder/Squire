/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.NPCManager
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import com.openosrs.client.game.NPCManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.BEnum;

/* TASK: Killing Blow -> KillingblowTask */
@TaskDesc(name="Killing Blow", blocking=true)
public class KillingBlowTask
extends Task {
    private static /* synthetic */ int[] lIlIIlIIIlIll;
    private final /* synthetic */ SquireSkipperPlugin H;
    private static /* synthetic */ String[] lIlIIlIIIlIlI;
    private final /* synthetic */ NPCManager I;

    private static boolean lIlllIlIIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        l var1;
        if (l.lIlllIlIIIIllll(Players.getLocal().getInteracting())) {
            return lIlIIlIIIlIll[0];
        }
        b var16 = var1.H.b();
        if (l.lIlllIlIIIlIIII((Object)var16, (Object)b.LIZARDS)) {
            return lIlIIlIIIlIll[0];
        }
        List var3 = NPCs.getAll(nPC -> {
            int n2;
            if (l.lIlllIlIIIlIllI(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIIlIIIlIll[1]];
                stringArray[l.lIlIIlIIIlIll[0]] = lIlIIlIIIlIlI[lIlIIlIIIlIll[0]];
                if (l.lIlllIlIIIlIIlI(nPC.hasAction(stringArray) ? 1 : 0) && l.lIlllIlIIIlIlII(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIlIIIlIll[4])) {
                    n2 = lIlIIlIIIlIll[1];
                    0;
                    if (((0xB0 ^ 0x98 ^ (0x82 ^ 0x8A)) & (87 + 52 - 124 + 146 ^ 66 + 40 - 93 + 116 ^ -1)) == 0) return n2 != 0;
                    return ((0x1D ^ 0x31 ^ (0x34 ^ 0x31)) & (91 + 2 - 64 + 99 ^ 13 + 168 - 113 + 101 ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIIIlIll[0];
            return n2 != 0;
        });
        int[] nArray = new int[lIlIIlIIIlIll[1]];
        nArray[l.lIlIIlIIIlIll[0]] = lIlIIlIIIlIll[2];
        Item var11 = Inventory.getFirst((int[])nArray);
        if (l.lIlllIlIIIlIIIl(var3.isEmpty() ? 1 : 0)) {
            Iterator var17 = var3.iterator();
            while (l.lIlllIlIIIlIIlI(var17.hasNext() ? 1 : 0)) {
                NPC var5 = (NPC)var17.next();
                int var6 = var1.b(var5);
                if (l.lIlllIlIIIlIIll(var6, lIlIIlIIIlIll[3]) && l.lIlllIlIIIlIlII(var6, lIlIIlIIIlIll[1])) {
                    System.out.println(var6);
                    NPC var7 = (NPC)var3.get(lIlIIlIIIlIll[0]);
                    if (l.lIlllIlIIIlIlIl(var11) && l.lIlllIlIIIlIllI(Players.getLocal().getInteracting(), var7)) {
                        var11.useOn((Actor)var7);
                        var1.sleep(lIlIIlIIIlIll[4]);
                        return lIlIIlIIIlIll[1];
                    }
                }
                0;
                if (1 == 1) continue;
                return ((0x44 ^ 0x32 ^ (0xB4 ^ 0x97)) & (0x85 ^ 0xAA ^ (0x5E ^ 0x24) ^ -1)) != 0;
            }
        }
        return lIlIIlIIIlIll[0];
    }

    static {
        l.lIlllIlIIIIlllI();
        l.lIlllIlIIIIllIl();
    }

    private static boolean lIlllIlIIIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllIlIIIlIlll(int n2) {
        return n2 >= 0;
    }

    private static void lIlllIlIIIIllIl() {
        lIlIIlIIIlIlI = new String[lIlIIlIIIlIll[1]];
        l.lIlIIlIIIlIlI[l.lIlIIlIIIlIll[0]] = l."Attack";
    }

    private static boolean lIlllIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIlIIIlIIII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIlllIlIIIIllII(String var12, String var14) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlIll[5]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlIIlIIIlIll[6], var15);
            return new String(var8.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIIllIII(int n2) {
        return n2 <= 0;
    }

    /*
     * WARNING - void declaration
     */
    private int b(NPC nPC) {
        void var2_2;
        void var3_3;
        void var4_4;
        l var9;
        void var2;
        if (!l.lIlllIlIIIlIlIl(nPC) || l.lIlllIlIIIIllll(nPC.getName())) {
            return lIlIIlIIIlIll[3];
        }
        int var13 = var2.getHealthScale();
        int var10 = var2.getHealthRatio();
        Integer llllllllllllllIllIllllIIIlIllIII = var9.I.getHealth(var2.getId());
        if (!l.lIlllIlIIIlIlll(var10) || l.lIlllIlIIIllIII(var13)) {
            return lIlIIlIIIlIll[3];
        }
        return (int)((float)(var4_4.intValue() * var3_3 / var2_2) + 0.5f);
    }

    private static boolean lIlllIlIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlllIlIIIIlllI() {
        lIlIIlIIIlIll = new int[7];
        l.lIlIIlIIIlIll[0] = (0x1C ^ 0x69 ^ (0xE4 ^ 0x96)) & (0x88 ^ 0x95 ^ (0x4D ^ 0x57) ^ -1);
        l.lIlIIlIIIlIll[1] = 1;
        l.lIlIIlIIIlIll[2] = -(0xFFFFE777 & 0x7DDD) & (0xFFFFFFFE & 0x7F7D);
        l.lIlIIlIIIlIll[3] = -1;
        l.lIlIIlIIIlIll[4] = 0xBF ^ 0xBB;
        l.lIlIIlIIIlIll[5] = 0x4E ^ 0x6A ^ (0x7F ^ 0x53);
        l.lIlIIlIIIlIll[6] = 2;
    }

    @Inject
    public l(SquireSkipperPlugin squireSkipperPlugin, NPCManager nPCManager) {
        this.H = squireSkipperPlugin;
        this.I = nPCManager;
    }

    private static boolean lIlllIlIIIlIlIl(Object object) {
        return object != null;
    }
}

