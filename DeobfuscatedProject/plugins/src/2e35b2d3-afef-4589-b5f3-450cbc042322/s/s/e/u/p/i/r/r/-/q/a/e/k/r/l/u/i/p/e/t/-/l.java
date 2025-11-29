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
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

@TaskDesc(name="Killing Blow", blocking=true)
public class l
extends Task {
    private static /* synthetic */ int[] lIlIIlIIIlIll;
    private final /* synthetic */ SquireSkipperPlugin H;
    private static /* synthetic */ String[] lIlIIlIIIlIlI;
    private final /* synthetic */ NPCManager I;

    private static boolean lIlllIlIIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        l llllllllllllllIllIllllIIIllIlIIl;
        if (l.lIlllIlIIIIllll(Players.getLocal().getInteracting())) {
            return lIlIIlIIIlIll[0];
        }
        b llllllllllllllIllIllllIIIllIlIII = llllllllllllllIllIllllIIIllIlIIl.H.b();
        if (l.lIlllIlIIIlIIII((Object)llllllllllllllIllIllllIIIllIlIII, (Object)b.LIZARDS)) {
            return lIlIIlIIIlIll[0];
        }
        List llllllllllllllIllIllllIIIllIIlll = NPCs.getAll(nPC -> {
            int n2;
            if (l.lIlllIlIIIlIllI(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIIlIIIlIll[1]];
                stringArray[l.lIlIIlIIIlIll[0]] = lIlIIlIIIlIlI[lIlIIlIIIlIll[0]];
                if (l.lIlllIlIIIlIIlI(nPC.hasAction(stringArray) ? 1 : 0) && l.lIlllIlIIIlIlII(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIlIIIlIll[4])) {
                    n2 = lIlIIlIIIlIll[1];
                    "".length();
                    if (((0xB0 ^ 0x98 ^ (0x82 ^ 0x8A)) & (87 + 52 - 124 + 146 ^ 66 + 40 - 93 + 116 ^ -" ".length())) == 0) return n2 != 0;
                    return ((0x1D ^ 0x31 ^ (0x34 ^ 0x31)) & (91 + 2 - 64 + 99 ^ 13 + 168 - 113 + 101 ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIlIIIlIll[0];
            return n2 != 0;
        });
        int[] nArray = new int[lIlIIlIIIlIll[1]];
        nArray[l.lIlIIlIIIlIll[0]] = lIlIIlIIIlIll[2];
        Item llllllllllllllIllIllllIIIllIIllI = Inventory.getFirst((int[])nArray);
        if (l.lIlllIlIIIlIIIl(llllllllllllllIllIllllIIIllIIlll.isEmpty() ? 1 : 0)) {
            Iterator llllllllllllllIllIllllIIIllIIlIl = llllllllllllllIllIllllIIIllIIlll.iterator();
            while (l.lIlllIlIIIlIIlI(llllllllllllllIllIllllIIIllIIlIl.hasNext() ? 1 : 0)) {
                NPC llllllllllllllIllIllllIIIllIIlII = (NPC)llllllllllllllIllIllllIIIllIIlIl.next();
                int llllllllllllllIllIllllIIIllIIIll = llllllllllllllIllIllllIIIllIlIIl.b(llllllllllllllIllIllllIIIllIIlII);
                if (l.lIlllIlIIIlIIll(llllllllllllllIllIllllIIIllIIIll, lIlIIlIIIlIll[3]) && l.lIlllIlIIIlIlII(llllllllllllllIllIllllIIIllIIIll, lIlIIlIIIlIll[1])) {
                    System.out.println(llllllllllllllIllIllllIIIllIIIll);
                    NPC llllllllllllllIllIllllIIIllIIIlI = (NPC)llllllllllllllIllIllllIIIllIIlll.get(lIlIIlIIIlIll[0]);
                    if (l.lIlllIlIIIlIlIl(llllllllllllllIllIllllIIIllIIllI) && l.lIlllIlIIIlIllI(Players.getLocal().getInteracting(), llllllllllllllIllIllllIIIllIIIlI)) {
                        llllllllllllllIllIllllIIIllIIllI.useOn((Actor)llllllllllllllIllIllllIIIllIIIlI);
                        llllllllllllllIllIllllIIIllIlIIl.sleep(lIlIIlIIIlIll[4]);
                        return lIlIIlIIIlIll[1];
                    }
                }
                "".length();
                if (" ".length() == " ".length()) continue;
                return ((0x44 ^ 0x32 ^ (0xB4 ^ 0x97)) & (0x85 ^ 0xAA ^ (0x5E ^ 0x24) ^ -" ".length())) != 0;
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
        l.lIlIIlIIIlIlI[l.lIlIIlIIIlIll[0]] = l.lIlllIlIIIIllII("38vR9utZ2YE=", "plkOq");
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

    private static String lIlllIlIIIIllII(String llllllllllllllIllIllllIIIlIIllII, String llllllllllllllIllIllllIIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIllllIIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlIll[5]), "DES");
            Cipher llllllllllllllIllIllllIIIlIlIIII = Cipher.getInstance("DES");
            llllllllllllllIllIllllIIIlIlIIII.init(lIlIIlIIIlIll[6], llllllllllllllIllIllllIIIlIlIIIl);
            return new String(llllllllllllllIllIllllIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllllIIIlIIllll) {
            llllllllllllllIllIllllIIIlIIllll.printStackTrace();
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
        l llllllllllllllIllIllllIIIlIlllII;
        void llllllllllllllIllIllllIIIlIllIll;
        if (!l.lIlllIlIIIlIlIl(nPC) || l.lIlllIlIIIIllll(nPC.getName())) {
            return lIlIIlIIIlIll[3];
        }
        int llllllllllllllIllIllllIIIlIllIlI = llllllllllllllIllIllllIIIlIllIll.getHealthScale();
        int llllllllllllllIllIllllIIIlIllIIl = llllllllllllllIllIllllIIIlIllIll.getHealthRatio();
        Integer llllllllllllllIllIllllIIIlIllIII = llllllllllllllIllIllllIIIlIlllII.I.getHealth(llllllllllllllIllIllllIIIlIllIll.getId());
        if (!l.lIlllIlIIIlIlll(llllllllllllllIllIllllIIIlIllIIl) || l.lIlllIlIIIllIII(llllllllllllllIllIllllIIIlIllIlI)) {
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
        l.lIlIIlIIIlIll[0] = (0x1C ^ 0x69 ^ (0xE4 ^ 0x96)) & (0x88 ^ 0x95 ^ (0x4D ^ 0x57) ^ -" ".length());
        l.lIlIIlIIIlIll[1] = " ".length();
        l.lIlIIlIIIlIll[2] = -(0xFFFFE777 & 0x7DDD) & (0xFFFFFFFE & 0x7F7D);
        l.lIlIIlIIIlIll[3] = -" ".length();
        l.lIlIIlIIIlIll[4] = 0xBF ^ 0xBB;
        l.lIlIIlIIIlIll[5] = 0x4E ^ 0x6A ^ (0x7F ^ 0x53);
        l.lIlIIlIIIlIll[6] = "  ".length();
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

