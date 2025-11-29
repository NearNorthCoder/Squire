/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.EEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;

/* TASK: Looting box trap -> LootingboxtrapTask */
@TaskDesc(name="Looting box trap", priority=1)
public class LootingBoxTrapTask
extends j_Unknown {
    private static /* synthetic */ int[] llllIIIIIlll;
    private static /* synthetic */ String[] llllIIIIIllI;

    private static void lIIIlllIlIIlllI() {
        llllIIIIIlll = new int[6];
        m.llllIIIIIlll[0] = 3;
        m.llllIIIIIlll[1] = 1;
        m.llllIIIIIlll[2] = (0x5F ^ 0x7D) & ~(0x64 ^ 0x46);
        m.llllIIIIIlll[3] = 0xFFFFAFFE & 0x7719;
        m.llllIIIIIlll[4] = 47 + 17 - -81 + 10 ^ 7 + 125 - 131 + 146;
        m.llllIIIIIlll[5] = 2;
    }

    private static void lIIIlllIlIIllIl() {
        llllIIIIIllI = new String[llllIIIIIlll[1]];
        m.llllIIIIIllI[m.llllIIIIIlll[2]] = m."Take";
    }

    static {
        m.lIIIlllIlIIlllI();
        m.lIIIlllIlIIllIl();
    }

    private static boolean lIIIlllIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public m(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
    }

    private static String lIIIlllIlIIllII(String var1, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llllIIIIIlll[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llllIIIIIlll[5], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean x() {
        int[] nArray = new int[llllIIIIIlll[1]];
        nArray[m.llllIIIIIlll[2]] = llllIIIIIlll[3];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)llllIIIIIlll[0], (int[])nArray);
        if (!m.lIIIlllIlIIllll(list) || m.lIIIlllIlIlIIII(list.isEmpty() ? 1 : 0)) {
            return llllIIIIIlll[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(llllIIIIIllI[llllIIIIIlll[2]]));
        return llllIIIIIlll[1];
    }

    private static boolean lIIIlllIlIIllll(Object object) {
        return object != null;
    }
}

