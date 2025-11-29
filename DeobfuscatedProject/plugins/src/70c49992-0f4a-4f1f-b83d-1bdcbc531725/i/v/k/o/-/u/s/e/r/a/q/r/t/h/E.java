/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Antifire Potion", priority=110)
public class E
extends w {
    private static /* synthetic */ String[] lIlIllIIlIllI;
    private static /* synthetic */ int[] lIlIllIIlIlll;

    private static boolean llIIIIIIlIlIIll(Object object) {
        return object != null;
    }

    private static String llIIIIIIlIIlllI(String llllllllllllllIllIlIIlIllllllIll, String llllllllllllllIllIlIIlIllllllIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIllllllIII.getBytes(StandardCharsets.UTF_8)), lIlIllIIlIlll[5]), "DES");
            Cipher llllllllllllllIllIlIIlIlllllllIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIlllllllIl.init(lIlIllIIlIlll[3], llllllllllllllIllIlIIlIllllllllI);
            return new String(llllllllllllllIllIlIIlIlllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlIlllllllII) {
            llllllllllllllIllIlIIlIlllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIlIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        E llllllllllllllIllIlIIllIIIIlllll;
        if (!E.llIIIIIIlIlIIIl(Combat.isSuperAntifired() ? 1 : 0) || E.llIIIIIIlIlIIlI(Combat.isAntifired() ? 1 : 0)) {
            return lIlIllIIlIlll[0];
        }
        NPC llllllllllllllIllIlIIllIIIIllllI = llllllllllllllIllIlIIllIIIIlllll.cg.A();
        if (E.llIIIIIIlIlIIll(llllllllllllllIllIlIIllIIIIllllI)) {
            return lIlIllIIlIlll[0];
        }
        int[] nArray = new int[lIlIllIIlIlll[1]];
        nArray[E.lIlIllIIlIlll[0]] = lIlIllIIlIlll[2];
        if (E.llIIIIIIlIlIIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlIlll[0];
        }
        Item llllllllllllllIllIlIIllIIIIlllIl = Inventory.getFirst(item -> {
            int n2;
            if (E.llIIIIIIlIlIIlI(item.getName().toLowerCase().contains(lIlIllIIlIllI[lIlIllIIlIlll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIlIlll[1]];
                stringArray[E.lIlIllIIlIlll[0]] = lIlIllIIlIllI[lIlIllIIlIlll[3]];
                if (E.llIIIIIIlIlIIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIIlIlll[1];
                    "".length();
                    if (((139 + 148 - 172 + 35 ^ 39 + 140 - 148 + 112) & (0x38 ^ 0x45 ^ (0xD ^ 0x69) ^ -" ".length())) == 0) return n2 != 0;
                    return ((62 + 14 - -11 + 57 ^ 109 + 140 - 64 + 8) & (0xEA ^ 0x83 ^ (0x8A ^ 0xB2) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIllIIlIlll[0];
            return n2 != 0;
        });
        if (E.llIIIIIIlIlIlII(llllllllllllllIllIlIIllIIIIlllIl)) {
            return lIlIllIIlIlll[0];
        }
        var2_2.interact(lIlIllIIlIllI[lIlIllIIlIlll[0]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlIlll[1];
    }

    private static void llIIIIIIlIIllll() {
        lIlIllIIlIllI = new String[lIlIllIIlIlll[4]];
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[0]] = E.llIIIIIIlIIllIl("DBowLzg=", "HhYAS");
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[1]] = E.llIIIIIIlIIlllI("QwthstDHPZ60vII7zoSbOw==", "RUkea");
        E.lIlIllIIlIllI[E.lIlIllIIlIlll[3]] = E.llIIIIIIlIIllIl("LwclJDw=", "kuLJW");
    }

    private static boolean llIIIIIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    private static String llIIIIIIlIIllIl(String llllllllllllllIllIlIIllIIIIIlIll, String llllllllllllllIllIlIIllIIIIIllll) {
        llllllllllllllIllIlIIllIIIIIlIll = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIllIIIIIlllI = new StringBuilder();
        char[] llllllllllllllIllIlIIllIIIIIllIl = llllllllllllllIllIlIIllIIIIIllll.toCharArray();
        int llllllllllllllIllIlIIllIIIIIllII = lIlIllIIlIlll[0];
        char[] llllllllllllllIllIlIIllIIIIIIllI = llllllllllllllIllIlIIllIIIIIlIll.toCharArray();
        int llllllllllllllIllIlIIllIIIIIIlIl = llllllllllllllIllIlIIllIIIIIIllI.length;
        int llllllllllllllIllIlIIllIIIIIIlII = lIlIllIIlIlll[0];
        while (E.llIIIIIIlIlIlIl(llllllllllllllIllIlIIllIIIIIIlII, llllllllllllllIllIlIIllIIIIIIlIl)) {
            char llllllllllllllIllIlIIllIIIIlIIIl = llllllllllllllIllIlIIllIIIIIIllI[llllllllllllllIllIlIIllIIIIIIlII];
            llllllllllllllIllIlIIllIIIIIlllI.append((char)(llllllllllllllIllIlIIllIIIIlIIIl ^ llllllllllllllIllIlIIllIIIIIllIl[llllllllllllllIllIlIIllIIIIIllII % llllllllllllllIllIlIIllIIIIIllIl.length]));
            "".length();
            ++llllllllllllllIllIlIIllIIIIIllII;
            ++llllllllllllllIllIlIIllIIIIIIlII;
            "".length();
            if ((58 + 136 - 53 + 10 ^ 33 + 122 - 119 + 111) > " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIllIIIIIlllI);
    }

    private static void llIIIIIIlIlIIII() {
        lIlIllIIlIlll = new int[6];
        E.lIlIllIIlIlll[0] = (0x48 ^ 4) & ~(0x39 ^ 0x75);
        E.lIlIllIIlIlll[1] = " ".length();
        E.lIlIllIIlIlll[2] = -(0xFFFFF7BF & 0x6A65) & (0xFFFFF7ED & 0x6FFF);
        E.lIlIllIIlIlll[3] = "  ".length();
        E.lIlIllIIlIlll[4] = "   ".length();
        E.lIlIllIIlIlll[5] = 0x6D ^ 0x65;
    }

    private static boolean llIIIIIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    protected E(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    static {
        E.llIIIIIIlIlIIII();
        E.llIIIIIIlIIllll();
    }
}

